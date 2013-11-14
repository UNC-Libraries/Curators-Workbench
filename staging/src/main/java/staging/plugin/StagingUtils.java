/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package staging.plugin;

import irods.efs.plugin.IrodsFileStore;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.StagingArea;
import edu.unc.lib.staging.StagingException;

/**
 * @author Gregory Jansen
 * 
 */
public class StagingUtils {
	private static final Logger log = LoggerFactory
			.getLogger(StagingUtils.class);
	private static final int chunkSize = 8192;

	public static class StagingResult {
		/**
		 * The manifest reference for the staged file.
		 */
		public URI manifestURI = null;
		/**
		 * BagIt, Tag, iRODS, HTTP
		 */
		public String manifestURIScheme = null;
		/**
		 * The resolvable location of the staged file. (or prestaged)
		 */
		public URI stagedFileURI = null;
		/**
		 * Newly calculated checksum. (Must match current original and staged
		 * file.)
		 */
		public String md5Sum = null;

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("StagingResult");
			sb.append("\n\tmanifest URI: ").append(this.manifestURI.toString());
			// sb.append("\n\tmanifest scheme: ").append(this.manifestURIScheme);
			sb.append("\n\tstaged file URL: ").append(
					this.stagedFileURI.toString());
			sb.append("\n\tmd5sum: ").append(this.md5Sum);
			return sb.toString();
		}
	}

	/**
	 * Handles staging or pre-staging of an original, calculates checksum for
	 * the original if not supplied, verifies checksum against staged copy if
	 * applicable.
	 * 
	 * @param original
	 *            the unwrapped original file store
	 * @param project
	 *            the project for the staged file
	 * @param originalPath
	 *            the project distinct path for this original, must not collide
	 *            with others in project
	 * @param md5sum
	 *            existing checksum for original, optional
	 * @param stage
	 *            preferred staging area
	 * @param destinationConfig
	 *            URL of the destination repository staging config
	 * @param monitor
	 *            progress monitor
	 * @return a StagingResult object
	 * @throws CoreException
	 *             when the staging cannot complete
	 */
	public static StagingResult stage(IFileStore original, IProject project,
			String originalPath, String md5sum, URI manifestStagingURI, SharedStagingArea stage,
			URL destinationConfig, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		StagingResult result = new StagingResult();
		monitor.beginTask(original.toURI().toString(), 100);
		monitor.subTask(original.toURI().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to stage", 1);
		setupMon.subTask("Preparing to stage");

		try {
			if (stage.getConnectedStorageURI().isAbsolute()) {
				String relpath = stage.getRelativePath(manifestStagingURI);
				result.stagedFileURI = stage.makeStorageURI(relpath,
						originalPath);
			} else {
				result.stagedFileURI = stage.makeStorageURI(originalPath);
			}
			result.manifestURI = stage.getManifestURI(result.stagedFileURI);
			result.manifestURIScheme = stage.getScheme();
		} catch (StagingException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					StagingPlugin.PLUGIN_ID, "Staging area not ready: "
							+ e.getLocalizedMessage()));
		}

		// resolve relative URIs against project location
		URI filestoreURI = result.stagedFileURI;
		if (!result.stagedFileURI.isAbsolute()) {
			filestoreURI = URI
					.create(project.getLocationURI().toString() + "/").resolve(
							result.stagedFileURI);
		}
		IFileStore stageFileStore = EFS.getStore(filestoreURI);

		IFileInfo sourceFileInfo = original.fetchInfo();
		// real staging starts here
		// TODO do we need overwrite
		// TODO prepare for overwrite
		IFileInfo stageFileInfo = stageFileStore.fetchInfo();
		if (stageFileInfo.exists()) {
			stageFileStore.delete(EFS.NONE, null);
		}

		// stage the file
		IProgressMonitor copyMonitor = new SubProgressMonitor(monitor, 50,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		String sourceMD5 = null;
		copyMonitor.beginTask("", 100);
		copyMonitor.subTask("Copying to stage");
		sourceMD5 = copyWithMD5Digest(original, stageFileStore, sourceFileInfo,
				copyMonitor);
		copyMonitor.done();

		// get the digest of the staged file
		IProgressMonitor stagedChecksumMonitor = new SubProgressMonitor(
				monitor, 49, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		// stagedChecksumMonitor.subTask("Getting digest for staged file.. ");
		String stagedMD5 = fetchMD5Digest(stageFileStore, stagedChecksumMonitor);
		if (md5sum != null && !md5sum.equals(sourceMD5)) {
			log.error("old checksum does not match new one: {} | {}", md5sum, sourceMD5);
			stageFileStore.delete(EFS.NONE, stagedChecksumMonitor);
			throw new CoreException(
					new Status(IStatus.ERROR, StagingPlugin.PLUGIN_ID,
							"Original file has been changed, latest checksum does not match original."));
		}
		if (!sourceMD5.equals(stagedMD5)) {
			log.error("checksums do not match: {} | {}", sourceMD5, stagedMD5);
			stageFileStore.delete(EFS.NONE, stagedChecksumMonitor);
			throw new CoreException(new Status(IStatus.ERROR,
					StagingPlugin.PLUGIN_ID,
					"Checksum mismatch during staging."));
		}
		result.md5Sum = sourceMD5;
		monitor.done();
		log.info(result.toString());
		return result;
	}

	/**
	 * Handles staging or pre-staging of an original, calculates checksum for
	 * the original if not supplied, verifies checksum against staged copy if
	 * applicable.
	 * 
	 * @param original
	 *            the unwrapped original file store
	 * @param project
	 *            the project for the staged file
	 * @param originalPath
	 *            the project distinct path for this original, must not collide
	 *            with others in project
	 * @param md5sum
	 *            existing checksum for original, optional
	 * @param stage
	 *            preferred staging area
	 * @param destinationConfig
	 *            URL of the destination repository staging config
	 * @param monitor
	 *            progress monitor
	 * @return a StagingResult object
	 * @throws CoreException
	 *             when the staging cannot complete
	 */
	public static StagingResult stageInPlace(IFileStore original,
			IProject project, String originalPath, String md5sum,
			StagingArea stage, URL destinationConfig, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		StagingResult result = new StagingResult();
		monitor.beginTask(original.toURI().toString(), 100);
		monitor.subTask(original.toURI().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to stage in place", 1);
		setupMon.subTask("Preparing to stage in place");

		StagingArea prestage = null;
		URI originalURI = original.toURI();
		if (stage.isWithinStorage(originalURI)) {
			// already prestaged in selected stage (can be project BagIt data
			// dir, non-shared)
			prestage = stage;
		} else {
			SharedStagingArea area = StagingPlugin.getDefault().getStages()
					.findMatchingArea(original.toURI());
			if (area != null
					&& (destinationConfig == null || destinationConfig
							.equals(area.getConfigURL()))) {
				prestage = area;
			}
		}

		try {
			// compute staged file URL
			result.stagedFileURI = original.toURI();
			result.manifestURI = prestage.getManifestURI(result.stagedFileURI);
			result.manifestURIScheme = prestage.getScheme();
		} catch (StagingException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					StagingPlugin.PLUGIN_ID, "Staging area not ready: "
							+ e.getLocalizedMessage()));
		}

		// resolve relative URIs against project location
		URI filestoreURI = result.stagedFileURI;
		if (!result.stagedFileURI.isAbsolute()) {
			filestoreURI = URI
					.create(project.getLocationURI().toString() + "/").resolve(
							result.stagedFileURI);
		}
		IFileStore stageFileStore = EFS.getStore(filestoreURI);

		IFileInfo sourceFileInfo = original.fetchInfo();
		// checksum the file
		IProgressMonitor checksumMonitor = new SubProgressMonitor(monitor, 50,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		checksumMonitor.beginTask("", 100);
		checksumMonitor.subTask("Computing checksum of pre-staged file");
		result.md5Sum = checksumWithMD5Digest(stageFileStore, sourceFileInfo,
				checksumMonitor);
		checksumMonitor.done();
		monitor.done();
		log.info(result.toString());
		return result;
	}

	/**
	 * @param stageFileStore
	 * @return
	 */
	public static String fetchMD5Digest(IFileStore fileStore,
			IProgressMonitor monitor) throws CoreException {
		String result = null;
		IFileInfo info = null;
		if (fileStore instanceof IrodsFileStore) {
			info = fileStore.fetchInfo();
			result = info.getStringAttribute(EFS.ATTRIBUTE_LINK_TARGET);
		}
		if (result == null) {
			monitor.beginTask(
					"Retreiving staged file and calculating checksum", 100);
			info = fileStore.fetchInfo();
			if (info.getLength() == 0) {
				return "d41d8cd98f00b204e9800998ecf8427e";
			}
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new CoreException(new Status(Status.ERROR,
						StagingPlugin.PLUGIN_ID,
						"Cannot create checksum without MD5 algorithm.", e));
			}
			messageDigest.reset();
			byte[] buffer = new byte[chunkSize];
			int bytesRead = 0;
			int totalBytesRead = 0;
			int progressTickBytes = (int) info.getLength() / 100;
			if (progressTickBytes == 0) {
				progressTickBytes = 1; // prevents divide by zero on files less
										// than 100 bytes
			}
			BufferedInputStream in = new BufferedInputStream(
					fileStore.openInputStream(EFS.NONE, null));
			try {
				while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
					messageDigest.update(buffer, 0, bytesRead);
					totalBytesRead = totalBytesRead + bytesRead;
					if ((totalBytesRead % progressTickBytes) < bytesRead) {
						monitor.worked(1);
					}
				}
			} catch (IOException e) {
				throw new CoreException(new Status(Status.ERROR,
						StagingPlugin.PLUGIN_ID,
						"Cannot read file store to calculate MD5 digest.", e));
			}
			Hex hex = new Hex();
			result = new String(hex.encode(messageDigest.digest()));
			monitor.done();
		}
		return result;
	}

	public static final String copyWithMD5Digest(IFileStore source,
			IFileStore destination, IFileInfo sourceInfo,
			IProgressMonitor monitor) throws CoreException {
		// TODO honor cancellation requests during copy
		// TODO report progress
		log.debug("source: {}", source);
		log.debug("destination: {}", destination);
		// monitor.subTask("Copying file " + source.getName() + "...");
		String result = null;
		byte[] buffer = new byte[chunkSize];
		int length = (int) sourceInfo.getLength();
		int progressTickBytes = length / 100;
		int bytesRead = 0;
		int totalBytesCopied = 0;
		InputStream in = null;
		OutputStream out = null;
		try {
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new CoreException(new Status(Status.ERROR,
						StagingPlugin.PLUGIN_ID,
						"Cannot compare checksums without MD5 algorithm.", e));
			}
			messageDigest.reset();
			in = new BufferedInputStream(
					source.openInputStream(EFS.NONE, null), 1024 * 64);
			destination.getParent().mkdir(EFS.NONE, null);
			out = new BufferedOutputStream(destination.openOutputStream(
					EFS.NONE, null), 1024 * 64);
			while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
				if (monitor.isCanceled()) {
					throw new CoreException(new Status(IStatus.CANCEL,
							StagingPlugin.PLUGIN_ID, "Staging cancelled"));
				}
				out.write(buffer, 0, bytesRead);
				messageDigest.update(buffer, 0, bytesRead);
				totalBytesCopied = totalBytesCopied + bytesRead;
				if (totalBytesCopied > 0 && progressTickBytes > 0) {
					if ((totalBytesCopied % progressTickBytes) < bytesRead) {
						monitor.worked(1);
						// if (length > 0) {
						// int percent = (int) (100.0 * ((float)
						// totalBytesCopied / length));
						// monitor.subTask(percent + "% (" + totalBytesCopied /
						// 1024 + "/" + length / 1024 + "K)");
						// }
					}
				}
			}
			Hex hex = new Hex();
			result = new String(hex.encode(messageDigest.digest()));
		} catch (IOException e) {
			throw new CoreException(new Status(Status.ERROR,
					StagingPlugin.PLUGIN_ID, e.getLocalizedMessage(), e));
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				log.error("Trouble closing i/o resources", e);
			}
		}
		return result;
	}

	/**
	 * @param sourceFileStore
	 * @param sourceFileInfo
	 * @param checksumMonitor
	 * @return
	 * @throws CoreException
	 */
	private static String checksumWithMD5Digest(IFileStore source,
			IFileInfo sourceInfo, IProgressMonitor monitor)
			throws CoreException {
		// TODO honor cancellation requests during copy
		// TODO report progress
		log.info("source: {}", source);
		String result = null;
		byte[] buffer = new byte[chunkSize];
		int length = (int) sourceInfo.getLength();
		int progressTickBytes = length / 100;
		int bytesRead = 0;
		int totalBytesCopied = 0;
		InputStream in = null;
		try {
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new CoreException(new Status(Status.ERROR,
						StagingPlugin.PLUGIN_ID,
						"Cannot compare checksums without MD5 algorithm.", e));
			}
			messageDigest.reset();
			in = new BufferedInputStream(
					source.openInputStream(EFS.NONE, null), 1024 * 64);
			while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
				messageDigest.update(buffer, 0, bytesRead);
				totalBytesCopied = totalBytesCopied + bytesRead;
				if (totalBytesCopied > 0 && progressTickBytes > 0) {
					if ((totalBytesCopied % progressTickBytes) < bytesRead) {
						monitor.worked(1);
						// if (length > 0) {
						// int percent = (int) (100.0 * ((float)
						// totalBytesCopied / length));
						// monitor.subTask(percent + "% (" + totalBytesCopied /
						// 1024 + "/" + length / 1024 + "K)");
						// }
					}
				}
			}
			Hex hex = new Hex();
			result = new String(hex.encode(messageDigest.digest()));
		} catch (IOException e) {
			throw new CoreException(new Status(Status.ERROR,
					StagingPlugin.PLUGIN_ID, e.getLocalizedMessage(), e));
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				log.error("Trouble closing i/o resources", e);
			}
		}
		return result;
	}
}

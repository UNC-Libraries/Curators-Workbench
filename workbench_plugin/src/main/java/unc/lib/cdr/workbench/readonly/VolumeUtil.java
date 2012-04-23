package unc.lib.cdr.workbench.readonly;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;

import unc.lib.cdr.workbench.rcp.Activator;

public class VolumeUtil {
	public static final QualifiedName VOLUME_FINGERPRINT = new QualifiedName(Activator.PLUGIN_ID, "volume-fingerprint");
	public static Set<String> removableFileStoreTypes = new HashSet<String>();
	
	static {
		//removableFileStoreTypes.add("");
	}

	public static boolean isVolumeRemovable(IResource r) throws CoreException {
		FileStore fs = getFileStore(r);
		String type = fs.type();
		System.err.println("Is this a removable?  type="+type);
		return removableFileStoreTypes.contains(type);
	}

	public static void recordVolumeFingerprint(IResource resource) throws CoreException {
		long fp = makeVolumeFingerprint(resource);
		System.err.println("recording fingerprint: "+fp);
		resource.setPersistentProperty(VOLUME_FINGERPRINT, String.valueOf(fp));
	}
	
	public static boolean isSameVolume(IResource resource) throws CoreException {
		long fp = makeVolumeFingerprint(resource);
		String prop = resource.getPersistentProperty(VOLUME_FINGERPRINT);
		return (String.valueOf(fp).equals(prop));
	}
	
	/**
	 * Computes a fingerprint for the volume (FileStore) containing this resource based on the names and dates in the root directory.
	 * The fingerprint will include:
	 * 	volume root creation time (if available)
	 * 	volume root name
	 * 	volume root file key (if available)
	 * 	volume root's oldest constituent file's timestamp
	 * 
	 * @param resource
	 *           a resource
	 */
	public static long makeVolumeFingerprint(IResource resource) throws CoreException {
		FileStore fstore = getFileStore(resource);
		try {
			Path path = getPath(resource);
			Path volumeRoot = findTopResourceInVolume(fstore, path);
			System.err.println("Found volume root: " + volumeRoot);
			long oldestFileCreation = -1;
			File[] files = volumeRoot.toFile().listFiles();
			if(files != null) {
				for(File f : files) {
					BasicFileAttributeView v = FileSystems.getDefault().provider().getFileAttributeView(f.toPath(), BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
					BasicFileAttributes basic = v.readAttributes();
					long test = basic.creationTime().toMillis();
					if(test > oldestFileCreation) {
						oldestFileCreation = test;
					}
				}
			}
			String name = volumeRoot.toString();
			System.err.println("Found volume root name: "+name);
			if(fstore.supportsFileAttributeView("basic")) {
				BasicFileAttributeView v = FileSystems.getDefault().provider().getFileAttributeView(volumeRoot, BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
				BasicFileAttributes basic = v.readAttributes();
				System.err.println("Found volume root file key: "+basic.fileKey());
				System.err.println("Found volume root create time: "+basic.creationTime());
				long result = name.hashCode() ^ basic.fileKey().hashCode() ^ basic.creationTime().toMillis() ^ oldestFileCreation;
				return result;
			} else {
				return name.hashCode() ^ oldestFileCreation;
			}
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "IO Exception while making unique volume key", e));
		}
	}

	private static Path getPath(IResource dirty) {
		Path result = null;
		result = Paths.get(dirty.getLocation().toOSString());
		return result;
	}

	private static Path findTopResourceInVolume(FileStore fstore, Path path) throws IOException {
		Path parent = path.getParent();
		if (parent == null) {
			return path; // root will do for default file system
		} else {
			FileStore parentStore = FileSystems.getDefault().provider().getFileStore(parent);
			if (fstore.equals(parentStore)) {
				return findTopResourceInVolume(fstore, parent);
			} else {
				return path;
			}
		}
	}

	public static FileStore getFileStore(IResource resource) throws CoreException {
		Path path = getPath(resource);
		System.err.println(path.toUri());
		try {
			FileSystem fs = FileSystems.getDefault();
			FileStore fstore = fs.provider().getFileStore(path);
			return fstore;
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Unexpected I/O error", e));
		}
	}

}

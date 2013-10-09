/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.originals;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

import javax.swing.filechooser.FileSystemView;

import org.eclipse.core.runtime.QualifiedName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.rcp.Activator;

public class VolumeUtil {
	private static final Logger LOG = LoggerFactory.getLogger(VolumeUtil.class);

	public static final QualifiedName VOLUME_FINGERPRINT = new QualifiedName(
			Activator.PLUGIN_ID, "volume-fingerprint");

	/**
	 * Computes a fingerprint for the volume (FileStore) containing this
	 * resource based on the names and dates in the root directory. The
	 * fingerprint will include: volume name and volume root's oldest
	 * constituent file's timestamp
	 * 
	 * @param resource
	 *            a resource
	 */
	public static int makeVolumeFingerprint(URI uri) throws IOException {
		FileStore fstore = getFileStore(uri);
		Path path = Paths.get(uri);
		Path volumeRoot = findTopResourceInVolume(fstore, path);
		File fr = volumeRoot.toFile();
		String s1 = FileSystemView.getFileSystemView().getSystemDisplayName(fr);
		String s2 = FileSystemView.getFileSystemView()
				.getSystemTypeDescription(fr);
		LOG.debug("getSystemDisplayName : " + s1);
		LOG.debug("getSystemTypeDescription : " + s2);

		if ("/".equals(volumeRoot.toFile().getPath())) {
			return 0; // fake hash key for root linux filesystem
		}
		LOG.debug("Found volume root: " + volumeRoot);
		int hashvalue = 17;
		long oldestFileCreation = -1;
		File[] files = volumeRoot.toFile().listFiles();
		if (files != null) {
			for (File f : files) {
				// catch windows java bug with paths end in spaces
				if(!f.getName().trim().equals(f.getName())) continue;
				hashvalue = 37 * hashvalue + f.getName().hashCode();
				Path p = FileSystems.getDefault().getPath(f.getPath());
				BasicFileAttributeView v = FileSystems
						.getDefault()
						.provider()
						.getFileAttributeView(p,
								BasicFileAttributeView.class,
								LinkOption.NOFOLLOW_LINKS);
				BasicFileAttributes basic = v.readAttributes();
				long test = basic.creationTime().toMillis();
				if (test < oldestFileCreation) {
					oldestFileCreation = test;
				}
			}
		}
		String name = volumeRoot.toString();
		hashvalue = 37 * hashvalue + name.hashCode();
		int timestampHash = (int)(oldestFileCreation ^ (oldestFileCreation >>> 32));
		hashvalue = 37 * hashvalue + timestampHash;
		LOG.debug("Found volume root name: " + name);
		LOG.debug("Found volume oldest file: " + oldestFileCreation);
		return hashvalue;
	}

	public static URI getTopResourceInVolume(URI location) throws IOException {
		Path path = Paths.get(location);
		FileStore fstore = getFileStore(location);
		Path p = findTopResourceInVolume(fstore, path);
		try {
			URI result = new URI(location.getScheme(), location.getUserInfo(),
					location.getHost(), location.getPort(),
					p.toUri().getPath(), location.getQuery(),
					location.getFragment());
			return result;
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
	}

	private static Path findTopResourceInVolume(FileStore fstore, Path path)
			throws IOException {
		Path parent = path.getParent();
		if (parent == null) {
			return path; // root will do for default file system
		} else {
			FileStore parentStore = FileSystems.getDefault().provider()
					.getFileStore(parent);
			if (fstore.equals(parentStore)) {
				return findTopResourceInVolume(fstore, parent);
			} else {
				return path;
			}
		}
	}

	public static FileStore getFileStore(URI uri) throws IOException {
		Path path = Paths.get(uri);
		FileStore fstore = path.getFileSystem().provider().getFileStore(path);
		return fstore;
	}

}

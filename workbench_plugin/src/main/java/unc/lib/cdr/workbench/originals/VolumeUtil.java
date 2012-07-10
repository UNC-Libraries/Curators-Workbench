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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.QualifiedName;

import unc.lib.cdr.workbench.rcp.Activator;

public class VolumeUtil {
	public static final QualifiedName VOLUME_FINGERPRINT = new QualifiedName(Activator.PLUGIN_ID, "volume-fingerprint");
	public static Set<String> removableFileStoreTypes = new HashSet<String>();

	static {
		// removableFileStoreTypes.add("");
	}

	public static boolean isVolumeRemovable(URI uri) throws IOException {
		FileStore fs = getFileStore(uri);
		String type = fs.type();
		//System.err.println("Is this a removable?  type=" + type);
		return removableFileStoreTypes.contains(type);
	}

	/**
	 * Computes a fingerprint for the volume (FileStore) containing this resource based on the names and dates in the
	 * root directory. The fingerprint will include: volume root creation time (if available) volume root name volume
	 * root file key (if available) volume root's oldest constituent file's timestamp
	 * 
	 * @param resource
	 *           a resource
	 */
	public static int makeVolumeFingerprint(URI uri) throws IOException {
		FileStore fstore = getFileStore(uri);
		Path path = Paths.get(uri);
		Path volumeRoot = findTopResourceInVolume(fstore, path);
		if("/".equals(volumeRoot.toFile().getPath())) {
			return -1; // fake hash key for root linux filesystem
		}
		//System.err.println("Found volume root: " + volumeRoot);
		long oldestFileCreation = -1;
		File[] files = volumeRoot.toFile().listFiles();
		if (files != null) {
			for (File f : files) {
				BasicFileAttributeView v = FileSystems.getDefault().provider()
						.getFileAttributeView(f.toPath(), BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
				BasicFileAttributes basic = v.readAttributes();
				long test = basic.creationTime().toMillis();
				if (test > oldestFileCreation) {
					oldestFileCreation = test;
				}
			}
		}
		String name = volumeRoot.toString();
		System.err.println("Found volume root name: " + name);
		if (fstore.supportsFileAttributeView("basic")) {
			BasicFileAttributeView v = FileSystems.getDefault().provider()
					.getFileAttributeView(volumeRoot, BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
			BasicFileAttributes basic = v.readAttributes();
			System.err.println("Found volume root file key: " + basic.fileKey());
			System.err.println("Found volume root create time: " + basic.creationTime());
			System.err.println("Oldest file create time: " + basic.creationTime());
			int result = name.hashCode() ^ (int) basic.creationTime().toMillis()
					^ (int) oldestFileCreation;
			return result;
		} else {
			return name.hashCode() ^ (int) oldestFileCreation;
		}
	}

	public static URI getTopResourceInVolume(URI location) throws IOException {
		Path path = Paths.get(location);
		FileStore fstore = getFileStore(location);
		Path p = findTopResourceInVolume(fstore, path);
		try {
			URI result = new URI(location.getScheme(), location.getUserInfo(), location.getHost(), location.getPort(), p.toString(), location.getQuery(), location.getFragment());
			return result;
		} catch(URISyntaxException e) {
			throw new Error(e);
		}
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

	public static FileStore getFileStore(URI uri) throws IOException {
		Path path = Paths.get(uri);
		FileStore fstore = path.getFileSystem().provider().getFileStore(path);
		return fstore;
	}

}

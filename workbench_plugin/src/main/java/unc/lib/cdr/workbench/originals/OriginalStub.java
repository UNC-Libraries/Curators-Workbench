package unc.lib.cdr.workbench.originals;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class OriginalStub implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3465833912924570340L;

	private URI volumeRoot = null;

	public URI getVolumeRoot() {
		return volumeRoot;
	}

	private List<URI> locations = new ArrayList<URI>();
	private Map<URI, URI> prestageLocations = new HashMap<URI, URI>();
	private transient IProject project;
	private String projectName;
	private int volumeHash;
	private String volumeType;
	private String name;

	public String getVolumeType() {
		return volumeType;
	}

	private transient List<OriginalFileStore> stores = new ArrayList<OriginalFileStore>();

	public OriginalStub(URI volumeRoot, List<URI> locations, Map<URI, URI> prestageLocations, IProject project) {
		this.volumeRoot = volumeRoot;
		this.locations = locations;
		this.project = project;
		this.projectName = project.getName();
		if (prestageLocations != null)
			this.prestageLocations = prestageLocations;
		init();
		try {
			this.volumeHash = VolumeUtil.makeVolumeFingerprint(volumeRoot);
			this.volumeType = VolumeUtil.getFileStore(volumeRoot).type();
		} catch (IOException e) {
			throw new Error(e);
		}
		this.name = Paths.get(volumeRoot).toFile().getName();
		if(this.name == null || this.name.trim().length() == 0) {
			this.name = this.volumeRoot.toString();
			if("file:/".equals(this.name.trim())) this.name = "/";
		}
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return this.volumeHash * 17 + this.projectName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OriginalStub) {
			return ((OriginalStub) obj).hashCode() == this.hashCode();
		}
		return false;
	}

	private void init() {
		try {
			this.stores = new ArrayList<OriginalFileStore>();
			for (URI base : locations) {
				this.stores.add((OriginalFileStore) OriginalsFileSystem.wrapStore(base, this));
			}
			this.project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

	public IProject getProject() {
		if (project == null)
			init();
		return project;
	}

	public String getFileStoreName() {
		String result = null;
		Path path = Paths.get(volumeRoot);
		try {
			FileStore fs = Files.getFileStore(path);
			result = fs.name();
		} catch (IOException ignored) {
		}
		return result;
	}

	public URI getPrestageBase(URI location) {
		return prestageLocations.get(location);
	}

	public List<URI> getLocations() {
		return locations;
	}

	public void addLocations(Collection<URI> newLocations, Map<URI, URI> prestageLocations) {
		this.locations.addAll(newLocations);
		if (prestageLocations != null)
			this.prestageLocations.putAll(prestageLocations);
		init();
	}

	public int getVolumeHash() {
		return volumeHash;
	}

	public OriginalFileStore getVolumeRootStore() {
		try {
			return (OriginalFileStore) OriginalsFileSystem.wrapStore(this.volumeRoot, this);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

	public boolean isAttached() {
		try {
			int currentHash = VolumeUtil.makeVolumeFingerprint(this.getVolumeRoot());
			//System.err.println("hashes " + currentHash + " " + this.getVolumeHash());
			return (currentHash == this.getVolumeHash());
		} catch (NoSuchFileException e) {
			return false;
		} catch(java.nio.file.FileSystemException e) {
			return false;
		} catch (IOException e) {
			e.printStackTrace(System.err);
			return false;
		}
	}

	public List<OriginalFileStore> getStores() {
		if (this.stores == null || this.stores.isEmpty())
			init();
		return stores;
	}

}

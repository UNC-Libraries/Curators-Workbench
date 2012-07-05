package unc.lib.cdr.workbench.originals;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbench;

public class OriginalStub implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3465833912924570340L;

	private URI base;
	private transient IProject project;
	private String projectName;
	private int volumeHash;
	private String name;
	private transient OriginalFileStore store = null;
	private URI prestageBase;

	public OriginalStub(URI base, IProject project, URI prestageBase, String name) {
		this.base = base;
		this.project = project;
		this.projectName = project.getName();
		this.prestageBase = prestageBase;
		this.name = name;
		init();
		try {
			this.volumeHash = VolumeUtil.makeVolumeFingerprint(base);
			if(this.name == null) {
				Path path = Paths.get(base);
				String volumeName = null;
				try {
					FileStore fs = Files.getFileStore(path);
					volumeName = fs.name();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.name = volumeName == null ? this.store.getName() : this.store.getName()+" on "+volumeName;
			}
		} catch (CoreException e) {
			throw new Error(e);
		}
	}
	
	private void init() {
		try {
			this.store = (OriginalFileStore) OriginalsFileSystem.wrapStore(base, this);
			this.project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

	public IProject getProject() {
		if(project == null) init();
		return project;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URI getPrestageBase() {
		return prestageBase;
	}

	public void setPrestageBase(URI prestageBase) {
		this.prestageBase = prestageBase;
	}

	public URI getBase() {
		return base;
	}

	public int getVolumeHash() {
		return volumeHash;
	}

	public OriginalFileStore getStore() {
		if(this.store == null) init();
		return store;
	}

}

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
package unc.lib.cdr.workbench.capture;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.jobs.Job;

import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.originals.VolumeUtil;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsLinkJob extends Job {
	URI baselocation = null;
	List<URI> locations = null;
	String name = null;
	boolean removeable = false;
	IProject project = null;
	private boolean prestaged;
	private URI prestagedBase;

	OriginalsLinkJob(URI baselocation, List<URI> locations, IProject project, boolean prestaged, URI prestagedBase, boolean removeable) {
		super("creating link to " + locations.size() + " location(s)");
		this.baselocation = baselocation;
		this.locations = locations;
		this.project = project;
		this.removeable = removeable;
		this.prestaged = prestaged;
		this.prestagedBase = prestagedBase;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		System.out.println("starting link");
		monitor.beginTask("Linking to originals ...", this.locations.size());
		MetsProjectNature n = MetsProjectNature.get(project);
		try {
			Set<URI> volumes = new HashSet<URI>();
			Map<URI, Map<URI, URI>> volumeToPrestageLocations = new HashMap<URI, Map<URI, URI>>();
			Map<URI, List<URI>> volumeToLocations = new HashMap<URI, List<URI>>();
			for (URI location : locations) {
				System.out.println("location: "+location);
				IFileStore fs = EFS.getStore(location);
				URI volume = null;
				try {
					volume = VolumeUtil.getTopResourceInVolume(location);
					System.out.println("top resource in volume: "+volume);
				} catch(IOException e) {
					throw new Error(e);
				}
				volumes.add(volume);
				if(volumeToLocations.get(volume) == null) {
					volumeToLocations.put(volume, new ArrayList<URI>());
				}
				volumeToLocations.get(volume).add(location);
				
				URI myprestage = null;
				if (this.prestaged && this.prestagedBase != null && this.baselocation != null) {
					// calculate staging base for each original location
					IPath basePath = new Path(this.baselocation.getPath()); // base path for all locations
					IPath subPath = new Path(fs.toURI().getPath()).makeRelativeTo(basePath.removeLastSegments(1));
					String myprestagestr = prestagedBase.toString();
					if (subPath.segmentCount() > 0) {
						myprestage = prestagedBase;
						for (String s : subPath.segments()) {
							myprestage = URIUtil.append(myprestage, s);
						}
						if(volumeToPrestageLocations.get(volume) == null) {
							volumeToPrestageLocations.put(volume, new HashMap<URI, URI>());
						}
						volumeToPrestageLocations.get(volume).put(location, myprestage);
					}
				}
			}
			for(URI volumeRoot : volumes) {
				boolean foundStub = false;
				for(OriginalStub s :n.getOriginals()) {
					if(s.getVolumeRoot().equals(volumeRoot) && s.isAttached()) {
						s.addLocations(volumeToLocations.get(volumeRoot));
						foundStub = true;
						break;
					}
				}
				if(!foundStub) {
					OriginalStub original = new OriginalStub(volumeRoot, volumeToLocations.get(volumeRoot), this.project, this.removeable);
					n.addOriginal(original);
				}
			}
			n.save();
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			return e.getStatus();
		}
	}

}

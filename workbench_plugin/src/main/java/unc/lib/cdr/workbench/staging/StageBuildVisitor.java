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
package unc.lib.cdr.workbench.staging;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;

/**
 * @author Gregory Jansen
 * 
 */
public class StageBuildVisitor implements IResourceVisitor {
	private static final Logger log = LoggerFactory.getLogger(StageBuildVisitor.class);
	IProgressMonitor monitor = null;
	boolean audit = false;

	public StageBuildVisitor(boolean audit, IProgressMonitor monitor) {
		log.debug("created");
		this.monitor = monitor;
		this.audit = audit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources .IResource)
	 */
	@Override
	public boolean visit(IResource r) throws CoreException {
		if (this.monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		if (r instanceof IContainer) {
			return true;
		} else if (r instanceof IFile) {
			// is it already staged?
			IMarker[] captured = r.findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_ZERO);
			IMarker[] staged = r.findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO);
			if (captured.length > 0) {
				if (staged.length == 0) {
					StagingUtils.stage((IFile) r, new SubProgressMonitor(monitor, 1));
				} else {
					StagingUtils.audit((IFile) r, new SubProgressMonitor(monitor, 1));
				}
			}
		}
		return false;
	}

}

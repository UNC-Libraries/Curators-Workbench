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
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gregory Jansen
 *
 */
public class StageBuildDeltaVisitor implements IResourceDeltaVisitor {
    private static final Logger log = LoggerFactory.getLogger(StageBuildDeltaVisitor.class);
    IProgressMonitor monitor = null;

    public StageBuildDeltaVisitor(IProgressMonitor monitor) {
	log.debug("created");
	this.monitor = monitor;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core
     * .resources.IResourceDelta)
     */
    @Override
    public boolean visit(IResourceDelta delta) throws CoreException {
	if (this.monitor.isCanceled()) {
	    throw new OperationCanceledException();
	}
	IResource r = delta.getResource();
	if (r instanceof IContainer) {
	    return true;
	} else if (r instanceof IFile) {
	    IMarkerDelta[] md = delta.getMarkerDeltas();
	    for (IMarkerDelta d : md) {
		// TODO implement staging and audit code for delta..
//		if (IResourceConstants.MARKER_TO_STAGE.equals(d.getType())) {
//		    if (IResourceDelta.REMOVED != d.getKind()) {
//			StagingUtils.stage((IFile) r, new SubProgressMonitor(monitor, 1));
//		    }
//		}
	    }
	}
	return false;
    }

}

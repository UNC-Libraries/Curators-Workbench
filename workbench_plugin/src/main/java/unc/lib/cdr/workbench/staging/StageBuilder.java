package unc.lib.cdr.workbench.staging;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;

public class StageBuilder extends IncrementalProjectBuilder {
    private static final Logger log = LoggerFactory.getLogger(StageBuilder.class);

    public StageBuilder() {
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
     *
     * audits and repairs previously staged files when arg["verify"] == Boolean.True
     */
    @Override
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
	IProject[] result = null;
	boolean audit = false;
	if(args != null && Boolean.TRUE.equals(args.get("audit"))) {
	    audit = true;
	}
	//IResourceDelta delta = getDelta(getProject());
	//if (delta == null) {
	    fullBuild(audit, monitor);
	//} else {
	//    incrementalBuild(delta, audit, monitor);
	//}
	ResourcesPlugin.getWorkspace().save(false, monitor);
	return result;
    }

    protected void fullBuild(boolean audit, final IProgressMonitor monitor) throws CoreException {
	int audits = 0;
	int stages = 0;
	IMarker[] captured = getProject().findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_INFINITE);
	Set<IFile> toStage = new HashSet<IFile>();
	for(IMarker m : captured) {
	    if(m.getResource() instanceof IFile) {
		IMarker[] staged = m.getResource().findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO);
		if(staged.length > 0) {
		    audits++;
		} else {
		    stages++;
		}
	    }
	}
	if(audit) {
	    monitor.beginTask("Staging " + stages + " files and auditing "+audits+".", audits+stages);
	    log.debug("Staging " + stages + " files and auditing "+audits+"...");
	} else {
	    monitor.beginTask("Staging " + stages + " files..", stages);
	    log.debug("Staging " + stages + " files...");
	}
	getProject().accept(new StageBuildVisitor(audit, monitor));
    }

/*    protected void incrementalBuild(IResourceDelta delta, boolean audit, IProgressMonitor monitor) throws CoreException {
	int audits = 0;
	int stages = 0;
	delta.g
	IMarkerDelta[] mds = delta.getMarkerDeltas();
	for()



	.getResource().findMarkers(IResourceConstants.MARKER_TO_STAGE, false, IResource.DEPTH_INFINITE).length;
	monitor.beginTask("Staging " + num + " files..", num);
	log.debug("Staging " + num + " files..");
	// the visitor does the work.
	delta.accept(new StageBuildDeltaVisitor(audit, monitor));
    }*/



}

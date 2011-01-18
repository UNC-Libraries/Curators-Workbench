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
package unc.lib.cdr.workbench.accession;

import java.net.URI;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class LinkOriginalsHandler extends AbstractHandler implements IJobChangeListener {

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#aboutToRun(org.eclipse
     * .core.runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void aboutToRun(IJobChangeEvent event) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#awake(org.eclipse.core
     * .runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void awake(IJobChangeEvent event) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#done(org.eclipse.core
     * .runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void done(IJobChangeEvent event) {
	if (event.getJob() instanceof OriginalsLinkJob && event.getResult().isOK()) {
	    OriginalsLinkJob j1 = (OriginalsLinkJob) event.getJob();
	    Job snapshotJob = new OriginalFolderSnapshotJob(j1.getLinkFolder(), false);
	    snapshotJob.schedule(Job.BUILD);
	}
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#running(org.eclipse.
     * core.runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void running(IJobChangeEvent event) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#scheduled(org.eclipse
     * .core.runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void scheduled(IJobChangeEvent event) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.jobs.IJobChangeListener#sleeping(org.eclipse
     * .core.runtime.jobs.IJobChangeEvent)
     */
    @Override
    public void sleeping(IJobChangeEvent event) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
     * ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
	Object sel = select.getFirstElement();

	if (sel != null && (sel instanceof IProject || sel instanceof OriginalFoldersProjectElement)) {

	    IProject project = null;
	    if(sel instanceof OriginalFoldersProjectElement) {
		project = ((OriginalFoldersProjectElement)sel).getProject();
	    } else {
		project = (IProject)sel;
	    }
	    LinkOriginalsWizard wiz = new LinkOriginalsWizard(project);
	    WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wiz);
	    if (WizardDialog.OK == dialog.open()) {
		URI selected = wiz.getSelectedLocation();
		String name = wiz.getName();
		String description = wiz.getDescription();
		//String mediaType = wiz.getMediaType();
		// add link to the project
		Job linkJob = new OriginalsLinkJob(selected, name, project);
		linkJob.addJobChangeListener(this);
		linkJob.schedule(Job.LONG);
	    }
	    return null;
	} else {
	    throw new ExecutionException("only runs on projects and originals element");
	}
    }

}

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
package unc.lib.cdr.workbench.project;

import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MetsType;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class MetsValidationJob extends Job {
    IProject project = null;

    /**
     * @param name
     */
    public MetsValidationJob(IProject project) {
	super("Validating METS for project " + project.getName());
	this.project = project;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
	try {
	    MetsProjectNature mpn = (MetsProjectNature) this.project.getNature(MetsProjectNature.NATURE_ID);
	    MetsType mets;
	    mets = mpn.getMets();
	    DocumentRoot root = (DocumentRoot) mets.eContainer();
	    Resource res = (Resource) root.eContainer();
	    mpn.save();
	    mpn.load();
	    EList<Diagnostic> errs = res.getErrors();
	    if (errs.size() > 0) {
		return new Status(Status.ERROR, Activator.PLUGIN_ID, "Found " + errs.size() + " errors in METS.");
	    }
	    return Status.OK_STATUS;
	} catch (CoreException e) {
	    return e.getStatus();
	}
    }

}

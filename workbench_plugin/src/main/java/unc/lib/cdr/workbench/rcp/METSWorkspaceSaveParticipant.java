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
package unc.lib.cdr.workbench.rcp;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ISaveContext;
import org.eclipse.core.resources.ISaveParticipant;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class METSWorkspaceSaveParticipant implements ISaveParticipant {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.ISaveParticipant#doneSaving(org.eclipse.core .resources.ISaveContext)
	 */
	@Override
	public void doneSaving(ISaveContext context) {
		// TODO Auto-generated method stub
		// resume paused operations
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.ISaveParticipant#prepareToSave(org.eclipse .core.resources.ISaveContext)
	 */
	@Override
	public void prepareToSave(ISaveContext context) throws CoreException {
		// TODO Auto-generated method stub
		// stop/pause all operations
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.ISaveParticipant#rollback(org.eclipse.core .resources.ISaveContext)
	 */
	@Override
	public void rollback(ISaveContext context) {
		// load model from last saved state
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			// TODO implement rollback via EMF
			// if (p.hasNature(MetsProjectNature.NATURE_ID)) {
			// MetsProjectNature n = (MetsProjectNature)
			// p.getNature(MetsProjectNature.NATURE_ID);

			// persist workbench mets object to file
			// n.saveMETS(context.getSaveNumber());
			// }
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.ISaveParticipant#saving(org.eclipse.core.resources .ISaveContext)
	 */
	@Override
	public void saving(ISaveContext context) throws CoreException {
		// find all projects with METS nature
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (p.isOpen() && p.hasNature(MetsProjectNature.NATURE_ID)) {
				MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				n.save();
			}
		}
	}

}

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

import gov.loc.mets.DivType;
import gov.loc.mets.MetsType1;
import gov.loc.mets.StructMapType;
import gov.loc.mets.util.METSUtils;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.rcp.Activator;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * @author Gregory Jansen
 * 
 */
public class CSVArrangementExportJob extends Job {
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CSVArrangementExportJob.class);

	IProject p = null;
	String filepath = null;

	public CSVArrangementExportJob(IProject p, String filepath) {
		super("Exporting arrangement of '" + p.getName() + "' as CSV");
		this.p = p;
		this.filepath = filepath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		MetsProjectNature n = null;
		try {
			n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "There was a problem obtaining the METS project nature.",
					e);
		}
		MetsType1 workbench = n.getMets();
		DivType bag = METSUtils.findBagDiv(workbench);

		// setup CSV file handler
		CSVWriter writer = null;
		try {
			writer = new CSVWriter(new FileWriter(filepath));
			writer.writeNext(new String[] {"order", "depth", "pid", "label"});
			int order = 1;
			for (TreeIterator<EObject> iter = bag.eAllContents(); iter.hasNext();) {
				EObject eo = iter.next();
				if (eo instanceof DivType) {
					DivType d = (DivType) eo;
					String uuid = METSUtils.getUUID(d);
					int depth = METSUtils.getDepth(d);
					writer.writeNext(new String[] { String.valueOf(order), String.valueOf(depth), uuid, d.getLABEL1() });
					order++;
				}
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open the export file: " + filepath);
		}

		try {
			p.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}

}

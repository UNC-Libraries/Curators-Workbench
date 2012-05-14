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
package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ResourceTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.capture.CaptureJob;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class ArrangementDropListener extends ViewerDropAdapter {
	private static final Logger LOG = LoggerFactory.getLogger(ArrangementDropListener.class);

	private IStructuredSelection select = null;
	private Viewer viewer = null;

	/**
	 * @param viewer
	 */
	public ArrangementDropListener(Viewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	private void refresh() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!viewer.getControl().isDisposed()) {
					viewer.refresh();
				}
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ViewerDropAdapter#performDrop(java.lang.Object)
	 */
	@Override
	public boolean performDrop(Object data) {
		LOG.debug("performDrop called with data: " + data);
		boolean result = false;
		if (this.select != null && this.select.toList().size() > 0) {
			List<Object> items = this.select.toList();
			List<DivType> divs = null;
			List<MdSecType> mdSecs = null;
			for (Object o : items) {
				if (o instanceof DivType) {
					if (divs == null)
						divs = new ArrayList<DivType>();
					divs.add((DivType) o);
				} else if (o instanceof MdSecType) {
					if (mdSecs == null)
						mdSecs = new ArrayList<MdSecType>();
					mdSecs.add((MdSecType) o);
				}
			}
			if (divs != null && divs.size() > 0) {
				result = dropDivs(divs);
			}
			if (mdSecs != null && mdSecs.size() > 0) {
				boolean result2 = dropMdSecs(mdSecs);
				result = result || result2;
			}
		} else if (data instanceof IResource[]) {
			IResource[] res = (IResource[]) data;
			List<IResource> items = new ArrayList<IResource>(res.length);
			for (IResource r : res) {
				items.add(r);
			}
			result = dropResources(items);
		}
		refresh();
		return result;
	}

	/**
	 * @param mdSecs
	 * @return
	 */
	private boolean dropMdSecs(List<MdSecType> mdSecs) {
		LOG.debug("dropMdSecType called");
		if (this.getCurrentTarget() instanceof DivType) {
			DivType div = (DivType) this.getCurrentTarget();
			EditingDomain domain = MetsProjectNature.getEditingDomain(div);
			MdSecType md = mdSecs.get(0); // can only drop one record at a time

			CompoundCommand comboCommand = new CompoundCommand("user matching crosswalked record to object");

			List<MdSecType> newDMDIDs = new ArrayList<MdSecType>();
			newDMDIDs.addAll(div.getDmdSec());
			newDMDIDs.add(md);
			Command dmdidCmd = SetCommand.create(domain, div, MetsPackage.eINSTANCE.getDivType_DmdSec(), newDMDIDs);
			Command mdStatusCmd = SetCommand.create(domain, md, MetsPackage.eINSTANCE.getMdSecType_STATUS(),
					METSConstants.MD_STATUS_CROSSWALK_USER_LINKED);
			comboCommand.append(dmdidCmd);
			comboCommand.append(mdStatusCmd);
			if (comboCommand.canExecute()) {
				comboCommand.execute();
				return true;
			} else {
				LOG.debug("Cannot execute drop command: " + comboCommand.toString());
				return false;
			}
		}
		return false;
	}

	/**
	 * @param items
	 * @return
	 */
	private boolean dropDivs(List<DivType> items) {
		LOG.debug("dropping Divs");
		if (this.getCurrentTarget() instanceof IProject) {
			IProject p = (IProject) this.getCurrentTarget();
			try {
				MetsProjectNature mpn = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				MetsType m = mpn.getMets();
				DivType bag = METSUtils.findBagDiv(m);
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop at top level, first
						insertOrMoveAll(items, bag, 0);
						break;
					case ViewerDropAdapter.LOCATION_NONE:
					case ViewerDropAdapter.LOCATION_BEFORE:
					case ViewerDropAdapter.LOCATION_ON:
						// drop at top level, last
						insertOrMoveAll(items, bag, bag.getDiv().size());
						break;
				}
			} catch (CoreException e) {
				throw new Error(e);
			}
		} else if (this.getCurrentTarget() instanceof DivType) {
			DivType d = (DivType) this.getCurrentTarget();
			DivType parent = (DivType) d.eContainer();
			int parentIndex = parent.getDiv().indexOf(d);
			if (METSUtils.isContainer(d)) {
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						insertOrMoveAll(items, parent, parentIndex);
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop after this div
						insertOrMoveAll(items, parent, parentIndex + 1);
						break;
					case ViewerDropAdapter.LOCATION_NONE:
					case ViewerDropAdapter.LOCATION_ON:
						// drop in this div, last
						insertOrMoveAll(items, d, d.getDiv().size());
						break;
				}
			} else {
				// it is a File
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						insertOrMoveAll(items, parent, parentIndex);
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop after this div
						insertOrMoveAll(items, parent, parentIndex + 1);
						break;
					default:
						return false;
				}
			}
		}
		return true;
	}

	private void insertOrMoveAll(List<DivType> items, DivType dest, int index) {
		Iterator<DivType> i = items.iterator();
		int insertIndex = index;
		while (i.hasNext()) {
			DivType d = i.next();
			if (dest.getDiv().contains(d)) {
				int current = dest.getDiv().indexOf(d);
				if (current < insertIndex) {
					insertIndex--;
				}
				dest.getDiv().move(insertIndex, d);
				insertIndex = dest.getDiv().indexOf(d) + 1;
			} else {
				if (insertIndex < dest.getDiv().size()) {
					dest.getDiv().add(insertIndex, d);
				} else {
					dest.getDiv().add(d);
				}
				insertIndex++;
			}
		}
	}

	@Override
	public void drop(DropTargetEvent event) {
		select = null;
		LOG.debug("event dataTypes: " + event.dataTypes);
		if (ResourceTransfer.getInstance().isSupportedType(event.currentDataType)) {
			LOG.debug("found resource transfer, event data: " + event.data);
		} else if (LocalSelectionTransfer.getTransfer().isSupportedType(event.currentDataType)) {
			LOG.debug("found local selection transfer data, event data: " + event.data);
			// put the transfer data somewhere safe
			select = (IStructuredSelection) LocalSelectionTransfer.getTransfer().getSelection();
			LOG.debug("selection: " + select);
		}
		super.drop(event);
	}

	private boolean dropResources(List<IResource> items) {
		LOG.debug("dropping Resources");
		CaptureJob job = null;
		if (this.getCurrentTarget() instanceof IProject) {
			IProject p = (IProject) this.getCurrentTarget();
			try {
				MetsProjectNature mpn = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				MetsType m = mpn.getMets();
				DivType bag = METSUtils.findBagDiv(m);
				DivType insertBefore = null;
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_NONE:
					case ViewerDropAdapter.LOCATION_BEFORE:
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop at top level, first
						if (bag.getDiv().size() > 0) {
							insertBefore = bag.getDiv().get(0);
						}
					case ViewerDropAdapter.LOCATION_ON:
						// drop at top level, last
						job = new CaptureJob("Capturing dragged resources at top of arrangement", items, bag, insertBefore);
						break;
				}
			} catch (CoreException e) {
				throw new Error(e);
			}
		} else if (this.getCurrentTarget() instanceof DivType) {
			DivType d = (DivType) this.getCurrentTarget();
			if (METSUtils.isContainer(d)) {
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_NONE:
						break;
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), d);
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop after this div
						DivType insertBefore = null;
						DivType parent = (DivType) d.eContainer();
						int idx = parent.getDiv().indexOf(d);
						if (idx + 1 < parent.getDiv().size()) {
							insertBefore = parent.getDiv().get(idx + 1);
						}
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), insertBefore);
						break;
					case ViewerDropAdapter.LOCATION_ON:
						// drop in this div, last
						job = new CaptureJob("Capturing dragged resources at specified location", items, d, null);
						break;
				}
			} else {
				// it is a File
				switch (this.getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), d);
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop after this div
						DivType insertBefore = null;
						DivType parent = (DivType) d.eContainer();
						int idx = parent.getDiv().indexOf(d);
						if (idx + 1 < parent.getDiv().size()) {
							insertBefore = parent.getDiv().get(idx + 1);
						}
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), insertBefore);
						break;
				}
			}
		}

		if (job != null) {
			job.schedule(Job.LONG);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ViewerDropAdapter#validateDrop(java.lang.Object , int,
	 * org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	public boolean validateDrop(Object target, int operation, TransferData transferData) {
		LOG.debug("validateDrop with transferdata: " + transferData);
		// first all dropped items must be divs or IResources from .originals folder
		try {
	   	 IStructuredSelection sel = (IStructuredSelection)LocalSelectionTransfer.getTransfer().getSelection();
	   	 for(Object o : sel.toArray()) {
	   		 if(o instanceof IResource) {
	   			 IResource r = (IResource)o;
	   			 if (!MetsProjectNature.ORIGINALS_FOLDER_NAME.equals(r.getProjectRelativePath().segment(0))) {
	   				 return false;
	   			 }
	   		 } else if(o instanceof DivType) {
	   			 continue;
	   		 } else {
	   			 return false;
	   		 }
	   	}
	   } catch(ClassCastException e) {
	   	return false;
	   }
		
		if(target instanceof DivType) {
		  DivType d = (DivType)target;
		  if(operation == ViewerDropAdapter.LOCATION_ON && !METSConstants.Div_File.equals(d.getTYPE())) {
		    return false;
		  }
		}
		return true;
	}

}

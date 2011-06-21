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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.capture.CaptureJob;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ArrangementCommonDropAdapterAssistant extends CommonDropAdapterAssistant {

	@Override
	public void setCommonDropAdapter(CommonDropAdapter dropAdapter) {
		super.setCommonDropAdapter(dropAdapter);
		dropAdapter.setFeedbackEnabled(true);
	}

	@Override
	public boolean isSupportedType(TransferData aTransferType) {
		if (LocalSelectionTransfer.getTransfer().isSupportedType(aTransferType)) {
			LOG.debug("found local selection transfer type");
			return true;
		} /*
			 * else if (ResourceTransfer.getInstance().isSupportedType(aTransferType)) {
			 * LOG.debug("found resource transfer type"); return true; } else if
			 * (PluginTransfer.getInstance().isSupportedType(aTransferType)) { LOG.debug("found plugin transfer type");
			 * return true; } /*else if (FileTransfer.getInstance().isSupportedType(aTransferType)) {
			 * LOG.debug("found file transfer type"); return true; }
			 */else {
			return false;
		}
	}

	private static final Logger LOG = LoggerFactory.getLogger(ArrangementCommonDropAdapterAssistant.class);

	@Override
	public IStatus validateDrop(Object target, int operation, TransferData transferType) {
		LOG.debug("validateDrop with: " + transferType + "|" + target);
		boolean foo = LocalSelectionTransfer.getTransfer().isSupportedType(transferType);
		LOG.debug("local selection? :" + foo);
		IStatus result = Status.CANCEL_STATUS;
		if (target instanceof DivType) {
			DivType d = (DivType) target;
			// if (this.getCommonDropAdapter().getCurrentLocation() ==
			// ViewerDropAdapter.LOCATION_ON
			// && METSConstants.Div_File.equals(d.getTYPE())) {
			// result = Status.CANCEL_STATUS;
			// } else {
			result = Status.OK_STATUS;
			// }
		} else if (target instanceof ArrangementProjectElement) {
			result = Status.OK_STATUS;
		}
		LOG.debug("result:" + result.getMessage());
		return result;
	}

	@Override
	public IStatus validatePluginTransferDrop(IStructuredSelection aDragSelection, Object aDropTarget) {
		LOG.debug("trying to validate plugin transfer drop");
		return super.validatePluginTransferDrop(aDragSelection, aDropTarget);
	}

	@Override
	public IStatus handleDrop(CommonDropAdapter aDropAdapter, DropTargetEvent event, Object aTarget) {
		LOG.debug("handle drop found transfer type:" + aDropAdapter.getCurrentTransfer());
		event.detail = DND.DROP_NONE;
		/*
		 * if (ResourceTransfer.getInstance().isSupportedType(aDropAdapter. getCurrentTransfer())) {
		 * LOG.debug("found resource transfer, event data: " + event.data); IResource[] res = (IResource[]) event.data;
		 * List<IResource> items = new ArrayList<IResource>(res.length); for (IResource r : res) { items.add(r); } return
		 * dropResources(items); } else
		 */
		if (LocalSelectionTransfer.getTransfer().isSupportedType(event.currentDataType)) {
			LOG.debug("found local selection transfer data, event data: " + event.data);
			// put the transfer data somewhere safe
			IStructuredSelection select = (IStructuredSelection) LocalSelectionTransfer.getTransfer().getSelection();
			LOG.debug("selection: " + select);
			List items = select.toList();
			if (items.size() > 0) {
				if (items.get(0) instanceof IResource) {
					return dropResources(items);
				} else if (items.get(0) instanceof DivType) {
					return dropDivs(items);
				} else if (items.get(0) instanceof MdSecType) {
					return dropMdSecs(items);
				}
			}
		}
		return Status.CANCEL_STATUS;

	}

	/**
	 * @param mdSecs
	 * @return
	 */
	private IStatus dropMdSecs(List mdSecs) {
		LOG.debug("dropMdSecs called");
		if (getCommonDropAdapter().getCurrentTarget() instanceof DivType) {
			MdSecType md = (MdSecType) mdSecs.get(0); // can only drop one
			// record at a time
			MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject(md);
			DivType bag = METSUtils.findBagDiv(mpn.getMets());
			CompoundCommand comboCommand = new CompoundCommand("match crosswalked record to object");

			// unlink the mdSec from any divs
			Iterator iter = bag.eAllContents();
			while (iter.hasNext()) {
				Object o = iter.next();
				if (o instanceof DivType) {
					DivType d = (DivType) o;
					if (d.getDmdSec().contains(md)) {
						List<MdSecType> dmdSecs = new ArrayList<MdSecType>();
						dmdSecs.addAll(d.getDmdSec());
						dmdSecs.remove(md);
						Command removeDMDID = SetCommand.create(mpn.getEditingDomain(), d,
								MetsPackage.eINSTANCE.getDivType_DmdSec(), dmdSecs);
						comboCommand.append(removeDMDID);
					}
				}
			}

			DivType div = (DivType) getCommonDropAdapter().getCurrentTarget();

			// add new link
			// set the status of the mdSec to user linked crosswalk
			Command setStatus = SetCommand.create(mpn.getEditingDomain(), md, MetsPackage.eINSTANCE.getMdSecType_STATUS(),
					METSConstants.MD_STATUS_CROSSWALK_USER_LINKED);
			comboCommand.append(setStatus);

			List<MdSecType> newDMDIDs = new ArrayList<MdSecType>();
			newDMDIDs.addAll(div.getDmdSec());
			newDMDIDs.add(md);
			Command dmdidCmd = SetCommand.create(mpn.getEditingDomain(), div, MetsPackage.eINSTANCE.getDivType_DmdSec(),
					newDMDIDs);
			comboCommand.append(dmdidCmd);

			if (comboCommand.canExecute()) {
				comboCommand.execute();
			} else {
				LOG.debug("Cannot execute drop command: " + comboCommand.toString());
			}
			return Status.OK_STATUS;
		}
		return Status.CANCEL_STATUS;
	}

	/**
	 * @param items
	 * @return
	 */
	private IStatus dropDivs(List<DivType> items) {
		LOG.debug("dropping Divs");
		Object target = getCommonDropAdapter().getCurrentTarget();
		if (target instanceof ArrangementProjectElement) {
			ArrangementProjectElement e = (ArrangementProjectElement) target;
			MetsProjectNature mpn = e.getProjectNature();
			MetsType m = mpn.getMets();
			DivType bag = METSUtils.findBagDiv(m);
			switch (getCommonDropAdapter().getCurrentLocation()) {
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
		} else if (target instanceof DivType) {
			DivType d = (DivType) target;
			DivType parent = (DivType) d.eContainer();
			int parentIndex = parent.getDiv().indexOf(d);
			if (METSUtils.isContainer(d)) {
				switch (getCommonDropAdapter().getCurrentLocation()) {
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
				switch (getCommonDropAdapter().getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						insertOrMoveAll(items, parent, parentIndex);
						break;
					case ViewerDropAdapter.LOCATION_AFTER:
						// drop after this div
						insertOrMoveAll(items, parent, parentIndex + 1);
						break;
					default:
						return Status.CANCEL_STATUS;
				}
			}
		}
		return Status.OK_STATUS;
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

	private IStatus dropResources(List<IResource> items) {
		LOG.debug("dropping Resources");
		CaptureJob job = null;
		Object target = getCommonDropAdapter().getCurrentTarget();
		if (target instanceof ArrangementProjectElement) {
			ArrangementProjectElement e = (ArrangementProjectElement) target;
			MetsProjectNature mpn = e.getProjectNature();
			MetsType m = mpn.getMets();
			DivType bag = METSUtils.findBagDiv(m);
			DivType insertBefore = null;
			switch (getCommonDropAdapter().getCurrentLocation()) {
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
					job = new CaptureJob("Capturing dragged resources at top of arrangement", items, bag, insertBefore,
							false);
					break;
			}
		} else if (getCommonDropAdapter().getCurrentTarget() instanceof DivType) {
			DivType d = (DivType) getCommonDropAdapter().getCurrentTarget();
			if (METSUtils.isContainer(d)) {
				switch (getCommonDropAdapter().getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_NONE:
						break;
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), d, false);
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
								(DivType) d.eContainer(), insertBefore, false);
						break;
					case ViewerDropAdapter.LOCATION_ON:
						// drop in this div, last
						job = new CaptureJob("Capturing dragged resources at specified location", items, d, null, false);
						break;
				}
			} else {
				// it is a File
				switch (getCommonDropAdapter().getCurrentLocation()) {
					case ViewerDropAdapter.LOCATION_BEFORE:
						// drop before this div
						job = new CaptureJob("Capturing dragged resources at specified location", items,
								(DivType) d.eContainer(), d, false);
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
								(DivType) d.eContainer(), insertBefore, false);
						break;
				}
			}
		}

		if (job != null) {
			job.schedule(Job.LONG);
			return Status.OK_STATUS;
		}
		return Status.CANCEL_STATUS;
	}

}

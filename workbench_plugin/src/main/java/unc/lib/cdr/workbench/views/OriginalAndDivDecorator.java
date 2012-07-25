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
package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.views.LabelImageFactory.Icon;

public class OriginalAndDivDecorator implements ILightweightLabelDecorator {
	Set<ILabelProviderListener> listeners = new HashSet<ILabelProviderListener>();

	public OriginalAndDivDecorator() {
		// TODO register as listener to capture and staging changes (less granular this time)
	}

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(OriginalAndDivDecorator.class);

	@Override
	public void addListener(ILabelProviderListener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void dispose() {
		this.listeners.clear();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		this.listeners.remove(listener);
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof OriginalStub) {
			decorateOriginalStub((OriginalStub) element, decoration);
			return;
		}
		OriginalFileStore r = null;
		boolean isDiv = false;
		// added/captured, queued/staged BR
		List<String> labels = new ArrayList<String>();
		if (element instanceof OriginalFileStore) {
			r = (OriginalFileStore) element;
			// add prefix of "../" to these when not under volume root
			if (r.getWrapped().getParent() != null) {
				if (r.getOriginalStub().getStores().contains(r)) {
					if (!r.getOriginalStub().getVolumeRootStore().getWrapped().equals(r.getWrapped().getParent())) {
						decoration.addPrefix(".../");
					}
				}
			}
		} else if (element instanceof DivType) {
			isDiv = true;
			DivType d = (DivType) element;
			Object adapted = Platform.getAdapterManager().getAdapter(d, OriginalFileStore.class);
			if (adapted != null && adapted instanceof OriginalFileStore) {
				r = (OriginalFileStore) adapted;
			}
			// described, crosswalked
			// MetsProjectNature n = MetsProjectNature.getNatureForMetsObject(d);
			for (MdSecType md : d.getDmdSec()) {
				if (md != null) {
					String st = md.getSTATUS();
					if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(st)) {
						decoration.addOverlay(Icon.CrosswalkedDecor.getImageDescriptor(), IDecoration.BOTTOM_LEFT);
					} else if (METSConstants.MD_STATUS_USER_EDITED.equals(st)) {
						decoration.addOverlay(Icon.UserEditedDecor.getImageDescriptor(), IDecoration.TOP_RIGHT);
					} else if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(st)) {
						decoration.addOverlay(Icon.CrosswalkedDecor.getImageDescriptor(), IDecoration.BOTTOM_LEFT);
					}
				}
			}
			for (MdSecType md : d.getMdSec()) { // process admin metadata overlays
				if (md != null) {
					if (MetsPackage.eINSTANCE.getAmdSecType_RightsMD().equals(md.eContainingFeature())) {
						decoration.addOverlay(Icon.ACLDecor.getImageDescriptor(), IDecoration.TOP_LEFT);
					}
				}
			}
			// add labels for links of which this div is the object
			for (SmLinkType sml : METSUtils.getObjectLinks(d)) {
				labels.add(METSConstants.getLinkForArcRole(sml.getArcrole()).label);
			}

		}

		ImageDescriptor overlay = null;
		if (r != null && r.getProject() != null && r.getProject().isOpen()) {
			boolean captured = false;
			if (r.getMetsDivType() != null) {
				captured = true;
				if (!isDiv) {
					labels.add("captured");
				}
			}
			URI prestage = r.getOriginalStub().getPrestageBase(r.getWrapped().toURI());
			if (prestage != null) {
				labels.add("pre-staged=>" + prestage.toString());
			}
			if (r.getStagingLocatorType() != null) {
				// captured file (original or the div)
				overlay = Icon.StagedDecor.getImageDescriptor();
				labels.add("staged");
			} else {
				if (captured && !r.fetchInfo().isDirectory()) {
					overlay = Icon.CaptureDecor.getImageDescriptor();
					labels.add("queued");
				}
			}
		} else {
			if (isDiv) {
				labels.add("added");
			}
		}
		if (overlay != null) {
			decoration.addOverlay(overlay, IDecoration.BOTTOM_RIGHT);
		}
		if (labels.size() > 0) {
			// decoration.setForegroundColor(org.eclipse.swt.graphics.);
			StringBuilder sb = new StringBuilder();
			sb.append("  [");
			sb.append(labels.remove(0));
			for (String label : labels) {
				sb.append("  ").append(label);
			}
			sb.append("]");
			decoration.addSuffix(sb.toString());
		}
	}

	private void decorateOriginalStub(OriginalStub stub, IDecoration decoration) {
		decoration.addPrefix("Originals on ");
		List<String> labels = new ArrayList<String>();
		// ejected overlay for detached disks
		if (!stub.isAttached()) {
			decoration.addOverlay(Icon.EjectedDecore.getImageDescriptor(), IDecoration.TOP_RIGHT);
		}
		labels.add(stub.getVolumeType());
		if (labels.size() > 0) {
			// decoration.setForegroundColor(org.eclipse.swt.graphics.);
			StringBuilder sb = new StringBuilder();
			sb.append("  [");
			sb.append(labels.remove(0));
			for (String label : labels) {
				sb.append("  ").append(label);
			}
			sb.append("]");
			decoration.addSuffix(sb.toString());
		}
	}
}

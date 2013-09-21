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

import edu.unc.lib.staging.SharedStagingArea;
import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.impl.DivTypeImpl;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.views.LabelImageFactory.Icon;

public class OriginalAndDivDecorator implements ILightweightLabelDecorator {
	
	Set<ILabelProviderListener> listeners = new HashSet<ILabelProviderListener>();

	public OriginalAndDivDecorator() {
		// TODO register as listener to capture and staging changes (less
		// granular this time)
	}

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory
			.getLogger(OriginalAndDivDecorator.class);

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
		boolean isFile = false;
		// added/captured, queued/staged BR
		List<String> labels = new ArrayList<String>();
		if (element instanceof OriginalFileStore) {
			r = (OriginalFileStore) element;
			if(r.isAttached()) {
				IFileInfo info = r.fetchInfo();
				if(info.exists() && !info.isDirectory()) isFile = true;
			}
			// add prefix of "../" to these when not under volume root
			if (r.getWrapped().getParent() != null) {
				if (r.getOriginalStub().getStores().contains(r)) {
					if (!r.getOriginalStub().getVolumeRootStore().getWrapped()
							.equals(r.getWrapped().getParent())) {
						decoration.addPrefix(".../");
					}
				}
			}
		} else if (DivTypeImpl.class.isInstance(element)) {
			isDiv = true;
			DivType d = (DivType) element;
			if (METSConstants.Div_File.equals(d.getTYPE())) {
				isFile = true;
			}
			Object adapted = Platform.getAdapterManager().getAdapter(d,
					OriginalFileStore.class);
			if (adapted != null && adapted instanceof OriginalFileStore) {
				r = (OriginalFileStore) adapted;
			}

			// Descriptions Decor
			boolean hasUserEdited = false;
			boolean hasCrosswalked = false;
			for (MdSecType md : d.getDmdSec()) {
				String st = md.getSTATUS();
				if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(st)
						|| METSConstants.MD_STATUS_CROSSWALK_USER_LINKED
								.equals(st)) {
					hasCrosswalked = true;
				} else if (METSConstants.MD_STATUS_USER_EDITED.equals(st)) {
					hasUserEdited = true;
				}
			}
			if (hasUserEdited) {
				decoration.addOverlay(
						Icon.UserEditedDecor.getImageDescriptor(),
						IDecoration.TOP_RIGHT);
			} else if (hasCrosswalked) {
				decoration.addOverlay(
						Icon.CrosswalkedDecor.getImageDescriptor(),
						IDecoration.TOP_RIGHT);
			}

			// ACL Decor
			boolean hasCrosswalkedACL = false;
			boolean hasUserACL = false;
			for (MdSecType md : d.getMdSec()) {
				if (MetsPackage.eINSTANCE.getAmdSecType_RightsMD().equals(
						md.eContainingFeature())) {
					String st = md.getSTATUS();
					if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(st)
							|| METSConstants.MD_STATUS_CROSSWALK_USER_LINKED
									.equals(st)) {
						hasCrosswalkedACL = true;
					} else if (METSConstants.MD_STATUS_USER_EDITED.equals(st)) {
						hasUserACL = true;
					}
				}
			}
			if (hasUserACL) {
				decoration.addOverlay(Icon.ACLDecor.getImageDescriptor(),
						IDecoration.TOP_LEFT);
			} else if (hasCrosswalkedACL) {
				decoration.addOverlay(Icon.ACLGrayDecor.getImageDescriptor(),
						IDecoration.TOP_LEFT);
			}

			// add labels for links of which this div is the object
			for (SmLinkType sml : METSUtils.getObjectLinks(d)) {
				labels.add(METSConstants.getLinkForArcRole(sml.getArcrole()).label);
			}

		}

		ImageDescriptor overlay = null;
		if (r != null && r.getProject() != null && r.getProject().isOpen()) {
			boolean captured = false;
			if(r.isAttached() && isFile) {
				long byteLength = r.fetchInfo().getLength();
				labels.add(IResourceConstants.humanReadableByteCount(byteLength, true));
			}
			if (r.getMetsDivType() != null) {
				captured = true;
				if (!isDiv) {
					labels.add("captured");
				}
			}
			// staged location == original location
			SharedStagingArea prestage = StagingPlugin.getDefault().getStages().findMatchingArea(r.getWrapped().toURI());
			if (prestage != null && r.getStagingLocatorType() == null) {
				labels.add("pre-staged: " + prestage.getName());
			}
			if (r.getStagingLocatorType() != null) {
				// captured file (original or the div)
				overlay = Icon.StagedDecor.getImageDescriptor();
				labels.add("staged");
			} else {
				if (captured && isFile) {
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
		StringBuilder sb = new StringBuilder();
		if (labels.size() > 0) {
			sb.append("  [");
			sb.append(labels.remove(0));
			for (String label : labels) {
				sb.append("  ").append(label);
			}
			sb.append("]");
		}
		decoration.addSuffix(sb.toString());
	}

	private void decorateOriginalStub(OriginalStub stub, IDecoration decoration) {
		decoration.addPrefix("Originals on ");
		List<String> labels = new ArrayList<String>();
		// ejected overlay for detached disks
		if (!stub.isAttached()) {
			decoration.addOverlay(Icon.EjectedDecore.getImageDescriptor(),
					IDecoration.TOP_RIGHT);
			labels.add("ejected");
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

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

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.StagingArea;

public class MetsProjectNaturePropertiesSection extends AbstractPropertySection {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(MetsProjectNaturePropertiesSection.class);
	
	IProject project = null;
	MetsProjectNature nature = null;
	
	Group stagingGroup = null;
	Text stagingName = null;
	Text stagingPath = null;
	Text stagingBaseText = null;
	Text stagingStatusText = null;
	
	Group metsGroup = null;
	Text manifestText = null;
	Text describedStatusText = null;
	

	public MetsProjectNaturePropertiesSection() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection s) {
		super.setInput(part, s);
		Assert.isTrue(s instanceof IStructuredSelection);
		Object fs = ((IStructuredSelection) s).getFirstElement();
		if (fs instanceof IProject) {
			this.project = (IProject)fs;
			this.nature = MetsProjectNature.get(project);
		} 
		Assert.isTrue(this.nature != null);
	}
	
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite outer = getWidgetFactory().createFlatFormComposite(parent);
		outer.setLayout(new GridLayout());
		metsGroup = getWidgetFactory().createGroup(outer, "METS Manifest");
		metsGroup.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, true, false));
		FormLayout layout = new FormLayout();
		metsGroup.setLayout(layout);

		FormData data;

		int secondTab = 150;

		CLabel l1 = getWidgetFactory().createCLabel(metsGroup, "Location");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		l1.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		manifestText = getWidgetFactory().createText(metsGroup, "", SWT.READ_ONLY);
		manifestText.setLayoutData(data);

		CLabel l2 = getWidgetFactory().createCLabel(metsGroup, "Status");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l1, ITabbedPropertyConstants.VSPACE);
		l2.setLayoutData(data);

		describedStatusText = getWidgetFactory().createText(metsGroup, "", SWT.READ_ONLY | SWT.MULTI);
		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(l1, ITabbedPropertyConstants.VSPACE);
		describedStatusText.setLayoutData(data);

		stagingGroup = getWidgetFactory().createGroup(outer, "Staging");
		stagingGroup.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, true, false));
		FormLayout layout2 = new FormLayout();
		stagingGroup.setLayout(layout2);

		CLabel sn = getWidgetFactory().createCLabel(stagingGroup, "Area Name");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l2, ITabbedPropertyConstants.VSPACE);
		sn.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(l2, ITabbedPropertyConstants.VSPACE);
		stagingName = getWidgetFactory().createText(stagingGroup, "", SWT.READ_ONLY);
		stagingName.setLayoutData(data);
		
		CLabel srp = getWidgetFactory().createCLabel(stagingGroup, "Folder Path");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(sn, ITabbedPropertyConstants.VSPACE);
		srp.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(sn, ITabbedPropertyConstants.VSPACE);
		stagingPath = getWidgetFactory().createText(stagingGroup, "", SWT.READ_ONLY);
		stagingPath.setLayoutData(data);
		
		CLabel sl = getWidgetFactory().createCLabel(stagingGroup, "Location");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(srp, ITabbedPropertyConstants.VSPACE);
		sl.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(srp, ITabbedPropertyConstants.VSPACE);
		stagingBaseText = getWidgetFactory().createText(stagingGroup, "", SWT.READ_ONLY);
		stagingBaseText.setLayoutData(data);
		
		CLabel hl = getWidgetFactory().createCLabel(stagingGroup, "Status");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(sl, ITabbedPropertyConstants.VSPACE);
		hl.setLayoutData(data);
		
		// TODO add a refresh status button

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(sl, ITabbedPropertyConstants.VSPACE);
		stagingStatusText = getWidgetFactory().createText(stagingGroup, "", SWT.READ_ONLY | SWT.MULTI);
		stagingStatusText.setLayoutData(data);

		manifestText.pack();
		describedStatusText.pack();
		stagingBaseText.pack();
		stagingStatusText.pack();
		metsGroup.pack();
		stagingGroup.pack();
	}
	
	@Override
	public void refresh() {
		manifestText.setText(nature.getMetsResource().getURI().toFileString());
		describedStatusText.setText(nature.getDescriptionStatus());
		URI manifestBase = nature.getStagingManifestURI();
		stagingBaseText.setText(manifestBase.toString());
		SharedStagingArea s = (SharedStagingArea)StagingPlugin.getDefault().getStages().findMatchingArea(manifestBase);
		if(s != null) {
			stagingName.setText(s.getName());
			String relpath = s.getRelativePath(manifestBase);
			stagingPath.setText(relpath);
		} else {
			stagingName.setText("unknown area");
			stagingPath.setText("");
		}
		stagingStatusText.setText(nature.getStagingStatus());
		
		manifestText.pack();
		describedStatusText.pack();
		stagingBaseText.pack();
		stagingStatusText.pack();
		metsGroup.pack();
		stagingGroup.pack();
	}

}

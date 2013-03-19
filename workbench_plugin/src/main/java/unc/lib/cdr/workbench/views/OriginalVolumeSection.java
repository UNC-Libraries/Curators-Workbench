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

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;

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

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class OriginalVolumeSection extends AbstractPropertySection {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(OriginalVolumeSection.class);

	private OriginalStub stub = null;

	Text nameText = null;
	Text typeText = null;
	Text usedSpaceText = null;
	Text hashText = null;
	Text attachedText = null;
	Group composite = null;

	public OriginalVolumeSection() {
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
		if (fs instanceof OriginalFileStore) {
			this.stub = ((OriginalFileStore) fs).getOriginalStub();
		} else if (fs instanceof OriginalStub) {
			this.stub = (OriginalStub) fs;
		} else if (fs instanceof DivType) {
			DivType div = (DivType) fs;
			this.stub = MetsProjectNature.getOriginal(div).getOriginalStub();
		}
		Assert.isTrue(this.stub != null);
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite outer = getWidgetFactory().createFlatFormComposite(parent);
		outer.setLayout(new GridLayout());
		composite = getWidgetFactory().createGroup(outer, "Storage Volume");
		composite.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, true, false));
		FormLayout layout = new FormLayout();
		composite.setLayout(layout);

		FormData data;

		int secondTab = 150;

		CLabel l1 = getWidgetFactory().createCLabel(composite, "Name");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		l1.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		nameText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		nameText.setLayoutData(data);

		CLabel l2 = getWidgetFactory().createCLabel(composite, "Type");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l1, ITabbedPropertyConstants.VSPACE);
		l2.setLayoutData(data);

		typeText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(l1, ITabbedPropertyConstants.VSPACE);
		typeText.setLayoutData(data);

		CLabel sl = getWidgetFactory().createCLabel(composite, "Used Space");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l2, ITabbedPropertyConstants.VSPACE);
		sl.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(l2, ITabbedPropertyConstants.VSPACE);
		usedSpaceText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		usedSpaceText.setLayoutData(data);

		CLabel hl = getWidgetFactory().createCLabel(composite, "Hash Key");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(sl, ITabbedPropertyConstants.VSPACE);
		hl.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(sl, ITabbedPropertyConstants.VSPACE);
		hashText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		hashText.setLayoutData(data);
		
		CLabel al = getWidgetFactory().createCLabel(composite, "Attached");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(hl, ITabbedPropertyConstants.VSPACE);
		al.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, secondTab);
		data.top = new FormAttachment(hl, ITabbedPropertyConstants.VSPACE);
		attachedText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		attachedText.setLayoutData(data);

		nameText.pack();
		typeText.pack();
		usedSpaceText.pack();
		hashText.pack();
		attachedText.pack();
	}

	@Override
	public void refresh() {
		nameText.setText(stub.getName());
		typeText.setText(stub.getVolumeType());
		hashText.setText(String.valueOf(stub.getVolumeHash()));
		attachedText.setText(stub.isAttached() ? "yes" : "no");
		try {
			FileStore fs = Files.getFileStore(Paths.get(this.stub.getVolumeRoot()));
			NumberFormat f = NumberFormat.getInstance();
			usedSpaceText.setText(f.format((fs.getTotalSpace() - fs.getUnallocatedSpace()) / 1024) + " kilobytes");
		} catch (IOException e) {
			usedSpaceText.setText("unavailable");
		}
		nameText.pack();
		typeText.pack();
		usedSpaceText.pack();
		hashText.pack();
		attachedText.pack();
		composite.pack();
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}
}

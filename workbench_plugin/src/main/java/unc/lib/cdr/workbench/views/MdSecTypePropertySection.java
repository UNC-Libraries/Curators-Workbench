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

import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MdSecTypePropertySection extends AbstractPropertySection {


	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(MdSecTypePropertySection.class);

	// private ISelection input = null;
	private MdSecType mdsec = null;
	CTabFolder folder = null;

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection s) {
		super.setInput(part, s);
		Assert.isTrue(s instanceof IStructuredSelection);
		Object divO = ((IStructuredSelection) s).getFirstElement();
		Assert.isTrue(divO instanceof MdSecType);
		this.mdsec = (MdSecType) divO;
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	String getXMLText(MdSecType mdSec) {
		StringWriter sw = new StringWriter();
		try {
			EObject o = (EObject) mdSec.getMdWrap().getXmlData().getAny().getValue(0);
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "utf-8");
			options.put(XMLResource.OPTION_LINE_WIDTH, new Integer(80));
			options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(o));
			((XMLResource) o.eResource()).save(sw, options);
		} catch (Exception ignored) {
			sw.append("failed to serialize XML for model object");
		}
		return sw.toString();
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage atabbedPropertySheetPage) {
		super.createControls(parent, atabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		folder = getWidgetFactory().createTabFolder(composite, SWT.TOP | SWT.BORDER);
		// labelText = getWidgetFactory().createText(composite, "",SWT.MULTI |
		// SWT.READ_ONLY | SWT.WRAP);
		FormData data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		folder.setLayoutData(data);
	}

	public CTabItem addTabItem(String title, String metadataText) {
		CTabItem item = getWidgetFactory().createTabItem(folder, SWT.NULL);
		item.setText(title);
		Text text = getWidgetFactory().createText(folder, metadataText, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.BORDER);
		item.setControl(text);
		return item;
	}

	@Override
	public void refresh() {
		if (folder != null) {
			CTabItem first = null;
			for (CTabItem i : folder.getItems()) {
				i.dispose();
			}
			String title = mdsec.getMdWrap().getLABEL() + " (" + mdsec.getGROUPID() + ")";
			boolean userLinked = METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(mdsec.getSTATUS()) ? true : false;
			String metadataText = getXMLText(mdsec);
			CTabItem i = addTabItem(title, metadataText);
			if (first == null) {
				first = i;
			}
			folder.setSelection(first);
			// folder.showItem(first);
		}
	}

}


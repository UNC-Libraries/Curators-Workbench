package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileType;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class OriginalFingerprintSection extends AbstractPropertySection {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(OriginalFingerprintSection.class);

	private FileType fileType = null;
	Text checksumText = null;
	Text checksumTypeText = null;
	Text stagedLocationText = null;

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection s) {
		super.setInput(part, s);
		Assert.isTrue(s instanceof IStructuredSelection);
		Object o = ((IStructuredSelection) s).getFirstElement();
		if(o instanceof DivType) {
			DivType div = (DivType)o;
			fileType = (FileType)div.eResource().getEObject(div.getFptr().get(0).getFILEID());
		} else if(o instanceof OriginalFileStore) {
			fileType = ((OriginalFileStore)o).getMetsFileType();
		}
		Assert.isTrue(fileType != null);
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data;

		CLabel l1 = getWidgetFactory().createCLabel(composite, "Checksum");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		l1.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(l1, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		checksumText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		checksumText.setLayoutData(data);

		CLabel l2 = getWidgetFactory().createCLabel(composite, "Type");
		data = new FormData();
		data.left = new FormAttachment(checksumText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		l2.setLayoutData(data);
		checksumTypeText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		data = new FormData();
		data.left = new FormAttachment(l2, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		checksumTypeText.setLayoutData(data);

		CLabel sl = getWidgetFactory().createCLabel(composite, "Staged Location");
		data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l1, ITabbedPropertyConstants.VSPACE);
		sl.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(sl, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(l2, ITabbedPropertyConstants.VSPACE);
		stagedLocationText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
		stagedLocationText.setLayoutData(data);
	}

	@Override
	public void refresh() {
		if (fileType.getCHECKSUM() != null) {
			checksumText.setText(fileType.getCHECKSUM());
			checksumTypeText.setText(fileType.getCHECKSUMTYPE().getName());
		} else {
			checksumText.setText("unknown");
			checksumTypeText.setText("n/a");
		}
		FLocatType l = null;
		for(FLocatType test : fileType.getFLocat()) {
			if(METSConstants.FLocat_USE_STAGE.equals(test.getUSE())) {
				l = test;
			}
		}
		if(l != null) {
			stagedLocationText.setText(l.getHref());
		} else {
			stagedLocationText.setText("");
		}
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}

}

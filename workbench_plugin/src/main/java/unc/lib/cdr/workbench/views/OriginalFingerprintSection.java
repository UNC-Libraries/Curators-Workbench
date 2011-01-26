package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileType;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSUtils;

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

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class OriginalFingerprintSection extends AbstractPropertySection {

@SuppressWarnings("unused")
private static final Logger LOG = LoggerFactory.getLogger(OriginalFingerprintSection.class);

    private DivType div = null;
    Text checksumText = null;
    Text checksumTypeText = null;

    /**
     * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
     *      org.eclipse.jface.viewers.ISelection)
     */
    @Override
    public void setInput(IWorkbenchPart part, ISelection s) {
	super.setInput(part, s);
	Assert.isTrue(s instanceof IStructuredSelection);
	Object divO = ((IStructuredSelection) s).getFirstElement();
	Assert.isTrue(divO instanceof DivType);
	this.div = (DivType) divO;
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
	checksumText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
	checksumText.setLayoutData(data);

	CLabel l2 = getWidgetFactory().createCLabel(composite, "Type");
	data = new FormData();
	data.left = new FormAttachment(checksumText, ITabbedPropertyConstants.HSPACE);
	l2.setLayoutData(data);
	checksumTypeText = getWidgetFactory().createText(composite, "", SWT.READ_ONLY);
	data = new FormData();
	data.left = new FormAttachment(l2, ITabbedPropertyConstants.HSPACE);
	checksumTypeText.setLayoutData(data);
    }

    @Override
    public void refresh() {
	//LOG.debug("div: "+div);
	MetsType mets = MetsProjectNature.getNatureForMetsObject(div).getMets();
	FileGrpType grp = METSUtils.getObjectFileGroup(mets, div.getID());
	FileType file = grp.getFile().get(0);
	checksumText.setText(file.getCHECKSUM());
	checksumTypeText.setText(file.getCHECKSUMTYPE().getName());
    }

    /**
     * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
     */
    @Override
    public boolean shouldUseExtraSpace() {
	return false;
    }

}

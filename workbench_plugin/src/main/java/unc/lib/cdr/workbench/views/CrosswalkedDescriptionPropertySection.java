package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

public class CrosswalkedDescriptionPropertySection extends AbstractPropertySection {

@SuppressWarnings("unused")
private static final Logger LOG = LoggerFactory.getLogger(CrosswalkedDescriptionPropertySection.class);

    //private ISelection input = null;
    private DivType div = null;
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
	Assert.isTrue(divO instanceof DivType);
	this.div = (DivType) divO;
    }

    /**
     * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
     */
    @Override
    public boolean shouldUseExtraSpace() {
	return true;
    }

    List<MdSecType> getCrosswalkedMdSecs() {
	List<MdSecType> result = new ArrayList<MdSecType>();
	return result;
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

    public CTabItem addTabItem(String title, String mods, boolean userLinked) {
	CTabItem item = getWidgetFactory().createTabItem(folder, SWT.NULL);
	item.setText(title);
	Text modsTxt = getWidgetFactory().createText(folder, mods, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.BORDER);
	item.setControl(modsTxt);
	return item;
    }

    @Override
    public void refresh() {
	//LOG.debug("folder: " +folder);
	//LOG.debug("div: "+div);
	if (folder != null) {
	    CTabItem first = null;
	    for(CTabItem i : folder.getItems()) {
		i.dispose();
	    }
	    List<MdSecType> cwMdSecs = new ArrayList<MdSecType>();
	    if (this.div != null) {
		for (MdSecType md : this.div.getDmdSec()) {
		    //LOG.debug(md.toString());
		    if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
			cwMdSecs.add(md);
		    } else if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(md.getSTATUS())) {
			cwMdSecs.add(md);
		    }
		}
	    }
	    for (MdSecType md : cwMdSecs) {
		String title = md.getGROUPID() + " (" + md.getMdWrap().getLABEL() + ")";
		boolean userLinked = METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(md.getSTATUS()) ? true
				: false;
		String mods = getXMLText(md);
		CTabItem i = addTabItem(title, mods, userLinked);
		if(first == null) {
		    first = i;
		}
	    }
	    folder.setSelection(first);
	    //folder.showItem(first);
	}
    }

}
package unc.lib.cdr.workbench.xwalk;

import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import unc.lib.cdr.workbench.views.LabelImageFactory;

public class CrosswalkLabelProvider implements ILabelProvider {
    private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
		    .getDecoratingWorkbenchLabelProvider();

    @Override
    public void addListener(ILabelProviderListener listener) {
	this.provider.addListener(listener);
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
	return true;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
	this.provider.removeListener(listener);
    }

    @Override
    public Image getImage(Object element) {
	if (element instanceof CrosswalksProjectElement) {
	    return LabelImageFactory.getImageForObject(element);
	} else if(element instanceof CrosswalkTreeElement) {
	    CrosswalkTreeElement t = (CrosswalkTreeElement)element;
	    element = t.getFile();
	} else if(element instanceof MdSecType) {
	    MdSecType dmd = (MdSecType)element;
	    return LabelImageFactory.getImageForObject(dmd);
	}
	return provider.getImage(element);
    }

    @Override
    public String getText(Object element) {
	if (element instanceof CrosswalksProjectElement) {
	    return ((CrosswalksProjectElement) element).getText();
	} else if (element instanceof CrosswalkTreeElement) {
	    CrosswalkTreeElement t = (CrosswalkTreeElement)element;
	    return t.getName();
	} else if(element instanceof MdSecType) {
	    MdSecType dmd = (MdSecType)element;
	    StringBuilder sb = new StringBuilder(dmd.getMdWrap().getLABEL());
	    if(METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(dmd.getSTATUS())) {
		sb.append(" - crosswalk linked");
	    } else if(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED.equals(dmd.getSTATUS())) {
		sb.append(" - unlinked");
	    } else if(METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(dmd.getSTATUS())) {
		sb.append(" - manually linked");
	    }
	    return sb.toString();
	} else {
	    return provider.getText(element);
	}
    }

}

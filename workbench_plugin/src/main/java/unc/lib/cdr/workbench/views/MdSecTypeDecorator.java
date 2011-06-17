package unc.lib.cdr.workbench.views;

import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;

public class MdSecTypeDecorator implements ILightweightLabelDecorator {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILightweightLabelDecorator#decorate(java.lang.Object, org.eclipse.jface.viewers.IDecoration)
	 */
	@Override
	public void decorate(Object element, IDecoration decoration) {
		if(element instanceof MdSecType) {
			MdSecType md = (MdSecType)element;
			if(METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
				decoration.addSuffix("  auto linked");
			} else if(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED.equals(md.getSTATUS())) {
				//decoration.addSuffix("  auto-linked");
			} else if(METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(md.getSTATUS())) {
				decoration.addSuffix("  user linked");
			} else if(METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
				decoration.addSuffix("  user created");
			}
		}
	}


}

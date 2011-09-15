package unc.lib.cdr.workbench;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class SelectionPropertyTester extends PropertyTester {
	public static final String IS_DIV_LINK_PAIR = "isDivLinkPair";
	public static final String SIBLING_IRESOURCES = "siblingIResources";

	public SelectionPropertyTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (IS_DIV_LINK_PAIR.equals(property)) {
			if (receiver instanceof ISelection) {
				ISelection s = (ISelection) receiver;
				if (s instanceof IStructuredSelection) {
					IStructuredSelection struct = (IStructuredSelection) s;
					// two objects must be selected
					if (struct.size() == 2) {
						Object[] objects = struct.toArray();
						// they must all be of DivType
						for (Object o : objects) {
							if (o != null && o instanceof DivType) {
								continue;
							} else {
								return false;
							}
						}

						DivType thing0 = (DivType) objects[0];
						DivType thing1 = (DivType) objects[1];

						// they cannot be the same DivType
						if (thing0.equals(thing1)) {
							return false;
						}

						// they must be in the same project
						IProject p0 = MetsProjectNature.getProjectForMetsEObject(thing0);
						IProject p1 = MetsProjectNature.getProjectForMetsEObject(thing1);
						if (!p0.equals(p1)) {
							return false;
						}

						if ("surrogate".equals(args[0])) {
							// enforce that one and only one selected object must be "Simple" TYPE
							boolean firstFile = METSConstants.Div_File.equals(((DivType) objects[0]).getTYPE());
							boolean secondFile = METSConstants.Div_File.equals(((DivType) objects[1]).getTYPE());
							return firstFile ^ secondFile;
						}
						return true;
					}
				}
			}
		} else if(SIBLING_IRESOURCES.equals(property)) {
			//System.out.println("checking siblings");
			if (receiver instanceof ISelection) {
				ISelection s = (ISelection) receiver;
				if (s instanceof IStructuredSelection) {
					IStructuredSelection struct = (IStructuredSelection) s;
					if(struct.size() > 0) {
						if(struct.getFirstElement() instanceof IResource) {
							IContainer c = ((IResource)struct.getFirstElement()).getParent();
							for(Object r : struct.toArray()) {
								if(!(r instanceof IResource)) {
									return false;
								}
								if(!(c.equals(((IResource)r).getParent()))) {
									System.out.println("not the same parent");
									return false;
								}
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
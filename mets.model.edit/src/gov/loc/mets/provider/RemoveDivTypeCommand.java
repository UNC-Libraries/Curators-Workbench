package gov.loc.mets.provider;

import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MdSecType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.util.METSConstants;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RemoveDivTypeCommand extends RemoveCommand implements Command {

	public RemoveDivTypeCommand(EditingDomain domain, EList<?> list, Collection<?> collection) {
		super(domain, list, collection);
	}

	public RemoveDivTypeCommand(EditingDomain domain, EList<?> list, Object value) {
		super(domain, list, value);
	}

	public RemoveDivTypeCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		super(domain, owner, feature, collection);
	}

	public RemoveDivTypeCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
	}

	@Override
	public void doExecute() {
		for (Object o : this.getCollection()) {
			DivType d = (DivType) o;
			deleteMetadataSections(d);
			deleteSmLinks(d);
			TreeIterator<EObject> iter = d.eAllContents();
			while (iter.hasNext()) {
				EObject i = iter.next();
				if (i instanceof DivType) {
					DivType descendant = (DivType) i;
					deleteMetadataSections(descendant);
					deleteSmLinks(descendant);
				}
			}
		}
		super.doExecute();
	}

	/**
	 * Finds elements that are linked to in this DivType and adds them to the supplied list
	 * 
	 * @param toDelete
	 *           the list
	 * @param div
	 *           the DivType with potential links
	 */
	private void deleteMetadataSections(DivType div) {
		Set<EObject> deletes = new HashSet<EObject>();
		for (MdSecType dmd : div.getDmdSec()) {
			if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(dmd.getSTATUS())) {
				dmd.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
			}
			if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(dmd.getSTATUS())) {
				dmd.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
			} else if (METSConstants.MD_STATUS_USER_EDITED.equals(dmd.getSTATUS())) {
				deletes.add(dmd);
			}
		}
		for (MdSecType md : div.getMdSec()) {
			deletes.add(md);
		}
		for(EObject o : deletes) {
			EcoreUtil.delete(o);
		}
	}

	private void deleteSmLinks(DivType div) {
		DocumentRoot root = (DocumentRoot) div.eResource().getContents().get(0);
		if (root.getMets().getStructLink() != null) {
			for (SmLinkType l : root.getMets().getStructLink().getSmLink()) {
				if (div.equals(l.getXlinkFrom())) {
					EcoreUtil.delete(l);
				}
				if (div.equals(l.getXlinkTo())) {
					EcoreUtil.delete(l);
				}
			}
		}
	}
}

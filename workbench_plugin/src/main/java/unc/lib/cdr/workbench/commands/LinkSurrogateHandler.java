package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructLinkType1;
import gov.loc.mets.provider.DivTypeItemProvider;
import gov.loc.mets.util.METSConstants;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class LinkSurrogateHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		List sel = select.toList();
		Assert.isTrue(sel.size() == 2);

		DivType thumb = null;
		DivType subject = null;
		if (METSConstants.Div_File.equals(((DivType) sel.get(0)).getTYPE())) {
			thumb = (DivType) sel.get(0);
			subject = (DivType) sel.get(1);
		} else {
			subject = (DivType) sel.get(0);
			thumb = (DivType) sel.get(1);
		}

		// confirmation
		String[] labels = new String[] { "Yes", "No" };
		String msg = "Do you want to set the thumbnail or surrogate object for\n" + subject.getLABEL1() + "\n\tto\n"
				+ thumb.getLABEL1();
		MessageDialog dialog = new MessageDialog(HandlerUtil.getActiveShell(event), "Establish Link", (Image) null, msg,
				MessageDialog.QUESTION, labels, 1);
		if (1 == dialog.open()) {
			return null;
		}

		MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject(subject);

		CompoundCommand cmd = new CompoundCommand("Adding Structural Link to METS");

		// check structLink
		StructLinkType1 sl = mpn.getMets().getStructLink();
		if (sl == null) {
			System.out.println("Struct link is null in METS");
			sl = MetsFactory.eINSTANCE.createStructLinkType1();
			cmd.append(new SetCommand(mpn.getEditingDomain(), mpn.getMets(), MetsPackage.eINSTANCE
					.getMetsType_StructLink(), sl));
		}

		// create link
		SmLinkType link = MetsFactory.eINSTANCE.createSmLinkType();
		link.setXlinkFrom(subject);
		link.setXlinkTo(thumb);
		link.setArcrole(METSConstants.LINK_HAS_SURROGATE_URI);

		// EList<SmLinkType> newlinks = ECollections.emptyEList();
		// ECollections.setEList(newlinks, sl.getSmLink());
		AddCommand setLinks = new AddCommand(mpn.getEditingDomain(), sl,
				MetsPackage.eINSTANCE.getStructLinkType_SmLink(), link);
		cmd.append(setLinks);
		try {
			mpn.getCommandStack().execute(cmd);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExecutionException("unable to add link", e);
		}
		//DivTypeItemProvider p = (DivTypeItemProvider)mpn.getAdapterFactory().adapt(subject, DivTypeItemProvider.class);
		mpn.getAdapterFactory().fireNotifyChanged(new NotificationImpl(Notification.ADD, null, null));
		return null;
	}

}

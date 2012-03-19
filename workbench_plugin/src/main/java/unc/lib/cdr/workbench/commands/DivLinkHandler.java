package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructLinkType1;
import gov.loc.mets.util.Link;
import gov.loc.mets.util.METSConstants;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class DivLinkHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		List sel = select.toList();
		String linkUri = event.getParameter("workbench_plugin.parameterLinkURI");
		Link link = METSConstants.getLinkForArcRole(linkUri);
		Collection<DivType[]> links = link.tester.potentialLinks(sel);
		DivType x = links.iterator().next()[0];
		MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject(x);
		CompoundCommand cmd = null;
		if(links.size() > 1) {
			cmd = new CompoundCommand("Added "+links.size()+" links: "+link.label);
		} else {
			cmd = new CompoundCommand("Added a link: "+link.label);
		}

		// check structLink
		StructLinkType1 sl = mpn.getMets().getStructLink();
		if (sl == null) {
			System.err.println("Struct link is null in METS");
			sl = MetsFactory.eINSTANCE.createStructLinkType1();
			cmd.append(new SetCommand(mpn.getEditingDomain(), mpn.getMets(), MetsPackage.eINSTANCE
					.getMetsType_StructLink(), sl));
		}

		for(DivType[] l : links) {
			// create link
			SmLinkType smlink = MetsFactory.eINSTANCE.createSmLinkType();
			smlink.setXlinkFrom(l[0]);
			smlink.setXlinkTo(l[1]);
			smlink.setArcrole(link.uri);
	
			// EList<SmLinkType> newlinks = ECollections.emptyEList();
			// ECollections.setEList(newlinks, sl.getSmLink());
			AddCommand setLinks = new AddCommand(mpn.getEditingDomain(), sl,
					MetsPackage.eINSTANCE.getStructLinkType_SmLink(), smlink);
			cmd.append(setLinks);
		}
		try {
			mpn.getCommandStack().execute(cmd);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExecutionException("unable to add link", e);
		}
		MetsProjectNature.getAdapterFactory().fireNotifyChanged(new NotificationImpl(Notification.ADD, null, null));
		return null;
	}

}

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
import org.eclipse.emf.edit.provider.ViewerNotification;
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
		for(DivType[] l : links) {
			if(l[0] != null) l[0].eNotify(new NotificationImpl(Notification.ADD, null, null));
			if(l[1] != null) l[1].eNotify(new NotificationImpl(Notification.ADD, null, null));
		}
		//MetsProjectNature.getAdapterFactory().fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
		return null;
	}

}

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
package crosswalk.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.commands.CurrentDateCreateCommand;
import crosswalk.diagram.edit.commands.CurrentUsernameCreateCommand;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.CurrentDateEditPart;
import crosswalk.diagram.edit.parts.CurrentUsernameEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrossWalkItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CrossWalkItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.CrossWalk_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.CurrentDate_3021 == req.getElementType()) {
			return getGEFWrapper(new CurrentDateCreateCommand(req));
		}
		if (CrosswalkElementTypes.CurrentUsername_3022 == req.getElementType()) {
			return getGEFWrapper(new CurrentUsernameCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (CrosswalkVisualIDRegistry.getVisualID(node)) {
				case CurrentDateEditPart.VISUAL_ID:
					for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
						Edge incomingLink = (Edge) it.next();
						if (CrosswalkVisualIDRegistry.getVisualID(incomingLink) == InputOutputEditPart.VISUAL_ID) {
							DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(),
									null, incomingLink.getTarget().getElement(), false);
							cmd.add(new DestroyReferenceCommand(r));
							cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
							continue;
						}
					}
					cmd.add(new DestroyElementCommand(
							new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
					// don't need explicit deletion of node as parent's view deletion would clean child views as well 
					// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
					break;
				case CurrentUsernameEditPart.VISUAL_ID:
					for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
						Edge incomingLink = (Edge) it.next();
						if (CrosswalkVisualIDRegistry.getVisualID(incomingLink) == InputOutputEditPart.VISUAL_ID) {
							DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(),
									null, incomingLink.getTarget().getElement(), false);
							cmd.add(new DestroyReferenceCommand(r));
							cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
							continue;
						}
					}
					cmd.add(new DestroyElementCommand(
							new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
					// don't need explicit deletion of node as parent's view deletion would clean child views as well 
					// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
					break;
				case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
					for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
						Node cnode = (Node) cit.next();
						switch (CrosswalkVisualIDRegistry.getVisualID(cnode)) {
							case DelimitedFileEditPart.VISUAL_ID:
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case OriginalNameRecordMatcherEditPart.VISUAL_ID:
								for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
									Edge outgoingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(outgoingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource()
												.getElement(), null, outgoingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
										continue;
									}
								}
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case DateRecognizerEditPart.VISUAL_ID:
								for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
									Edge incomingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(incomingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource()
												.getElement(), null, incomingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
										continue;
									}
								}
								for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
									Edge outgoingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(outgoingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource()
												.getElement(), null, outgoingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
										continue;
									}
								}
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case TextEditPart.VISUAL_ID:
								for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
									Edge incomingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(incomingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource()
												.getElement(), null, incomingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
										continue;
									}
								}
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case TrimWhitespaceEditPart.VISUAL_ID:
								for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
									Edge incomingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(incomingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource()
												.getElement(), null, incomingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
										continue;
									}
								}
								for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
									Edge outgoingLink = (Edge) it.next();
									if (CrosswalkVisualIDRegistry.getVisualID(outgoingLink) == InputOutputEditPart.VISUAL_ID) {
										DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource()
												.getElement(), null, outgoingLink.getTarget().getElement(), false);
										cmd.add(new DestroyReferenceCommand(r));
										cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
										continue;
									}
								}
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case MappedElementEditPart.VISUAL_ID:
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
							case MetadataBlock2EditPart.VISUAL_ID:
								cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
										.getElement(), false))); // directlyOwned: true
								// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
								// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
								break;
						}
					}
					break;
			}
		}
	}

}

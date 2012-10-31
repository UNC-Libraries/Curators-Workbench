package crosswalk.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.parts.CurrentDateEditPart;
import crosswalk.diagram.edit.parts.CurrentUsernameEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlock2ItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlock2ItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3018);
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
				case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
					for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
						Node cnode = (Node) cit.next();
						switch (CrosswalkVisualIDRegistry.getVisualID(cnode)) {
							case TextInputFieldEditPart.VISUAL_ID:
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
							case DateInputFieldEditPart.VISUAL_ID:
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
						}
					}
					break;
				case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
					for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
						Node cnode = (Node) cit.next();
						switch (CrosswalkVisualIDRegistry.getVisualID(cnode)) {
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
							case CurrentDateEditPart.VISUAL_ID:
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
							case CurrentUsernameEditPart.VISUAL_ID:
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
						}
					}
					break;
			}
		}
	}

}

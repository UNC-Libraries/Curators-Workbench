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

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.CurrentDateCreateCommand;
import crosswalk.diagram.edit.commands.CurrentUsernameCreateCommand;
import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockMappingCompartment3ItemSemanticEditPolicy
		extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockMappingCompartment3ItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.DateRecognizer_3004 == req.getElementType()) {
			return getGEFWrapper(new DateRecognizerCreateCommand(req));
		}
		if (CrosswalkElementTypes.Text_3005 == req.getElementType()) {
			return getGEFWrapper(new TextCreateCommand(req));
		}
		if (CrosswalkElementTypes.TrimWhitespace_3006 == req.getElementType()) {
			return getGEFWrapper(new TrimWhitespaceCreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedElement_3007 == req.getElementType()) {
			return getGEFWrapper(new MappedElementCreateCommand(req));
		}
		if (CrosswalkElementTypes.CurrentDate_3021 == req.getElementType()) {
			return getGEFWrapper(new CurrentDateCreateCommand(req));
		}
		if (CrosswalkElementTypes.CurrentUsername_3022 == req.getElementType()) {
			return getGEFWrapper(new CurrentUsernameCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

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

import crosswalk.diagram.edit.commands.MetadataBlock3CreateCommand;
import crosswalk.diagram.edit.commands.ParagraphCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class FormModelBoxCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormModelBoxCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.Form_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MetadataBlock_3019 == req.getElementType()) {
			return getGEFWrapper(new MetadataBlock3CreateCommand(req));
		}
		if (CrosswalkElementTypes.Paragraph_3020 == req.getElementType()) {
			return getGEFWrapper(new ParagraphCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

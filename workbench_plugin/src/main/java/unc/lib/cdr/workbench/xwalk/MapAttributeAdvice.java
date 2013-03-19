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
package unc.lib.cdr.workbench.xwalk;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.MappedElement;
import crosswalk.diagram.providers.CrosswalkElementTypes;

public class MapAttributeAdvice extends AbstractEditHelperAdvice implements IEditHelperAdvice {
	@Override
	protected ICommand getBeforeCreateCommand(final CreateElementRequest request) {
		if (isRelevant(request)) {
			return new PickMappedFeatureCommand(request);
		}
		return null;
	}

	@Override
	protected ICommand getAfterCreateCommand(final CreateElementRequest request) {
		if (isRelevant(request)) {
			return new SetMappedFeatureCommand(request);
		}
		return null;
	}
	
	/**
	 * This is required to such that we don't return commands for the wrong element types, causing meaningless prompts the
	 * unspecified create type request.
	 * @param request
	 * @return
	 */
	private static boolean isRelevant(CreateElementRequest request) {
		if(request.getContainer() instanceof MappedElement &&
				request.getElementType() == CrosswalkElementTypes.MappedAttribute_3009) {
			return true;
		}
		return false;
	}
}

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.CrossWalk;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.diagram.providers.CrosswalkElementTypes;

public class MapElementAdvice extends AbstractEditHelperAdvice implements IEditHelperAdvice {
	private static final Logger LOG = LoggerFactory.getLogger(MapElementAdvice.class);

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
		if(request.getContainer() instanceof CrossWalk && request.getElementType() == CrosswalkElementTypes.MappedElement_3007) {
			return true;
		} else if(request.getContainer() instanceof MetadataBlock && request.getElementType() == CrosswalkElementTypes.MappedElement_3007) {
			return true;
		} else if(request.getContainer() instanceof MappedElement && request.getElementType() == CrosswalkElementTypes.MappedElement_3008) {
			return true;
		}
		return false;
	}
}

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

import gov.loc.mods.mods.MODSPackage;

import java.util.Collections;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.CrosswalkFactory;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.diagram.custom.MappedModelUtil;
import crosswalk.impl.MappedElementImpl;

public class SetMappedFeatureCommand extends AbstractTransactionalCommand {
	
	private static final Logger log = LoggerFactory
			.getLogger(SetMappedFeatureCommand.class);
	
	private static final String MAPPED_FEATURE_PARAM = "mappedFeature";
	
	private CreateElementRequest request = null;
	
	public SetMappedFeatureCommand(CreateElementRequest request) {
		super(request.getEditingDomain(), "Pick the Mapped Feature", Collections.EMPTY_LIST);
		this.request = request;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EStructuralFeature feature = (EStructuralFeature) request.getParameters().get(MAPPED_FEATURE_PARAM);
		Object o = request.getNewElement();
		if (o instanceof MappedElement) {
			MappedElementImpl me = (MappedElementImpl) request.getNewElement();
			me.setMappedFeature((EReference) feature);
			EClass type = ((EReference) feature).getEReferenceType();
			if (MODSPackage.eINSTANCE.getDateBaseDefinition().isSuperTypeOf(type)) {
				// this is a date!
				EAttribute textAttr = MappedModelUtil.getXMLTextAttributeInReferenceType(me);
				MappedModelUtil.setEDateToStringConversionStrategyAttribute(me, textAttr);
				MappedModelUtil.setMODSDateEncodingAttribute(me);
			} else { // detect a text value attribute
				EAttribute textValue = MappedModelUtil.getXMLTextAttributeInReferenceType(me);
				if (textValue != null) {
					MappedModelUtil.setTextAttribute(me, textValue);
				} else {
					log.debug("No element value text attribute found.");
				}
			}
			// TODO handle :mixed elements, adding a text value attribute.
			return CommandResult.newOKCommandResult();
		} else if (o instanceof MappedAttribute) {
			MappedAttribute ma = (MappedAttribute) request.getNewElement();
			EAttribute eattr = (EAttribute)feature;
			ma.setMappedFeature(eattr);
			// handle Date attributes
			if(XMLGregorianCalendar.class.equals(eattr.getEType().getInstanceClass())) {
				ma.setConversionStrategy(CrosswalkFactory.eINSTANCE
						.createDateToXMLGregorianCalenderConversion());
			}
			// TODO handle Date vs DateTime
			return CommandResult.newOKCommandResult();
		} else {
			return CommandResult.newErrorCommandResult("Could not find mapped feature param.");
		}
	}
}

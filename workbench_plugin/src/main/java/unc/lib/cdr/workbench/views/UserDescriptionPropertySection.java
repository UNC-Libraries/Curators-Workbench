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
package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mods.mods.ModsDefinition;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class UserDescriptionPropertySection extends AbstractEcoreXMLPropertySection {

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.views.AbstractEcoreXMLPropertySection#getXMLEObject()
	 */
	@Override
	EObject getXMLEObject() {
		ISelection s = getInput();
		Assert.isTrue(s instanceof IStructuredSelection);
		Object divO = ((IStructuredSelection) s).getFirstElement();
		Assert.isTrue(divO instanceof DivType);
		DivType div = (DivType) divO;
		ModsDefinition result = null;
		try {
			EObject o = METSUtils.getDescription(div, METSConstants.MD_STATUS_USER_EDITED);
			if (o != null && o instanceof ModsDefinition) {
				result = (ModsDefinition) o;
			}
		} catch (Exception ignored) {
		}
		return result;
	}

}

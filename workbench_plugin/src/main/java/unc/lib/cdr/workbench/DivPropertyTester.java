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
package unc.lib.cdr.workbench;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import org.eclipse.core.expressions.PropertyTester;

public class DivPropertyTester extends PropertyTester {
	public static final String IS_CONTAINER_PROPERTY = "isContainer";
	public static final String IS_FOLDER_PROPERTY = "isFolder";

	public DivPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof DivType) {
			DivType div = (DivType) receiver;
			if (IS_CONTAINER_PROPERTY.equals(property)) {
				return METSUtils.isContainer(div);
			} else if (IS_FOLDER_PROPERTY.equals(property)) {
				return METSConstants.Div_Folder.equals(div.getTYPE());
			}
		}
		return false;
	}

}

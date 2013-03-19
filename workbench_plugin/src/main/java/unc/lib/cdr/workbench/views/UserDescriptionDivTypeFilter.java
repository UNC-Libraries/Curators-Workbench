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
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.IFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDescriptionDivTypeFilter implements IFilter {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(UserDescriptionDivTypeFilter.class);

	@Override
	public boolean select(Object toTest) {
		if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			for (MdSecType md : d.getDmdSec()) {
				if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
					// LOG.debug("found a user description");
					return true;
				}
			}
		}
		return false;
	}

}

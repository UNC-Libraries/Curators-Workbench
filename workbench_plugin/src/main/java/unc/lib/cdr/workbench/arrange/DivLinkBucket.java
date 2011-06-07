/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.arrange;

import java.util.ArrayList;
import java.util.List;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.provider.SmLinkTypeItemProvider;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;

import unc.lib.cdr.workbench.project.ICustomEObjectBucket;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class DivLinkBucket implements ICustomEObjectBucket {
	private static final String label = "links";
	private DivType div = null;

	public DivLinkBucket(DivType div) {
		this.div = div;
	}

	/* (non-Javadoc)
	 * @see unc.lib.cdr.workbench.project.ICustomEObjectBucket#getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see unc.lib.cdr.workbench.project.ICustomEObjectBucket#getChildren()
	 */
	@Override
	public Object[] getChildren() {
		List<Object> results = new ArrayList<Object>();
		MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject(div);
		MetsType mets = mpn.getMets();
		if(mets.getStructLink() != null && mets.getStructLink().getSmLink() != null) {
			for(SmLinkType l : mets.getStructLink().getSmLink()) {
				if (div.equals(l.getXlinkFrom())) {
					results.add(l);
				}
			}
		}
		return results.toArray();
	}

	/* (non-Javadoc)
	 * @see unc.lib.cdr.workbench.project.ICustomEObjectBucket#getText()
	 */
	@Override
	public String getText() {
		return label;
	}

	/* (non-Javadoc)
	 * @see unc.lib.cdr.workbench.project.ICustomEObjectBucket#hasChildren()
	 */
	@Override
	public boolean hasChildren() {
		return true;
	}

	/* (non-Javadoc)
	 * @see unc.lib.cdr.workbench.project.ICustomEObjectBucket#getParent()
	 */
	@Override
	public DivType getParent() {
		return div;
	}

}

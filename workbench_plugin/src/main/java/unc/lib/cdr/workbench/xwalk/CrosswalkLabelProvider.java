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

import gov.loc.mets.MdSecType;

import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import unc.lib.cdr.workbench.views.LabelImageFactory;
import unc.lib.cdr.workbench.views.LabelImageFactory.Icon;

public class CrosswalkLabelProvider implements ILabelProvider {
	private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
			.getDecoratingWorkbenchLabelProvider();

	@Override
	public void addListener(ILabelProviderListener listener) {
		this.provider.addListener(listener);
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		this.provider.removeListener(listener);
	}

	@Override
	public Image getImage(Object element) {
		if(element instanceof MetadataCompartment) {
			return LabelImageFactory.getImage(LabelImageFactory.Icon.CrosswalkedRecord);
		} else if(element instanceof MdSecType) {
			MdSecType mdSec = (MdSecType)element;
			if(mdSec.getMdWrap() != null) {
				String type = !"OTHER".equals(mdSec.getMdWrap().getMDTYPE().getName()) ? 
						mdSec.getMdWrap().getMDTYPE().getName() :
							mdSec.getMdWrap().getOTHERMDTYPE();
				switch(type) {
				case "ACL":
					return LabelImageFactory.getImage(Icon.ACLDecor);
				case "MODS":
					return LabelImageFactory.getImage(Icon.UserEditedDecor);
				}
			}
		}
		return provider.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if(element instanceof MetadataCompartment) {
			MetadataCompartment mc = (MetadataCompartment)element;
			return "data row "+mc.row;
		}
		return provider.getText(element);
	}

}

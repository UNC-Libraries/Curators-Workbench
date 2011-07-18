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
package crosswalk.provider;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * @author Gregory Jansen
 *
 */
public class WrappedItemPropertyDescriptor implements IItemPropertyDescriptor {
    IItemPropertyDescriptor wrappedDescriptor = null;

    public WrappedItemPropertyDescriptor(IItemPropertyDescriptor wrappedDescriptor) {
	this.wrappedDescriptor = wrappedDescriptor;
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getPropertyValue(java.lang.Object)
     */
    @Override
    public Object getPropertyValue(Object object) {
	return wrappedDescriptor.getPropertyValue(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isPropertySet(java.lang.Object)
     */
    @Override
    public boolean isPropertySet(Object object) {
	return wrappedDescriptor.isPropertySet(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#canSetProperty(java.lang.Object)
     */
    @Override
    public boolean canSetProperty(Object object) {
	return wrappedDescriptor.canSetProperty(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#resetPropertyValue(java.lang.Object)
     */
    @Override
    public void resetPropertyValue(Object object) {
	this.wrappedDescriptor.resetPropertyValue(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#setPropertyValue(java.lang.Object, java.lang.Object)
     */
    @Override
    public void setPropertyValue(Object object, Object value) {
	this.wrappedDescriptor.setPropertyValue(object, value);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getCategory(java.lang.Object)
     */
    @Override
    public String getCategory(Object object) {
	return wrappedDescriptor.getCategory(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDescription(java.lang.Object)
     */
    @Override
    public String getDescription(Object object) {
	return this.wrappedDescriptor.getDescription(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDisplayName(java.lang.Object)
     */
    @Override
    public String getDisplayName(Object object) {
	return this.wrappedDescriptor.getDisplayName(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getFilterFlags(java.lang.Object)
     */
    @Override
    public String[] getFilterFlags(Object object) {
	return this.wrappedDescriptor.getFilterFlags(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getHelpContextIds(java.lang.Object)
     */
    @Override
    public Object getHelpContextIds(Object object) {
	return this.wrappedDescriptor.getHelpContextIds(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getId(java.lang.Object)
     */
    @Override
    public String getId(Object object) {
	return this.wrappedDescriptor.getId(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getLabelProvider(java.lang.Object)
     */
    @Override
    public IItemLabelProvider getLabelProvider(Object object) {
	return this.wrappedDescriptor.getLabelProvider(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isCompatibleWith(java.lang.Object, java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
     */
    @Override
    public boolean isCompatibleWith(Object object, Object anotherObject,
		    IItemPropertyDescriptor anotherPropertyDescriptor) {
	return this.wrappedDescriptor.isCompatibleWith(object, anotherObject, anotherPropertyDescriptor);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getFeature(java.lang.Object)
     */
    @Override
    public Object getFeature(Object object) {
	return this.wrappedDescriptor.getFeature(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isMany(java.lang.Object)
     */
    @Override
    public boolean isMany(Object object) {
	return this.wrappedDescriptor.isMany(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
     */
    @Override
    public Collection<?> getChoiceOfValues(Object object) {
	return this.wrappedDescriptor.getChoiceOfValues(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isMultiLine(java.lang.Object)
     */
    @Override
    public boolean isMultiLine(Object object) {
	return this.wrappedDescriptor.isMultiLine(object);
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isSortChoices(java.lang.Object)
     */
    @Override
    public boolean isSortChoices(Object object) {
	return this.wrappedDescriptor.isSortChoices(object);
    }

}

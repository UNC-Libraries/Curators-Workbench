/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import crosswalk.CrosswalkPackage;
import crosswalk.MappedAttribute;
import crosswalk.impl.MappedAttributeImpl;

/**
 * This is the item provider adapter for a {@link crosswalk.MappedAttribute} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class MappedAttributeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	Map<EAttribute, IItemPropertyDescriptor> foreignAttributeDescriptors = new HashMap<EAttribute, IItemPropertyDescriptor>();

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MappedAttributeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			addOutputPropertyDescriptor(object);
			addConversionStrategyPropertyDescriptor(object);
		}
		List<IItemPropertyDescriptor> result = new ArrayList<IItemPropertyDescriptor>();
		result.addAll(itemPropertyDescriptors);
		result.add(getDefaultValuePropertyDescriptor(object));
		return result;
	}

	/**
	 * This adds a property descriptor for the Output feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Input_Output_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Input_Output_feature", "_UI_Input_type"),
				CrosswalkPackage.Literals.INPUT__OUTPUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Conversion Strategy feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversionStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedAttribute_conversionStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedAttribute_conversionStrategy_feature", "_UI_MappedAttribute_type"),
				 CrosswalkPackage.Literals.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedAttribute_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedAttribute_defaultValue_feature", "_UI_MappedAttribute_type"),
				 CrosswalkPackage.Literals.MAPPED_ATTRIBUTE__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedAttribute_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedAttribute_required_feature", "_UI_MappedAttribute_type"),
				 CrosswalkPackage.Literals.MAPPED_ATTRIBUTE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns MappedAttribute.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappedAttribute"));
	}

	/**
	 * This adds a property descriptor for the Default Value feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	protected IItemPropertyDescriptor getDefaultValuePropertyDescriptor(Object object) {
		ItemPropertyDescriptor result = null;
		final MappedAttributeImpl ma = (MappedAttributeImpl) object;
		if (!foreignAttributeDescriptors.containsKey(ma.getMappedFeature())) {
			// load foreign property descriptor
			IEditingDomainItemProvider mappedProvider = null;
			EClass containerClass = ma.getMappedFeature().getEContainingClass();
			AdapterFactory rootFactory = ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory();
			EObject o = containerClass.getEPackage().getEFactoryInstance().create(containerClass);
			System.out.println("Container class: " + containerClass.getName());
			IEditingDomainItemProvider ip = (IEditingDomainItemProvider) rootFactory.adapt(o,
					IEditingDomainItemProvider.class);
			ItemProviderAdapter ipa = null;
			if (ip instanceof ItemProviderAdapter) {
				ipa = (ItemProviderAdapter) ip;
				foreignAttributeDescriptors.put(ma.getMappedFeature(), ipa.getPropertyDescriptor(o, ma.getMappedFeature()));
				// System.out.println("adding foreign descriptor to map: "
				// + foreignAttributeDescriptors.get(ma.getMappedFeature()).getDisplayName(o));
			}
		}

		// could wrap in the other direction and just override setProperty() instead..
		final IItemPropertyDescriptor foreign = foreignAttributeDescriptors.get(ma.getMappedFeature());
		result = new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), null,
				getString("_UI_MappedAttribute_defaultValue_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_MappedAttribute_defaultValue_feature", "_UI_MappedAttribute_type"),
				CrosswalkPackage.Literals.MAPPED_ATTRIBUTE__DEFAULT_VALUE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (foreign != null) {
					return foreign.getChoiceOfValues(object);
				} else {
					return super.getChoiceOfValues(object);
				}
			}

			@Override
			public IItemLabelProvider getLabelProvider(Object object) {
				if (foreign != null) {
					return foreign.getLabelProvider(object);
				} else {
					return super.getLabelProvider(object);
				}
			}

			// @Override
			// public boolean isMany(Object object) {
			// if(foreign != null) {
			// return foreign.isMany(object);
			// }
			// return super.isMany(object);
			// }

			@Override
			public boolean isMultiLine(Object object) {
				if (foreign != null) {
					return foreign.isMultiLine(object);
				}
				return super.isMultiLine(object);
			}

			@Override
			public boolean isSortChoices(Object object) {
				if (foreign != null) {
					return foreign.isSortChoices(object);
				}
				return super.isSortChoices(object);
			}

			@Override
			public void setPropertyValue(Object object, Object value) {
				String strVal = EcoreUtil.convertToString(ma.getMappedFeature().getEAttributeType(), value);
				super.setPropertyValue(object, strVal);
			}

			// @Override
			// public Object getPropertyValue(Object object) {
			// String savedString = (String)super.getPropertyValue(object);
			// Object result = EcoreUtil.createFromString(ma.getMappedFeature().getEAttributeType(), savedString);
			// return result;
			// }
			//
			// @Override
			// protected Object createPropertyValueWrapper(Object object, Object propertyValue) {
			// // TODO Auto-generated method stub
			// return super.createPropertyValueWrapper(object, propertyValue);
			// }

		};
		return result;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MappedAttribute)object).getDefaultValue();
		return label == null || label.length() == 0 ?
			getString("_UI_MappedAttribute_type") :
			getString("_UI_MappedAttribute_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MappedAttribute.class)) {
			case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
			case CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CrosswalkEditPlugin.INSTANCE;
	}

}

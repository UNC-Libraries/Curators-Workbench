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
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataSource;
import crosswalk.Editable;
import crosswalk.MappedElement;
import crosswalk.MappingContainer;
import crosswalk.OutputElement;
import crosswalk.MetsSource;
import crosswalk.WalkWidget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Walk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.CrossWalkImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.impl.CrossWalkImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.impl.CrossWalkImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrossWalkImpl extends SchemaProviderImpl implements CrossWalk {
        /**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
        protected EList<WalkWidget> widgets;

        /**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
        protected EList<OutputElement> elements;

								/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
        protected DataSource dataSource;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CrossWalkImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.CROSS_WALK;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DataSource getDataSource() {
		return dataSource;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrosswalkPackage.CROSS_WALK__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, CrosswalkPackage.DATA_SOURCE__WALK, DataSource.class, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, CrosswalkPackage.DATA_SOURCE__WALK, DataSource.class, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.CROSS_WALK__DATA_SOURCE, newDataSource, newDataSource));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<WalkWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentWithInverseEList<WalkWidget>(WalkWidget.class, this, CrosswalkPackage.CROSS_WALK__WIDGETS, CrosswalkPackage.WALK_WIDGET__WALK);
		}
		return widgets;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<OutputElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<OutputElement>(OutputElement.class, this, CrosswalkPackage.CROSS_WALK__ELEMENTS);
		}
		return elements;
	}

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public IProject getProject() throws DataException {
            URI uri = this.eResource().getURI();
            IFile resc = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(uri.toFileString()));
            return resc.getProject();
        }

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWidgets()).basicAdd(otherEnd, msgs);
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				if (dataSource != null)
					msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrosswalkPackage.CROSS_WALK__DATA_SOURCE, null, msgs);
				return basicSetDataSource((DataSource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				return getWidgets();
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
				return getElements();
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				return getDataSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends WalkWidget>)newValue);
				return;
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends OutputElement>)newValue);
				return;
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public void eUnset(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				getWidgets().clear();
				return;
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
				getElements().clear();
				return;
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
		}
		super.eUnset(featureID);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				return dataSource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MappingContainer.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.CROSS_WALK__WIDGETS: return CrosswalkPackage.MAPPING_CONTAINER__WIDGETS;
				case CrosswalkPackage.CROSS_WALK__ELEMENTS: return CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Editable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MappingContainer.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.MAPPING_CONTAINER__WIDGETS: return CrosswalkPackage.CROSS_WALK__WIDGETS;
				case CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS: return CrosswalkPackage.CROSS_WALK__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Editable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/* (non-Javadoc)
	 * @see crosswalk.CrossWalk#getRecordID(int)
	 */
	@Override
	public String getRecordID(int recordNumber) {
	    URI uri = this.eResource().getURI();
	    String path = uri.lastSegment();
	    return path+"_"+String.valueOf(recordNumber);
	}

	private MetsSource metsSource = null;

	/* (non-Javadoc)
	 * @see crosswalk.CrossWalk#setMetsSource(crosswalk.MetsSource)
	 */
	@Override
	public void setMetsSource(MetsSource metsSource) {
	    this.metsSource = metsSource;
	}

	/* (non-Javadoc)
	 * @see crosswalk.CrossWalk#getMetsSource()
	 */
	@Override
	public MetsSource getMetsSource() {
	    return this.metsSource;
	}

} //CrossWalkImpl

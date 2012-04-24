/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrosswalkPackage;
import crosswalk.Dictionary;
import crosswalk.MetadataBlock;
import crosswalk.Vocabulary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.DictionaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.DictionaryImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link crosswalk.impl.DictionaryImpl#getVocabularies <em>Vocabularies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryImpl extends SchemaProviderImpl implements Dictionary {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataBlock> blocks;

	/**
	 * The cached value of the '{@link #getVocabularies() <em>Vocabularies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularies()
	 * @generated
	 * @ordered
	 */
	protected EList<Vocabulary> vocabularies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DICTIONARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataBlock> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<MetadataBlock>(MetadataBlock.class, this, CrosswalkPackage.DICTIONARY__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vocabulary> getVocabularies() {
		if (vocabularies == null) {
			vocabularies = new EObjectContainmentEList<Vocabulary>(Vocabulary.class, this, CrosswalkPackage.DICTIONARY__VOCABULARIES);
		}
		return vocabularies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.DICTIONARY__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.DICTIONARY__VOCABULARIES:
				return ((InternalEList<?>)getVocabularies()).basicRemove(otherEnd, msgs);
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
			case CrosswalkPackage.DICTIONARY__NAME:
				return getName();
			case CrosswalkPackage.DICTIONARY__BLOCKS:
				return getBlocks();
			case CrosswalkPackage.DICTIONARY__VOCABULARIES:
				return getVocabularies();
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
			case CrosswalkPackage.DICTIONARY__NAME:
				setName((String)newValue);
				return;
			case CrosswalkPackage.DICTIONARY__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends MetadataBlock>)newValue);
				return;
			case CrosswalkPackage.DICTIONARY__VOCABULARIES:
				getVocabularies().clear();
				getVocabularies().addAll((Collection<? extends Vocabulary>)newValue);
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
			case CrosswalkPackage.DICTIONARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrosswalkPackage.DICTIONARY__BLOCKS:
				getBlocks().clear();
				return;
			case CrosswalkPackage.DICTIONARY__VOCABULARIES:
				getVocabularies().clear();
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
			case CrosswalkPackage.DICTIONARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrosswalkPackage.DICTIONARY__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case CrosswalkPackage.DICTIONARY__VOCABULARIES:
				return vocabularies != null && !vocabularies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DictionaryImpl

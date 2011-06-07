/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * behaviorType: Complex Type for Behaviors
 * 			 A behavior can be used to associate executable behaviors with content in the METS object.  A behavior element has an interface definition element that represents an abstract definition  of the set  of behaviors represented by a particular behavior.  A behavior element also has an behavior  mechanism which is a module of executable code that implements and runs the behavior defined abstractly by the interface definition.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.BehaviorType#getInterfaceDef <em>Interface Def</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getBTYPE <em>BTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorType#getSTRUCTID <em>STRUCTID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getBehaviorType()
 * @model extendedMetaData="name='behaviorType' kind='elementOnly'"
 * @generated
 */
public interface BehaviorType extends EObject {
        /**
	 * Returns the value of the '<em><b>Interface Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The interface definition &lt;interfaceDef&gt; element contains a pointer to an abstract definition of a single behavior or a set of related behaviors that are associated with the content of a METS object. The interface definition object to which the &lt;interfaceDef&gt; element points using xlink:href could be another digital object, or some other entity, such as a text file which describes the interface or a Web Services Description Language (WSDL) file. Ideally, an interface definition object contains metadata that describes a set of behaviors or methods. It may also contain files that describe the intended usage of the behaviors, and possibly files that represent different expressions of the interface definition.		
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Def</em>' containment reference.
	 * @see #setInterfaceDef(ObjectType)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_InterfaceDef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceDef' namespace='##targetNamespace'"
	 * @generated
	 */
        ObjectType getInterfaceDef();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getInterfaceDef <em>Interface Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Def</em>' containment reference.
	 * @see #getInterfaceDef()
	 * @generated
	 */
        void setInterfaceDef(ObjectType value);

        /**
	 * Returns the value of the '<em><b>Mechanism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * 					A mechanism element &lt;mechanism&gt; contains a pointer to an executable code module that implements a set of behaviors defined by an interface definition. The &lt;mechanism&gt; element will be a pointer to another object (a mechanism object). A mechanism object could be another METS object, or some other entity (e.g., a WSDL file). A mechanism object should contain executable code, pointers to executable code, or specifications for binding to network services (e.g., web services).
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mechanism</em>' containment reference.
	 * @see #setMechanism(ObjectType)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_Mechanism()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mechanism' namespace='##targetNamespace'"
	 * @generated
	 */
        ObjectType getMechanism();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getMechanism <em>Mechanism</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' containment reference.
	 * @see #getMechanism()
	 * @generated
	 */
        void setMechanism(ObjectType value);

        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREFS/O): An optional attribute listing the XML ID values of administrative metadata sections within the METS document pertaining to this behavior.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getADMID <em>ADMID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADMID</em>' attribute.
	 * @see #getADMID()
	 * @generated
	 */
        void setADMID(List<String> value);

        /**
	 * Returns the value of the '<em><b>BTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BTYPE (string/O): The behavior type provides a means of categorizing the related behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BTYPE</em>' attribute.
	 * @see #setBTYPE(String)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_BTYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='BTYPE'"
	 * @generated
	 */
        String getBTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getBTYPE <em>BTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BTYPE</em>' attribute.
	 * @see #getBTYPE()
	 * @generated
	 */
        void setBTYPE(String value);

        /**
	 * Returns the value of the '<em><b>CREATED</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CREATED (dateTime/O): The dateTime of creation for the behavior. 
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CREATED</em>' attribute.
	 * @see #setCREATED(XMLGregorianCalendar)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_CREATED()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='CREATED'"
	 * @generated
	 */
        XMLGregorianCalendar getCREATED();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getCREATED <em>CREATED</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATED</em>' attribute.
	 * @see #getCREATED()
	 * @generated
	 */
        void setCREATED(XMLGregorianCalendar value);

        /**
	 * Returns the value of the '<em><b>GROUPID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GROUPID (string/O): An identifier that establishes a correspondence between the given behavior and other behaviors, typically used to facilitate versions of behaviors.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GROUPID</em>' attribute.
	 * @see #setGROUPID(String)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_GROUPID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='GROUPID'"
	 * @generated
	 */
        String getGROUPID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getGROUPID <em>GROUPID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GROUPID</em>' attribute.
	 * @see #getGROUPID()
	 * @generated
	 */
        void setGROUPID(String value);

        /**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. In the case of a &lt;behavior&gt; element that applies to a &lt;transformFile&gt; element, the ID value must be present and would be referenced from the transformFile/@TRANSFORMBEHAVIOR attribute. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>LABEL</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LABEL (string/O): A text description of the behavior.  
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LABEL</em>' attribute.
	 * @see #setLABEL(String)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_LABEL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LABEL'"
	 * @generated
	 */
        String getLABEL();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getLABEL <em>LABEL</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LABEL</em>' attribute.
	 * @see #getLABEL()
	 * @generated
	 */
        void setLABEL(String value);

        /**
	 * Returns the value of the '<em><b>STRUCTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * STRUCTID (IDREFS/O): An XML IDREFS attribute used to link a &lt;behavior&gt;  to one or more &lt;div&gt; elements within a &lt;structMap&gt; in the METS document. The content to which the STRUCTID points is considered input to the executable behavior mechanism defined for the behavior.  If the &lt;behavior&gt; applies to one or more &lt;div&gt; elements, then the STRUCTID attribute must be present.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>STRUCTID</em>' attribute.
	 * @see #setSTRUCTID(List)
	 * @see gov.loc.mets.MetsPackage#getBehaviorType_STRUCTID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='STRUCTID'"
	 * @generated
	 */
        List<String> getSTRUCTID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.BehaviorType#getSTRUCTID <em>STRUCTID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STRUCTID</em>' attribute.
	 * @see #getSTRUCTID()
	 * @generated
	 */
        void setSTRUCTID(List<String> value);

} // BehaviorType

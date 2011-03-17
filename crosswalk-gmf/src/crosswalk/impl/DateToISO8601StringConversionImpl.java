/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.text.SimpleDateFormat;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DateToISO8601StringConversion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date To ISO8601 String Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DateToISO8601StringConversionImpl extends EObjectImpl implements DateToISO8601StringConversion {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DateToISO8601StringConversionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.DATE_TO_ISO8601_STRING_CONVERSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public Object convert(Object input) {
            return sdf.format(input);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public EDataType getInputDataType() {
            return EcorePackage.eINSTANCE.getEDate();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public EDataType getOutputDataType() {
                return EcorePackage.eINSTANCE.getEString();
        }

} //DateToISO8601StringConversionImpl

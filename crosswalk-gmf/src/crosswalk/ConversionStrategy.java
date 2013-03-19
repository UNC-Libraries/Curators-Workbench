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
package crosswalk;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getConversionStrategy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConversionStrategy extends EObject {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model required="true" inputRequired="true"
	 * @generated
	 */
        Object convert(Object input);

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="crosswalk.Clazz" required="true"
	 * @generated
	 */
	Class getInputType();

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="crosswalk.Clazz" required="true"
	 * @generated
	 */
	Class getOutputType();

} // ConversionStrategy

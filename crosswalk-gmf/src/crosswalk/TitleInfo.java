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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title Info</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getTitleInfo()
 * @model
 * @generated
 */
public interface TitleInfo extends InputConsumer, OutputElement {
    public static final int INPUT_TITLE = 0;
    public static final int INPUT_SUBTITLE = 1;
    public static final int INPUT_NONSORT = 2;
    public static final int INPUT_PARTNAME = 3;
    public static final int INPUT_PARTNUMBER = 4;

    public static final String[] stringInputNames = {"title", "subtitle", "non-sort","part name","part number"};

} // TitleInfo

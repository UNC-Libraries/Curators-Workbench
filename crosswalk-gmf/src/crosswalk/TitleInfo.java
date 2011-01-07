/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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

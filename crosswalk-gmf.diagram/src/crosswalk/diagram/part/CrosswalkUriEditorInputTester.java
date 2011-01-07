/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.ui.URIEditorInput;

/**
 * @generated
 */
public class CrosswalkUriEditorInputTester extends PropertyTester {

    /**
     * @generated
     */
    public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
	if (false == receiver instanceof URIEditorInput) {
	    return false;
	}
	URIEditorInput editorInput = (URIEditorInput) receiver;
	return "crosswalk".equals(editorInput.getURI().fileExtension()); //$NON-NLS-1$
    }

}

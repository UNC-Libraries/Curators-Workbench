package crosswalk.diagram.parsers;

import java.util.Arrays;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;

/**
 * @generated
 */
public class NativeParser extends AbstractParser {

	/**
	 * @generated
	 */
	public NativeParser(EAttribute[] features) {
		super(features);
		if (features.length != 1) {
			throw new IllegalArgumentException(Arrays.toString(features));
		}
	}

	/**
	 * @generated
	 */
	public NativeParser(EAttribute[] features, EAttribute[] editableFeatures) {
		super(features, editableFeatures);
		if (features.length != 1) {
			throw new IllegalArgumentException(Arrays.toString(features));
		}
		if (editableFeatures.length != 1) {
			throw new IllegalArgumentException(Arrays.toString(editableFeatures));
		}
	}

	/**
	 * @generated
	 */
	public String getEditString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		String s = EcoreUtil.convertToString(editableFeatures[0].getEAttributeType(), element.eGet(editableFeatures[0]));
		return s != null ? s : ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public IParserEditStatus isValidEditString(IAdaptable adapter, String editString) {
		return ParserEditStatus.EDITABLE_STATUS;
	}

	/**
	 * @generated
	 */
	public ICommand getParseCommand(IAdaptable adapter, String newString, int flags) {
		Object value = EcoreUtil.createFromString(editableFeatures[0].getEAttributeType(), newString);
		return getParseCommand(adapter, new Object[] { value }, flags);
	}

	/**
	 * @generated
	 */
	public String getPrintString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		String s = EcoreUtil.convertToString(features[0].getEAttributeType(), element.eGet(features[0]));
		return s != null ? s : ""; //$NON-NLS-1$
	}

}

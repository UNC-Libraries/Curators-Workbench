package crosswalk.diagram.custom;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class HelpfulFeatureEditorDialog extends FeatureEditorDialog {
	public String helpContextId = null;

	public HelpfulFeatureEditorDialog(Shell parent,
			ILabelProvider labelProvider, Object object,
			EClassifier eClassifier, List<?> currentValues, String displayName,
			List<?> choiceOfValues, boolean multiLine, boolean sortChoices,
			boolean unique, String helpContextId) {
		super(parent, labelProvider, object, eClassifier, currentValues,
				displayName, choiceOfValues, multiLine, sortChoices, unique);
		this.helpContextId = helpContextId;
	}

	public HelpfulFeatureEditorDialog(Shell parent,
			ILabelProvider labelProvider, EObject eObject,
			EStructuralFeature eStructuralFeature, String displayName,
			List<?> choiceOfValues, String helpContextId) {
		this(parent, labelProvider, eObject, eStructuralFeature.getEType(),
				(List<?>) eObject.eGet(eStructuralFeature), displayName,
				choiceOfValues, false, false, eStructuralFeature.isUnique(), helpContextId);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Control result = super.createDialogArea(parent);
		if(this.helpContextId != null && this.helpContextId instanceof String) {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(result, this.helpContextId);
		}
		return result;
	}
	
	

}

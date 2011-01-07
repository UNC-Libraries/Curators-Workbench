/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.part;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class CrosswalkCreationWizardPage extends WizardNewFileCreationPage {

    /**
     * @generated
     */
    private final String fileExtension;

    /**
     * @generated
     */
    public CrosswalkCreationWizardPage(String pageName, IStructuredSelection selection, String fileExtension) {
	super(pageName, selection);
	this.fileExtension = fileExtension;
    }

    /**
     * Override to create files with this extension.
     *
     * @generated
     */
    protected String getExtension() {
	return fileExtension;
    }

    /**
     * @generated
     */
    public URI getURI() {
	return URI.createPlatformResourceURI(getFilePath().toString(), false);
    }

    /**
     * @generated
     */
    protected IPath getFilePath() {
	IPath path = getContainerFullPath();
	if (path == null) {
	    path = new Path(""); //$NON-NLS-1$
	}
	String fileName = getFileName();
	if (fileName != null) {
	    path = path.append(fileName);
	}
	return path;
    }

    /**
     * @generated
     */
    @Override
    public void createControl(Composite parent) {
	super.createControl(parent);
	setFileName(CrosswalkDiagramEditorUtil.getUniqueFileName(getContainerFullPath(), getFileName(), getExtension()));
	setPageComplete(validatePage());
    }

    /**
     * @generated
     */
    @Override
    protected boolean validatePage() {
	if (!super.validatePage()) {
	    return false;
	}
	String extension = getExtension();
	if (extension != null && !getFilePath().toString().endsWith("." + extension)) {
	    setErrorMessage(NLS.bind(Messages.CrosswalkCreationWizardPageExtensionError, extension));
	    return false;
	}
	return true;
    }
}

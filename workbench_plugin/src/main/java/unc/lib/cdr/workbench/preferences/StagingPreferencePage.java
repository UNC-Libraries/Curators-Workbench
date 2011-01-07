package unc.lib.cdr.workbench.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class StagingPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    RadioGroupFieldEditor radioGroup;

    public StagingPreferencePage() {
	super(GRID);
	setPreferenceStore(Activator.getDefault().getPreferenceStore());
	setDescription("Configure staging preferences.");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    @Override
    public void createFieldEditors() {
	radioGroup = new RadioGroupFieldEditor(PreferenceConstants.P_STAGE_CHOICE, "Choose a stage:", 1,
			new String[][] { { "&CDR iRODS Stage", PreferenceConstants.P_STAGE_CHOICE_IRODS_PROD },
					{ "CDR-&Dev iRODS Stage", PreferenceConstants.P_STAGE_CHOICE_IRODS_TEST }, { "Local Stage", PreferenceConstants.P_STAGE_CHOICE_IRODS_LOCAL } },
			getFieldEditorParent());
	addField(radioGroup);
	addField(new LocationFieldEditor(PreferenceConstants.P_PROD_IRODS_URI, "&CDR iRODS Stage Location:",
			getFieldEditorParent()));

	addField(new LocationFieldEditor(PreferenceConstants.P_TEST_IRODS_URI, "&CDR-Dev iRODS Stage Location:",
			getFieldEditorParent()));

	addField(new DirectoryFieldEditor(PreferenceConstants.P_LOCAL_STAGE_PATH, "Local Stage Location",
			getFieldEditorParent()));

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

}
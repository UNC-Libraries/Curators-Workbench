/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

    /**
     * @generated
     */
    public void initializeDefaultPreferences() {
	IPreferenceStore store = getPreferenceStore();
	DiagramGeneralPreferencePage.initDefaults(store);
	DiagramAppearancePreferencePage.initDefaults(store);
	DiagramConnectionsPreferencePage.initDefaults(store);
	DiagramPrintingPreferencePage.initDefaults(store);
	DiagramRulersAndGridPreferencePage.initDefaults(store);

    }

    /**
     * @generated
     */
    protected IPreferenceStore getPreferenceStore() {
	return CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore();
    }
}

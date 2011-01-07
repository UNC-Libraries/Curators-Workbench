/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

    /**
     * @generated
     */
    public DiagramConnectionsPreferencePage() {
	setPreferenceStore(CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore());
    }
}

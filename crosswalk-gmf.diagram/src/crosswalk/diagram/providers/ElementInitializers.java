/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.providers;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

    protected ElementInitializers() {
	// use #getInstance to access cached instance
    }

    /**
     * @generated
     */
    public static ElementInitializers getInstance() {
	ElementInitializers cached = CrosswalkDiagramEditorPlugin.getInstance().getElementInitializers();
	if (cached == null) {
	    CrosswalkDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
	}
	return cached;
    }
}

package gov.loc.mods.mods.presentation;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

public class URIFragmentEditorInputFactory implements IElementFactory {
    public static final String ID = "mods.model.editor.factoryURIFragmentEditorInput";

    public URIFragmentEditorInputFactory()
    {
      super();
    }

    public IAdaptable createElement(IMemento memento)
    {
      return URIFragmentEditorInput.create(memento);
    }

}

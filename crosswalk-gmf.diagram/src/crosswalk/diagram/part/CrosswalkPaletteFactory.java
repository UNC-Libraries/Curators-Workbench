/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkPaletteFactory {

    /**
     * @generated
     */
    public void fillPalette(PaletteRoot paletteRoot) {
	paletteRoot.add(createDataInputs1Group());
    }

    /**
     * Creates "Data Inputs" palette tool group
     * @generated
     */
    private PaletteContainer createDataInputs1Group() {
	PaletteGroup paletteContainer = new PaletteGroup(Messages.DataInputs1Group_title);
	paletteContainer.setId("createDataInputs1Group"); //$NON-NLS-1$
	paletteContainer.add(createInputConnector1CreationTool());
	paletteContainer.add(createMODSElement2CreationTool());
	paletteContainer.add(createNormalizeWhitespace3CreationTool());
	paletteContainer.add(createOriginalNameMatcher4CreationTool());
	paletteContainer.add(createDateRecognizer5CreationTool());
	paletteContainer.add(createText6CreationTool());
	return paletteContainer;
    }

    /**
     * @generated
     */
    private ToolEntry createInputConnector1CreationTool() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(2);
	types.add(CrosswalkElementTypes.StringInputInput_4009);
	types.add(CrosswalkElementTypes.DateInputInput_4010);
	LinkToolEntry entry = new LinkToolEntry(Messages.InputConnector1CreationTool_title,
			Messages.InputConnector1CreationTool_desc, types);
	entry.setId("createInputConnector1CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.StringInputInput_4009));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createMODSElement2CreationTool() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(10);
	types.add(CrosswalkElementTypes.TitleInfo_2005);
	types.add(CrosswalkElementTypes.Abstract_2007);
	types.add(CrosswalkElementTypes.Genre_2008);
	types.add(CrosswalkElementTypes.Identifier_2009);
	types.add(CrosswalkElementTypes.Language_2010);
	types.add(CrosswalkElementTypes.Name_2011);
	types.add(CrosswalkElementTypes.Subject_2012);
	types.add(CrosswalkElementTypes.TypeOfResource_2013);
	types.add(CrosswalkElementTypes.DateCreated_2015);
	types.add(CrosswalkElementTypes.AccessCondition_2016);
	NodeToolEntry entry = new NodeToolEntry(Messages.MODSElement2CreationTool_title,
			Messages.MODSElement2CreationTool_desc, types);
	entry.setId("createMODSElement2CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.TitleInfo_2005));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createNormalizeWhitespace3CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.NormalizeWhitespace3CreationTool_title,
			Messages.NormalizeWhitespace3CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.TrimWhitespace_2019));
	entry.setId("createNormalizeWhitespace3CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.TrimWhitespace_2019));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createOriginalNameMatcher4CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.OriginalNameMatcher4CreationTool_title,
			Messages.OriginalNameMatcher4CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.OriginalNameRecordMatcher_2014));
	entry.setId("createOriginalNameMatcher4CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes
			.getImageDescriptor(CrosswalkElementTypes.OriginalNameRecordMatcher_2014));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createDateRecognizer5CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.DateRecognizer5CreationTool_title,
			Messages.DateRecognizer5CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.DateRecognizer_2017));
	entry.setId("createDateRecognizer5CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.DateRecognizer_2017));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createText6CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.Text6CreationTool_title, Messages.Text6CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.Text_2018));
	entry.setId("createText6CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.Text_2018));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private static class NodeToolEntry extends ToolEntry {

	/**
	 * @generated
	 */
	private final List<IElementType> elementTypes;

	/**
	 * @generated
	 */
	private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
	    super(title, description, null, null);
	    this.elementTypes = elementTypes;
	}

	/**
	 * @generated
	 */
	public Tool createTool() {
	    Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
	    tool.setProperties(getToolProperties());
	    return tool;
	}
    }

    /**
     * @generated
     */
    private static class LinkToolEntry extends ToolEntry {

	/**
	 * @generated
	 */
	private final List<IElementType> relationshipTypes;

	/**
	 * @generated
	 */
	private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
	    super(title, description, null, null);
	    this.relationshipTypes = relationshipTypes;
	}

	/**
	 * @generated
	 */
	public Tool createTool() {
	    Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
	    tool.setProperties(getToolProperties());
	    return tool;
	}
    }
}

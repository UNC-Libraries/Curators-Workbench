/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
	paletteContainer.add(createXMLElement1CreationTool());
	paletteContainer.add(createXMLAttribute2CreationTool());
	paletteContainer.add(createInputConnector3CreationTool());
	paletteContainer.add(createOriginalNameMatcher4CreationTool());
	paletteContainer.add(createFixedText5CreationTool());
	paletteContainer.add(createNormalizeWhitespace6CreationTool());
	paletteContainer.add(createDateRecognizer7CreationTool());
	return paletteContainer;
    }

    /**
     * @generated
     */
    private ToolEntry createXMLElement1CreationTool() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(2);
	types.add(CrosswalkElementTypes.MappedElement_2016);
	types.add(CrosswalkElementTypes.MappedElement_3015);
	NodeToolEntry entry = new NodeToolEntry(Messages.XMLElement1CreationTool_title,
			Messages.XMLElement1CreationTool_desc, types);
	entry.setId("createXMLElement1CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MappedElement_2016));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createXMLAttribute2CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.XMLAttribute2CreationTool_title,
			Messages.XMLAttribute2CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.MappedAttribute_3016));
	entry.setId("createXMLAttribute2CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MappedAttribute_3016));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createInputConnector3CreationTool() {
	LinkToolEntry entry = new LinkToolEntry(Messages.InputConnector3CreationTool_title,
			Messages.InputConnector3CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.InputOutput_4003));
	entry.setId("createInputConnector3CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.InputOutput_4003));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createOriginalNameMatcher4CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.OriginalNameMatcher4CreationTool_title,
			Messages.OriginalNameMatcher4CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.OriginalNameRecordMatcher_2010));
	entry.setId("createOriginalNameMatcher4CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes
			.getImageDescriptor(CrosswalkElementTypes.OriginalNameRecordMatcher_2010));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createFixedText5CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.FixedText5CreationTool_title,
			Messages.FixedText5CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.Text_2014));
	entry.setId("createFixedText5CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.Text_2014));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createNormalizeWhitespace6CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.NormalizeWhitespace6CreationTool_title,
			Messages.NormalizeWhitespace6CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.TrimWhitespace_2015));
	entry.setId("createNormalizeWhitespace6CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.TrimWhitespace_2015));
	entry.setLargeIcon(entry.getSmallIcon());
	return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createDateRecognizer7CreationTool() {
	NodeToolEntry entry = new NodeToolEntry(Messages.DateRecognizer7CreationTool_title,
			Messages.DateRecognizer7CreationTool_desc,
			Collections.singletonList(CrosswalkElementTypes.DateRecognizer_2013));
	entry.setId("createDateRecognizer7CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.DateRecognizer_2013));
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
	@Override
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
	@Override
	public Tool createTool() {
	    Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
	    tool.setProperties(getToolProperties());
	    return tool;
	}
    }
}

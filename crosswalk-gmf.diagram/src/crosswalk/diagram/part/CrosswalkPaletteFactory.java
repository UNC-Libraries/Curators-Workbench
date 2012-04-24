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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import crosswalk.CrosswalkFactory;
import crosswalk.InputField;
import crosswalk.MetadataBlock;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkPaletteFactory {

	/**
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMetadataMapping1Group());
		paletteRoot.add(createDictionary2Group());
		paletteRoot.add(createDictionaryContentsGroup());
	}

	/**
	 * Creates "Metadata Mapping" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createMetadataMapping1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.MetadataMapping1Group_title);
		paletteContainer.setId("createMetadataMapping1Group"); //$NON-NLS-1$
		paletteContainer.add(createXMLElement1CreationTool());
		paletteContainer.add(createXMLAttribute2CreationTool());
		paletteContainer.add(createInputConnector3CreationTool());
		paletteContainer.add(createOriginalNameMatcher4CreationTool());
		paletteContainer.add(createDateMaker5CreationTool());
		paletteContainer.add(createFixedText6CreationTool());
		paletteContainer.add(createTrimSpaces7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Dictionary" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createDictionary2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Dictionary2Group_title);
		paletteContainer.setId("createDictionary2Group"); //$NON-NLS-1$
		paletteContainer.add(createMetadataBlock1CreationTool());
		paletteContainer.add(createInputField2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates custom "Dictionary" entry palette tool group
	 */
	private PaletteContainer createDictionaryContentsGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer("custom "+Messages.Dictionary2Group_title);
		paletteContainer.setId("createCustomDictionary2Group"); //$NON-NLS-1$
		paletteContainer.add(createMetadataBlockCopyTool());
		return paletteContainer;
	}

	
	/**
	 * @generated
	 */
	private ToolEntry createXMLElement1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrosswalkElementTypes.MappedElement_3007);
		types.add(CrosswalkElementTypes.MappedElement_3008);
		types.add(CrosswalkElementTypes.MappedElement_3015);
		NodeToolEntry entry = new NodeToolEntry(Messages.XMLElement1CreationTool_title,
				Messages.XMLElement1CreationTool_desc, types);
		entry.setId("createXMLElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MappedElement_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXMLAttribute2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.MappedAttribute_3009);
		types.add(CrosswalkElementTypes.MappedAttribute_3016);
		NodeToolEntry entry = new NodeToolEntry(Messages.XMLAttribute2CreationTool_title,
				Messages.XMLAttribute2CreationTool_desc, types);
		entry.setId("createXMLAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MappedAttribute_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputConnector3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.InputConnector3CreationTool_title,
				Messages.InputConnector3CreationTool_desc,
				Collections.singletonList(CrosswalkElementTypes.InputOutput_4001));
		entry.setId("createInputConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.InputOutput_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOriginalNameMatcher4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3003);
		types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3011);
		NodeToolEntry entry = new NodeToolEntry(Messages.OriginalNameMatcher4CreationTool_title,
				Messages.OriginalNameMatcher4CreationTool_desc, types);
		entry.setId("createOriginalNameMatcher4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.OriginalNameRecordMatcher_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDateMaker5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.DateRecognizer_3004);
		types.add(CrosswalkElementTypes.DateRecognizer_3012);
		NodeToolEntry entry = new NodeToolEntry(Messages.DateMaker5CreationTool_title,
				Messages.DateMaker5CreationTool_desc, types);
		entry.setId("createDateMaker5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.DateRecognizer_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedText6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.Text_3005);
		types.add(CrosswalkElementTypes.Text_3013);
		NodeToolEntry entry = new NodeToolEntry(Messages.FixedText6CreationTool_title,
				Messages.FixedText6CreationTool_desc, types);
		entry.setId("createFixedText6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.Text_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrimSpaces7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.TrimWhitespace_3006);
		types.add(CrosswalkElementTypes.TrimWhitespace_3014);
		NodeToolEntry entry = new NodeToolEntry(Messages.TrimSpaces7CreationTool_title,
				Messages.TrimSpaces7CreationTool_desc, types);
		entry.setId("createTrimSpaces7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.TrimWhitespace_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetadataBlock1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.MetadataBlock_3018);
		types.add(CrosswalkElementTypes.MetadataBlock_3010);
		NodeToolEntry entry = new NodeToolEntry(Messages.MetadataBlock1CreationTool_title,
				Messages.MetadataBlock1CreationTool_desc, types);
		entry.setId("createMetadataBlock1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MetadataBlock_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputField2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.InputField2CreationTool_title,
				Messages.InputField2CreationTool_desc, Collections.singletonList(CrosswalkElementTypes.InputField_3017));
		entry.setId("createInputField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.InputField_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	 * @generated
	 */
	private ToolEntry createMetadataBlockCopyTool() {
		MetadataBlock mb = CrosswalkFactory.eINSTANCE.createMetadataBlock();
		mb.setName("my metadata block");
		InputField in = CrosswalkFactory.eINSTANCE.createInputField();
		in.setLabel("foooo");
		mb.getPorts().add(in);
		TemplateObjectToolEntry entry = new TemplateObjectToolEntry("drop "+Messages.MetadataBlock1CreationTool_title,
				"add "+mb.getName() /* Messages.MetadataBlock1CreationTool_desc*/, mb);
		entry.setId("dropMetadataBlockDropTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes.getImageDescriptor(CrosswalkElementTypes.MetadataBlock_3018));
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
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class TemplateObjectToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final EObject object;

		/**
		 * @generated
		 */
		private TemplateObjectToolEntry(String title, String description, EObject object) {
			super(title, description, null, null);
			this.object = object;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new TemplateObjectCreationTool(object);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	public static class TemplateObjectCreationTool extends CreationTool {

		/**
		 * List of objects which will be dropped.
		 */
		private final EObject object;

		/**
		 * Creates a new instance with a list of possible element types.
		 * 
		 * @param elementTypes
		 *           List of element types of which one will be created (of type <code>IElementType</code>).
		 */
		public TemplateObjectCreationTool(EObject object) {
			super();
			this.object = object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.tools.TargetingTool#createTargetRequest()
		 */
		protected Request createTargetRequest() {
			//return new TemplateObjectCreateRequest(CrosswalkElementTypes.MetadataBlock_3018, object, getPreferencesHint());
			CreateViewRequest req = CreateViewRequestFactory.getCreateShapeRequest(CrosswalkElementTypes.MetadataBlock_3018, getPreferencesHint());
			req.getExtendedData().put("templateElement", object);
			return req;
			//DropObjectsRequest drop = new DropObjectsRequest();
			//drop.setObjects(Collections.singletonList(EcoreUtil.copy(this.object)));
			//return drop;
		}

		@Override
		protected String getCommandName() {
			return "drop: "+object.toString();
		}
	}
}

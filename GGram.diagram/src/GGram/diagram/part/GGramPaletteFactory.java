package GGram.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class GGramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGGram1Group());
	}

	/**
	 * Creates "GGram" palette tool group
	 * @generated
	 */
	private PaletteContainer createGGram1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				GGram.diagram.part.Messages.GGram1Group_title);
		paletteContainer.setId("createGGram1Group"); //$NON-NLS-1$
		paletteContainer.add(createMan1CreationTool());
		paletteContainer.add(createWoman2CreationTool());
		paletteContainer.add(createMarriage3CreationTool());
		paletteContainer.add(createCohabitation4CreationTool());
		paletteContainer.add(createEngagement5CreationTool());
		paletteContainer.add(createDivorce6CreationTool());
		paletteContainer.add(createRelationship7CreationTool());
		paletteContainer.add(createNullity8CreationTool());
		paletteContainer.add(createLoveAffair9CreationTool());
		paletteContainer.add(createCohabitationAndSeparation10CreationTool());
		paletteContainer.add(createHasAdoptedChild11CreationTool());
		paletteContainer.add(createHasChild12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMan1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		NodeToolEntry entry = new NodeToolEntry(
				GGram.diagram.part.Messages.Man1CreationTool_title,
				GGram.diagram.part.Messages.Man1CreationTool_desc, types);
		entry.setId("createMan1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Man_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWoman2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		NodeToolEntry entry = new NodeToolEntry(
				GGram.diagram.part.Messages.Woman2CreationTool_title,
				GGram.diagram.part.Messages.Woman2CreationTool_desc, types);
		entry.setId("createWoman2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Woman_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMarriage3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Marriage_4005);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Marriage3CreationTool_title,
				GGram.diagram.part.Messages.Marriage3CreationTool_desc, types);
		entry.setId("createMarriage3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Marriage_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCohabitation4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Cohabitation_4003);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Cohabitation4CreationTool_title,
				GGram.diagram.part.Messages.Cohabitation4CreationTool_desc,
				types);
		entry.setId("createCohabitation4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Cohabitation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEngagement5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Engagement_4001);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Engagement5CreationTool_title,
				GGram.diagram.part.Messages.Engagement5CreationTool_desc, types);
		entry.setId("createEngagement5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Engagement_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDivorce6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Divorce_4008);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Divorce6CreationTool_title,
				GGram.diagram.part.Messages.Divorce6CreationTool_desc, types);
		entry.setId("createDivorce6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Divorce_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Relationship_4009);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Relationship7CreationTool_title,
				GGram.diagram.part.Messages.Relationship7CreationTool_desc,
				types);
		entry.setId("createRelationship7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Relationship_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNullity8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.Nullity_4007);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.Nullity8CreationTool_title,
				GGram.diagram.part.Messages.Nullity8CreationTool_desc, types);
		entry.setId("createNullity8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.Nullity_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoveAffair9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.LoveAffair_4006);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.LoveAffair9CreationTool_title,
				GGram.diagram.part.Messages.LoveAffair9CreationTool_desc, types);
		entry.setId("createLoveAffair9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.LoveAffair_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCohabitationAndSeparation10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.CohabitationAndSeparation10CreationTool_title,
				GGram.diagram.part.Messages.CohabitationAndSeparation10CreationTool_desc,
				types);
		entry.setId("createCohabitationAndSeparation10CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasAdoptedChild11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.HasAdoptedChild11CreationTool_title,
				GGram.diagram.part.Messages.HasAdoptedChild11CreationTool_desc,
				types);
		entry.setId("createHasAdoptedChild11CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasChild12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GGram.diagram.providers.GGramElementTypes.HasChild_4002);
		LinkToolEntry entry = new LinkToolEntry(
				GGram.diagram.part.Messages.HasChild12CreationTool_title,
				GGram.diagram.part.Messages.HasChild12CreationTool_desc, types);
		entry.setId("createHasChild12CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(GGram.diagram.providers.GGramElementTypes
						.getImageDescriptor(GGram.diagram.providers.GGramElementTypes.HasChild_4002));
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
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
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
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
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

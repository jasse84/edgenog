package GGram.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GGramNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GGram.diagram.part.GGramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GGram.diagram.part.GGramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GGram.diagram.navigator.GGramNavigatorItem
				&& !isOwnView(((GGram.diagram.navigator.GGramNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GGram.diagram.navigator.GGramNavigatorGroup) {
			GGram.diagram.navigator.GGramNavigatorGroup group = (GGram.diagram.navigator.GGramNavigatorGroup) element;
			return GGram.diagram.part.GGramDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof GGram.diagram.navigator.GGramNavigatorItem) {
			GGram.diagram.navigator.GGramNavigatorItem navigatorItem = (GGram.diagram.navigator.GGramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ggram?Genogram", GGram.diagram.providers.GGramElementTypes.Genogram_1000); //$NON-NLS-1$
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ggram?Woman", GGram.diagram.providers.GGramElementTypes.Woman_2001); //$NON-NLS-1$
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ggram?Man", GGram.diagram.providers.GGramElementTypes.Man_2002); //$NON-NLS-1$
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Engagement", GGram.diagram.providers.GGramElementTypes.Engagement_4001); //$NON-NLS-1$
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?HasChild", GGram.diagram.providers.GGramElementTypes.HasChild_4002); //$NON-NLS-1$
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Cohabitation", GGram.diagram.providers.GGramElementTypes.Cohabitation_4003); //$NON-NLS-1$
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?CohabitationAndSeparation", GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004); //$NON-NLS-1$
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Marriage", GGram.diagram.providers.GGramElementTypes.Marriage_4005); //$NON-NLS-1$
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?LoveAffair", GGram.diagram.providers.GGramElementTypes.LoveAffair_4006); //$NON-NLS-1$
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Nullity", GGram.diagram.providers.GGramElementTypes.Nullity_4007); //$NON-NLS-1$
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Divorce", GGram.diagram.providers.GGramElementTypes.Divorce_4008); //$NON-NLS-1$
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?Relationship", GGram.diagram.providers.GGramElementTypes.Relationship_4009); //$NON-NLS-1$
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ggram?HasAdoptedChild", GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GGram.diagram.part.GGramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& GGram.diagram.providers.GGramElementTypes
						.isKnownElementType(elementType)) {
			image = GGram.diagram.providers.GGramElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GGram.diagram.navigator.GGramNavigatorGroup) {
			GGram.diagram.navigator.GGramNavigatorGroup group = (GGram.diagram.navigator.GGramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GGram.diagram.navigator.GGramNavigatorItem) {
			GGram.diagram.navigator.GGramNavigatorItem navigatorItem = (GGram.diagram.navigator.GGramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			return getGenogram_1000Text(view);
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return getWoman_2001Text(view);
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return getMan_2002Text(view);
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getEngagement_4001Text(view);
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getHasChild_4002Text(view);
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getCohabitation_4003Text(view);
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getCohabitationAndSeparation_4004Text(view);
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getMarriage_4005Text(view);
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getLoveAffair_4006Text(view);
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getNullity_4007Text(view);
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getDivorce_4008Text(view);
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getRelationship_4009Text(view);
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getHasAdoptedChild_4010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGenogram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWoman_2001Text(View view) {
		IParser parser = GGram.diagram.providers.GGramParserProvider
				.getParser(
						GGram.diagram.providers.GGramElementTypes.Woman_2001,
						view.getElement() != null ? view.getElement() : view,
						GGram.diagram.part.GGramVisualIDRegistry
								.getType(GGram.diagram.edit.parts.WomanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GGram.diagram.part.GGramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMan_2002Text(View view) {
		IParser parser = GGram.diagram.providers.GGramParserProvider
				.getParser(
						GGram.diagram.providers.GGramElementTypes.Man_2002,
						view.getElement() != null ? view.getElement() : view,
						GGram.diagram.part.GGramVisualIDRegistry
								.getType(GGram.diagram.edit.parts.ManNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GGram.diagram.part.GGramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEngagement_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHasChild_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCohabitation_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCohabitationAndSeparation_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMarriage_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoveAffair_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNullity_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDivorce_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationship_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHasAdoptedChild_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(GGram.diagram.part.GGramVisualIDRegistry
						.getModelID(view));
	}

}

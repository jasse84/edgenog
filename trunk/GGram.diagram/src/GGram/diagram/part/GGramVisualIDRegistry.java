package GGram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GGramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GGram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID.equals(view
					.getType())) {
				return GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GGram.diagram.part.GGramDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GGram.GGramPackage.eINSTANCE.getGenogram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((GGram.Genogram) domainElement)) {
			return GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = GGram.diagram.part.GGramVisualIDRegistry
				.getModelID(containerView);
		if (!GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			if (GGram.GGramPackage.eINSTANCE.getWoman().isSuperTypeOf(
					domainElement.eClass())) {
				return GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID;
			}
			if (GGram.GGramPackage.eINSTANCE.getMan().isSuperTypeOf(
					domainElement.eClass())) {
				return GGram.diagram.edit.parts.ManEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = GGram.diagram.part.GGramVisualIDRegistry
				.getModelID(containerView);
		if (!GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			if (GGram.diagram.edit.parts.WomanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.WomanProfessionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.WomanDateOfBirthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.WomanDateOfDeathEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			if (GGram.diagram.edit.parts.ManNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.ManProfessionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.ManDateOfBirthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.ManDateOfDeathEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			if (GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GGram.diagram.edit.parts.ManEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GGram.GGramPackage.eINSTANCE.getEngagement().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getHasChild().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getCohabitation().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getCohabitationAndSeparation()
				.isSuperTypeOf(domainElement.eClass())) {
			return GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getMarriage().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getLoveAffair().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getNullity().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getDivorce().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID;
		}
		if (GGram.GGramPackage.eINSTANCE.getHasAdoptedChild().isSuperTypeOf(
				domainElement.eClass())) {
			return GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(GGram.Genogram element) {
		return true;
	}

}

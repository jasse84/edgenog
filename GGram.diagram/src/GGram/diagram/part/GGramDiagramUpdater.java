package GGram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GGramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			return getGenogram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGenogram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		GGram.Genogram modelElement = (GGram.Genogram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasEntities().iterator(); it
				.hasNext();) {
			GGram.Entity childElement = (GGram.Entity) it.next();
			int visualID = GGram.diagram.part.GGramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID) {
				result.add(new GGram.diagram.part.GGramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == GGram.diagram.edit.parts.ManEditPart.VISUAL_ID) {
				result.add(new GGram.diagram.part.GGramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			return getGenogram_1000ContainedLinks(view);
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return getWoman_2001ContainedLinks(view);
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return getMan_2002ContainedLinks(view);
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getEngagement_4001ContainedLinks(view);
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getHasChild_4002ContainedLinks(view);
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getCohabitation_4003ContainedLinks(view);
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getCohabitationAndSeparation_4004ContainedLinks(view);
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getMarriage_4005ContainedLinks(view);
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getLoveAffair_4006ContainedLinks(view);
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getNullity_4007ContainedLinks(view);
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getDivorce_4008ContainedLinks(view);
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getRelationship_4009ContainedLinks(view);
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getHasAdoptedChild_4010ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return getWoman_2001IncomingLinks(view);
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return getMan_2002IncomingLinks(view);
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getEngagement_4001IncomingLinks(view);
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getHasChild_4002IncomingLinks(view);
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getCohabitation_4003IncomingLinks(view);
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getCohabitationAndSeparation_4004IncomingLinks(view);
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getMarriage_4005IncomingLinks(view);
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getLoveAffair_4006IncomingLinks(view);
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getNullity_4007IncomingLinks(view);
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getDivorce_4008IncomingLinks(view);
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getRelationship_4009IncomingLinks(view);
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getHasAdoptedChild_4010IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return getWoman_2001OutgoingLinks(view);
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return getMan_2002OutgoingLinks(view);
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getEngagement_4001OutgoingLinks(view);
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getHasChild_4002OutgoingLinks(view);
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getCohabitation_4003OutgoingLinks(view);
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getCohabitationAndSeparation_4004OutgoingLinks(view);
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getMarriage_4005OutgoingLinks(view);
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getLoveAffair_4006OutgoingLinks(view);
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getNullity_4007OutgoingLinks(view);
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getDivorce_4008OutgoingLinks(view);
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getRelationship_4009OutgoingLinks(view);
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getHasAdoptedChild_4010OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGenogram_1000ContainedLinks(View view) {
		GGram.Genogram modelElement = (GGram.Genogram) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Engagement_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Cohabitation_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_CohabitationAndSeparation_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Marriage_4005(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_LoveAffair_4006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Nullity_4007(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Divorce_4008(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Relationship_4009(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWoman_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMan_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEngagement_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHasChild_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCohabitation_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCohabitationAndSeparation_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMarriage_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLoveAffair_4006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNullity_4007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDivorce_4008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHasAdoptedChild_4010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWoman_2001IncomingLinks(View view) {
		GGram.Woman modelElement = (GGram.Woman) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_HasChild_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HasAdoptedChild_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMan_2002IncomingLinks(View view) {
		GGram.Man modelElement = (GGram.Man) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Engagement_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HasChild_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Cohabitation_4003(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_CohabitationAndSeparation_4004(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Marriage_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LoveAffair_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Nullity_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Divorce_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HasAdoptedChild_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEngagement_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHasChild_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCohabitation_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCohabitationAndSeparation_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMarriage_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLoveAffair_4006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNullity_4007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDivorce_4008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHasAdoptedChild_4010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWoman_2001OutgoingLinks(View view) {
		GGram.Woman modelElement = (GGram.Woman) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Engagement_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Cohabitation_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CohabitationAndSeparation_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Marriage_4005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LoveAffair_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Nullity_4007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Divorce_4008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMan_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEngagement_4001OutgoingLinks(View view) {
		GGram.Engagement modelElement = (GGram.Engagement) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHasChild_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCohabitation_4003OutgoingLinks(View view) {
		GGram.Cohabitation modelElement = (GGram.Cohabitation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCohabitationAndSeparation_4004OutgoingLinks(View view) {
		GGram.CohabitationAndSeparation modelElement = (GGram.CohabitationAndSeparation) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMarriage_4005OutgoingLinks(View view) {
		GGram.Marriage modelElement = (GGram.Marriage) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoveAffair_4006OutgoingLinks(View view) {
		GGram.LoveAffair modelElement = (GGram.LoveAffair) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNullity_4007OutgoingLinks(View view) {
		GGram.Nullity modelElement = (GGram.Nullity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDivorce_4008OutgoingLinks(View view) {
		GGram.Divorce modelElement = (GGram.Divorce) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4009OutgoingLinks(View view) {
		GGram.Relationship modelElement = (GGram.Relationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasChild_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHasAdoptedChild_4010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Engagement_4001(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Engagement) {
				continue;
			}
			GGram.Engagement link = (GGram.Engagement) linkObject;
			if (GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Engagement_4001,
					GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HasChild_4002(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasChildRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.HasChild) {
				continue;
			}
			GGram.HasChild link = (GGram.HasChild) linkObject;
			if (GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Entity dst = link.getTarget();
			GGram.FamiliRelation src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.HasChild_4002,
					GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Cohabitation_4003(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Cohabitation) {
				continue;
			}
			GGram.Cohabitation link = (GGram.Cohabitation) linkObject;
			if (GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.Cohabitation_4003,
							GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_CohabitationAndSeparation_4004(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.CohabitationAndSeparation) {
				continue;
			}
			GGram.CohabitationAndSeparation link = (GGram.CohabitationAndSeparation) linkObject;
			if (GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004,
							GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Marriage_4005(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Marriage) {
				continue;
			}
			GGram.Marriage link = (GGram.Marriage) linkObject;
			if (GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Marriage_4005,
					GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_LoveAffair_4006(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.LoveAffair) {
				continue;
			}
			GGram.LoveAffair link = (GGram.LoveAffair) linkObject;
			if (GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.LoveAffair_4006,
					GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Nullity_4007(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Nullity) {
				continue;
			}
			GGram.Nullity link = (GGram.Nullity) linkObject;
			if (GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Nullity_4007,
					GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Divorce_4008(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Divorce) {
				continue;
			}
			GGram.Divorce link = (GGram.Divorce) linkObject;
			if (GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Divorce_4008,
					GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Relationship_4009(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Relationship) {
				continue;
			}
			GGram.Relationship link = (GGram.Relationship) linkObject;
			if (GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.Relationship_4009,
							GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HasAdoptedChild_4010(
			GGram.Genogram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHasChildRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.HasAdoptedChild) {
				continue;
			}
			GGram.HasAdoptedChild link = (GGram.HasAdoptedChild) linkObject;
			if (GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Entity dst = link.getTarget();
			GGram.FamiliRelation src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010,
							GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Engagement_4001(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Engagement) {
				continue;
			}
			GGram.Engagement link = (GGram.Engagement) setting.getEObject();
			if (GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.Engagement_4001,
					GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HasChild_4002(
			GGram.Entity target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getHasChildRelation_Target()
					|| false == setting.getEObject() instanceof GGram.HasChild) {
				continue;
			}
			GGram.HasChild link = (GGram.HasChild) setting.getEObject();
			if (GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.FamiliRelation src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.HasChild_4002,
					GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Cohabitation_4003(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Cohabitation) {
				continue;
			}
			GGram.Cohabitation link = (GGram.Cohabitation) setting.getEObject();
			if (GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							target,
							link,
							GGram.diagram.providers.GGramElementTypes.Cohabitation_4003,
							GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_CohabitationAndSeparation_4004(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.CohabitationAndSeparation) {
				continue;
			}
			GGram.CohabitationAndSeparation link = (GGram.CohabitationAndSeparation) setting
					.getEObject();
			if (GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							target,
							link,
							GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004,
							GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Marriage_4005(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Marriage) {
				continue;
			}
			GGram.Marriage link = (GGram.Marriage) setting.getEObject();
			if (GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.Marriage_4005,
					GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_LoveAffair_4006(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.LoveAffair) {
				continue;
			}
			GGram.LoveAffair link = (GGram.LoveAffair) setting.getEObject();
			if (GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.LoveAffair_4006,
					GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Nullity_4007(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Nullity) {
				continue;
			}
			GGram.Nullity link = (GGram.Nullity) setting.getEObject();
			if (GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.Nullity_4007,
					GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Divorce_4008(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Divorce) {
				continue;
			}
			GGram.Divorce link = (GGram.Divorce) setting.getEObject();
			if (GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, target,
					link,
					GGram.diagram.providers.GGramElementTypes.Divorce_4008,
					GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Relationship_4009(
			GGram.Man target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getFamiliRelation_Target()
					|| false == setting.getEObject() instanceof GGram.Relationship) {
				continue;
			}
			GGram.Relationship link = (GGram.Relationship) setting.getEObject();
			if (GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Woman src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							target,
							link,
							GGram.diagram.providers.GGramElementTypes.Relationship_4009,
							GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HasAdoptedChild_4010(
			GGram.Entity target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GGram.GGramPackage.eINSTANCE
					.getHasChildRelation_Target()
					|| false == setting.getEObject() instanceof GGram.HasAdoptedChild) {
				continue;
			}
			GGram.HasAdoptedChild link = (GGram.HasAdoptedChild) setting
					.getEObject();
			if (GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.FamiliRelation src = link.getSource();
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							target,
							link,
							GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010,
							GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Engagement_4001(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Engagement) {
				continue;
			}
			GGram.Engagement link = (GGram.Engagement) linkObject;
			if (GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Engagement_4001,
					GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HasChild_4002(
			GGram.FamiliRelation source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasChildRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.HasChild) {
				continue;
			}
			GGram.HasChild link = (GGram.HasChild) linkObject;
			if (GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Entity dst = link.getTarget();
			GGram.FamiliRelation src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.HasChild_4002,
					GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Cohabitation_4003(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Cohabitation) {
				continue;
			}
			GGram.Cohabitation link = (GGram.Cohabitation) linkObject;
			if (GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.Cohabitation_4003,
							GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_CohabitationAndSeparation_4004(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.CohabitationAndSeparation) {
				continue;
			}
			GGram.CohabitationAndSeparation link = (GGram.CohabitationAndSeparation) linkObject;
			if (GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004,
							GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Marriage_4005(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Marriage) {
				continue;
			}
			GGram.Marriage link = (GGram.Marriage) linkObject;
			if (GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Marriage_4005,
					GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_LoveAffair_4006(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.LoveAffair) {
				continue;
			}
			GGram.LoveAffair link = (GGram.LoveAffair) linkObject;
			if (GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.LoveAffair_4006,
					GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Nullity_4007(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Nullity) {
				continue;
			}
			GGram.Nullity link = (GGram.Nullity) linkObject;
			if (GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Nullity_4007,
					GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Divorce_4008(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Divorce) {
				continue;
			}
			GGram.Divorce link = (GGram.Divorce) linkObject;
			if (GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GGram.diagram.part.GGramLinkDescriptor(src, dst,
					link,
					GGram.diagram.providers.GGramElementTypes.Divorce_4008,
					GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Relationship_4009(
			GGram.Woman source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.Relationship) {
				continue;
			}
			GGram.Relationship link = (GGram.Relationship) linkObject;
			if (GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Man dst = link.getTarget();
			GGram.Woman src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.Relationship_4009,
							GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HasAdoptedChild_4010(
			GGram.FamiliRelation source) {
		GGram.Genogram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GGram.Genogram) {
				container = (GGram.Genogram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHasChildRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GGram.HasAdoptedChild) {
				continue;
			}
			GGram.HasAdoptedChild link = (GGram.HasAdoptedChild) linkObject;
			if (GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID != GGram.diagram.part.GGramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GGram.Entity dst = link.getTarget();
			GGram.FamiliRelation src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new GGram.diagram.part.GGramLinkDescriptor(
							src,
							dst,
							link,
							GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010,
							GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
		}
		return result;
	}

}

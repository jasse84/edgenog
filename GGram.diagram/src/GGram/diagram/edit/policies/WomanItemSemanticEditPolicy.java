package GGram.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WomanItemSemanticEditPolicy extends
		GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WomanItemSemanticEditPolicy() {
		super(GGram.diagram.providers.GGramElementTypes.Woman_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(incomingLink) == GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(incomingLink) == GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(outgoingLink) == GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GGram.diagram.providers.GGramElementTypes.Engagement_4001 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.EngagementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.HasChild_4002 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.Cohabitation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.CohabitationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.CohabitationAndSeparationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.Marriage_4005 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.MarriageCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.LoveAffair_4006 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.LoveAffairCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.Nullity_4007 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.NullityCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.Divorce_4008 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.DivorceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.Relationship_4009 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.RelationshipCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GGram.diagram.providers.GGramElementTypes.Engagement_4001 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.HasChild_4002 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.HasChildCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.Cohabitation_4003 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.Marriage_4005 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.LoveAffair_4006 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.Nullity_4007 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.Divorce_4008 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.Relationship_4009 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.HasAdoptedChildCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.EngagementReorientCommand(
					req));
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.HasChildReorientCommand(
					req));
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.CohabitationReorientCommand(
					req));
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.CohabitationAndSeparationReorientCommand(
					req));
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.MarriageReorientCommand(
					req));
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.LoveAffairReorientCommand(
					req));
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.NullityReorientCommand(
					req));
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.DivorceReorientCommand(
					req));
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.RelationshipReorientCommand(
					req));
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.HasAdoptedChildReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}

package GGram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CohabitationItemSemanticEditPolicy extends
		GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CohabitationItemSemanticEditPolicy() {
		super(GGram.diagram.providers.GGramElementTypes.Cohabitation_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
		if (GGram.diagram.providers.GGramElementTypes.HasChild_4002 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.HasChildCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010 == req
				.getElementType()) {
			return getGEFWrapper(new GGram.diagram.edit.commands.HasAdoptedChildCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GGram.diagram.providers.GGramElementTypes.HasChild_4002 == req
				.getElementType()) {
			return null;
		}
		if (GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010 == req
				.getElementType()) {
			return null;
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
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.HasChildReorientCommand(
					req));
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return getGEFWrapper(new GGram.diagram.edit.commands.HasAdoptedChildReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}

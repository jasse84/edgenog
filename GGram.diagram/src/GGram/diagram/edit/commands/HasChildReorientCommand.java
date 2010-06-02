package GGram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class HasChildReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public HasChildReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GGram.HasChild) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof GGram.FamiliRelation && newEnd instanceof GGram.FamiliRelation)) {
			return false;
		}
		GGram.Entity target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof GGram.Genogram)) {
			return false;
		}
		GGram.Genogram container = (GGram.Genogram) getLink().eContainer();
		return GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy.LinkConstraints
				.canExistHasChild_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GGram.Entity && newEnd instanceof GGram.Entity)) {
			return false;
		}
		GGram.FamiliRelation source = getLink().getSource();
		if (!(getLink().eContainer() instanceof GGram.Genogram)) {
			return false;
		}
		GGram.Genogram container = (GGram.Genogram) getLink().eContainer();
		return GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy.LinkConstraints
				.canExistHasChild_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected GGram.HasChild getLink() {
		return (GGram.HasChild) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GGram.FamiliRelation getOldSource() {
		return (GGram.FamiliRelation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.FamiliRelation getNewSource() {
		return (GGram.FamiliRelation) newEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.Entity getOldTarget() {
		return (GGram.Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.Entity getNewTarget() {
		return (GGram.Entity) newEnd;
	}
}

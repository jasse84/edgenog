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
public class CohabitationAndSeparationReorientCommand extends
		EditElementCommand {

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
	public CohabitationAndSeparationReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GGram.CohabitationAndSeparation) {
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
		if (!(oldEnd instanceof GGram.Woman && newEnd instanceof GGram.Woman)) {
			return false;
		}
		GGram.Man target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof GGram.Genogram)) {
			return false;
		}
		GGram.Genogram container = (GGram.Genogram) getLink().eContainer();
		return GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy.LinkConstraints
				.canExistCohabitationAndSeparation_4004(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GGram.Man && newEnd instanceof GGram.Man)) {
			return false;
		}
		GGram.Woman source = getLink().getSource();
		if (!(getLink().eContainer() instanceof GGram.Genogram)) {
			return false;
		}
		GGram.Genogram container = (GGram.Genogram) getLink().eContainer();
		return GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy.LinkConstraints
				.canExistCohabitationAndSeparation_4004(container, source,
						getNewTarget());
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
	protected GGram.CohabitationAndSeparation getLink() {
		return (GGram.CohabitationAndSeparation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GGram.Woman getOldSource() {
		return (GGram.Woman) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.Woman getNewSource() {
		return (GGram.Woman) newEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.Man getOldTarget() {
		return (GGram.Man) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GGram.Man getNewTarget() {
		return (GGram.Man) newEnd;
	}
}

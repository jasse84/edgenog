package GGram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class HasAdoptedChildItemSemanticEditPolicy extends
		GGram.diagram.edit.policies.GGramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HasAdoptedChildItemSemanticEditPolicy() {
		super(GGram.diagram.providers.GGramElementTypes.HasAdoptedChild_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}

package GGram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GGramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4012;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GGram.diagram.navigator.GGramNavigatorItem) {
			GGram.diagram.navigator.GGramNavigatorItem item = (GGram.diagram.navigator.GGramNavigatorItem) element;
			return GGram.diagram.part.GGramVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}

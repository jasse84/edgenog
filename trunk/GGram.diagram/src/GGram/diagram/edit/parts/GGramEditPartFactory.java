package GGram.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class GGramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {

			case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.GenogramEditPart(view);

			case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.WomanEditPart(view);

			case GGram.diagram.edit.parts.WomanNameEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.WomanNameEditPart(view);

			case GGram.diagram.edit.parts.WomanProfessionEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.WomanProfessionEditPart(
						view);

			case GGram.diagram.edit.parts.WomanDateOfBirthEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.WomanDateOfBirthEditPart(
						view);

			case GGram.diagram.edit.parts.WomanDateOfDeathEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.WomanDateOfDeathEditPart(
						view);

			case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.ManEditPart(view);

			case GGram.diagram.edit.parts.ManNameEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.ManNameEditPart(view);

			case GGram.diagram.edit.parts.ManProfessionEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.ManProfessionEditPart(view);

			case GGram.diagram.edit.parts.ManDateOfBirthEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.ManDateOfBirthEditPart(view);

			case GGram.diagram.edit.parts.ManDateOfDeathEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.ManDateOfDeathEditPart(view);

			case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.EngagementEditPart(view);

			case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.HasChildEditPart(view);

			case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.CohabitationEditPart(view);

			case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.CohabitationAndSeparationEditPart(
						view);

			case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.MarriageEditPart(view);

			case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.LoveAffairEditPart(view);

			case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.NullityEditPart(view);

			case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.DivorceEditPart(view);

			case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.RelationshipEditPart(view);

			case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
				return new GGram.diagram.edit.parts.HasAdoptedChildEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}

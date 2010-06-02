package GGram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ManEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ManEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GGram.diagram.edit.policies.ManItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ManFigure figure = new ManFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ManFigure getPrimaryShape() {
		return (ManFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GGram.diagram.edit.parts.ManNameEditPart) {
			((GGram.diagram.edit.parts.ManNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureManNameFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManProfessionEditPart) {
			((GGram.diagram.edit.parts.ManProfessionEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureManProfessionFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManDateOfBirthEditPart) {
			((GGram.diagram.edit.parts.ManDateOfBirthEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureManDateOfBirthFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManDateOfDeathEditPart) {
			((GGram.diagram.edit.parts.ManDateOfDeathEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureManDateOfDeathFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GGram.diagram.edit.parts.ManNameEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManProfessionEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManDateOfBirthEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.ManDateOfDeathEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 150);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GGram.diagram.part.GGramVisualIDRegistry
				.getType(GGram.diagram.edit.parts.ManNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(GGram.diagram.providers.GGramElementTypes.Engagement_4001);
		types.add(GGram.diagram.providers.GGramElementTypes.Cohabitation_4003);
		types
				.add(GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004);
		types.add(GGram.diagram.providers.GGramElementTypes.Marriage_4005);
		types.add(GGram.diagram.providers.GGramElementTypes.LoveAffair_4006);
		types.add(GGram.diagram.providers.GGramElementTypes.Nullity_4007);
		types.add(GGram.diagram.providers.GGramElementTypes.Divorce_4008);
		types.add(GGram.diagram.providers.GGramElementTypes.Relationship_4009);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Engagement_4001) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Cohabitation_4003) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Marriage_4005) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.LoveAffair_4006) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Nullity_4007) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Divorce_4008) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Relationship_4009) {
			types.add(GGram.diagram.providers.GGramElementTypes.Woman_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ManFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureManNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureManDateOfBirthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureManDateOfDeathFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureManProfessionFigure;

		/**
		 * @generated
		 */
		public ManFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.marginWidth = 30;
			layoutThis.marginHeight = 30;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(3);
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(150)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(200)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(50),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureManNameFigure = new WrappingLabel();
			fFigureManNameFigure.setText("Name");

			fFigureManNameFigure.setFont(FFIGUREMANNAMEFIGURE_FONT);

			this.add(fFigureManNameFigure);

			fFigureManDateOfBirthFigure = new WrappingLabel();
			fFigureManDateOfBirthFigure.setText("Date of birth:");

			fFigureManDateOfBirthFigure
					.setFont(FFIGUREMANDATEOFBIRTHFIGURE_FONT);

			this.add(fFigureManDateOfBirthFigure);

			fFigureManDateOfDeathFigure = new WrappingLabel();
			fFigureManDateOfDeathFigure.setText("Daste of death:");

			fFigureManDateOfDeathFigure
					.setFont(FFIGUREMANDATEOFDEATHFIGURE_FONT);

			this.add(fFigureManDateOfDeathFigure);

			fFigureManProfessionFigure = new WrappingLabel();
			fFigureManProfessionFigure.setText("Profession:");

			fFigureManProfessionFigure.setFont(FFIGUREMANPROFESSIONFIGURE_FONT);

			this.add(fFigureManProfessionFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureManNameFigure() {
			return fFigureManNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureManDateOfBirthFigure() {
			return fFigureManDateOfBirthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureManDateOfDeathFigure() {
			return fFigureManDateOfDeathFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureManProfessionFigure() {
			return fFigureManProfessionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 255);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 223, 247, 247);

	/**
	 * @generated
	 */
	static final Font FFIGUREMANNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), "MName", 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREMANDATEOFBIRTHFIGURE_FONT = new Font(Display
			.getCurrent(), "MDateB", 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREMANDATEOFDEATHFIGURE_FONT = new Font(Display
			.getCurrent(), "MDateD", 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREMANPROFESSIONFIGURE_FONT = new Font(Display
			.getCurrent(), "MProfession", 8, SWT.ITALIC);

}

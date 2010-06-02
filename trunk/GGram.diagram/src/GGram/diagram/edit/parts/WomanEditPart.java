package GGram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
public class WomanEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public WomanEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GGram.diagram.edit.policies.WomanItemSemanticEditPolicy());
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
		WomanFigure figure = new WomanFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public WomanFigure getPrimaryShape() {
		return (WomanFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanDateOfDeathEditPart) {
			((GGram.diagram.edit.parts.WomanDateOfDeathEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWomanDateOfDeathFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanNameEditPart) {
			((GGram.diagram.edit.parts.WomanNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureWomanNameFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanProfessionEditPart) {
			((GGram.diagram.edit.parts.WomanProfessionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWomanProfessionFigure());
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanDateOfBirthEditPart) {
			((GGram.diagram.edit.parts.WomanDateOfBirthEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWomanDateOfBirthFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanDateOfDeathEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanNameEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanProfessionEditPart) {
			return true;
		}
		if (childEditPart instanceof GGram.diagram.edit.parts.WomanDateOfBirthEditPart) {
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
				.getType(GGram.diagram.edit.parts.WomanNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
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
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types
					.add(GGram.diagram.providers.GGramElementTypes.Engagement_4001);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types
					.add(GGram.diagram.providers.GGramElementTypes.Cohabitation_4003);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types
					.add(GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types.add(GGram.diagram.providers.GGramElementTypes.Marriage_4005);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types
					.add(GGram.diagram.providers.GGramElementTypes.LoveAffair_4006);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types.add(GGram.diagram.providers.GGramElementTypes.Nullity_4007);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types.add(GGram.diagram.providers.GGramElementTypes.Divorce_4008);
		}
		if (targetEditPart instanceof GGram.diagram.edit.parts.ManEditPart) {
			types
					.add(GGram.diagram.providers.GGramElementTypes.Relationship_4009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Engagement_4001) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Cohabitation_4003) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.CohabitationAndSeparation_4004) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Marriage_4005) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.LoveAffair_4006) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Nullity_4007) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Divorce_4008) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		if (relationshipType == GGram.diagram.providers.GGramElementTypes.Relationship_4009) {
			types.add(GGram.diagram.providers.GGramElementTypes.Man_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WomanFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWomanProfessionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWomanDateOfDeathFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWomanDateOfBirthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWomanNameFigure;

		/**
		 * @generated
		 */
		public WomanFigure() {

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
			this.setSize(getMapMode().DPtoLP(150), getMapMode().DPtoLP(150));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWomanNameFigure = new WrappingLabel();
			fFigureWomanNameFigure.setText("Name");

			fFigureWomanNameFigure.setFont(FFIGUREWOMANNAMEFIGURE_FONT);

			this.add(fFigureWomanNameFigure);

			fFigureWomanDateOfBirthFigure = new WrappingLabel();
			fFigureWomanDateOfBirthFigure.setText("Date of birth");

			fFigureWomanDateOfBirthFigure
					.setFont(FFIGUREWOMANDATEOFBIRTHFIGURE_FONT);

			this.add(fFigureWomanDateOfBirthFigure);

			fFigureWomanDateOfDeathFigure = new WrappingLabel();
			fFigureWomanDateOfDeathFigure.setText("Date of death");

			fFigureWomanDateOfDeathFigure
					.setFont(FFIGUREWOMANDATEOFDEATHFIGURE_FONT);

			this.add(fFigureWomanDateOfDeathFigure);

			fFigureWomanProfessionFigure = new WrappingLabel();
			fFigureWomanProfessionFigure.setText("Profession");

			fFigureWomanProfessionFigure
					.setFont(FFIGUREWOMANPROFESSIONFIGURE_FONT);

			this.add(fFigureWomanProfessionFigure);

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
		public WrappingLabel getFigureWomanProfessionFigure() {
			return fFigureWomanProfessionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWomanDateOfDeathFigure() {
			return fFigureWomanDateOfDeathFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWomanDateOfBirthFigure() {
			return fFigureWomanDateOfBirthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWomanNameFigure() {
			return fFigureWomanNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 0, 0);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 251, 202, 205);

	/**
	 * @generated
	 */
	static final Font FFIGUREWOMANNAMEFIGURE_FONT = new Font(Display
			.getCurrent(), "WName", 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREWOMANDATEOFBIRTHFIGURE_FONT = new Font(Display
			.getCurrent(), "DBirth", 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREWOMANDATEOFDEATHFIGURE_FONT = new Font(Display
			.getCurrent(), "DDeath", 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREWOMANPROFESSIONFIGURE_FONT = new Font(Display
			.getCurrent(), "WProfession", 8, SWT.ITALIC);

}

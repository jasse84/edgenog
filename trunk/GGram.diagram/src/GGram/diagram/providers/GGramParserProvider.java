package GGram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GGramParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser womanName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getWomanName_5001Parser() {
		if (womanName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Name() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			womanName_5001Parser = parser;
		}
		return womanName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser womanProfession_5003Parser;

	/**
	 * @generated
	 */
	private IParser getWomanProfession_5003Parser() {
		if (womanProfession_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Profession() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Profession() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			womanProfession_5003Parser = parser;
		}
		return womanProfession_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser womanDateOfBirth_5004Parser;

	/**
	 * @generated
	 */
	private IParser getWomanDateOfBirth_5004Parser() {
		if (womanDateOfBirth_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfBirth() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfBirth() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			womanDateOfBirth_5004Parser = parser;
		}
		return womanDateOfBirth_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser womanDateOfDeath_5005Parser;

	/**
	 * @generated
	 */
	private IParser getWomanDateOfDeath_5005Parser() {
		if (womanDateOfDeath_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfDeath() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfDeath() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			womanDateOfDeath_5005Parser = parser;
		}
		return womanDateOfDeath_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser manName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getManName_5002Parser() {
		if (manName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Name() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			manName_5002Parser = parser;
		}
		return manName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser manProfession_5006Parser;

	/**
	 * @generated
	 */
	private IParser getManProfession_5006Parser() {
		if (manProfession_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Profession() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_Profession() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			manProfession_5006Parser = parser;
		}
		return manProfession_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser manDateOfBirth_5007Parser;

	/**
	 * @generated
	 */
	private IParser getManDateOfBirth_5007Parser() {
		if (manDateOfBirth_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfBirth() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfBirth() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			manDateOfBirth_5007Parser = parser;
		}
		return manDateOfBirth_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser manDateOfDeath_5008Parser;

	/**
	 * @generated
	 */
	private IParser getManDateOfDeath_5008Parser() {
		if (manDateOfDeath_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfDeath() };
			EAttribute[] editableFeatures = new EAttribute[] { GGram.GGramPackage.eINSTANCE
					.getEntity_DateOfDeath() };
			GGram.diagram.parsers.MessageFormatParser parser = new GGram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			manDateOfDeath_5008Parser = parser;
		}
		return manDateOfDeath_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GGram.diagram.edit.parts.WomanNameEditPart.VISUAL_ID:
			return getWomanName_5001Parser();
		case GGram.diagram.edit.parts.WomanProfessionEditPart.VISUAL_ID:
			return getWomanProfession_5003Parser();
		case GGram.diagram.edit.parts.WomanDateOfBirthEditPart.VISUAL_ID:
			return getWomanDateOfBirth_5004Parser();
		case GGram.diagram.edit.parts.WomanDateOfDeathEditPart.VISUAL_ID:
			return getWomanDateOfDeath_5005Parser();
		case GGram.diagram.edit.parts.ManNameEditPart.VISUAL_ID:
			return getManName_5002Parser();
		case GGram.diagram.edit.parts.ManProfessionEditPart.VISUAL_ID:
			return getManProfession_5006Parser();
		case GGram.diagram.edit.parts.ManDateOfBirthEditPart.VISUAL_ID:
			return getManDateOfBirth_5007Parser();
		case GGram.diagram.edit.parts.ManDateOfDeathEditPart.VISUAL_ID:
			return getManDateOfDeath_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GGram.diagram.part.GGramVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GGram.diagram.providers.GGramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

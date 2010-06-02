package GGram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GGramElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private GGramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Genogram_1000 = getElementType("GGram.diagram.Genogram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Woman_2001 = getElementType("GGram.diagram.Woman_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Man_2002 = getElementType("GGram.diagram.Man_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Engagement_4001 = getElementType("GGram.diagram.Engagement_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HasChild_4002 = getElementType("GGram.diagram.HasChild_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cohabitation_4003 = getElementType("GGram.diagram.Cohabitation_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CohabitationAndSeparation_4004 = getElementType("GGram.diagram.CohabitationAndSeparation_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Marriage_4005 = getElementType("GGram.diagram.Marriage_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LoveAffair_4006 = getElementType("GGram.diagram.LoveAffair_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Nullity_4007 = getElementType("GGram.diagram.Nullity_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Divorce_4008 = getElementType("GGram.diagram.Divorce_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_4009 = getElementType("GGram.diagram.Relationship_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HasAdoptedChild_4010 = getElementType("GGram.diagram.HasAdoptedChild_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GGram.diagram.part.GGramDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Genogram_1000, GGram.GGramPackage.eINSTANCE
					.getGenogram());

			elements.put(Woman_2001, GGram.GGramPackage.eINSTANCE.getWoman());

			elements.put(Man_2002, GGram.GGramPackage.eINSTANCE.getMan());

			elements.put(Engagement_4001, GGram.GGramPackage.eINSTANCE
					.getEngagement());

			elements.put(HasChild_4002, GGram.GGramPackage.eINSTANCE
					.getHasChild());

			elements.put(Cohabitation_4003, GGram.GGramPackage.eINSTANCE
					.getCohabitation());

			elements
					.put(CohabitationAndSeparation_4004,
							GGram.GGramPackage.eINSTANCE
									.getCohabitationAndSeparation());

			elements.put(Marriage_4005, GGram.GGramPackage.eINSTANCE
					.getMarriage());

			elements.put(LoveAffair_4006, GGram.GGramPackage.eINSTANCE
					.getLoveAffair());

			elements.put(Nullity_4007, GGram.GGramPackage.eINSTANCE
					.getNullity());

			elements.put(Divorce_4008, GGram.GGramPackage.eINSTANCE
					.getDivorce());

			elements.put(Relationship_4009, GGram.GGramPackage.eINSTANCE
					.getRelationship());

			elements.put(HasAdoptedChild_4010, GGram.GGramPackage.eINSTANCE
					.getHasAdoptedChild());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Genogram_1000);
			KNOWN_ELEMENT_TYPES.add(Woman_2001);
			KNOWN_ELEMENT_TYPES.add(Man_2002);
			KNOWN_ELEMENT_TYPES.add(Engagement_4001);
			KNOWN_ELEMENT_TYPES.add(HasChild_4002);
			KNOWN_ELEMENT_TYPES.add(Cohabitation_4003);
			KNOWN_ELEMENT_TYPES.add(CohabitationAndSeparation_4004);
			KNOWN_ELEMENT_TYPES.add(Marriage_4005);
			KNOWN_ELEMENT_TYPES.add(LoveAffair_4006);
			KNOWN_ELEMENT_TYPES.add(Nullity_4007);
			KNOWN_ELEMENT_TYPES.add(Divorce_4008);
			KNOWN_ELEMENT_TYPES.add(Relationship_4009);
			KNOWN_ELEMENT_TYPES.add(HasAdoptedChild_4010);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID:
			return Genogram_1000;
		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID:
			return Woman_2001;
		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID:
			return Man_2002;
		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID:
			return Engagement_4001;
		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID:
			return HasChild_4002;
		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID:
			return Cohabitation_4003;
		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID:
			return CohabitationAndSeparation_4004;
		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID:
			return Marriage_4005;
		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID:
			return LoveAffair_4006;
		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID:
			return Nullity_4007;
		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID:
			return Divorce_4008;
		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
			return Relationship_4009;
		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID:
			return HasAdoptedChild_4010;
		}
		return null;
	}

}

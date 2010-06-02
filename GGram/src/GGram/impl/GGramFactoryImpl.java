/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.impl;

import GGram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GGramFactoryImpl extends EFactoryImpl implements GGramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GGramFactory init() {
		try {
			GGramFactory theGGramFactory = (GGramFactory)EPackage.Registry.INSTANCE.getEFactory("http://ggram"); 
			if (theGGramFactory != null) {
				return theGGramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GGramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GGramPackage.MAN: return createMan();
			case GGramPackage.WOMAN: return createWoman();
			case GGramPackage.GENOGRAM: return createGenogram();
			case GGramPackage.MARRIAGE: return createMarriage();
			case GGramPackage.COHABITATION: return createCohabitation();
			case GGramPackage.ENGAGEMENT: return createEngagement();
			case GGramPackage.DIVORCE: return createDivorce();
			case GGramPackage.RELATIONSHIP: return createRelationship();
			case GGramPackage.NULLITY: return createNullity();
			case GGramPackage.LOVE_AFFAIR: return createLoveAffair();
			case GGramPackage.COHABITATION_AND_SEPARATION: return createCohabitationAndSeparation();
			case GGramPackage.HAS_ADOPTED_CHILD: return createHasAdoptedChild();
			case GGramPackage.HAS_CHILD: return createHasChild();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man createMan() {
		ManImpl man = new ManImpl();
		return man;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman createWoman() {
		WomanImpl woman = new WomanImpl();
		return woman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genogram createGenogram() {
		GenogramImpl genogram = new GenogramImpl();
		return genogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage createMarriage() {
		MarriageImpl marriage = new MarriageImpl();
		return marriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cohabitation createCohabitation() {
		CohabitationImpl cohabitation = new CohabitationImpl();
		return cohabitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engagement createEngagement() {
		EngagementImpl engagement = new EngagementImpl();
		return engagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divorce createDivorce() {
		DivorceImpl divorce = new DivorceImpl();
		return divorce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nullity createNullity() {
		NullityImpl nullity = new NullityImpl();
		return nullity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoveAffair createLoveAffair() {
		LoveAffairImpl loveAffair = new LoveAffairImpl();
		return loveAffair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CohabitationAndSeparation createCohabitationAndSeparation() {
		CohabitationAndSeparationImpl cohabitationAndSeparation = new CohabitationAndSeparationImpl();
		return cohabitationAndSeparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAdoptedChild createHasAdoptedChild() {
		HasAdoptedChildImpl hasAdoptedChild = new HasAdoptedChildImpl();
		return hasAdoptedChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasChild createHasChild() {
		HasChildImpl hasChild = new HasChildImpl();
		return hasChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGramPackage getGGramPackage() {
		return (GGramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GGramPackage getPackage() {
		return GGramPackage.eINSTANCE;
	}

} //GGramFactoryImpl

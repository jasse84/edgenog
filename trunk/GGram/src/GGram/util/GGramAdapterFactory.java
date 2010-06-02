/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.util;

import GGram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GGram.GGramPackage
 * @generated
 */
public class GGramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GGramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GGramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GGramSwitch<Adapter> modelSwitch =
		new GGramSwitch<Adapter>() {
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseMan(Man object) {
				return createManAdapter();
			}
			@Override
			public Adapter caseWoman(Woman object) {
				return createWomanAdapter();
			}
			@Override
			public Adapter caseGenogram(Genogram object) {
				return createGenogramAdapter();
			}
			@Override
			public Adapter caseFamiliRelation(FamiliRelation object) {
				return createFamiliRelationAdapter();
			}
			@Override
			public Adapter caseMarriage(Marriage object) {
				return createMarriageAdapter();
			}
			@Override
			public Adapter caseCohabitation(Cohabitation object) {
				return createCohabitationAdapter();
			}
			@Override
			public Adapter caseEngagement(Engagement object) {
				return createEngagementAdapter();
			}
			@Override
			public Adapter caseHasChildRelation(HasChildRelation object) {
				return createHasChildRelationAdapter();
			}
			@Override
			public Adapter caseDivorce(Divorce object) {
				return createDivorceAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseNullity(Nullity object) {
				return createNullityAdapter();
			}
			@Override
			public Adapter caseLoveAffair(LoveAffair object) {
				return createLoveAffairAdapter();
			}
			@Override
			public Adapter caseCohabitationAndSeparation(CohabitationAndSeparation object) {
				return createCohabitationAndSeparationAdapter();
			}
			@Override
			public Adapter caseHasAdoptedChild(HasAdoptedChild object) {
				return createHasAdoptedChildAdapter();
			}
			@Override
			public Adapter caseHasChild(HasChild object) {
				return createHasChildAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link GGram.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Man
	 * @generated
	 */
	public Adapter createManAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Woman <em>Woman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Woman
	 * @generated
	 */
	public Adapter createWomanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Genogram <em>Genogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Genogram
	 * @generated
	 */
	public Adapter createGenogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.FamiliRelation <em>Famili Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.FamiliRelation
	 * @generated
	 */
	public Adapter createFamiliRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Marriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Marriage
	 * @generated
	 */
	public Adapter createMarriageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Cohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Cohabitation
	 * @generated
	 */
	public Adapter createCohabitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Engagement <em>Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Engagement
	 * @generated
	 */
	public Adapter createEngagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.HasChildRelation <em>Has Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.HasChildRelation
	 * @generated
	 */
	public Adapter createHasChildRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Divorce <em>Divorce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Divorce
	 * @generated
	 */
	public Adapter createDivorceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.Nullity <em>Nullity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.Nullity
	 * @generated
	 */
	public Adapter createNullityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.LoveAffair <em>Love Affair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.LoveAffair
	 * @generated
	 */
	public Adapter createLoveAffairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.CohabitationAndSeparation <em>Cohabitation And Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.CohabitationAndSeparation
	 * @generated
	 */
	public Adapter createCohabitationAndSeparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.HasAdoptedChild <em>Has Adopted Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.HasAdoptedChild
	 * @generated
	 */
	public Adapter createHasAdoptedChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GGram.HasChild <em>Has Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GGram.HasChild
	 * @generated
	 */
	public Adapter createHasChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GGramAdapterFactory

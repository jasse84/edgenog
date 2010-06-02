/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.util;

import GGram.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GGram.GGramPackage
 * @generated
 */
public class GGramSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GGramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGramSwitch() {
		if (modelPackage == null) {
			modelPackage = GGramPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GGramPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.MAN: {
				Man man = (Man)theEObject;
				T result = caseMan(man);
				if (result == null) result = caseEntity(man);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.WOMAN: {
				Woman woman = (Woman)theEObject;
				T result = caseWoman(woman);
				if (result == null) result = caseEntity(woman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.GENOGRAM: {
				Genogram genogram = (Genogram)theEObject;
				T result = caseGenogram(genogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.FAMILI_RELATION: {
				FamiliRelation familiRelation = (FamiliRelation)theEObject;
				T result = caseFamiliRelation(familiRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.MARRIAGE: {
				Marriage marriage = (Marriage)theEObject;
				T result = caseMarriage(marriage);
				if (result == null) result = caseFamiliRelation(marriage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.COHABITATION: {
				Cohabitation cohabitation = (Cohabitation)theEObject;
				T result = caseCohabitation(cohabitation);
				if (result == null) result = caseFamiliRelation(cohabitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.ENGAGEMENT: {
				Engagement engagement = (Engagement)theEObject;
				T result = caseEngagement(engagement);
				if (result == null) result = caseFamiliRelation(engagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.HAS_CHILD_RELATION: {
				HasChildRelation hasChildRelation = (HasChildRelation)theEObject;
				T result = caseHasChildRelation(hasChildRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.DIVORCE: {
				Divorce divorce = (Divorce)theEObject;
				T result = caseDivorce(divorce);
				if (result == null) result = caseFamiliRelation(divorce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseFamiliRelation(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.NULLITY: {
				Nullity nullity = (Nullity)theEObject;
				T result = caseNullity(nullity);
				if (result == null) result = caseFamiliRelation(nullity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.LOVE_AFFAIR: {
				LoveAffair loveAffair = (LoveAffair)theEObject;
				T result = caseLoveAffair(loveAffair);
				if (result == null) result = caseFamiliRelation(loveAffair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.COHABITATION_AND_SEPARATION: {
				CohabitationAndSeparation cohabitationAndSeparation = (CohabitationAndSeparation)theEObject;
				T result = caseCohabitationAndSeparation(cohabitationAndSeparation);
				if (result == null) result = caseFamiliRelation(cohabitationAndSeparation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.HAS_ADOPTED_CHILD: {
				HasAdoptedChild hasAdoptedChild = (HasAdoptedChild)theEObject;
				T result = caseHasAdoptedChild(hasAdoptedChild);
				if (result == null) result = caseHasChildRelation(hasAdoptedChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GGramPackage.HAS_CHILD: {
				HasChild hasChild = (HasChild)theEObject;
				T result = caseHasChild(hasChild);
				if (result == null) result = caseHasChildRelation(hasChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Man</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Man</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMan(Man object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Woman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Woman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWoman(Woman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenogram(Genogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Famili Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Famili Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamiliRelation(FamiliRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marriage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarriage(Marriage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cohabitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCohabitation(Cohabitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engagement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engagement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngagement(Engagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Child Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Child Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasChildRelation(HasChildRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divorce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divorce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivorce(Divorce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nullity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nullity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullity(Nullity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Love Affair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Love Affair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoveAffair(LoveAffair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cohabitation And Separation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cohabitation And Separation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCohabitationAndSeparation(CohabitationAndSeparation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Adopted Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Adopted Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasAdoptedChild(HasAdoptedChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasChild(HasChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GGramSwitch

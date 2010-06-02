/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Famili Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GGram.FamiliRelation#getSource <em>Source</em>}</li>
 *   <li>{@link GGram.FamiliRelation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GGram.GGramPackage#getFamiliRelation()
 * @model abstract="true"
 * @generated
 */
public interface FamiliRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Woman)
	 * @see GGram.GGramPackage#getFamiliRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	Woman getSource();

	/**
	 * Sets the value of the '{@link GGram.FamiliRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Woman value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Man)
	 * @see GGram.GGramPackage#getFamiliRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Man getTarget();

	/**
	 * Sets the value of the '{@link GGram.FamiliRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Man value);

} // FamiliRelation

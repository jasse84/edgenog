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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GGram.Entity#getName <em>Name</em>}</li>
 *   <li>{@link GGram.Entity#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link GGram.Entity#getDateOfDeath <em>Date Of Death</em>}</li>
 *   <li>{@link GGram.Entity#getProfession <em>Profession</em>}</li>
 * </ul>
 * </p>
 *
 * @see GGram.GGramPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GGram.GGramPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GGram.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(String)
	 * @see GGram.GGramPackage#getEntity_DateOfBirth()
	 * @model
	 * @generated
	 */
	String getDateOfBirth();

	/**
	 * Sets the value of the '{@link GGram.Entity#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Death</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Death</em>' attribute.
	 * @see #setDateOfDeath(String)
	 * @see GGram.GGramPackage#getEntity_DateOfDeath()
	 * @model
	 * @generated
	 */
	String getDateOfDeath();

	/**
	 * Sets the value of the '{@link GGram.Entity#getDateOfDeath <em>Date Of Death</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Death</em>' attribute.
	 * @see #getDateOfDeath()
	 * @generated
	 */
	void setDateOfDeath(String value);

	/**
	 * Returns the value of the '<em><b>Profession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profession</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profession</em>' attribute.
	 * @see #setProfession(String)
	 * @see GGram.GGramPackage#getEntity_Profession()
	 * @model
	 * @generated
	 */
	String getProfession();

	/**
	 * Sets the value of the '{@link GGram.Entity#getProfession <em>Profession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profession</em>' attribute.
	 * @see #getProfession()
	 * @generated
	 */
	void setProfession(String value);

} // Entity

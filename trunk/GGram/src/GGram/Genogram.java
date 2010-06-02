/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GGram.Genogram#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link GGram.Genogram#getHasRelations <em>Has Relations</em>}</li>
 *   <li>{@link GGram.Genogram#getHasChildRelations <em>Has Child Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see GGram.GGramPackage#getGenogram()
 * @model
 * @generated
 */
public interface Genogram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Entities</b></em>' containment reference list.
	 * The list contents are of type {@link GGram.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entities</em>' containment reference list.
	 * @see GGram.GGramPackage#getGenogram_HasEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getHasEntities();

	/**
	 * Returns the value of the '<em><b>Has Relations</b></em>' containment reference list.
	 * The list contents are of type {@link GGram.FamiliRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relations</em>' containment reference list.
	 * @see GGram.GGramPackage#getGenogram_HasRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FamiliRelation> getHasRelations();

	/**
	 * Returns the value of the '<em><b>Has Child Relations</b></em>' containment reference list.
	 * The list contents are of type {@link GGram.HasChildRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Child Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Child Relations</em>' containment reference list.
	 * @see GGram.GGramPackage#getGenogram_HasChildRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<HasChildRelation> getHasChildRelations();

} // Genogram

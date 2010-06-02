/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GGram.GGramPackage
 * @generated
 */
public interface GGramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GGramFactory eINSTANCE = GGram.impl.GGramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Man</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Man</em>'.
	 * @generated
	 */
	Man createMan();

	/**
	 * Returns a new object of class '<em>Woman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Woman</em>'.
	 * @generated
	 */
	Woman createWoman();

	/**
	 * Returns a new object of class '<em>Genogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genogram</em>'.
	 * @generated
	 */
	Genogram createGenogram();

	/**
	 * Returns a new object of class '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marriage</em>'.
	 * @generated
	 */
	Marriage createMarriage();

	/**
	 * Returns a new object of class '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cohabitation</em>'.
	 * @generated
	 */
	Cohabitation createCohabitation();

	/**
	 * Returns a new object of class '<em>Engagement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engagement</em>'.
	 * @generated
	 */
	Engagement createEngagement();

	/**
	 * Returns a new object of class '<em>Divorce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divorce</em>'.
	 * @generated
	 */
	Divorce createDivorce();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Nullity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nullity</em>'.
	 * @generated
	 */
	Nullity createNullity();

	/**
	 * Returns a new object of class '<em>Love Affair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Love Affair</em>'.
	 * @generated
	 */
	LoveAffair createLoveAffair();

	/**
	 * Returns a new object of class '<em>Cohabitation And Separation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cohabitation And Separation</em>'.
	 * @generated
	 */
	CohabitationAndSeparation createCohabitationAndSeparation();

	/**
	 * Returns a new object of class '<em>Has Adopted Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Adopted Child</em>'.
	 * @generated
	 */
	HasAdoptedChild createHasAdoptedChild();

	/**
	 * Returns a new object of class '<em>Has Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Child</em>'.
	 * @generated
	 */
	HasChild createHasChild();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GGramPackage getGGramPackage();

} //GGramFactory

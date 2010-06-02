/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.CohabitationAndSeparation;
import GGram.GGramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cohabitation And Separation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CohabitationAndSeparationTest extends FamiliRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CohabitationAndSeparationTest.class);
	}

	/**
	 * Constructs a new Cohabitation And Separation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CohabitationAndSeparationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cohabitation And Separation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CohabitationAndSeparation getFixture() {
		return (CohabitationAndSeparation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createCohabitationAndSeparation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CohabitationAndSeparationTest

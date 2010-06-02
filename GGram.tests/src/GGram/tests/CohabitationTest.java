/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.Cohabitation;
import GGram.GGramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cohabitation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CohabitationTest extends FamiliRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CohabitationTest.class);
	}

	/**
	 * Constructs a new Cohabitation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CohabitationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cohabitation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cohabitation getFixture() {
		return (Cohabitation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createCohabitation());
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

} //CohabitationTest

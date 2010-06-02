/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.GGramFactory;
import GGram.LoveAffair;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Love Affair</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoveAffairTest extends FamiliRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoveAffairTest.class);
	}

	/**
	 * Constructs a new Love Affair test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoveAffairTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Love Affair test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoveAffair getFixture() {
		return (LoveAffair)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createLoveAffair());
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

} //LoveAffairTest

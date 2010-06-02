/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.GGramFactory;
import GGram.Nullity;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nullity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NullityTest extends FamiliRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NullityTest.class);
	}

	/**
	 * Constructs a new Nullity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nullity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Nullity getFixture() {
		return (Nullity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createNullity());
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

} //NullityTest

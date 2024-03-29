/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.GGramFactory;
import GGram.Genogram;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Genogram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenogramTest extends TestCase {

	/**
	 * The fixture for this Genogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Genogram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenogramTest.class);
	}

	/**
	 * Constructs a new Genogram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenogramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Genogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Genogram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Genogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Genogram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createGenogram());
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

} //GenogramTest

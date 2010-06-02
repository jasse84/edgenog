/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.tests;

import GGram.GGramFactory;
import GGram.HasAdoptedChild;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Has Adopted Child</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HasAdoptedChildTest extends HasChildRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HasAdoptedChildTest.class);
	}

	/**
	 * Constructs a new Has Adopted Child test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAdoptedChildTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Has Adopted Child test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HasAdoptedChild getFixture() {
		return (HasAdoptedChild)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GGramFactory.eINSTANCE.createHasAdoptedChild());
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

} //HasAdoptedChildTest

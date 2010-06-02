/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GGram.GGramFactory
 * @model kind="package"
 * @generated
 */
public interface GGramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GGram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ggram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ggram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GGramPackage eINSTANCE = GGram.impl.GGramPackageImpl.init();

	/**
	 * The meta object id for the '{@link GGram.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.EntityImpl
	 * @see GGram.impl.GGramPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATE_OF_BIRTH = 1;

	/**
	 * The feature id for the '<em><b>Date Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATE_OF_DEATH = 2;

	/**
	 * The feature id for the '<em><b>Profession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PROFESSION = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link GGram.impl.ManImpl <em>Man</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.ManImpl
	 * @see GGram.impl.GGramPackageImpl#getMan()
	 * @generated
	 */
	int MAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__DATE_OF_BIRTH = ENTITY__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Date Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__DATE_OF_DEATH = ENTITY__DATE_OF_DEATH;

	/**
	 * The feature id for the '<em><b>Profession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__PROFESSION = ENTITY__PROFESSION;

	/**
	 * The number of structural features of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.WomanImpl <em>Woman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.WomanImpl
	 * @see GGram.impl.GGramPackageImpl#getWoman()
	 * @generated
	 */
	int WOMAN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__DATE_OF_BIRTH = ENTITY__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Date Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__DATE_OF_DEATH = ENTITY__DATE_OF_DEATH;

	/**
	 * The feature id for the '<em><b>Profession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__PROFESSION = ENTITY__PROFESSION;

	/**
	 * The number of structural features of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.GenogramImpl <em>Genogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.GenogramImpl
	 * @see GGram.impl.GGramPackageImpl#getGenogram()
	 * @generated
	 */
	int GENOGRAM = 3;

	/**
	 * The feature id for the '<em><b>Has Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOGRAM__HAS_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOGRAM__HAS_RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Has Child Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOGRAM__HAS_CHILD_RELATIONS = 2;

	/**
	 * The number of structural features of the '<em>Genogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GGram.impl.FamiliRelationImpl <em>Famili Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.FamiliRelationImpl
	 * @see GGram.impl.GGramPackageImpl#getFamiliRelation()
	 * @generated
	 */
	int FAMILI_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILI_RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILI_RELATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Famili Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILI_RELATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GGram.impl.MarriageImpl <em>Marriage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.MarriageImpl
	 * @see GGram.impl.GGramPackageImpl#getMarriage()
	 * @generated
	 */
	int MARRIAGE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Marriage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.CohabitationImpl <em>Cohabitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.CohabitationImpl
	 * @see GGram.impl.GGramPackageImpl#getCohabitation()
	 * @generated
	 */
	int COHABITATION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Cohabitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.EngagementImpl <em>Engagement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.EngagementImpl
	 * @see GGram.impl.GGramPackageImpl#getEngagement()
	 * @generated
	 */
	int ENGAGEMENT = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Engagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.HasChildRelationImpl <em>Has Child Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.HasChildRelationImpl
	 * @see GGram.impl.GGramPackageImpl#getHasChildRelation()
	 * @generated
	 */
	int HAS_CHILD_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD_RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD_RELATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Has Child Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD_RELATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GGram.impl.DivorceImpl <em>Divorce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.DivorceImpl
	 * @see GGram.impl.GGramPackageImpl#getDivorce()
	 * @generated
	 */
	int DIVORCE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVORCE__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVORCE__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Divorce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVORCE_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.RelationshipImpl
	 * @see GGram.impl.GGramPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.NullityImpl <em>Nullity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.NullityImpl
	 * @see GGram.impl.GGramPackageImpl#getNullity()
	 * @generated
	 */
	int NULLITY = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLITY__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLITY__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Nullity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLITY_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.LoveAffairImpl <em>Love Affair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.LoveAffairImpl
	 * @see GGram.impl.GGramPackageImpl#getLoveAffair()
	 * @generated
	 */
	int LOVE_AFFAIR = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOVE_AFFAIR__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOVE_AFFAIR__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Love Affair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOVE_AFFAIR_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.CohabitationAndSeparationImpl <em>Cohabitation And Separation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.CohabitationAndSeparationImpl
	 * @see GGram.impl.GGramPackageImpl#getCohabitationAndSeparation()
	 * @generated
	 */
	int COHABITATION_AND_SEPARATION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_AND_SEPARATION__SOURCE = FAMILI_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_AND_SEPARATION__TARGET = FAMILI_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Cohabitation And Separation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_AND_SEPARATION_FEATURE_COUNT = FAMILI_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.HasAdoptedChildImpl <em>Has Adopted Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.HasAdoptedChildImpl
	 * @see GGram.impl.GGramPackageImpl#getHasAdoptedChild()
	 * @generated
	 */
	int HAS_ADOPTED_CHILD = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ADOPTED_CHILD__SOURCE = HAS_CHILD_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ADOPTED_CHILD__TARGET = HAS_CHILD_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Has Adopted Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ADOPTED_CHILD_FEATURE_COUNT = HAS_CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GGram.impl.HasChildImpl <em>Has Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GGram.impl.HasChildImpl
	 * @see GGram.impl.GGramPackageImpl#getHasChild()
	 * @generated
	 */
	int HAS_CHILD = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD__SOURCE = HAS_CHILD_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD__TARGET = HAS_CHILD_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Has Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHILD_FEATURE_COUNT = HAS_CHILD_RELATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link GGram.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see GGram.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link GGram.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GGram.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link GGram.Entity#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see GGram.Entity#getDateOfBirth()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link GGram.Entity#getDateOfDeath <em>Date Of Death</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Death</em>'.
	 * @see GGram.Entity#getDateOfDeath()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DateOfDeath();

	/**
	 * Returns the meta object for the attribute '{@link GGram.Entity#getProfession <em>Profession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profession</em>'.
	 * @see GGram.Entity#getProfession()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Profession();

	/**
	 * Returns the meta object for class '{@link GGram.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Man</em>'.
	 * @see GGram.Man
	 * @generated
	 */
	EClass getMan();

	/**
	 * Returns the meta object for class '{@link GGram.Woman <em>Woman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Woman</em>'.
	 * @see GGram.Woman
	 * @generated
	 */
	EClass getWoman();

	/**
	 * Returns the meta object for class '{@link GGram.Genogram <em>Genogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genogram</em>'.
	 * @see GGram.Genogram
	 * @generated
	 */
	EClass getGenogram();

	/**
	 * Returns the meta object for the containment reference list '{@link GGram.Genogram#getHasEntities <em>Has Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Entities</em>'.
	 * @see GGram.Genogram#getHasEntities()
	 * @see #getGenogram()
	 * @generated
	 */
	EReference getGenogram_HasEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link GGram.Genogram#getHasRelations <em>Has Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relations</em>'.
	 * @see GGram.Genogram#getHasRelations()
	 * @see #getGenogram()
	 * @generated
	 */
	EReference getGenogram_HasRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link GGram.Genogram#getHasChildRelations <em>Has Child Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Child Relations</em>'.
	 * @see GGram.Genogram#getHasChildRelations()
	 * @see #getGenogram()
	 * @generated
	 */
	EReference getGenogram_HasChildRelations();

	/**
	 * Returns the meta object for class '{@link GGram.FamiliRelation <em>Famili Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Famili Relation</em>'.
	 * @see GGram.FamiliRelation
	 * @generated
	 */
	EClass getFamiliRelation();

	/**
	 * Returns the meta object for the reference '{@link GGram.FamiliRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GGram.FamiliRelation#getSource()
	 * @see #getFamiliRelation()
	 * @generated
	 */
	EReference getFamiliRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link GGram.FamiliRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GGram.FamiliRelation#getTarget()
	 * @see #getFamiliRelation()
	 * @generated
	 */
	EReference getFamiliRelation_Target();

	/**
	 * Returns the meta object for class '{@link GGram.Marriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage</em>'.
	 * @see GGram.Marriage
	 * @generated
	 */
	EClass getMarriage();

	/**
	 * Returns the meta object for class '{@link GGram.Cohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cohabitation</em>'.
	 * @see GGram.Cohabitation
	 * @generated
	 */
	EClass getCohabitation();

	/**
	 * Returns the meta object for class '{@link GGram.Engagement <em>Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engagement</em>'.
	 * @see GGram.Engagement
	 * @generated
	 */
	EClass getEngagement();

	/**
	 * Returns the meta object for class '{@link GGram.HasChildRelation <em>Has Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Child Relation</em>'.
	 * @see GGram.HasChildRelation
	 * @generated
	 */
	EClass getHasChildRelation();

	/**
	 * Returns the meta object for the reference '{@link GGram.HasChildRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GGram.HasChildRelation#getSource()
	 * @see #getHasChildRelation()
	 * @generated
	 */
	EReference getHasChildRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link GGram.HasChildRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GGram.HasChildRelation#getTarget()
	 * @see #getHasChildRelation()
	 * @generated
	 */
	EReference getHasChildRelation_Target();

	/**
	 * Returns the meta object for class '{@link GGram.Divorce <em>Divorce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divorce</em>'.
	 * @see GGram.Divorce
	 * @generated
	 */
	EClass getDivorce();

	/**
	 * Returns the meta object for class '{@link GGram.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see GGram.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for class '{@link GGram.Nullity <em>Nullity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nullity</em>'.
	 * @see GGram.Nullity
	 * @generated
	 */
	EClass getNullity();

	/**
	 * Returns the meta object for class '{@link GGram.LoveAffair <em>Love Affair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Love Affair</em>'.
	 * @see GGram.LoveAffair
	 * @generated
	 */
	EClass getLoveAffair();

	/**
	 * Returns the meta object for class '{@link GGram.CohabitationAndSeparation <em>Cohabitation And Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cohabitation And Separation</em>'.
	 * @see GGram.CohabitationAndSeparation
	 * @generated
	 */
	EClass getCohabitationAndSeparation();

	/**
	 * Returns the meta object for class '{@link GGram.HasAdoptedChild <em>Has Adopted Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Adopted Child</em>'.
	 * @see GGram.HasAdoptedChild
	 * @generated
	 */
	EClass getHasAdoptedChild();

	/**
	 * Returns the meta object for class '{@link GGram.HasChild <em>Has Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Child</em>'.
	 * @see GGram.HasChild
	 * @generated
	 */
	EClass getHasChild();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GGramFactory getGGramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GGram.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.EntityImpl
		 * @see GGram.impl.GGramPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DATE_OF_BIRTH = eINSTANCE.getEntity_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Date Of Death</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DATE_OF_DEATH = eINSTANCE.getEntity_DateOfDeath();

		/**
		 * The meta object literal for the '<em><b>Profession</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PROFESSION = eINSTANCE.getEntity_Profession();

		/**
		 * The meta object literal for the '{@link GGram.impl.ManImpl <em>Man</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.ManImpl
		 * @see GGram.impl.GGramPackageImpl#getMan()
		 * @generated
		 */
		EClass MAN = eINSTANCE.getMan();

		/**
		 * The meta object literal for the '{@link GGram.impl.WomanImpl <em>Woman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.WomanImpl
		 * @see GGram.impl.GGramPackageImpl#getWoman()
		 * @generated
		 */
		EClass WOMAN = eINSTANCE.getWoman();

		/**
		 * The meta object literal for the '{@link GGram.impl.GenogramImpl <em>Genogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.GenogramImpl
		 * @see GGram.impl.GGramPackageImpl#getGenogram()
		 * @generated
		 */
		EClass GENOGRAM = eINSTANCE.getGenogram();

		/**
		 * The meta object literal for the '<em><b>Has Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENOGRAM__HAS_ENTITIES = eINSTANCE.getGenogram_HasEntities();

		/**
		 * The meta object literal for the '<em><b>Has Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENOGRAM__HAS_RELATIONS = eINSTANCE.getGenogram_HasRelations();

		/**
		 * The meta object literal for the '<em><b>Has Child Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENOGRAM__HAS_CHILD_RELATIONS = eINSTANCE.getGenogram_HasChildRelations();

		/**
		 * The meta object literal for the '{@link GGram.impl.FamiliRelationImpl <em>Famili Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.FamiliRelationImpl
		 * @see GGram.impl.GGramPackageImpl#getFamiliRelation()
		 * @generated
		 */
		EClass FAMILI_RELATION = eINSTANCE.getFamiliRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILI_RELATION__SOURCE = eINSTANCE.getFamiliRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILI_RELATION__TARGET = eINSTANCE.getFamiliRelation_Target();

		/**
		 * The meta object literal for the '{@link GGram.impl.MarriageImpl <em>Marriage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.MarriageImpl
		 * @see GGram.impl.GGramPackageImpl#getMarriage()
		 * @generated
		 */
		EClass MARRIAGE = eINSTANCE.getMarriage();

		/**
		 * The meta object literal for the '{@link GGram.impl.CohabitationImpl <em>Cohabitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.CohabitationImpl
		 * @see GGram.impl.GGramPackageImpl#getCohabitation()
		 * @generated
		 */
		EClass COHABITATION = eINSTANCE.getCohabitation();

		/**
		 * The meta object literal for the '{@link GGram.impl.EngagementImpl <em>Engagement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.EngagementImpl
		 * @see GGram.impl.GGramPackageImpl#getEngagement()
		 * @generated
		 */
		EClass ENGAGEMENT = eINSTANCE.getEngagement();

		/**
		 * The meta object literal for the '{@link GGram.impl.HasChildRelationImpl <em>Has Child Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.HasChildRelationImpl
		 * @see GGram.impl.GGramPackageImpl#getHasChildRelation()
		 * @generated
		 */
		EClass HAS_CHILD_RELATION = eINSTANCE.getHasChildRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_CHILD_RELATION__SOURCE = eINSTANCE.getHasChildRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_CHILD_RELATION__TARGET = eINSTANCE.getHasChildRelation_Target();

		/**
		 * The meta object literal for the '{@link GGram.impl.DivorceImpl <em>Divorce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.DivorceImpl
		 * @see GGram.impl.GGramPackageImpl#getDivorce()
		 * @generated
		 */
		EClass DIVORCE = eINSTANCE.getDivorce();

		/**
		 * The meta object literal for the '{@link GGram.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.RelationshipImpl
		 * @see GGram.impl.GGramPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '{@link GGram.impl.NullityImpl <em>Nullity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.NullityImpl
		 * @see GGram.impl.GGramPackageImpl#getNullity()
		 * @generated
		 */
		EClass NULLITY = eINSTANCE.getNullity();

		/**
		 * The meta object literal for the '{@link GGram.impl.LoveAffairImpl <em>Love Affair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.LoveAffairImpl
		 * @see GGram.impl.GGramPackageImpl#getLoveAffair()
		 * @generated
		 */
		EClass LOVE_AFFAIR = eINSTANCE.getLoveAffair();

		/**
		 * The meta object literal for the '{@link GGram.impl.CohabitationAndSeparationImpl <em>Cohabitation And Separation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.CohabitationAndSeparationImpl
		 * @see GGram.impl.GGramPackageImpl#getCohabitationAndSeparation()
		 * @generated
		 */
		EClass COHABITATION_AND_SEPARATION = eINSTANCE.getCohabitationAndSeparation();

		/**
		 * The meta object literal for the '{@link GGram.impl.HasAdoptedChildImpl <em>Has Adopted Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.HasAdoptedChildImpl
		 * @see GGram.impl.GGramPackageImpl#getHasAdoptedChild()
		 * @generated
		 */
		EClass HAS_ADOPTED_CHILD = eINSTANCE.getHasAdoptedChild();

		/**
		 * The meta object literal for the '{@link GGram.impl.HasChildImpl <em>Has Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GGram.impl.HasChildImpl
		 * @see GGram.impl.GGramPackageImpl#getHasChild()
		 * @generated
		 */
		EClass HAS_CHILD = eINSTANCE.getHasChild();

	}

} //GGramPackage

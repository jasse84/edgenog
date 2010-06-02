/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.impl;

import GGram.Entity;
import GGram.GGramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GGram.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link GGram.impl.EntityImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link GGram.impl.EntityImpl#getDateOfDeath <em>Date Of Death</em>}</li>
 *   <li>{@link GGram.impl.EntityImpl#getProfession <em>Profession</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected String dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfDeath() <em>Date Of Death</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfDeath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_DEATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfDeath() <em>Date Of Death</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfDeath()
	 * @generated
	 * @ordered
	 */
	protected String dateOfDeath = DATE_OF_DEATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfession() <em>Profession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfession()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfession() <em>Profession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfession()
	 * @generated
	 * @ordered
	 */
	protected String profession = PROFESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GGramPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GGramPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(String newDateOfBirth) {
		String oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GGramPackage.ENTITY__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfDeath() {
		return dateOfDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfDeath(String newDateOfDeath) {
		String oldDateOfDeath = dateOfDeath;
		dateOfDeath = newDateOfDeath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GGramPackage.ENTITY__DATE_OF_DEATH, oldDateOfDeath, dateOfDeath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfession(String newProfession) {
		String oldProfession = profession;
		profession = newProfession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GGramPackage.ENTITY__PROFESSION, oldProfession, profession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GGramPackage.ENTITY__NAME:
				return getName();
			case GGramPackage.ENTITY__DATE_OF_BIRTH:
				return getDateOfBirth();
			case GGramPackage.ENTITY__DATE_OF_DEATH:
				return getDateOfDeath();
			case GGramPackage.ENTITY__PROFESSION:
				return getProfession();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GGramPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case GGramPackage.ENTITY__DATE_OF_BIRTH:
				setDateOfBirth((String)newValue);
				return;
			case GGramPackage.ENTITY__DATE_OF_DEATH:
				setDateOfDeath((String)newValue);
				return;
			case GGramPackage.ENTITY__PROFESSION:
				setProfession((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GGramPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GGramPackage.ENTITY__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case GGramPackage.ENTITY__DATE_OF_DEATH:
				setDateOfDeath(DATE_OF_DEATH_EDEFAULT);
				return;
			case GGramPackage.ENTITY__PROFESSION:
				setProfession(PROFESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GGramPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GGramPackage.ENTITY__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case GGramPackage.ENTITY__DATE_OF_DEATH:
				return DATE_OF_DEATH_EDEFAULT == null ? dateOfDeath != null : !DATE_OF_DEATH_EDEFAULT.equals(dateOfDeath);
			case GGramPackage.ENTITY__PROFESSION:
				return PROFESSION_EDEFAULT == null ? profession != null : !PROFESSION_EDEFAULT.equals(profession);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", DateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", DateOfDeath: ");
		result.append(dateOfDeath);
		result.append(", Profession: ");
		result.append(profession);
		result.append(')');
		return result.toString();
	}

} //EntityImpl

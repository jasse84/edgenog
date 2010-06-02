/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.impl;

import GGram.Entity;
import GGram.FamiliRelation;
import GGram.GGramPackage;
import GGram.Genogram;
import GGram.HasChildRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GGram.impl.GenogramImpl#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link GGram.impl.GenogramImpl#getHasRelations <em>Has Relations</em>}</li>
 *   <li>{@link GGram.impl.GenogramImpl#getHasChildRelations <em>Has Child Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenogramImpl extends EObjectImpl implements Genogram {
	/**
	 * The cached value of the '{@link #getHasEntities() <em>Has Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> hasEntities;

	/**
	 * The cached value of the '{@link #getHasRelations() <em>Has Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<FamiliRelation> hasRelations;

	/**
	 * The cached value of the '{@link #getHasChildRelations() <em>Has Child Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChildRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<HasChildRelation> hasChildRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GGramPackage.Literals.GENOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getHasEntities() {
		if (hasEntities == null) {
			hasEntities = new EObjectContainmentEList<Entity>(Entity.class, this, GGramPackage.GENOGRAM__HAS_ENTITIES);
		}
		return hasEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamiliRelation> getHasRelations() {
		if (hasRelations == null) {
			hasRelations = new EObjectContainmentEList<FamiliRelation>(FamiliRelation.class, this, GGramPackage.GENOGRAM__HAS_RELATIONS);
		}
		return hasRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HasChildRelation> getHasChildRelations() {
		if (hasChildRelations == null) {
			hasChildRelations = new EObjectContainmentEList<HasChildRelation>(HasChildRelation.class, this, GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS);
		}
		return hasChildRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
				return ((InternalEList<?>)getHasEntities()).basicRemove(otherEnd, msgs);
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
				return ((InternalEList<?>)getHasRelations()).basicRemove(otherEnd, msgs);
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				return ((InternalEList<?>)getHasChildRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
				return getHasEntities();
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
				return getHasRelations();
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				return getHasChildRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
				getHasEntities().clear();
				getHasEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
				getHasRelations().clear();
				getHasRelations().addAll((Collection<? extends FamiliRelation>)newValue);
				return;
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				getHasChildRelations().clear();
				getHasChildRelations().addAll((Collection<? extends HasChildRelation>)newValue);
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
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
				getHasEntities().clear();
				return;
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
				getHasRelations().clear();
				return;
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				getHasChildRelations().clear();
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
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
				return hasEntities != null && !hasEntities.isEmpty();
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
				return hasRelations != null && !hasRelations.isEmpty();
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				return hasChildRelations != null && !hasChildRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenogramImpl

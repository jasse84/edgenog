/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GGram.provider;


import GGram.GGramFactory;
import GGram.GGramPackage;
import GGram.Genogram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GGram.Genogram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenogramItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenogramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GGramPackage.Literals.GENOGRAM__HAS_ENTITIES);
			childrenFeatures.add(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS);
			childrenFeatures.add(GGramPackage.Literals.GENOGRAM__HAS_CHILD_RELATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Genogram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Genogram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Genogram_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Genogram.class)) {
			case GGramPackage.GENOGRAM__HAS_ENTITIES:
			case GGramPackage.GENOGRAM__HAS_RELATIONS:
			case GGramPackage.GENOGRAM__HAS_CHILD_RELATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_ENTITIES,
				 GGramFactory.eINSTANCE.createMan()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_ENTITIES,
				 GGramFactory.eINSTANCE.createWoman()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createMarriage()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createCohabitation()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createEngagement()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createDivorce()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createNullity()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createLoveAffair()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_RELATIONS,
				 GGramFactory.eINSTANCE.createCohabitationAndSeparation()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_CHILD_RELATIONS,
				 GGramFactory.eINSTANCE.createHasAdoptedChild()));

		newChildDescriptors.add
			(createChildParameter
				(GGramPackage.Literals.GENOGRAM__HAS_CHILD_RELATIONS,
				 GGramFactory.eINSTANCE.createHasChild()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GGramEditPlugin.INSTANCE;
	}

}

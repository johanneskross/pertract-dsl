/**
 * Copyright (C) 2018 fortiss GmbH
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *  
 * Contributors:
 *      kross - initial implementation
 */
package org.fortiss.pmwt.pertract.dsl.model.application.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceProfileImpl#getResourceDemands <em>Resource Demands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceProfileImpl extends MinimalEObjectImpl.Container implements ResourceProfile {
	/**
	 * The cached value of the '{@link #getResourceDemands() <em>Resource Demands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDemand> resourceDemands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.RESOURCE_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDemand> getResourceDemands() {
		if (resourceDemands == null) {
			resourceDemands = new EObjectContainmentEList<ResourceDemand>(ResourceDemand.class, this, ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS);
		}
		return resourceDemands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS:
				return ((InternalEList<?>)getResourceDemands()).basicRemove(otherEnd, msgs);
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
			case ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS:
				return getResourceDemands();
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
			case ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS:
				getResourceDemands().clear();
				getResourceDemands().addAll((Collection<? extends ResourceDemand>)newValue);
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
			case ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS:
				getResourceDemands().clear();
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
			case ApplicationDSLPackage.RESOURCE_PROFILE__RESOURCE_DEMANDS:
				return resourceDemands != null && !resourceDemands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceProfileImpl

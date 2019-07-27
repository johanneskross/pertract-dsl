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
package org.fortiss.pmwt.pertract.dsl.model.resources.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterSpecificationImpl extends MinimalEObjectImpl.Container implements ClusterSpecification {
	/**
	 * The default value of the '{@link #getResourceRole() <em>Resource Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceRole() <em>Resource Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRole()
	 * @generated
	 * @ordered
	 */
	protected String resourceRole = RESOURCE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULING_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected String schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceDSLPackage.Literals.CLUSTER_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceRole() {
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRole(String newResourceRole) {
		String oldResourceRole = resourceRole;
		resourceRole = newResourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.CLUSTER_SPECIFICATION__RESOURCE_ROLE, oldResourceRole, resourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(String newSchedulingPolicy) {
		String oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.CLUSTER_SPECIFICATION__SCHEDULING_POLICY, oldSchedulingPolicy, schedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__RESOURCE_ROLE:
				return getResourceRole();
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__SCHEDULING_POLICY:
				return getSchedulingPolicy();
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
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__RESOURCE_ROLE:
				setResourceRole((String)newValue);
				return;
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__SCHEDULING_POLICY:
				setSchedulingPolicy((String)newValue);
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
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__RESOURCE_ROLE:
				setResourceRole(RESOURCE_ROLE_EDEFAULT);
				return;
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__SCHEDULING_POLICY:
				setSchedulingPolicy(SCHEDULING_POLICY_EDEFAULT);
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
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__RESOURCE_ROLE:
				return RESOURCE_ROLE_EDEFAULT == null ? resourceRole != null : !RESOURCE_ROLE_EDEFAULT.equals(resourceRole);
			case ResourceDSLPackage.CLUSTER_SPECIFICATION__SCHEDULING_POLICY:
				return SCHEDULING_POLICY_EDEFAULT == null ? schedulingPolicy != null : !SCHEDULING_POLICY_EDEFAULT.equals(schedulingPolicy);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ResourceRole: ");
		result.append(resourceRole);
		result.append(", SchedulingPolicy: ");
		result.append(schedulingPolicy);
		result.append(')');
		return result.toString();
	}

} //ClusterSpecificationImpl

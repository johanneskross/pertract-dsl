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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification;
import org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl#getProcessingResourceUnit <em>Processing Resource Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl#getDriveProcessingUnit <em>Drive Processing Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl#getMemoryProcessingUnit <em>Memory Processing Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl#getClusterSpecification <em>Cluster Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceNodeImpl extends MinimalEObjectImpl.Container implements ResourceNode {
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
	 * The cached value of the '{@link #getProcessingResourceUnit() <em>Processing Resource Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceUnit()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceUnit processingResourceUnit;

	/**
	 * The cached value of the '{@link #getDriveProcessingUnit() <em>Drive Processing Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveProcessingUnit()
	 * @generated
	 * @ordered
	 */
	protected DriveProcessingUnit driveProcessingUnit;

	/**
	 * The cached value of the '{@link #getMemoryProcessingUnit() <em>Memory Processing Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryProcessingUnit()
	 * @generated
	 * @ordered
	 */
	protected MemoryProcessingUnit memoryProcessingUnit;

	/**
	 * The cached value of the '{@link #getClusterSpecification() <em>Cluster Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterSpecification()
	 * @generated
	 * @ordered
	 */
	protected ClusterSpecification clusterSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceDSLPackage.Literals.RESOURCE_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceUnit getProcessingResourceUnit() {
		return processingResourceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingResourceUnit(ProcessingResourceUnit newProcessingResourceUnit, NotificationChain msgs) {
		ProcessingResourceUnit oldProcessingResourceUnit = processingResourceUnit;
		processingResourceUnit = newProcessingResourceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT, oldProcessingResourceUnit, newProcessingResourceUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingResourceUnit(ProcessingResourceUnit newProcessingResourceUnit) {
		if (newProcessingResourceUnit != processingResourceUnit) {
			NotificationChain msgs = null;
			if (processingResourceUnit != null)
				msgs = ((InternalEObject)processingResourceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT, null, msgs);
			if (newProcessingResourceUnit != null)
				msgs = ((InternalEObject)newProcessingResourceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT, null, msgs);
			msgs = basicSetProcessingResourceUnit(newProcessingResourceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT, newProcessingResourceUnit, newProcessingResourceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveProcessingUnit getDriveProcessingUnit() {
		return driveProcessingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveProcessingUnit(DriveProcessingUnit newDriveProcessingUnit, NotificationChain msgs) {
		DriveProcessingUnit oldDriveProcessingUnit = driveProcessingUnit;
		driveProcessingUnit = newDriveProcessingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT, oldDriveProcessingUnit, newDriveProcessingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveProcessingUnit(DriveProcessingUnit newDriveProcessingUnit) {
		if (newDriveProcessingUnit != driveProcessingUnit) {
			NotificationChain msgs = null;
			if (driveProcessingUnit != null)
				msgs = ((InternalEObject)driveProcessingUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT, null, msgs);
			if (newDriveProcessingUnit != null)
				msgs = ((InternalEObject)newDriveProcessingUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT, null, msgs);
			msgs = basicSetDriveProcessingUnit(newDriveProcessingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT, newDriveProcessingUnit, newDriveProcessingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryProcessingUnit getMemoryProcessingUnit() {
		return memoryProcessingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryProcessingUnit(MemoryProcessingUnit newMemoryProcessingUnit, NotificationChain msgs) {
		MemoryProcessingUnit oldMemoryProcessingUnit = memoryProcessingUnit;
		memoryProcessingUnit = newMemoryProcessingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT, oldMemoryProcessingUnit, newMemoryProcessingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryProcessingUnit(MemoryProcessingUnit newMemoryProcessingUnit) {
		if (newMemoryProcessingUnit != memoryProcessingUnit) {
			NotificationChain msgs = null;
			if (memoryProcessingUnit != null)
				msgs = ((InternalEObject)memoryProcessingUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT, null, msgs);
			if (newMemoryProcessingUnit != null)
				msgs = ((InternalEObject)newMemoryProcessingUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT, null, msgs);
			msgs = basicSetMemoryProcessingUnit(newMemoryProcessingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT, newMemoryProcessingUnit, newMemoryProcessingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterSpecification getClusterSpecification() {
		return clusterSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClusterSpecification(ClusterSpecification newClusterSpecification, NotificationChain msgs) {
		ClusterSpecification oldClusterSpecification = clusterSpecification;
		clusterSpecification = newClusterSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION, oldClusterSpecification, newClusterSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterSpecification(ClusterSpecification newClusterSpecification) {
		if (newClusterSpecification != clusterSpecification) {
			NotificationChain msgs = null;
			if (clusterSpecification != null)
				msgs = ((InternalEObject)clusterSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION, null, msgs);
			if (newClusterSpecification != null)
				msgs = ((InternalEObject)newClusterSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION, null, msgs);
			msgs = basicSetClusterSpecification(newClusterSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION, newClusterSpecification, newClusterSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT:
				return basicSetProcessingResourceUnit(null, msgs);
			case ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT:
				return basicSetDriveProcessingUnit(null, msgs);
			case ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT:
				return basicSetMemoryProcessingUnit(null, msgs);
			case ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION:
				return basicSetClusterSpecification(null, msgs);
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
			case ResourceDSLPackage.RESOURCE_NODE__NAME:
				return getName();
			case ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT:
				return getProcessingResourceUnit();
			case ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT:
				return getDriveProcessingUnit();
			case ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT:
				return getMemoryProcessingUnit();
			case ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION:
				return getClusterSpecification();
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
			case ResourceDSLPackage.RESOURCE_NODE__NAME:
				setName((String)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT:
				setProcessingResourceUnit((ProcessingResourceUnit)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT:
				setDriveProcessingUnit((DriveProcessingUnit)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT:
				setMemoryProcessingUnit((MemoryProcessingUnit)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION:
				setClusterSpecification((ClusterSpecification)newValue);
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
			case ResourceDSLPackage.RESOURCE_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT:
				setProcessingResourceUnit((ProcessingResourceUnit)null);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT:
				setDriveProcessingUnit((DriveProcessingUnit)null);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT:
				setMemoryProcessingUnit((MemoryProcessingUnit)null);
				return;
			case ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION:
				setClusterSpecification((ClusterSpecification)null);
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
			case ResourceDSLPackage.RESOURCE_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourceDSLPackage.RESOURCE_NODE__PROCESSING_RESOURCE_UNIT:
				return processingResourceUnit != null;
			case ResourceDSLPackage.RESOURCE_NODE__DRIVE_PROCESSING_UNIT:
				return driveProcessingUnit != null;
			case ResourceDSLPackage.RESOURCE_NODE__MEMORY_PROCESSING_UNIT:
				return memoryProcessingUnit != null;
			case ResourceDSLPackage.RESOURCE_NODE__CLUSTER_SPECIFICATION:
				return clusterSpecification != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceNodeImpl

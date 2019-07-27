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
package org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.SingleDataSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.SingleDataSourceImpl#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleDataSourceImpl extends MinimalEObjectImpl.Container implements SingleDataSource {
	/**
	 * The default value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected int partitions = PARTITIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWorkloadDSLPackage.Literals.SINGLE_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPartitions() {
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitions(int newPartitions) {
		int oldPartitions = partitions;
		partitions = newPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.SINGLE_DATA_SOURCE__PARTITIONS, oldPartitions, partitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWorkloadDSLPackage.SINGLE_DATA_SOURCE__PARTITIONS:
				return getPartitions();
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
			case DataWorkloadDSLPackage.SINGLE_DATA_SOURCE__PARTITIONS:
				setPartitions((Integer)newValue);
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
			case DataWorkloadDSLPackage.SINGLE_DATA_SOURCE__PARTITIONS:
				setPartitions(PARTITIONS_EDEFAULT);
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
			case DataWorkloadDSLPackage.SINGLE_DATA_SOURCE__PARTITIONS:
				return partitions != PARTITIONS_EDEFAULT;
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
		result.append(" (partitions: ");
		result.append(partitions);
		result.append(')');
		return result.toString();
	}

} //SingleDataSourceImpl

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
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl#getArrivalRate <em>Arrival Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenDataSourceImpl extends MinimalEObjectImpl.Container implements OpenDataSource {
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
	 * The default value of the '{@link #getArrivalRate() <em>Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected static final double ARRIVAL_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArrivalRate() <em>Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected double arrivalRate = ARRIVAL_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWorkloadDSLPackage.Literals.OPEN_DATA_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.OPEN_DATA_SOURCE__PARTITIONS, oldPartitions, partitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArrivalRate() {
		return arrivalRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalRate(double newArrivalRate) {
		double oldArrivalRate = arrivalRate;
		arrivalRate = newArrivalRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.OPEN_DATA_SOURCE__ARRIVAL_RATE, oldArrivalRate, arrivalRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__PARTITIONS:
				return getPartitions();
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__ARRIVAL_RATE:
				return getArrivalRate();
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
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__PARTITIONS:
				setPartitions((Integer)newValue);
				return;
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__ARRIVAL_RATE:
				setArrivalRate((Double)newValue);
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
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__PARTITIONS:
				setPartitions(PARTITIONS_EDEFAULT);
				return;
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__ARRIVAL_RATE:
				setArrivalRate(ARRIVAL_RATE_EDEFAULT);
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
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__PARTITIONS:
				return partitions != PARTITIONS_EDEFAULT;
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE__ARRIVAL_RATE:
				return arrivalRate != ARRIVAL_RATE_EDEFAULT;
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
		result.append(", arrivalRate: ");
		result.append(arrivalRate);
		result.append(')');
		return result.toString();
	}

} //OpenDataSourceImpl

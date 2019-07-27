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

import org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl#getReplications <em>Replications</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl#getReadRate <em>Read Rate</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl#getWriteRate <em>Write Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveProcessingUnitImpl extends MinimalEObjectImpl.Container implements DriveProcessingUnit {
	/**
	 * The default value of the '{@link #getReplications() <em>Replications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplications()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplications() <em>Replications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplications()
	 * @generated
	 * @ordered
	 */
	protected int replications = REPLICATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadRate() <em>Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadRate()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReadRate() <em>Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadRate()
	 * @generated
	 * @ordered
	 */
	protected int readRate = READ_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteRate() <em>Write Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteRate()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITE_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriteRate() <em>Write Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteRate()
	 * @generated
	 * @ordered
	 */
	protected int writeRate = WRITE_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveProcessingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceDSLPackage.Literals.DRIVE_PROCESSING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplications() {
		return replications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplications(int newReplications) {
		int oldReplications = replications;
		replications = newReplications;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.DRIVE_PROCESSING_UNIT__REPLICATIONS, oldReplications, replications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReadRate() {
		return readRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRate(int newReadRate) {
		int oldReadRate = readRate;
		readRate = newReadRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.DRIVE_PROCESSING_UNIT__READ_RATE, oldReadRate, readRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriteRate() {
		return writeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteRate(int newWriteRate) {
		int oldWriteRate = writeRate;
		writeRate = newWriteRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.DRIVE_PROCESSING_UNIT__WRITE_RATE, oldWriteRate, writeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__REPLICATIONS:
				return getReplications();
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__READ_RATE:
				return getReadRate();
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__WRITE_RATE:
				return getWriteRate();
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
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__REPLICATIONS:
				setReplications((Integer)newValue);
				return;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__READ_RATE:
				setReadRate((Integer)newValue);
				return;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__WRITE_RATE:
				setWriteRate((Integer)newValue);
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
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__REPLICATIONS:
				setReplications(REPLICATIONS_EDEFAULT);
				return;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__READ_RATE:
				setReadRate(READ_RATE_EDEFAULT);
				return;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__WRITE_RATE:
				setWriteRate(WRITE_RATE_EDEFAULT);
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
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__REPLICATIONS:
				return replications != REPLICATIONS_EDEFAULT;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__READ_RATE:
				return readRate != READ_RATE_EDEFAULT;
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT__WRITE_RATE:
				return writeRate != WRITE_RATE_EDEFAULT;
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
		result.append(" (replications: ");
		result.append(replications);
		result.append(", readRate: ");
		result.append(readRate);
		result.append(", writeRate: ");
		result.append(writeRate);
		result.append(')');
		return result.toString();
	}

} //DriveProcessingUnitImpl

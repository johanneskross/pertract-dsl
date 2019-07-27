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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Batch Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.MiniBatchConfigurationImpl#getMiniBatchInterval <em>Mini Batch Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniBatchConfigurationImpl extends ApplicationConfigurationImpl implements MiniBatchConfiguration {
	/**
	 * The default value of the '{@link #getMiniBatchInterval() <em>Mini Batch Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiniBatchInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MINI_BATCH_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMiniBatchInterval() <em>Mini Batch Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiniBatchInterval()
	 * @generated
	 * @ordered
	 */
	protected int miniBatchInterval = MINI_BATCH_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniBatchConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.MINI_BATCH_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMiniBatchInterval() {
		return miniBatchInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiniBatchInterval(int newMiniBatchInterval) {
		int oldMiniBatchInterval = miniBatchInterval;
		miniBatchInterval = newMiniBatchInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL, oldMiniBatchInterval, miniBatchInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationDSLPackage.MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL:
				return getMiniBatchInterval();
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
			case ApplicationDSLPackage.MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL:
				setMiniBatchInterval((Integer)newValue);
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
			case ApplicationDSLPackage.MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL:
				setMiniBatchInterval(MINI_BATCH_INTERVAL_EDEFAULT);
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
			case ApplicationDSLPackage.MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL:
				return miniBatchInterval != MINI_BATCH_INTERVAL_EDEFAULT;
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
		result.append(" (miniBatchInterval: ");
		result.append(miniBatchInterval);
		result.append(')');
		return result.toString();
	}

} //MiniBatchConfigurationImpl

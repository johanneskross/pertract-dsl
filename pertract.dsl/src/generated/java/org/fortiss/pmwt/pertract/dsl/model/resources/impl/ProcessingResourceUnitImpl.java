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

import org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl#getReplications <em>Replications</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl#getProcessingRate <em>Processing Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingResourceUnitImpl extends MinimalEObjectImpl.Container implements ProcessingResourceUnit {
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
	 * The default value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected int processingRate = PROCESSING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceDSLPackage.Literals.PROCESSING_RESOURCE_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__REPLICATIONS, oldReplications, replications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessingRate() {
		return processingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingRate(int newProcessingRate) {
		int oldProcessingRate = processingRate;
		processingRate = newProcessingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__PROCESSING_RATE, oldProcessingRate, processingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__REPLICATIONS:
				return getReplications();
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__PROCESSING_RATE:
				return getProcessingRate();
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
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__REPLICATIONS:
				setReplications((Integer)newValue);
				return;
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__PROCESSING_RATE:
				setProcessingRate((Integer)newValue);
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
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__REPLICATIONS:
				setReplications(REPLICATIONS_EDEFAULT);
				return;
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__PROCESSING_RATE:
				setProcessingRate(PROCESSING_RATE_EDEFAULT);
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
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__REPLICATIONS:
				return replications != REPLICATIONS_EDEFAULT;
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT__PROCESSING_RATE:
				return processingRate != PROCESSING_RATE_EDEFAULT;
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
		result.append(", processingRate: ");
		result.append(processingRate);
		result.append(')');
		return result.toString();
	}

} //ProcessingResourceUnitImpl

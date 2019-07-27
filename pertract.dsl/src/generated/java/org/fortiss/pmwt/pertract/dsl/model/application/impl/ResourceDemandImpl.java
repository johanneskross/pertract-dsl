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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl#getProcessingType <em>Processing Type</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl#getRandomVariable <em>Random Variable</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl#getParametricVariableName <em>Parametric Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDemandImpl extends MinimalEObjectImpl.Container implements ResourceDemand {
	/**
	 * The default value of the '{@link #getProcessingType() <em>Processing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSING_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getProcessingType() <em>Processing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingType()
	 * @generated
	 * @ordered
	 */
	protected String processingType = PROCESSING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandomVariable() <em>Random Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String RANDOM_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRandomVariable() <em>Random Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomVariable()
	 * @generated
	 * @ordered
	 */
	protected String randomVariable = RANDOM_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParametricVariableName() <em>Parametric Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametricVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETRIC_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParametricVariableName() <em>Parametric Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametricVariableName()
	 * @generated
	 * @ordered
	 */
	protected String parametricVariableName = PARAMETRIC_VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.RESOURCE_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessingType() {
		return processingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingType(String newProcessingType) {
		String oldProcessingType = processingType;
		processingType = newProcessingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.RESOURCE_DEMAND__PROCESSING_TYPE, oldProcessingType, processingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRandomVariable() {
		return randomVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomVariable(String newRandomVariable) {
		String oldRandomVariable = randomVariable;
		randomVariable = newRandomVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.RESOURCE_DEMAND__RANDOM_VARIABLE, oldRandomVariable, randomVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParametricVariableName() {
		return parametricVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametricVariableName(String newParametricVariableName) {
		String oldParametricVariableName = parametricVariableName;
		parametricVariableName = newParametricVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME, oldParametricVariableName, parametricVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationDSLPackage.RESOURCE_DEMAND__PROCESSING_TYPE:
				return getProcessingType();
			case ApplicationDSLPackage.RESOURCE_DEMAND__RANDOM_VARIABLE:
				return getRandomVariable();
			case ApplicationDSLPackage.RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME:
				return getParametricVariableName();
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
			case ApplicationDSLPackage.RESOURCE_DEMAND__PROCESSING_TYPE:
				setProcessingType((String)newValue);
				return;
			case ApplicationDSLPackage.RESOURCE_DEMAND__RANDOM_VARIABLE:
				setRandomVariable((String)newValue);
				return;
			case ApplicationDSLPackage.RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME:
				setParametricVariableName((String)newValue);
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
			case ApplicationDSLPackage.RESOURCE_DEMAND__PROCESSING_TYPE:
				setProcessingType(PROCESSING_TYPE_EDEFAULT);
				return;
			case ApplicationDSLPackage.RESOURCE_DEMAND__RANDOM_VARIABLE:
				setRandomVariable(RANDOM_VARIABLE_EDEFAULT);
				return;
			case ApplicationDSLPackage.RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME:
				setParametricVariableName(PARAMETRIC_VARIABLE_NAME_EDEFAULT);
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
			case ApplicationDSLPackage.RESOURCE_DEMAND__PROCESSING_TYPE:
				return PROCESSING_TYPE_EDEFAULT == null ? processingType != null : !PROCESSING_TYPE_EDEFAULT.equals(processingType);
			case ApplicationDSLPackage.RESOURCE_DEMAND__RANDOM_VARIABLE:
				return RANDOM_VARIABLE_EDEFAULT == null ? randomVariable != null : !RANDOM_VARIABLE_EDEFAULT.equals(randomVariable);
			case ApplicationDSLPackage.RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME:
				return PARAMETRIC_VARIABLE_NAME_EDEFAULT == null ? parametricVariableName != null : !PARAMETRIC_VARIABLE_NAME_EDEFAULT.equals(parametricVariableName);
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
		result.append(" (processingType: ");
		result.append(processingType);
		result.append(", randomVariable: ");
		result.append(randomVariable);
		result.append(", parametricVariableName: ");
		result.append(parametricVariableName);
		result.append(')');
		return result.toString();
	}

} //ResourceDemandImpl

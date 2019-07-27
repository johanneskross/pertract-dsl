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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Workload Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl#getDataModels <em>Data Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataWorkloadArchitectureImpl extends MinimalEObjectImpl.Container implements DataWorkloadArchitecture {
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
	 * The cached value of the '{@link #getDataModels() <em>Data Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModels()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModel> dataModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWorkloadArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWorkloadDSLPackage.Literals.DATA_WORKLOAD_ARCHITECTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModel> getDataModels() {
		if (dataModels == null) {
			dataModels = new EObjectContainmentEList<DataModel>(DataModel.class, this, DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS);
		}
		return dataModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS:
				return ((InternalEList<?>)getDataModels()).basicRemove(otherEnd, msgs);
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
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__NAME:
				return getName();
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS:
				return getDataModels();
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
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS:
				getDataModels().clear();
				getDataModels().addAll((Collection<? extends DataModel>)newValue);
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
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS:
				getDataModels().clear();
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
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS:
				return dataModels != null && !dataModels.isEmpty();
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

} //DataWorkloadArchitectureImpl

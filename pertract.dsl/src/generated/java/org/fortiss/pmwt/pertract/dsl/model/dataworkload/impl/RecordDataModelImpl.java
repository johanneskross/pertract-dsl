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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl#getMeanRecordSize <em>Mean Record Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordDataModelImpl extends MinimalEObjectImpl.Container implements RecordDataModel {
	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

	/**
	 * The default value of the '{@link #getMeanRecordSize() <em>Mean Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanRecordSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MEAN_RECORD_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMeanRecordSize() <em>Mean Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanRecordSize()
	 * @generated
	 * @ordered
	 */
	protected long meanRecordSize = MEAN_RECORD_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWorkloadDSLPackage.Literals.RECORD_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMeanRecordSize() {
		return meanRecordSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanRecordSize(long newMeanRecordSize) {
		long oldMeanRecordSize = meanRecordSize;
		meanRecordSize = newMeanRecordSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.RECORD_DATA_MODEL__MEAN_RECORD_SIZE, oldMeanRecordSize, meanRecordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
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
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE:
				return getDataSource();
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__MEAN_RECORD_SIZE:
				return getMeanRecordSize();
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
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__MEAN_RECORD_SIZE:
				setMeanRecordSize((Long)newValue);
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
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__MEAN_RECORD_SIZE:
				setMeanRecordSize(MEAN_RECORD_SIZE_EDEFAULT);
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
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__DATA_SOURCE:
				return dataSource != null;
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL__MEAN_RECORD_SIZE:
				return meanRecordSize != MEAN_RECORD_SIZE_EDEFAULT;
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
		result.append(" (meanRecordSize: ");
		result.append(meanRecordSize);
		result.append(')');
		return result.toString();
	}

} //RecordDataModelImpl

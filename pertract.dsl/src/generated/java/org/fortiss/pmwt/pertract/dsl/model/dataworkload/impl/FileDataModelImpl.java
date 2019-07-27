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

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl#getPartitionSize <em>Partition Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileDataModelImpl extends MinimalEObjectImpl.Container implements FileDataModel {
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
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSpecification> files;

	/**
	 * The default value of the '{@link #getPartitionSize() <em>Partition Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTITION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPartitionSize() <em>Partition Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionSize()
	 * @generated
	 * @ordered
	 */
	protected int partitionSize = PARTITION_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWorkloadDSLPackage.Literals.FILE_DATA_MODEL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE, oldDataSource, newDataSource);
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
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSpecification> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<FileSpecification>(FileSpecification.class, this, DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPartitionSize() {
		return partitionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionSize(int newPartitionSize) {
		int oldPartitionSize = partitionSize;
		partitionSize = newPartitionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWorkloadDSLPackage.FILE_DATA_MODEL__PARTITION_SIZE, oldPartitionSize, partitionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE:
				return getDataSource();
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES:
				return getFiles();
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__PARTITION_SIZE:
				return getPartitionSize();
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
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends FileSpecification>)newValue);
				return;
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__PARTITION_SIZE:
				setPartitionSize((Integer)newValue);
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
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES:
				getFiles().clear();
				return;
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__PARTITION_SIZE:
				setPartitionSize(PARTITION_SIZE_EDEFAULT);
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
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__DATA_SOURCE:
				return dataSource != null;
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__FILES:
				return files != null && !files.isEmpty();
			case DataWorkloadDSLPackage.FILE_DATA_MODEL__PARTITION_SIZE:
				return partitionSize != PARTITION_SIZE_EDEFAULT;
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
		result.append(" (partitionSize: ");
		result.append(partitionSize);
		result.append(')');
		return result.toString();
	}

} //FileDataModelImpl

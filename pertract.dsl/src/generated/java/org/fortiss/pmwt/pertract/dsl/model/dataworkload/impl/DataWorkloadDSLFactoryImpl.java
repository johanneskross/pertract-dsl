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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWorkloadDSLFactoryImpl extends EFactoryImpl implements DataWorkloadDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataWorkloadDSLFactory init() {
		try {
			DataWorkloadDSLFactory theDataWorkloadDSLFactory = (DataWorkloadDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DataWorkloadDSLPackage.eNS_URI);
			if (theDataWorkloadDSLFactory != null) {
				return theDataWorkloadDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataWorkloadDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWorkloadDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataWorkloadDSLPackage.DATA_WORKLOAD_ARCHITECTURE: return createDataWorkloadArchitecture();
			case DataWorkloadDSLPackage.RECORD_DATA_MODEL: return createRecordDataModel();
			case DataWorkloadDSLPackage.OPEN_DATA_SOURCE: return createOpenDataSource();
			case DataWorkloadDSLPackage.FILE_DATA_MODEL: return createFileDataModel();
			case DataWorkloadDSLPackage.FILE_SPECIFICATION: return createFileSpecification();
			case DataWorkloadDSLPackage.SINGLE_DATA_SOURCE: return createSingleDataSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWorkloadArchitecture createDataWorkloadArchitecture() {
		DataWorkloadArchitectureImpl dataWorkloadArchitecture = new DataWorkloadArchitectureImpl();
		return dataWorkloadArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordDataModel createRecordDataModel() {
		RecordDataModelImpl recordDataModel = new RecordDataModelImpl();
		return recordDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDataSource createOpenDataSource() {
		OpenDataSourceImpl openDataSource = new OpenDataSourceImpl();
		return openDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDataModel createFileDataModel() {
		FileDataModelImpl fileDataModel = new FileDataModelImpl();
		return fileDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSpecification createFileSpecification() {
		FileSpecificationImpl fileSpecification = new FileSpecificationImpl();
		return fileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDataSource createSingleDataSource() {
		SingleDataSourceImpl singleDataSource = new SingleDataSourceImpl();
		return singleDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWorkloadDSLPackage getDataWorkloadDSLPackage() {
		return (DataWorkloadDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataWorkloadDSLPackage getPackage() {
		return DataWorkloadDSLPackage.eINSTANCE;
	}

} //DataWorkloadDSLFactoryImpl

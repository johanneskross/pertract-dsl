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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;

import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.SingleDataSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWorkloadDSLPackageImpl extends EPackageImpl implements DataWorkloadDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWorkloadArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDataSourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataWorkloadDSLPackageImpl() {
		super(eNS_URI, DataWorkloadDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataWorkloadDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataWorkloadDSLPackage init() {
		if (isInited) return (DataWorkloadDSLPackage)EPackage.Registry.INSTANCE.getEPackage(DataWorkloadDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataWorkloadDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataWorkloadDSLPackageImpl theDataWorkloadDSLPackage = registeredDataWorkloadDSLPackage instanceof DataWorkloadDSLPackageImpl ? (DataWorkloadDSLPackageImpl)registeredDataWorkloadDSLPackage : new DataWorkloadDSLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ApplicationDSLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDataWorkloadDSLPackage.createPackageContents();

		// Initialize created meta-data
		theDataWorkloadDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataWorkloadDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataWorkloadDSLPackage.eNS_URI, theDataWorkloadDSLPackage);
		return theDataWorkloadDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataWorkloadArchitecture() {
		return dataWorkloadArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWorkloadArchitecture_Name() {
		return (EAttribute)dataWorkloadArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWorkloadArchitecture_DataModels() {
		return (EReference)dataWorkloadArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataSource() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Partitions() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordDataModel() {
		return recordDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordDataModel_MeanRecordSize() {
		return (EAttribute)recordDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDataSource() {
		return openDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDataSource_ArrivalRate() {
		return (EAttribute)openDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDataModel() {
		return fileDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDataModel_Files() {
		return (EReference)fileDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileDataModel_PartitionSize() {
		return (EAttribute)fileDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSpecification() {
		return fileSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_Size() {
		return (EAttribute)fileSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_Records() {
		return (EAttribute)fileSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleDataSource() {
		return singleDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWorkloadDSLFactory getDataWorkloadDSLFactory() {
		return (DataWorkloadDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataWorkloadArchitectureEClass = createEClass(DATA_WORKLOAD_ARCHITECTURE);
		createEAttribute(dataWorkloadArchitectureEClass, DATA_WORKLOAD_ARCHITECTURE__NAME);
		createEReference(dataWorkloadArchitectureEClass, DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS);

		dataModelEClass = createEClass(DATA_MODEL);
		createEReference(dataModelEClass, DATA_MODEL__DATA_SOURCE);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__PARTITIONS);

		recordDataModelEClass = createEClass(RECORD_DATA_MODEL);
		createEAttribute(recordDataModelEClass, RECORD_DATA_MODEL__MEAN_RECORD_SIZE);

		openDataSourceEClass = createEClass(OPEN_DATA_SOURCE);
		createEAttribute(openDataSourceEClass, OPEN_DATA_SOURCE__ARRIVAL_RATE);

		fileDataModelEClass = createEClass(FILE_DATA_MODEL);
		createEReference(fileDataModelEClass, FILE_DATA_MODEL__FILES);
		createEAttribute(fileDataModelEClass, FILE_DATA_MODEL__PARTITION_SIZE);

		fileSpecificationEClass = createEClass(FILE_SPECIFICATION);
		createEAttribute(fileSpecificationEClass, FILE_SPECIFICATION__SIZE);
		createEAttribute(fileSpecificationEClass, FILE_SPECIFICATION__RECORDS);

		singleDataSourceEClass = createEClass(SINGLE_DATA_SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicationDSLPackage theApplicationDSLPackage = (ApplicationDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationDSLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataModelEClass.getESuperTypes().add(theApplicationDSLPackage.getDataInput());
		recordDataModelEClass.getESuperTypes().add(this.getDataModel());
		openDataSourceEClass.getESuperTypes().add(this.getDataSource());
		fileDataModelEClass.getESuperTypes().add(this.getDataModel());
		singleDataSourceEClass.getESuperTypes().add(this.getDataSource());

		// Initialize classes and features; add operations and parameters
		initEClass(dataWorkloadArchitectureEClass, DataWorkloadArchitecture.class, "DataWorkloadArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataWorkloadArchitecture_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataWorkloadArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWorkloadArchitecture_DataModels(), this.getDataModel(), null, "dataModels", null, 1, -1, DataWorkloadArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataModel_DataSource(), this.getDataSource(), null, "dataSource", null, 1, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Partitions(), ecorePackage.getEInt(), "partitions", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordDataModelEClass, RecordDataModel.class, "RecordDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordDataModel_MeanRecordSize(), ecorePackage.getELong(), "meanRecordSize", null, 0, 1, RecordDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openDataSourceEClass, OpenDataSource.class, "OpenDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDataSource_ArrivalRate(), ecorePackage.getEDouble(), "arrivalRate", null, 0, 1, OpenDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDataModelEClass, FileDataModel.class, "FileDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDataModel_Files(), this.getFileSpecification(), null, "files", null, 1, -1, FileDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileDataModel_PartitionSize(), ecorePackage.getEInt(), "partitionSize", null, 1, 1, FileDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSpecificationEClass, FileSpecification.class, "FileSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSpecification_Size(), ecorePackage.getELong(), "size", null, 0, 1, FileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSpecification_Records(), ecorePackage.getELong(), "records", null, 0, 1, FileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleDataSourceEClass, SingleDataSource.class, "SingleDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DataWorkloadDSLPackageImpl

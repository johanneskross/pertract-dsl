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
package org.fortiss.pmwt.pertract.dsl.model.dataworkload;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLFactory
 * @model kind="package"
 * @generated
 */
public interface DataWorkloadDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataworkload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/pmwt/pertract/dsl/data/workload";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org-fortiss-pmwt-pertract-dsl-data-workload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWorkloadDSLPackage eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl <em>Data Workload Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataWorkloadArchitecture()
	 * @generated
	 */
	int DATA_WORKLOAD_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WORKLOAD_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS = 1;

	/**
	 * The number of structural features of the '<em>Data Workload Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WORKLOAD_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_SOURCE = ApplicationDSLPackage.DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = ApplicationDSLPackage.DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PARTITIONS = 0;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl <em>Record Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getRecordDataModel()
	 * @generated
	 */
	int RECORD_DATA_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DATA_MODEL__DATA_SOURCE = DATA_MODEL__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Mean Record Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DATA_MODEL__MEAN_RECORD_SIZE = DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DATA_MODEL_FEATURE_COUNT = DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl <em>Open Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getOpenDataSource()
	 * @generated
	 */
	int OPEN_DATA_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_SOURCE__PARTITIONS = DATA_SOURCE__PARTITIONS;

	/**
	 * The feature id for the '<em><b>Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_SOURCE__ARRIVAL_RATE = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl <em>File Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getFileDataModel()
	 * @generated
	 */
	int FILE_DATA_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_MODEL__DATA_SOURCE = DATA_MODEL__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_MODEL__FILES = DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_MODEL__PARTITION_SIZE = DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_MODEL_FEATURE_COUNT = DATA_MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileSpecificationImpl <em>File Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileSpecificationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getFileSpecification()
	 * @generated
	 */
	int FILE_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION__RECORDS = 1;

	/**
	 * The number of structural features of the '<em>File Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.SingleDataSourceImpl <em>Single Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.SingleDataSourceImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getSingleDataSource()
	 * @generated
	 */
	int SINGLE_DATA_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DATA_SOURCE__PARTITIONS = DATA_SOURCE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>Single Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture <em>Data Workload Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Workload Architecture</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture
	 * @generated
	 */
	EClass getDataWorkloadArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture#getName()
	 * @see #getDataWorkloadArchitecture()
	 * @generated
	 */
	EAttribute getDataWorkloadArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture#getDataModels <em>Data Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Models</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture#getDataModels()
	 * @see #getDataWorkloadArchitecture()
	 * @generated
	 */
	EReference getDataWorkloadArchitecture_DataModels();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel#getDataSource()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataSource();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partitions</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource#getPartitions()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Partitions();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel <em>Record Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Data Model</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel
	 * @generated
	 */
	EClass getRecordDataModel();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel#getMeanRecordSize <em>Mean Record Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Record Size</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel#getMeanRecordSize()
	 * @see #getRecordDataModel()
	 * @generated
	 */
	EAttribute getRecordDataModel_MeanRecordSize();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource <em>Open Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Data Source</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource
	 * @generated
	 */
	EClass getOpenDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource#getArrivalRate <em>Arrival Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Rate</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource#getArrivalRate()
	 * @see #getOpenDataSource()
	 * @generated
	 */
	EAttribute getOpenDataSource_ArrivalRate();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel <em>File Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Data Model</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel
	 * @generated
	 */
	EClass getFileDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getFiles()
	 * @see #getFileDataModel()
	 * @generated
	 */
	EReference getFileDataModel_Files();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getPartitionSize <em>Partition Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Size</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getPartitionSize()
	 * @see #getFileDataModel()
	 * @generated
	 */
	EAttribute getFileDataModel_PartitionSize();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification <em>File Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Specification</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification
	 * @generated
	 */
	EClass getFileSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getSize()
	 * @see #getFileSpecification()
	 * @generated
	 */
	EAttribute getFileSpecification_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Records</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getRecords()
	 * @see #getFileSpecification()
	 * @generated
	 */
	EAttribute getFileSpecification_Records();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.SingleDataSource <em>Single Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Data Source</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.SingleDataSource
	 * @generated
	 */
	EClass getSingleDataSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataWorkloadDSLFactory getDataWorkloadDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl <em>Data Workload Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadArchitectureImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataWorkloadArchitecture()
		 * @generated
		 */
		EClass DATA_WORKLOAD_ARCHITECTURE = eINSTANCE.getDataWorkloadArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WORKLOAD_ARCHITECTURE__NAME = eINSTANCE.getDataWorkloadArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Data Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WORKLOAD_ARCHITECTURE__DATA_MODELS = eINSTANCE.getDataWorkloadArchitecture_DataModels();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataModel
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_SOURCE = eINSTANCE.getDataModel_DataSource();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataSource
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__PARTITIONS = eINSTANCE.getDataSource_Partitions();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl <em>Record Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.RecordDataModelImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getRecordDataModel()
		 * @generated
		 */
		EClass RECORD_DATA_MODEL = eINSTANCE.getRecordDataModel();

		/**
		 * The meta object literal for the '<em><b>Mean Record Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_DATA_MODEL__MEAN_RECORD_SIZE = eINSTANCE.getRecordDataModel_MeanRecordSize();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl <em>Open Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.OpenDataSourceImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getOpenDataSource()
		 * @generated
		 */
		EClass OPEN_DATA_SOURCE = eINSTANCE.getOpenDataSource();

		/**
		 * The meta object literal for the '<em><b>Arrival Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_SOURCE__ARRIVAL_RATE = eINSTANCE.getOpenDataSource_ArrivalRate();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl <em>File Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileDataModelImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getFileDataModel()
		 * @generated
		 */
		EClass FILE_DATA_MODEL = eINSTANCE.getFileDataModel();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DATA_MODEL__FILES = eINSTANCE.getFileDataModel_Files();

		/**
		 * The meta object literal for the '<em><b>Partition Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DATA_MODEL__PARTITION_SIZE = eINSTANCE.getFileDataModel_PartitionSize();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileSpecificationImpl <em>File Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.FileSpecificationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getFileSpecification()
		 * @generated
		 */
		EClass FILE_SPECIFICATION = eINSTANCE.getFileSpecification();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SPECIFICATION__SIZE = eINSTANCE.getFileSpecification_Size();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SPECIFICATION__RECORDS = eINSTANCE.getFileSpecification_Records();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.SingleDataSourceImpl <em>Single Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.SingleDataSourceImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLPackageImpl#getSingleDataSource()
		 * @generated
		 */
		EClass SINGLE_DATA_SOURCE = eINSTANCE.getSingleDataSource();

	}

} //DataWorkloadDSLPackage

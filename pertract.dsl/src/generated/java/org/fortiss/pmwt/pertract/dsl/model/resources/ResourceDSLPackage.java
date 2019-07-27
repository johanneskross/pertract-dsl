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
package org.fortiss.pmwt.pertract.dsl.model.resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/pmwt/pertract/dsl/resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org-fortiss-pmwt-pertract-dsl-resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceDSLPackage eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl <em>Resource Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceArchitecture()
	 * @generated
	 */
	int RESOURCE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Network Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__NETWORK_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Resource Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__RESOURCE_NODES = 2;

	/**
	 * The number of structural features of the '<em>Resource Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.NetworkChannelImpl <em>Network Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.NetworkChannelImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getNetworkChannel()
	 * @generated
	 */
	int NETWORK_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CHANNEL__BANDWIDTH = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CHANNEL__LATENCY = 1;

	/**
	 * The number of structural features of the '<em>Network Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl <em>Resource Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceNode()
	 * @generated
	 */
	int RESOURCE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Processing Resource Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE__PROCESSING_RESOURCE_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Drive Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE__DRIVE_PROCESSING_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Memory Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE__MEMORY_PROCESSING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Cluster Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE__CLUSTER_SPECIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Resource Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit <em>Resource Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceUnit()
	 * @generated
	 */
	int RESOURCE_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Resource Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl <em>Processing Resource Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getProcessingResourceUnit()
	 * @generated
	 */
	int PROCESSING_RESOURCE_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Replications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UNIT__REPLICATIONS = RESOURCE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UNIT__PROCESSING_RATE = RESOURCE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Resource Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UNIT_FEATURE_COUNT = RESOURCE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl <em>Drive Processing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getDriveProcessingUnit()
	 * @generated
	 */
	int DRIVE_PROCESSING_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Replications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_PROCESSING_UNIT__REPLICATIONS = RESOURCE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_PROCESSING_UNIT__READ_RATE = RESOURCE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Write Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_PROCESSING_UNIT__WRITE_RATE = RESOURCE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drive Processing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_PROCESSING_UNIT_FEATURE_COUNT = RESOURCE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.MemoryProcessingUnitImpl <em>Memory Processing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.MemoryProcessingUnitImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getMemoryProcessingUnit()
	 * @generated
	 */
	int MEMORY_PROCESSING_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PROCESSING_UNIT__CAPACITY = RESOURCE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Processing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PROCESSING_UNIT_FEATURE_COUNT = RESOURCE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl <em>Cluster Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getClusterSpecification()
	 * @generated
	 */
	int CLUSTER_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SPECIFICATION__RESOURCE_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SPECIFICATION__SCHEDULING_POLICY = 1;

	/**
	 * The number of structural features of the '<em>Cluster Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole <em>Resource Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 8;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 9;


	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture <em>Resource Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Architecture</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture
	 * @generated
	 */
	EClass getResourceArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getName()
	 * @see #getResourceArchitecture()
	 * @generated
	 */
	EAttribute getResourceArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getNetworkChannel <em>Network Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Channel</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getNetworkChannel()
	 * @see #getResourceArchitecture()
	 * @generated
	 */
	EReference getResourceArchitecture_NetworkChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getResourceNodes <em>Resource Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Nodes</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getResourceNodes()
	 * @see #getResourceArchitecture()
	 * @generated
	 */
	EReference getResourceArchitecture_ResourceNodes();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel <em>Network Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Channel</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel
	 * @generated
	 */
	EClass getNetworkChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getBandwidth()
	 * @see #getNetworkChannel()
	 * @generated
	 */
	EAttribute getNetworkChannel_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getLatency()
	 * @see #getNetworkChannel()
	 * @generated
	 */
	EAttribute getNetworkChannel_Latency();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode <em>Resource Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Node</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode
	 * @generated
	 */
	EClass getResourceNode();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getName()
	 * @see #getResourceNode()
	 * @generated
	 */
	EAttribute getResourceNode_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getProcessingResourceUnit <em>Processing Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Resource Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getProcessingResourceUnit()
	 * @see #getResourceNode()
	 * @generated
	 */
	EReference getResourceNode_ProcessingResourceUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getDriveProcessingUnit <em>Drive Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drive Processing Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getDriveProcessingUnit()
	 * @see #getResourceNode()
	 * @generated
	 */
	EReference getResourceNode_DriveProcessingUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getMemoryProcessingUnit <em>Memory Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Processing Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getMemoryProcessingUnit()
	 * @see #getResourceNode()
	 * @generated
	 */
	EReference getResourceNode_MemoryProcessingUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getClusterSpecification <em>Cluster Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cluster Specification</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getClusterSpecification()
	 * @see #getResourceNode()
	 * @generated
	 */
	EReference getResourceNode_ClusterSpecification();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit <em>Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit
	 * @generated
	 */
	EClass getResourceUnit();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit <em>Processing Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit
	 * @generated
	 */
	EClass getProcessingResourceUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getReplications <em>Replications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replications</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getReplications()
	 * @see #getProcessingResourceUnit()
	 * @generated
	 */
	EAttribute getProcessingResourceUnit_Replications();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getProcessingRate <em>Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Rate</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getProcessingRate()
	 * @see #getProcessingResourceUnit()
	 * @generated
	 */
	EAttribute getProcessingResourceUnit_ProcessingRate();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit <em>Drive Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive Processing Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit
	 * @generated
	 */
	EClass getDriveProcessingUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReplications <em>Replications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replications</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReplications()
	 * @see #getDriveProcessingUnit()
	 * @generated
	 */
	EAttribute getDriveProcessingUnit_Replications();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReadRate <em>Read Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Rate</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReadRate()
	 * @see #getDriveProcessingUnit()
	 * @generated
	 */
	EAttribute getDriveProcessingUnit_ReadRate();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getWriteRate <em>Write Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Rate</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getWriteRate()
	 * @see #getDriveProcessingUnit()
	 * @generated
	 */
	EAttribute getDriveProcessingUnit_WriteRate();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit <em>Memory Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Processing Unit</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit
	 * @generated
	 */
	EClass getMemoryProcessingUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit#getCapacity()
	 * @see #getMemoryProcessingUnit()
	 * @generated
	 */
	EAttribute getMemoryProcessingUnit_Capacity();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification <em>Cluster Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Specification</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification
	 * @generated
	 */
	EClass getClusterSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Role</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getResourceRole()
	 * @see #getClusterSpecification()
	 * @generated
	 */
	EAttribute getClusterSpecification_ResourceRole();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getSchedulingPolicy()
	 * @see #getClusterSpecification()
	 * @generated
	 */
	EAttribute getClusterSpecification_SchedulingPolicy();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Role</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole
	 * @generated
	 */
	EEnum getResourceRole();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy
	 * @generated
	 */
	EEnum getSchedulingPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceDSLFactory getResourceDSLFactory();

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
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl <em>Resource Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceArchitecture()
		 * @generated
		 */
		EClass RESOURCE_ARCHITECTURE = eINSTANCE.getResourceArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ARCHITECTURE__NAME = eINSTANCE.getResourceArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Network Channel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ARCHITECTURE__NETWORK_CHANNEL = eINSTANCE.getResourceArchitecture_NetworkChannel();

		/**
		 * The meta object literal for the '<em><b>Resource Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ARCHITECTURE__RESOURCE_NODES = eINSTANCE.getResourceArchitecture_ResourceNodes();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.NetworkChannelImpl <em>Network Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.NetworkChannelImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getNetworkChannel()
		 * @generated
		 */
		EClass NETWORK_CHANNEL = eINSTANCE.getNetworkChannel();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CHANNEL__BANDWIDTH = eINSTANCE.getNetworkChannel_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CHANNEL__LATENCY = eINSTANCE.getNetworkChannel_Latency();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl <em>Resource Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceNodeImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceNode()
		 * @generated
		 */
		EClass RESOURCE_NODE = eINSTANCE.getResourceNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_NODE__NAME = eINSTANCE.getResourceNode_Name();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_NODE__PROCESSING_RESOURCE_UNIT = eINSTANCE.getResourceNode_ProcessingResourceUnit();

		/**
		 * The meta object literal for the '<em><b>Drive Processing Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_NODE__DRIVE_PROCESSING_UNIT = eINSTANCE.getResourceNode_DriveProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Memory Processing Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_NODE__MEMORY_PROCESSING_UNIT = eINSTANCE.getResourceNode_MemoryProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Cluster Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_NODE__CLUSTER_SPECIFICATION = eINSTANCE.getResourceNode_ClusterSpecification();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit <em>Resource Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceUnit()
		 * @generated
		 */
		EClass RESOURCE_UNIT = eINSTANCE.getResourceUnit();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl <em>Processing Resource Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ProcessingResourceUnitImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getProcessingResourceUnit()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_UNIT = eINSTANCE.getProcessingResourceUnit();

		/**
		 * The meta object literal for the '<em><b>Replications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_UNIT__REPLICATIONS = eINSTANCE.getProcessingResourceUnit_Replications();

		/**
		 * The meta object literal for the '<em><b>Processing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_UNIT__PROCESSING_RATE = eINSTANCE.getProcessingResourceUnit_ProcessingRate();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl <em>Drive Processing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.DriveProcessingUnitImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getDriveProcessingUnit()
		 * @generated
		 */
		EClass DRIVE_PROCESSING_UNIT = eINSTANCE.getDriveProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Replications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVE_PROCESSING_UNIT__REPLICATIONS = eINSTANCE.getDriveProcessingUnit_Replications();

		/**
		 * The meta object literal for the '<em><b>Read Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVE_PROCESSING_UNIT__READ_RATE = eINSTANCE.getDriveProcessingUnit_ReadRate();

		/**
		 * The meta object literal for the '<em><b>Write Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVE_PROCESSING_UNIT__WRITE_RATE = eINSTANCE.getDriveProcessingUnit_WriteRate();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.MemoryProcessingUnitImpl <em>Memory Processing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.MemoryProcessingUnitImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getMemoryProcessingUnit()
		 * @generated
		 */
		EClass MEMORY_PROCESSING_UNIT = eINSTANCE.getMemoryProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_PROCESSING_UNIT__CAPACITY = eINSTANCE.getMemoryProcessingUnit_Capacity();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl <em>Cluster Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ClusterSpecificationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getClusterSpecification()
		 * @generated
		 */
		EClass CLUSTER_SPECIFICATION = eINSTANCE.getClusterSpecification();

		/**
		 * The meta object literal for the '<em><b>Resource Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_SPECIFICATION__RESOURCE_ROLE = eINSTANCE.getClusterSpecification_ResourceRole();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_SPECIFICATION__SCHEDULING_POLICY = eINSTANCE.getClusterSpecification_SchedulingPolicy();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole <em>Resource Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getResourceRole()
		 * @generated
		 */
		EEnum RESOURCE_ROLE = eINSTANCE.getResourceRole();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy
		 * @see org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

	}

} //ResourceDSLPackage

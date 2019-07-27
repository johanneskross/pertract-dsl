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
package org.fortiss.pmwt.pertract.dsl.model.application;

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
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/pmwt/pertract/dsl/application";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org-fortiss-pmwt-pertract-dsl-application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationDSLPackage eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl <em>Application Execution Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationExecutionArchitecture()
	 * @generated
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK = 1;

	/**
	 * The feature id for the '<em><b>Application Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Top Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE = 3;

	/**
	 * The number of structural features of the '<em>Application Execution Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXECUTION_ARCHITECTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl <em>Application Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationConfiguration()
	 * @generated
	 */
	int APPLICATION_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM = 0;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION__EXECUTORS = 1;

	/**
	 * The feature id for the '<em><b>Memory Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR = 2;

	/**
	 * The feature id for the '<em><b>Task Slots Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR = 3;

	/**
	 * The feature id for the '<em><b>Memory Per Task Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT = 4;

	/**
	 * The number of structural features of the '<em>Application Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.BatchConfigurationImpl <em>Batch Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.BatchConfigurationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getBatchConfiguration()
	 * @generated
	 */
	int BATCH_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION__DEFAULT_PARALLELISM = APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION__EXECUTORS = APPLICATION_CONFIGURATION__EXECUTORS;

	/**
	 * The feature id for the '<em><b>Memory Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION__MEMORY_PER_EXECUTOR = APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Task Slots Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR = APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Memory Per Task Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION__MEMORY_PER_TASK_SLOT = APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT;

	/**
	 * The number of structural features of the '<em>Batch Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_CONFIGURATION_FEATURE_COUNT = APPLICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.MiniBatchConfigurationImpl <em>Mini Batch Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.MiniBatchConfigurationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getMiniBatchConfiguration()
	 * @generated
	 */
	int MINI_BATCH_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__DEFAULT_PARALLELISM = APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__EXECUTORS = APPLICATION_CONFIGURATION__EXECUTORS;

	/**
	 * The feature id for the '<em><b>Memory Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__MEMORY_PER_EXECUTOR = APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Task Slots Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR = APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Memory Per Task Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__MEMORY_PER_TASK_SLOT = APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT;

	/**
	 * The feature id for the '<em><b>Mini Batch Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL = APPLICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mini Batch Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_BATCH_CONFIGURATION_FEATURE_COUNT = APPLICATION_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.StreamConfigurationImpl <em>Stream Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.StreamConfigurationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getStreamConfiguration()
	 * @generated
	 */
	int STREAM_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION__DEFAULT_PARALLELISM = APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION__EXECUTORS = APPLICATION_CONFIGURATION__EXECUTORS;

	/**
	 * The feature id for the '<em><b>Memory Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION__MEMORY_PER_EXECUTOR = APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Task Slots Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR = APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR;

	/**
	 * The feature id for the '<em><b>Memory Per Task Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION__MEMORY_PER_TASK_SLOT = APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT;

	/**
	 * The number of structural features of the '<em>Stream Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONFIGURATION_FEATURE_COUNT = APPLICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl <em>Execution Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getExecutionNode()
	 * @generated
	 */
	int EXECUTION_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Edges Of Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__EDGES_OF_CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Resource Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__RESOURCE_PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__PARALLELISM = 6;

	/**
	 * The feature id for the '<em><b>Starting Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__STARTING_NODE = 7;

	/**
	 * The feature id for the '<em><b>Spout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__SPOUT = 8;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE__DATA_INPUT = 9;

	/**
	 * The number of structural features of the '<em>Execution Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_NODE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.DataInput <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DataInput
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 6;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.OperationImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getDirectedEdge()
	 * @generated
	 */
	int DIRECTED_EDGE = 8;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_EDGE__TAIL = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_EDGE__HEAD = 1;

	/**
	 * The feature id for the '<em><b>Data Transmission Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR = 2;

	/**
	 * The number of structural features of the '<em>Directed Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_EDGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceProfileImpl <em>Resource Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceProfileImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getResourceProfile()
	 * @generated
	 */
	int RESOURCE_PROFILE = 9;

	/**
	 * The feature id for the '<em><b>Resource Demands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROFILE__RESOURCE_DEMANDS = 0;

	/**
	 * The number of structural features of the '<em>Resource Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl <em>Resource Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getResourceDemand()
	 * @generated
	 */
	int RESOURCE_DEMAND = 10;

	/**
	 * The feature id for the '<em><b>Processing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMAND__PROCESSING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Random Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMAND__RANDOM_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Parametric Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMAND_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType <em>Processing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getProcessingType()
	 * @generated
	 */
	int PROCESSING_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture <em>Application Execution Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Execution Architecture</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture
	 * @generated
	 */
	EClass getApplicationExecutionArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getName()
	 * @see #getApplicationExecutionArchitecture()
	 * @generated
	 */
	EAttribute getApplicationExecutionArchitecture_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getFramework()
	 * @see #getApplicationExecutionArchitecture()
	 * @generated
	 */
	EAttribute getApplicationExecutionArchitecture_Framework();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getApplicationConfiguration <em>Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Configuration</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getApplicationConfiguration()
	 * @see #getApplicationExecutionArchitecture()
	 * @generated
	 */
	EReference getApplicationExecutionArchitecture_ApplicationConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getTopNode <em>Top Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top Node</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getTopNode()
	 * @see #getApplicationExecutionArchitecture()
	 * @generated
	 */
	EReference getApplicationExecutionArchitecture_TopNode();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration <em>Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Configuration</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration
	 * @generated
	 */
	EClass getApplicationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getDefaultParallelism <em>Default Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Parallelism</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getDefaultParallelism()
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	EAttribute getApplicationConfiguration_DefaultParallelism();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getExecutors <em>Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executors</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getExecutors()
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	EAttribute getApplicationConfiguration_Executors();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerExecutor <em>Memory Per Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Per Executor</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerExecutor()
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	EAttribute getApplicationConfiguration_MemoryPerExecutor();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getTaskSlotsPerExecutor <em>Task Slots Per Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Slots Per Executor</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getTaskSlotsPerExecutor()
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	EAttribute getApplicationConfiguration_TaskSlotsPerExecutor();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerTaskSlot <em>Memory Per Task Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Per Task Slot</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerTaskSlot()
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	EAttribute getApplicationConfiguration_MemoryPerTaskSlot();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.BatchConfiguration <em>Batch Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch Configuration</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.BatchConfiguration
	 * @generated
	 */
	EClass getBatchConfiguration();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration <em>Mini Batch Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mini Batch Configuration</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration
	 * @generated
	 */
	EClass getMiniBatchConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration#getMiniBatchInterval <em>Mini Batch Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mini Batch Interval</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration#getMiniBatchInterval()
	 * @see #getMiniBatchConfiguration()
	 * @generated
	 */
	EAttribute getMiniBatchConfiguration_MiniBatchInterval();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.StreamConfiguration <em>Stream Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Configuration</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.StreamConfiguration
	 * @generated
	 */
	EClass getStreamConfiguration();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode <em>Execution Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Node</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode
	 * @generated
	 */
	EClass getExecutionNode();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getName()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EAttribute getExecutionNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getOperations()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_Operations();

	/**
	 * Returns the meta object for the reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParent()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getChildren()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getEdgesOfChildren <em>Edges Of Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges Of Children</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getEdgesOfChildren()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_EdgesOfChildren();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getResourceProfile <em>Resource Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Profile</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getResourceProfile()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_ResourceProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParallelism()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EAttribute getExecutionNode_Parallelism();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isStartingNode <em>Starting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Node</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isStartingNode()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EAttribute getExecutionNode_StartingNode();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isSpout <em>Spout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spout</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isSpout()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EAttribute getExecutionNode_Spout();

	/**
	 * Returns the meta object for the reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Input</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getDataInput()
	 * @see #getExecutionNode()
	 * @generated
	 */
	EReference getExecutionNode_DataInput();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge <em>Directed Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Edge</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge
	 * @generated
	 */
	EClass getDirectedEdge();

	/**
	 * Returns the meta object for the reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tail</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getTail()
	 * @see #getDirectedEdge()
	 * @generated
	 */
	EReference getDirectedEdge_Tail();

	/**
	 * Returns the meta object for the reference '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getHead()
	 * @see #getDirectedEdge()
	 * @generated
	 */
	EReference getDirectedEdge_Head();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getDataTransmissionFactor <em>Data Transmission Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Transmission Factor</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getDataTransmissionFactor()
	 * @see #getDirectedEdge()
	 * @generated
	 */
	EAttribute getDirectedEdge_DataTransmissionFactor();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile <em>Resource Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Profile</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile
	 * @generated
	 */
	EClass getResourceProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile#getResourceDemands <em>Resource Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Demands</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile#getResourceDemands()
	 * @see #getResourceProfile()
	 * @generated
	 */
	EReference getResourceProfile_ResourceDemands();

	/**
	 * Returns the meta object for class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand <em>Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Demand</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand
	 * @generated
	 */
	EClass getResourceDemand();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Type</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getProcessingType()
	 * @see #getResourceDemand()
	 * @generated
	 */
	EAttribute getResourceDemand_ProcessingType();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getRandomVariable <em>Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Variable</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getRandomVariable()
	 * @see #getResourceDemand()
	 * @generated
	 */
	EAttribute getResourceDemand_RandomVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getParametricVariableName <em>Parametric Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametric Variable Name</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getParametricVariableName()
	 * @see #getResourceDemand()
	 * @generated
	 */
	EAttribute getResourceDemand_ParametricVariableName();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Type</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType
	 * @generated
	 */
	EEnum getProcessingType();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationDSLFactory getApplicationDSLFactory();

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
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl <em>Application Execution Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationExecutionArchitecture()
		 * @generated
		 */
		EClass APPLICATION_EXECUTION_ARCHITECTURE = eINSTANCE.getApplicationExecutionArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_EXECUTION_ARCHITECTURE__NAME = eINSTANCE.getApplicationExecutionArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK = eINSTANCE.getApplicationExecutionArchitecture_Framework();

		/**
		 * The meta object literal for the '<em><b>Application Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION = eINSTANCE.getApplicationExecutionArchitecture_ApplicationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Top Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE = eINSTANCE.getApplicationExecutionArchitecture_TopNode();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl <em>Application Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationConfiguration()
		 * @generated
		 */
		EClass APPLICATION_CONFIGURATION = eINSTANCE.getApplicationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Default Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM = eINSTANCE.getApplicationConfiguration_DefaultParallelism();

		/**
		 * The meta object literal for the '<em><b>Executors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIGURATION__EXECUTORS = eINSTANCE.getApplicationConfiguration_Executors();

		/**
		 * The meta object literal for the '<em><b>Memory Per Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR = eINSTANCE.getApplicationConfiguration_MemoryPerExecutor();

		/**
		 * The meta object literal for the '<em><b>Task Slots Per Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR = eINSTANCE.getApplicationConfiguration_TaskSlotsPerExecutor();

		/**
		 * The meta object literal for the '<em><b>Memory Per Task Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT = eINSTANCE.getApplicationConfiguration_MemoryPerTaskSlot();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.BatchConfigurationImpl <em>Batch Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.BatchConfigurationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getBatchConfiguration()
		 * @generated
		 */
		EClass BATCH_CONFIGURATION = eINSTANCE.getBatchConfiguration();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.MiniBatchConfigurationImpl <em>Mini Batch Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.MiniBatchConfigurationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getMiniBatchConfiguration()
		 * @generated
		 */
		EClass MINI_BATCH_CONFIGURATION = eINSTANCE.getMiniBatchConfiguration();

		/**
		 * The meta object literal for the '<em><b>Mini Batch Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL = eINSTANCE.getMiniBatchConfiguration_MiniBatchInterval();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.StreamConfigurationImpl <em>Stream Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.StreamConfigurationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getStreamConfiguration()
		 * @generated
		 */
		EClass STREAM_CONFIGURATION = eINSTANCE.getStreamConfiguration();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl <em>Execution Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getExecutionNode()
		 * @generated
		 */
		EClass EXECUTION_NODE = eINSTANCE.getExecutionNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_NODE__NAME = eINSTANCE.getExecutionNode_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__OPERATIONS = eINSTANCE.getExecutionNode_Operations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__PARENT = eINSTANCE.getExecutionNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__CHILDREN = eINSTANCE.getExecutionNode_Children();

		/**
		 * The meta object literal for the '<em><b>Edges Of Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__EDGES_OF_CHILDREN = eINSTANCE.getExecutionNode_EdgesOfChildren();

		/**
		 * The meta object literal for the '<em><b>Resource Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__RESOURCE_PROFILE = eINSTANCE.getExecutionNode_ResourceProfile();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_NODE__PARALLELISM = eINSTANCE.getExecutionNode_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Starting Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_NODE__STARTING_NODE = eINSTANCE.getExecutionNode_StartingNode();

		/**
		 * The meta object literal for the '<em><b>Spout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_NODE__SPOUT = eINSTANCE.getExecutionNode_Spout();

		/**
		 * The meta object literal for the '<em><b>Data Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_NODE__DATA_INPUT = eINSTANCE.getExecutionNode_DataInput();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.DataInput <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.DataInput
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.OperationImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getDirectedEdge()
		 * @generated
		 */
		EClass DIRECTED_EDGE = eINSTANCE.getDirectedEdge();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_EDGE__TAIL = eINSTANCE.getDirectedEdge_Tail();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_EDGE__HEAD = eINSTANCE.getDirectedEdge_Head();

		/**
		 * The meta object literal for the '<em><b>Data Transmission Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR = eINSTANCE.getDirectedEdge_DataTransmissionFactor();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceProfileImpl <em>Resource Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceProfileImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getResourceProfile()
		 * @generated
		 */
		EClass RESOURCE_PROFILE = eINSTANCE.getResourceProfile();

		/**
		 * The meta object literal for the '<em><b>Resource Demands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROFILE__RESOURCE_DEMANDS = eINSTANCE.getResourceProfile_ResourceDemands();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl <em>Resource Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ResourceDemandImpl
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getResourceDemand()
		 * @generated
		 */
		EClass RESOURCE_DEMAND = eINSTANCE.getResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Processing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DEMAND__PROCESSING_TYPE = eINSTANCE.getResourceDemand_ProcessingType();

		/**
		 * The meta object literal for the '<em><b>Random Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DEMAND__RANDOM_VARIABLE = eINSTANCE.getResourceDemand_RandomVariable();

		/**
		 * The meta object literal for the '<em><b>Parametric Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME = eINSTANCE.getResourceDemand_ParametricVariableName();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType <em>Processing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getProcessingType()
		 * @generated
		 */
		EEnum PROCESSING_TYPE = eINSTANCE.getProcessingType();

		/**
		 * The meta object literal for the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType
		 * @see org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLPackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

	}

} //ApplicationDSLPackage

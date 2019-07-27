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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationType;
import org.fortiss.pmwt.pertract.dsl.model.application.BatchConfiguration;
import org.fortiss.pmwt.pertract.dsl.model.application.DataInput;
import org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge;
import org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode;
import org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration;
import org.fortiss.pmwt.pertract.dsl.model.application.Operation;
import org.fortiss.pmwt.pertract.dsl.model.application.ProcessingType;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile;
import org.fortiss.pmwt.pertract.dsl.model.application.StreamConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationDSLPackageImpl extends EPackageImpl implements ApplicationDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationExecutionArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniBatchConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationTypeEEnum = null;

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
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationDSLPackageImpl() {
		super(eNS_URI, ApplicationDSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationDSLPackage init() {
		if (isInited) return (ApplicationDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApplicationDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApplicationDSLPackageImpl theApplicationDSLPackage = registeredApplicationDSLPackage instanceof ApplicationDSLPackageImpl ? (ApplicationDSLPackageImpl)registeredApplicationDSLPackage : new ApplicationDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theApplicationDSLPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationDSLPackage.eNS_URI, theApplicationDSLPackage);
		return theApplicationDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationExecutionArchitecture() {
		return applicationExecutionArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationExecutionArchitecture_Name() {
		return (EAttribute)applicationExecutionArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationExecutionArchitecture_Framework() {
		return (EAttribute)applicationExecutionArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationExecutionArchitecture_ApplicationConfiguration() {
		return (EReference)applicationExecutionArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationExecutionArchitecture_TopNode() {
		return (EReference)applicationExecutionArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationConfiguration() {
		return applicationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationConfiguration_DefaultParallelism() {
		return (EAttribute)applicationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationConfiguration_Executors() {
		return (EAttribute)applicationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationConfiguration_MemoryPerExecutor() {
		return (EAttribute)applicationConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationConfiguration_TaskSlotsPerExecutor() {
		return (EAttribute)applicationConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationConfiguration_MemoryPerTaskSlot() {
		return (EAttribute)applicationConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchConfiguration() {
		return batchConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiniBatchConfiguration() {
		return miniBatchConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniBatchConfiguration_MiniBatchInterval() {
		return (EAttribute)miniBatchConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamConfiguration() {
		return streamConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionNode() {
		return executionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionNode_Name() {
		return (EAttribute)executionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_Operations() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_Parent() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_Children() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_EdgesOfChildren() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_ResourceProfile() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionNode_Parallelism() {
		return (EAttribute)executionNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionNode_StartingNode() {
		return (EAttribute)executionNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionNode_Spout() {
		return (EAttribute)executionNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionNode_DataInput() {
		return (EReference)executionNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInput() {
		return dataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedEdge() {
		return directedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedEdge_Tail() {
		return (EReference)directedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedEdge_Head() {
		return (EReference)directedEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdge_DataTransmissionFactor() {
		return (EAttribute)directedEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProfile() {
		return resourceProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProfile_ResourceDemands() {
		return (EReference)resourceProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDemand() {
		return resourceDemandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDemand_ProcessingType() {
		return (EAttribute)resourceDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDemand_RandomVariable() {
		return (EAttribute)resourceDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDemand_ParametricVariableName() {
		return (EAttribute)resourceDemandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingType() {
		return processingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationType() {
		return applicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDSLFactory getApplicationDSLFactory() {
		return (ApplicationDSLFactory)getEFactoryInstance();
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
		applicationExecutionArchitectureEClass = createEClass(APPLICATION_EXECUTION_ARCHITECTURE);
		createEAttribute(applicationExecutionArchitectureEClass, APPLICATION_EXECUTION_ARCHITECTURE__NAME);
		createEAttribute(applicationExecutionArchitectureEClass, APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK);
		createEReference(applicationExecutionArchitectureEClass, APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION);
		createEReference(applicationExecutionArchitectureEClass, APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE);

		applicationConfigurationEClass = createEClass(APPLICATION_CONFIGURATION);
		createEAttribute(applicationConfigurationEClass, APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM);
		createEAttribute(applicationConfigurationEClass, APPLICATION_CONFIGURATION__EXECUTORS);
		createEAttribute(applicationConfigurationEClass, APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR);
		createEAttribute(applicationConfigurationEClass, APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR);
		createEAttribute(applicationConfigurationEClass, APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT);

		batchConfigurationEClass = createEClass(BATCH_CONFIGURATION);

		miniBatchConfigurationEClass = createEClass(MINI_BATCH_CONFIGURATION);
		createEAttribute(miniBatchConfigurationEClass, MINI_BATCH_CONFIGURATION__MINI_BATCH_INTERVAL);

		streamConfigurationEClass = createEClass(STREAM_CONFIGURATION);

		executionNodeEClass = createEClass(EXECUTION_NODE);
		createEAttribute(executionNodeEClass, EXECUTION_NODE__NAME);
		createEReference(executionNodeEClass, EXECUTION_NODE__OPERATIONS);
		createEReference(executionNodeEClass, EXECUTION_NODE__PARENT);
		createEReference(executionNodeEClass, EXECUTION_NODE__CHILDREN);
		createEReference(executionNodeEClass, EXECUTION_NODE__EDGES_OF_CHILDREN);
		createEReference(executionNodeEClass, EXECUTION_NODE__RESOURCE_PROFILE);
		createEAttribute(executionNodeEClass, EXECUTION_NODE__PARALLELISM);
		createEAttribute(executionNodeEClass, EXECUTION_NODE__STARTING_NODE);
		createEAttribute(executionNodeEClass, EXECUTION_NODE__SPOUT);
		createEReference(executionNodeEClass, EXECUTION_NODE__DATA_INPUT);

		dataInputEClass = createEClass(DATA_INPUT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);

		directedEdgeEClass = createEClass(DIRECTED_EDGE);
		createEReference(directedEdgeEClass, DIRECTED_EDGE__TAIL);
		createEReference(directedEdgeEClass, DIRECTED_EDGE__HEAD);
		createEAttribute(directedEdgeEClass, DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR);

		resourceProfileEClass = createEClass(RESOURCE_PROFILE);
		createEReference(resourceProfileEClass, RESOURCE_PROFILE__RESOURCE_DEMANDS);

		resourceDemandEClass = createEClass(RESOURCE_DEMAND);
		createEAttribute(resourceDemandEClass, RESOURCE_DEMAND__PROCESSING_TYPE);
		createEAttribute(resourceDemandEClass, RESOURCE_DEMAND__RANDOM_VARIABLE);
		createEAttribute(resourceDemandEClass, RESOURCE_DEMAND__PARAMETRIC_VARIABLE_NAME);

		// Create enums
		processingTypeEEnum = createEEnum(PROCESSING_TYPE);
		applicationTypeEEnum = createEEnum(APPLICATION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		batchConfigurationEClass.getESuperTypes().add(this.getApplicationConfiguration());
		miniBatchConfigurationEClass.getESuperTypes().add(this.getApplicationConfiguration());
		streamConfigurationEClass.getESuperTypes().add(this.getApplicationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationExecutionArchitectureEClass, ApplicationExecutionArchitecture.class, "ApplicationExecutionArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationExecutionArchitecture_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApplicationExecutionArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationExecutionArchitecture_Framework(), ecorePackage.getEString(), "framework", null, 1, 1, ApplicationExecutionArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationExecutionArchitecture_ApplicationConfiguration(), this.getApplicationConfiguration(), null, "applicationConfiguration", null, 1, 1, ApplicationExecutionArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationExecutionArchitecture_TopNode(), this.getExecutionNode(), null, "topNode", null, 1, 1, ApplicationExecutionArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationConfigurationEClass, ApplicationConfiguration.class, "ApplicationConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationConfiguration_DefaultParallelism(), ecorePackage.getEInt(), "defaultParallelism", null, 1, 1, ApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfiguration_Executors(), ecorePackage.getEInt(), "executors", null, 0, 1, ApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfiguration_MemoryPerExecutor(), ecorePackage.getEInt(), "memoryPerExecutor", null, 0, 1, ApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfiguration_TaskSlotsPerExecutor(), ecorePackage.getEInt(), "taskSlotsPerExecutor", null, 0, 1, ApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfiguration_MemoryPerTaskSlot(), ecorePackage.getEInt(), "memoryPerTaskSlot", null, 0, 1, ApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchConfigurationEClass, BatchConfiguration.class, "BatchConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miniBatchConfigurationEClass, MiniBatchConfiguration.class, "MiniBatchConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiniBatchConfiguration_MiniBatchInterval(), ecorePackage.getEInt(), "miniBatchInterval", null, 1, 1, MiniBatchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamConfigurationEClass, StreamConfiguration.class, "StreamConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionNodeEClass, ExecutionNode.class, "ExecutionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_Operations(), this.getOperation(), null, "operations", null, 1, -1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_Parent(), this.getExecutionNode(), null, "parent", null, 0, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_Children(), this.getExecutionNode(), null, "children", null, 0, -1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_EdgesOfChildren(), this.getDirectedEdge(), null, "edgesOfChildren", null, 0, -1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_ResourceProfile(), this.getResourceProfile(), null, "resourceProfile", null, 0, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionNode_Parallelism(), ecorePackage.getEInt(), "parallelism", null, 1, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionNode_StartingNode(), ecorePackage.getEBoolean(), "startingNode", "false", 1, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionNode_Spout(), ecorePackage.getEBoolean(), "spout", null, 1, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionNode_DataInput(), this.getDataInput(), null, "dataInput", null, 0, 1, ExecutionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataInputEClass, DataInput.class, "DataInput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedEdgeEClass, DirectedEdge.class, "DirectedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedEdge_Tail(), this.getExecutionNode(), null, "tail", null, 1, 1, DirectedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedEdge_Head(), this.getExecutionNode(), null, "head", null, 1, 1, DirectedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedEdge_DataTransmissionFactor(), ecorePackage.getEDouble(), "dataTransmissionFactor", null, 1, 1, DirectedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceProfileEClass, ResourceProfile.class, "ResourceProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceProfile_ResourceDemands(), this.getResourceDemand(), null, "resourceDemands", null, 1, -1, ResourceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDemandEClass, ResourceDemand.class, "ResourceDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceDemand_ProcessingType(), ecorePackage.getEString(), "processingType", "", 1, 1, ResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDemand_RandomVariable(), ecorePackage.getEString(), "randomVariable", null, 1, 1, ResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDemand_ParametricVariableName(), ecorePackage.getEString(), "parametricVariableName", null, 0, 1, ResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(processingTypeEEnum, ProcessingType.class, "ProcessingType");
		addEEnumLiteral(processingTypeEEnum, ProcessingType.CPU);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.DRIVE_READ);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.DRIVE_WRITE);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.MEMORY_ALLOCATED);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.DELAY);

		initEEnum(applicationTypeEEnum, ApplicationType.class, "ApplicationType");
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.BATCH);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.MINI_BATCH);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.STREAM);

		// Create resource
		createResource(eNS_URI);
	}

} //ApplicationDSLPackageImpl

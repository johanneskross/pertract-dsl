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
package org.fortiss.pmwt.pertract.dsl.model.resources.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification;
import org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel;
import org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceRole;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit;
import org.fortiss.pmwt.pertract.dsl.model.resources.SchedulingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDSLPackageImpl extends EPackageImpl implements ResourceDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driveProcessingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryProcessingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingPolicyEEnum = null;

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
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceDSLPackageImpl() {
		super(eNS_URI, ResourceDSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourceDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceDSLPackage init() {
		if (isInited) return (ResourceDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourceDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourceDSLPackageImpl theResourceDSLPackage = registeredResourceDSLPackage instanceof ResourceDSLPackageImpl ? (ResourceDSLPackageImpl)registeredResourceDSLPackage : new ResourceDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theResourceDSLPackage.createPackageContents();

		// Initialize created meta-data
		theResourceDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceDSLPackage.eNS_URI, theResourceDSLPackage);
		return theResourceDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceArchitecture() {
		return resourceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceArchitecture_Name() {
		return (EAttribute)resourceArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceArchitecture_NetworkChannel() {
		return (EReference)resourceArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceArchitecture_ResourceNodes() {
		return (EReference)resourceArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkChannel() {
		return networkChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkChannel_Bandwidth() {
		return (EAttribute)networkChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkChannel_Latency() {
		return (EAttribute)networkChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceNode() {
		return resourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceNode_Name() {
		return (EAttribute)resourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceNode_ProcessingResourceUnit() {
		return (EReference)resourceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceNode_DriveProcessingUnit() {
		return (EReference)resourceNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceNode_MemoryProcessingUnit() {
		return (EReference)resourceNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceNode_ClusterSpecification() {
		return (EReference)resourceNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceUnit() {
		return resourceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourceUnit() {
		return processingResourceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceUnit_Replications() {
		return (EAttribute)processingResourceUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceUnit_ProcessingRate() {
		return (EAttribute)processingResourceUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriveProcessingUnit() {
		return driveProcessingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriveProcessingUnit_Replications() {
		return (EAttribute)driveProcessingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriveProcessingUnit_ReadRate() {
		return (EAttribute)driveProcessingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriveProcessingUnit_WriteRate() {
		return (EAttribute)driveProcessingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryProcessingUnit() {
		return memoryProcessingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryProcessingUnit_Capacity() {
		return (EAttribute)memoryProcessingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterSpecification() {
		return clusterSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusterSpecification_ResourceRole() {
		return (EAttribute)clusterSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusterSpecification_SchedulingPolicy() {
		return (EAttribute)clusterSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceRole() {
		return resourceRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingPolicy() {
		return schedulingPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDSLFactory getResourceDSLFactory() {
		return (ResourceDSLFactory)getEFactoryInstance();
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
		resourceArchitectureEClass = createEClass(RESOURCE_ARCHITECTURE);
		createEAttribute(resourceArchitectureEClass, RESOURCE_ARCHITECTURE__NAME);
		createEReference(resourceArchitectureEClass, RESOURCE_ARCHITECTURE__NETWORK_CHANNEL);
		createEReference(resourceArchitectureEClass, RESOURCE_ARCHITECTURE__RESOURCE_NODES);

		networkChannelEClass = createEClass(NETWORK_CHANNEL);
		createEAttribute(networkChannelEClass, NETWORK_CHANNEL__BANDWIDTH);
		createEAttribute(networkChannelEClass, NETWORK_CHANNEL__LATENCY);

		resourceNodeEClass = createEClass(RESOURCE_NODE);
		createEAttribute(resourceNodeEClass, RESOURCE_NODE__NAME);
		createEReference(resourceNodeEClass, RESOURCE_NODE__PROCESSING_RESOURCE_UNIT);
		createEReference(resourceNodeEClass, RESOURCE_NODE__DRIVE_PROCESSING_UNIT);
		createEReference(resourceNodeEClass, RESOURCE_NODE__MEMORY_PROCESSING_UNIT);
		createEReference(resourceNodeEClass, RESOURCE_NODE__CLUSTER_SPECIFICATION);

		resourceUnitEClass = createEClass(RESOURCE_UNIT);

		processingResourceUnitEClass = createEClass(PROCESSING_RESOURCE_UNIT);
		createEAttribute(processingResourceUnitEClass, PROCESSING_RESOURCE_UNIT__REPLICATIONS);
		createEAttribute(processingResourceUnitEClass, PROCESSING_RESOURCE_UNIT__PROCESSING_RATE);

		driveProcessingUnitEClass = createEClass(DRIVE_PROCESSING_UNIT);
		createEAttribute(driveProcessingUnitEClass, DRIVE_PROCESSING_UNIT__REPLICATIONS);
		createEAttribute(driveProcessingUnitEClass, DRIVE_PROCESSING_UNIT__READ_RATE);
		createEAttribute(driveProcessingUnitEClass, DRIVE_PROCESSING_UNIT__WRITE_RATE);

		memoryProcessingUnitEClass = createEClass(MEMORY_PROCESSING_UNIT);
		createEAttribute(memoryProcessingUnitEClass, MEMORY_PROCESSING_UNIT__CAPACITY);

		clusterSpecificationEClass = createEClass(CLUSTER_SPECIFICATION);
		createEAttribute(clusterSpecificationEClass, CLUSTER_SPECIFICATION__RESOURCE_ROLE);
		createEAttribute(clusterSpecificationEClass, CLUSTER_SPECIFICATION__SCHEDULING_POLICY);

		// Create enums
		resourceRoleEEnum = createEEnum(RESOURCE_ROLE);
		schedulingPolicyEEnum = createEEnum(SCHEDULING_POLICY);
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
		processingResourceUnitEClass.getESuperTypes().add(this.getResourceUnit());
		driveProcessingUnitEClass.getESuperTypes().add(this.getResourceUnit());
		memoryProcessingUnitEClass.getESuperTypes().add(this.getResourceUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceArchitectureEClass, ResourceArchitecture.class, "ResourceArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceArchitecture_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceArchitecture_NetworkChannel(), this.getNetworkChannel(), null, "networkChannel", null, 1, 1, ResourceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceArchitecture_ResourceNodes(), this.getResourceNode(), null, "resourceNodes", null, 1, -1, ResourceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkChannelEClass, NetworkChannel.class, "NetworkChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkChannel_Bandwidth(), ecorePackage.getEDouble(), "bandwidth", null, 1, 1, NetworkChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkChannel_Latency(), ecorePackage.getEDouble(), "latency", null, 1, 1, NetworkChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceNodeEClass, ResourceNode.class, "ResourceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceNode_ProcessingResourceUnit(), this.getProcessingResourceUnit(), null, "processingResourceUnit", null, 1, 1, ResourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceNode_DriveProcessingUnit(), this.getDriveProcessingUnit(), null, "driveProcessingUnit", null, 1, 1, ResourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceNode_MemoryProcessingUnit(), this.getMemoryProcessingUnit(), null, "memoryProcessingUnit", null, 1, 1, ResourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceNode_ClusterSpecification(), this.getClusterSpecification(), null, "clusterSpecification", null, 1, 1, ResourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceUnitEClass, ResourceUnit.class, "ResourceUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingResourceUnitEClass, ProcessingResourceUnit.class, "ProcessingResourceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingResourceUnit_Replications(), ecorePackage.getEInt(), "replications", null, 1, 1, ProcessingResourceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResourceUnit_ProcessingRate(), ecorePackage.getEInt(), "processingRate", null, 1, 1, ProcessingResourceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driveProcessingUnitEClass, DriveProcessingUnit.class, "DriveProcessingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriveProcessingUnit_Replications(), ecorePackage.getEInt(), "replications", null, 1, 1, DriveProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriveProcessingUnit_ReadRate(), ecorePackage.getEInt(), "readRate", null, 0, 1, DriveProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriveProcessingUnit_WriteRate(), ecorePackage.getEInt(), "writeRate", null, 1, 1, DriveProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryProcessingUnitEClass, MemoryProcessingUnit.class, "MemoryProcessingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryProcessingUnit_Capacity(), ecorePackage.getELong(), "capacity", null, 1, 1, MemoryProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterSpecificationEClass, ClusterSpecification.class, "ClusterSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClusterSpecification_ResourceRole(), ecorePackage.getEString(), "ResourceRole", null, 1, 1, ClusterSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClusterSpecification_SchedulingPolicy(), ecorePackage.getEString(), "SchedulingPolicy", null, 1, 1, ClusterSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceRoleEEnum, ResourceRole.class, "ResourceRole");
		addEEnumLiteral(resourceRoleEEnum, ResourceRole.MASTER);
		addEEnumLiteral(resourceRoleEEnum, ResourceRole.WORKER);

		initEEnum(schedulingPolicyEEnum, SchedulingPolicy.class, "SchedulingPolicy");
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.ROUND_ROBIN);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourceDSLPackageImpl

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.pmwt.pertract.dsl.model.resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDSLFactoryImpl extends EFactoryImpl implements ResourceDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceDSLFactory init() {
		try {
			ResourceDSLFactory theResourceDSLFactory = (ResourceDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceDSLPackage.eNS_URI);
			if (theResourceDSLFactory != null) {
				return theResourceDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDSLFactoryImpl() {
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
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE: return createResourceArchitecture();
			case ResourceDSLPackage.NETWORK_CHANNEL: return createNetworkChannel();
			case ResourceDSLPackage.RESOURCE_NODE: return createResourceNode();
			case ResourceDSLPackage.PROCESSING_RESOURCE_UNIT: return createProcessingResourceUnit();
			case ResourceDSLPackage.DRIVE_PROCESSING_UNIT: return createDriveProcessingUnit();
			case ResourceDSLPackage.MEMORY_PROCESSING_UNIT: return createMemoryProcessingUnit();
			case ResourceDSLPackage.CLUSTER_SPECIFICATION: return createClusterSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ResourceDSLPackage.RESOURCE_ROLE:
				return createResourceRoleFromString(eDataType, initialValue);
			case ResourceDSLPackage.SCHEDULING_POLICY:
				return createSchedulingPolicyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ResourceDSLPackage.RESOURCE_ROLE:
				return convertResourceRoleToString(eDataType, instanceValue);
			case ResourceDSLPackage.SCHEDULING_POLICY:
				return convertSchedulingPolicyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceArchitecture createResourceArchitecture() {
		ResourceArchitectureImpl resourceArchitecture = new ResourceArchitectureImpl();
		return resourceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkChannel createNetworkChannel() {
		NetworkChannelImpl networkChannel = new NetworkChannelImpl();
		return networkChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceNode createResourceNode() {
		ResourceNodeImpl resourceNode = new ResourceNodeImpl();
		return resourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceUnit createProcessingResourceUnit() {
		ProcessingResourceUnitImpl processingResourceUnit = new ProcessingResourceUnitImpl();
		return processingResourceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveProcessingUnit createDriveProcessingUnit() {
		DriveProcessingUnitImpl driveProcessingUnit = new DriveProcessingUnitImpl();
		return driveProcessingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryProcessingUnit createMemoryProcessingUnit() {
		MemoryProcessingUnitImpl memoryProcessingUnit = new MemoryProcessingUnitImpl();
		return memoryProcessingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterSpecification createClusterSpecification() {
		ClusterSpecificationImpl clusterSpecification = new ClusterSpecificationImpl();
		return clusterSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRoleFromString(EDataType eDataType, String initialValue) {
		ResourceRole result = ResourceRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy createSchedulingPolicyFromString(EDataType eDataType, String initialValue) {
		SchedulingPolicy result = SchedulingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDSLPackage getResourceDSLPackage() {
		return (ResourceDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceDSLPackage getPackage() {
		return ResourceDSLPackage.eINSTANCE;
	}

} //ResourceDSLFactoryImpl

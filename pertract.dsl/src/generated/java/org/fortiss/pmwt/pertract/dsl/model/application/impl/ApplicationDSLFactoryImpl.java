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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.pmwt.pertract.dsl.model.application.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationDSLFactoryImpl extends EFactoryImpl implements ApplicationDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationDSLFactory init() {
		try {
			ApplicationDSLFactory theApplicationDSLFactory = (ApplicationDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationDSLPackage.eNS_URI);
			if (theApplicationDSLFactory != null) {
				return theApplicationDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDSLFactoryImpl() {
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
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE: return createApplicationExecutionArchitecture();
			case ApplicationDSLPackage.BATCH_CONFIGURATION: return createBatchConfiguration();
			case ApplicationDSLPackage.MINI_BATCH_CONFIGURATION: return createMiniBatchConfiguration();
			case ApplicationDSLPackage.STREAM_CONFIGURATION: return createStreamConfiguration();
			case ApplicationDSLPackage.EXECUTION_NODE: return createExecutionNode();
			case ApplicationDSLPackage.OPERATION: return createOperation();
			case ApplicationDSLPackage.DIRECTED_EDGE: return createDirectedEdge();
			case ApplicationDSLPackage.RESOURCE_PROFILE: return createResourceProfile();
			case ApplicationDSLPackage.RESOURCE_DEMAND: return createResourceDemand();
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
			case ApplicationDSLPackage.PROCESSING_TYPE:
				return createProcessingTypeFromString(eDataType, initialValue);
			case ApplicationDSLPackage.APPLICATION_TYPE:
				return createApplicationTypeFromString(eDataType, initialValue);
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
			case ApplicationDSLPackage.PROCESSING_TYPE:
				return convertProcessingTypeToString(eDataType, instanceValue);
			case ApplicationDSLPackage.APPLICATION_TYPE:
				return convertApplicationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationExecutionArchitecture createApplicationExecutionArchitecture() {
		ApplicationExecutionArchitectureImpl applicationExecutionArchitecture = new ApplicationExecutionArchitectureImpl();
		return applicationExecutionArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatchConfiguration createBatchConfiguration() {
		BatchConfigurationImpl batchConfiguration = new BatchConfigurationImpl();
		return batchConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniBatchConfiguration createMiniBatchConfiguration() {
		MiniBatchConfigurationImpl miniBatchConfiguration = new MiniBatchConfigurationImpl();
		return miniBatchConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamConfiguration createStreamConfiguration() {
		StreamConfigurationImpl streamConfiguration = new StreamConfigurationImpl();
		return streamConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode createExecutionNode() {
		ExecutionNodeImpl executionNode = new ExecutionNodeImpl();
		return executionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedEdge createDirectedEdge() {
		DirectedEdgeImpl directedEdge = new DirectedEdgeImpl();
		return directedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProfile createResourceProfile() {
		ResourceProfileImpl resourceProfile = new ResourceProfileImpl();
		return resourceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemand createResourceDemand() {
		ResourceDemandImpl resourceDemand = new ResourceDemandImpl();
		return resourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType createProcessingTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingType result = ProcessingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationTypeFromString(EDataType eDataType, String initialValue) {
		ApplicationType result = ApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDSLPackage getApplicationDSLPackage() {
		return (ApplicationDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationDSLPackage getPackage() {
		return ApplicationDSLPackage.eINSTANCE;
	}

} //ApplicationDSLFactoryImpl

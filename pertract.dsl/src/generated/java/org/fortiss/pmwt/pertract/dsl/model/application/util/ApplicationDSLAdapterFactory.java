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
package org.fortiss.pmwt.pertract.dsl.model.application.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.pmwt.pertract.dsl.model.application.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage
 * @generated
 */
public class ApplicationDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApplicationDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDSLSwitch<Adapter> modelSwitch =
		new ApplicationDSLSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationExecutionArchitecture(ApplicationExecutionArchitecture object) {
				return createApplicationExecutionArchitectureAdapter();
			}
			@Override
			public Adapter caseApplicationConfiguration(ApplicationConfiguration object) {
				return createApplicationConfigurationAdapter();
			}
			@Override
			public Adapter caseBatchConfiguration(BatchConfiguration object) {
				return createBatchConfigurationAdapter();
			}
			@Override
			public Adapter caseMiniBatchConfiguration(MiniBatchConfiguration object) {
				return createMiniBatchConfigurationAdapter();
			}
			@Override
			public Adapter caseStreamConfiguration(StreamConfiguration object) {
				return createStreamConfigurationAdapter();
			}
			@Override
			public Adapter caseExecutionNode(ExecutionNode object) {
				return createExecutionNodeAdapter();
			}
			@Override
			public Adapter caseDataInput(DataInput object) {
				return createDataInputAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseDirectedEdge(DirectedEdge object) {
				return createDirectedEdgeAdapter();
			}
			@Override
			public Adapter caseResourceProfile(ResourceProfile object) {
				return createResourceProfileAdapter();
			}
			@Override
			public Adapter caseResourceDemand(ResourceDemand object) {
				return createResourceDemandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture <em>Application Execution Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture
	 * @generated
	 */
	public Adapter createApplicationExecutionArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration <em>Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration
	 * @generated
	 */
	public Adapter createApplicationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.BatchConfiguration <em>Batch Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.BatchConfiguration
	 * @generated
	 */
	public Adapter createBatchConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration <em>Mini Batch Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration
	 * @generated
	 */
	public Adapter createMiniBatchConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.StreamConfiguration <em>Stream Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.StreamConfiguration
	 * @generated
	 */
	public Adapter createStreamConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode <em>Execution Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode
	 * @generated
	 */
	public Adapter createExecutionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DataInput
	 * @generated
	 */
	public Adapter createDataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge <em>Directed Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge
	 * @generated
	 */
	public Adapter createDirectedEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile <em>Resource Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile
	 * @generated
	 */
	public Adapter createResourceProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand <em>Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand
	 * @generated
	 */
	public Adapter createResourceDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationDSLAdapterFactory

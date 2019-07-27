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
package org.fortiss.pmwt.pertract.dsl.model.resources.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.pmwt.pertract.dsl.model.resources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage
 * @generated
 */
public class ResourceDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourceDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourceDSLPackage.eINSTANCE;
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
	protected ResourceDSLSwitch<Adapter> modelSwitch =
		new ResourceDSLSwitch<Adapter>() {
			@Override
			public Adapter caseResourceArchitecture(ResourceArchitecture object) {
				return createResourceArchitectureAdapter();
			}
			@Override
			public Adapter caseNetworkChannel(NetworkChannel object) {
				return createNetworkChannelAdapter();
			}
			@Override
			public Adapter caseResourceNode(ResourceNode object) {
				return createResourceNodeAdapter();
			}
			@Override
			public Adapter caseResourceUnit(ResourceUnit object) {
				return createResourceUnitAdapter();
			}
			@Override
			public Adapter caseProcessingResourceUnit(ProcessingResourceUnit object) {
				return createProcessingResourceUnitAdapter();
			}
			@Override
			public Adapter caseDriveProcessingUnit(DriveProcessingUnit object) {
				return createDriveProcessingUnitAdapter();
			}
			@Override
			public Adapter caseMemoryProcessingUnit(MemoryProcessingUnit object) {
				return createMemoryProcessingUnitAdapter();
			}
			@Override
			public Adapter caseClusterSpecification(ClusterSpecification object) {
				return createClusterSpecificationAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture <em>Resource Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture
	 * @generated
	 */
	public Adapter createResourceArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel <em>Network Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel
	 * @generated
	 */
	public Adapter createNetworkChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode <em>Resource Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode
	 * @generated
	 */
	public Adapter createResourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit <em>Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceUnit
	 * @generated
	 */
	public Adapter createResourceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit <em>Processing Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit
	 * @generated
	 */
	public Adapter createProcessingResourceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit <em>Drive Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit
	 * @generated
	 */
	public Adapter createDriveProcessingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit <em>Memory Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.MemoryProcessingUnit
	 * @generated
	 */
	public Adapter createMemoryProcessingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification <em>Cluster Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification
	 * @generated
	 */
	public Adapter createClusterSpecificationAdapter() {
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

} //ResourceDSLAdapterFactory

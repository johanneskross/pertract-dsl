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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage
 * @generated
 */
public interface ResourceDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceDSLFactory eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Architecture</em>'.
	 * @generated
	 */
	ResourceArchitecture createResourceArchitecture();

	/**
	 * Returns a new object of class '<em>Network Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Channel</em>'.
	 * @generated
	 */
	NetworkChannel createNetworkChannel();

	/**
	 * Returns a new object of class '<em>Resource Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Node</em>'.
	 * @generated
	 */
	ResourceNode createResourceNode();

	/**
	 * Returns a new object of class '<em>Processing Resource Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Unit</em>'.
	 * @generated
	 */
	ProcessingResourceUnit createProcessingResourceUnit();

	/**
	 * Returns a new object of class '<em>Drive Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Processing Unit</em>'.
	 * @generated
	 */
	DriveProcessingUnit createDriveProcessingUnit();

	/**
	 * Returns a new object of class '<em>Memory Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Processing Unit</em>'.
	 * @generated
	 */
	MemoryProcessingUnit createMemoryProcessingUnit();

	/**
	 * Returns a new object of class '<em>Cluster Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Specification</em>'.
	 * @generated
	 */
	ClusterSpecification createClusterSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceDSLPackage getResourceDSLPackage();

} //ResourceDSLFactory

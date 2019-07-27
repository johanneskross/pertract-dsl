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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage
 * @generated
 */
public interface ApplicationDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationDSLFactory eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Execution Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Execution Architecture</em>'.
	 * @generated
	 */
	ApplicationExecutionArchitecture createApplicationExecutionArchitecture();

	/**
	 * Returns a new object of class '<em>Batch Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batch Configuration</em>'.
	 * @generated
	 */
	BatchConfiguration createBatchConfiguration();

	/**
	 * Returns a new object of class '<em>Mini Batch Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mini Batch Configuration</em>'.
	 * @generated
	 */
	MiniBatchConfiguration createMiniBatchConfiguration();

	/**
	 * Returns a new object of class '<em>Stream Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Configuration</em>'.
	 * @generated
	 */
	StreamConfiguration createStreamConfiguration();

	/**
	 * Returns a new object of class '<em>Execution Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Node</em>'.
	 * @generated
	 */
	ExecutionNode createExecutionNode();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Directed Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Edge</em>'.
	 * @generated
	 */
	DirectedEdge createDirectedEdge();

	/**
	 * Returns a new object of class '<em>Resource Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Profile</em>'.
	 * @generated
	 */
	ResourceProfile createResourceProfile();

	/**
	 * Returns a new object of class '<em>Resource Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Demand</em>'.
	 * @generated
	 */
	ResourceDemand createResourceDemand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationDSLPackage getApplicationDSLPackage();

} //ApplicationDSLFactory

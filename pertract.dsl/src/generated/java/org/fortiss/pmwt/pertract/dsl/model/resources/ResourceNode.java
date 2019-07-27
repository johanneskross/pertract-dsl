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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getProcessingResourceUnit <em>Processing Resource Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getDriveProcessingUnit <em>Drive Processing Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getMemoryProcessingUnit <em>Memory Processing Unit</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getClusterSpecification <em>Cluster Specification</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode()
 * @model
 * @generated
 */
public interface ResourceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processing Resource Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Resource Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Unit</em>' containment reference.
	 * @see #setProcessingResourceUnit(ProcessingResourceUnit)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode_ProcessingResourceUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProcessingResourceUnit getProcessingResourceUnit();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getProcessingResourceUnit <em>Processing Resource Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Unit</em>' containment reference.
	 * @see #getProcessingResourceUnit()
	 * @generated
	 */
	void setProcessingResourceUnit(ProcessingResourceUnit value);

	/**
	 * Returns the value of the '<em><b>Drive Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Processing Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Processing Unit</em>' containment reference.
	 * @see #setDriveProcessingUnit(DriveProcessingUnit)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode_DriveProcessingUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DriveProcessingUnit getDriveProcessingUnit();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getDriveProcessingUnit <em>Drive Processing Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Processing Unit</em>' containment reference.
	 * @see #getDriveProcessingUnit()
	 * @generated
	 */
	void setDriveProcessingUnit(DriveProcessingUnit value);

	/**
	 * Returns the value of the '<em><b>Memory Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Processing Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Processing Unit</em>' containment reference.
	 * @see #setMemoryProcessingUnit(MemoryProcessingUnit)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode_MemoryProcessingUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MemoryProcessingUnit getMemoryProcessingUnit();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getMemoryProcessingUnit <em>Memory Processing Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Processing Unit</em>' containment reference.
	 * @see #getMemoryProcessingUnit()
	 * @generated
	 */
	void setMemoryProcessingUnit(MemoryProcessingUnit value);

	/**
	 * Returns the value of the '<em><b>Cluster Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Specification</em>' containment reference.
	 * @see #setClusterSpecification(ClusterSpecification)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceNode_ClusterSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClusterSpecification getClusterSpecification();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode#getClusterSpecification <em>Cluster Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Specification</em>' containment reference.
	 * @see #getClusterSpecification()
	 * @generated
	 */
	void setClusterSpecification(ClusterSpecification value);

} // ResourceNode

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
 * A representation of the model object '<em><b>Cluster Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getClusterSpecification()
 * @model
 * @generated
 */
public interface ClusterSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Role</em>' attribute.
	 * @see #setResourceRole(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getClusterSpecification_ResourceRole()
	 * @model required="true"
	 * @generated
	 */
	String getResourceRole();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getResourceRole <em>Resource Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Role</em>' attribute.
	 * @see #getResourceRole()
	 * @generated
	 */
	void setResourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see #setSchedulingPolicy(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getClusterSpecification_SchedulingPolicy()
	 * @model required="true"
	 * @generated
	 */
	String getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ClusterSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(String value);

} // ClusterSpecification

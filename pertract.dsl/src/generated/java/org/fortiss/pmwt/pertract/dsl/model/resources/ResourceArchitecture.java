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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getNetworkChannel <em>Network Channel</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getResourceNodes <em>Resource Nodes</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceArchitecture()
 * @model
 * @generated
 */
public interface ResourceArchitecture extends EObject {
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
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceArchitecture_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Network Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Channel</em>' containment reference.
	 * @see #setNetworkChannel(NetworkChannel)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceArchitecture_NetworkChannel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NetworkChannel getNetworkChannel();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture#getNetworkChannel <em>Network Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Channel</em>' containment reference.
	 * @see #getNetworkChannel()
	 * @generated
	 */
	void setNetworkChannel(NetworkChannel value);

	/**
	 * Returns the value of the '<em><b>Resource Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Nodes</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getResourceArchitecture_ResourceNodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceNode> getResourceNodes();

} // ResourceArchitecture

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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Execution Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getFramework <em>Framework</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getApplicationConfiguration <em>Application Configuration</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getTopNode <em>Top Node</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationExecutionArchitecture()
 * @model
 * @generated
 */
public interface ApplicationExecutionArchitecture extends EObject {
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
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationExecutionArchitecture_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' attribute.
	 * @see #setFramework(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationExecutionArchitecture_Framework()
	 * @model required="true"
	 * @generated
	 */
	String getFramework();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getFramework <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' attribute.
	 * @see #getFramework()
	 * @generated
	 */
	void setFramework(String value);

	/**
	 * Returns the value of the '<em><b>Application Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Configuration</em>' containment reference.
	 * @see #setApplicationConfiguration(ApplicationConfiguration)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationExecutionArchitecture_ApplicationConfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ApplicationConfiguration getApplicationConfiguration();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getApplicationConfiguration <em>Application Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Configuration</em>' containment reference.
	 * @see #getApplicationConfiguration()
	 * @generated
	 */
	void setApplicationConfiguration(ApplicationConfiguration value);

	/**
	 * Returns the value of the '<em><b>Top Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Node</em>' containment reference.
	 * @see #setTopNode(ExecutionNode)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationExecutionArchitecture_TopNode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionNode getTopNode();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture#getTopNode <em>Top Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Node</em>' containment reference.
	 * @see #getTopNode()
	 * @generated
	 */
	void setTopNode(ExecutionNode value);

} // ApplicationExecutionArchitecture

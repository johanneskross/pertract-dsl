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
 * A representation of the model object '<em><b>Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getProcessingType <em>Processing Type</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getRandomVariable <em>Random Variable</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getParametricVariableName <em>Parametric Variable Name</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceDemand()
 * @model
 * @generated
 */
public interface ResourceDemand extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Type</em>' attribute.
	 * @see #setProcessingType(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceDemand_ProcessingType()
	 * @model default="" required="true"
	 * @generated
	 */
	String getProcessingType();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getProcessingType <em>Processing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Type</em>' attribute.
	 * @see #getProcessingType()
	 * @generated
	 */
	void setProcessingType(String value);

	/**
	 * Returns the value of the '<em><b>Random Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Variable</em>' attribute.
	 * @see #setRandomVariable(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceDemand_RandomVariable()
	 * @model required="true"
	 * @generated
	 */
	String getRandomVariable();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getRandomVariable <em>Random Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Variable</em>' attribute.
	 * @see #getRandomVariable()
	 * @generated
	 */
	void setRandomVariable(String value);

	/**
	 * Returns the value of the '<em><b>Parametric Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametric Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametric Variable Name</em>' attribute.
	 * @see #setParametricVariableName(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceDemand_ParametricVariableName()
	 * @model
	 * @generated
	 */
	String getParametricVariableName();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand#getParametricVariableName <em>Parametric Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametric Variable Name</em>' attribute.
	 * @see #getParametricVariableName()
	 * @generated
	 */
	void setParametricVariableName(String value);

} // ResourceDemand

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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getReplications <em>Replications</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getProcessingRate <em>Processing Rate</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getProcessingResourceUnit()
 * @model
 * @generated
 */
public interface ProcessingResourceUnit extends ResourceUnit {
	/**
	 * Returns the value of the '<em><b>Replications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replications</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replications</em>' attribute.
	 * @see #setReplications(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getProcessingResourceUnit_Replications()
	 * @model required="true"
	 * @generated
	 */
	int getReplications();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getReplications <em>Replications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replications</em>' attribute.
	 * @see #getReplications()
	 * @generated
	 */
	void setReplications(int value);

	/**
	 * Returns the value of the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Rate</em>' attribute.
	 * @see #setProcessingRate(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getProcessingResourceUnit_ProcessingRate()
	 * @model required="true"
	 * @generated
	 */
	int getProcessingRate();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.ProcessingResourceUnit#getProcessingRate <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Rate</em>' attribute.
	 * @see #getProcessingRate()
	 * @generated
	 */
	void setProcessingRate(int value);

} // ProcessingResourceUnit

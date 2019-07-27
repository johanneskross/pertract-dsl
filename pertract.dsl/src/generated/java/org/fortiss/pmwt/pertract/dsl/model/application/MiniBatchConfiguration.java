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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mini Batch Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration#getMiniBatchInterval <em>Mini Batch Interval</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getMiniBatchConfiguration()
 * @model
 * @generated
 */
public interface MiniBatchConfiguration extends ApplicationConfiguration {
	/**
	 * Returns the value of the '<em><b>Mini Batch Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mini Batch Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mini Batch Interval</em>' attribute.
	 * @see #setMiniBatchInterval(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getMiniBatchConfiguration_MiniBatchInterval()
	 * @model required="true"
	 * @generated
	 */
	int getMiniBatchInterval();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.MiniBatchConfiguration#getMiniBatchInterval <em>Mini Batch Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mini Batch Interval</em>' attribute.
	 * @see #getMiniBatchInterval()
	 * @generated
	 */
	void setMiniBatchInterval(int value);

} // MiniBatchConfiguration

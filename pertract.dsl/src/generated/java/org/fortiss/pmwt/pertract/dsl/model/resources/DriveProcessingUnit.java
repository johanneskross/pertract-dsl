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
 * A representation of the model object '<em><b>Drive Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReplications <em>Replications</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReadRate <em>Read Rate</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getWriteRate <em>Write Rate</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getDriveProcessingUnit()
 * @model
 * @generated
 */
public interface DriveProcessingUnit extends ResourceUnit {
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
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getDriveProcessingUnit_Replications()
	 * @model required="true"
	 * @generated
	 */
	int getReplications();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReplications <em>Replications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replications</em>' attribute.
	 * @see #getReplications()
	 * @generated
	 */
	void setReplications(int value);

	/**
	 * Returns the value of the '<em><b>Read Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Rate</em>' attribute.
	 * @see #setReadRate(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getDriveProcessingUnit_ReadRate()
	 * @model
	 * @generated
	 */
	int getReadRate();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getReadRate <em>Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Rate</em>' attribute.
	 * @see #getReadRate()
	 * @generated
	 */
	void setReadRate(int value);

	/**
	 * Returns the value of the '<em><b>Write Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Rate</em>' attribute.
	 * @see #setWriteRate(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getDriveProcessingUnit_WriteRate()
	 * @model required="true"
	 * @generated
	 */
	int getWriteRate();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.DriveProcessingUnit#getWriteRate <em>Write Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Rate</em>' attribute.
	 * @see #getWriteRate()
	 * @generated
	 */
	void setWriteRate(int value);

} // DriveProcessingUnit

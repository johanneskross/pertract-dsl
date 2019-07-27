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
package org.fortiss.pmwt.pertract.dsl.model.dataworkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getSize <em>Size</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getRecords <em>Records</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileSpecification()
 * @model
 * @generated
 */
public interface FileSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileSpecification_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' attribute.
	 * @see #setRecords(long)
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileSpecification_Records()
	 * @model
	 * @generated
	 */
	long getRecords();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification#getRecords <em>Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Records</em>' attribute.
	 * @see #getRecords()
	 * @generated
	 */
	void setRecords(long value);

} // FileSpecification

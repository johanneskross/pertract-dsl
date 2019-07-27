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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getFiles <em>Files</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getPartitionSize <em>Partition Size</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileDataModel()
 * @model
 * @generated
 */
public interface FileDataModel extends DataModel {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileDataModel_Files()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FileSpecification> getFiles();

	/**
	 * Returns the value of the '<em><b>Partition Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Size</em>' attribute.
	 * @see #setPartitionSize(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getFileDataModel_PartitionSize()
	 * @model required="true"
	 * @generated
	 */
	int getPartitionSize();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.FileDataModel#getPartitionSize <em>Partition Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Size</em>' attribute.
	 * @see #getPartitionSize()
	 * @generated
	 */
	void setPartitionSize(int value);

} // FileDataModel

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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel#getMeanRecordSize <em>Mean Record Size</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getRecordDataModel()
 * @model
 * @generated
 */
public interface RecordDataModel extends DataModel {
	/**
	 * Returns the value of the '<em><b>Mean Record Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Record Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Record Size</em>' attribute.
	 * @see #setMeanRecordSize(long)
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getRecordDataModel_MeanRecordSize()
	 * @model
	 * @generated
	 */
	long getMeanRecordSize();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.RecordDataModel#getMeanRecordSize <em>Mean Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Record Size</em>' attribute.
	 * @see #getMeanRecordSize()
	 * @generated
	 */
	void setMeanRecordSize(long value);

} // RecordDataModel

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
 * A representation of the model object '<em><b>Open Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource#getArrivalRate <em>Arrival Rate</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getOpenDataSource()
 * @model
 * @generated
 */
public interface OpenDataSource extends DataSource {
	/**
	 * Returns the value of the '<em><b>Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Rate</em>' attribute.
	 * @see #setArrivalRate(double)
	 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage#getOpenDataSource_ArrivalRate()
	 * @model
	 * @generated
	 */
	double getArrivalRate();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.dataworkload.OpenDataSource#getArrivalRate <em>Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Rate</em>' attribute.
	 * @see #getArrivalRate()
	 * @generated
	 */
	void setArrivalRate(double value);

} // OpenDataSource

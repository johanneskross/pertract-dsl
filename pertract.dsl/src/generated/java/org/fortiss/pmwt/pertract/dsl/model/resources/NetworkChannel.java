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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getNetworkChannel()
 * @model
 * @generated
 */
public interface NetworkChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(double)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getNetworkChannel_Bandwidth()
	 * @model required="true"
	 * @generated
	 */
	double getBandwidth();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage#getNetworkChannel_Latency()
	 * @model required="true"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

} // NetworkChannel

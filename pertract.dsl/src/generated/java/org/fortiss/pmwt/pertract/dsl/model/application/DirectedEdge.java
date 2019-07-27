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
 * A representation of the model object '<em><b>Directed Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getTail <em>Tail</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getHead <em>Head</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getDataTransmissionFactor <em>Data Transmission Factor</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getDirectedEdge()
 * @model
 * @generated
 */
public interface DirectedEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Tail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' reference.
	 * @see #setTail(ExecutionNode)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getDirectedEdge_Tail()
	 * @model required="true"
	 * @generated
	 */
	ExecutionNode getTail();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getTail <em>Tail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(ExecutionNode value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(ExecutionNode)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getDirectedEdge_Head()
	 * @model required="true"
	 * @generated
	 */
	ExecutionNode getHead();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(ExecutionNode value);

	/**
	 * Returns the value of the '<em><b>Data Transmission Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Transmission Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transmission Factor</em>' attribute.
	 * @see #setDataTransmissionFactor(double)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getDirectedEdge_DataTransmissionFactor()
	 * @model required="true"
	 * @generated
	 */
	double getDataTransmissionFactor();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge#getDataTransmissionFactor <em>Data Transmission Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transmission Factor</em>' attribute.
	 * @see #getDataTransmissionFactor()
	 * @generated
	 */
	void setDataTransmissionFactor(double value);

} // DirectedEdge

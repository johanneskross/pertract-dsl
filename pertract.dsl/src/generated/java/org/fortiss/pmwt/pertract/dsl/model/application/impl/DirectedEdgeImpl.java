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
package org.fortiss.pmwt.pertract.dsl.model.application.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge;
import org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl#getTail <em>Tail</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.DirectedEdgeImpl#getDataTransmissionFactor <em>Data Transmission Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedEdgeImpl extends MinimalEObjectImpl.Container implements DirectedEdge {
	/**
	 * The cached value of the '{@link #getTail() <em>Tail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTail()
	 * @generated
	 * @ordered
	 */
	protected ExecutionNode tail;

	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected ExecutionNode head;

	/**
	 * The default value of the '{@link #getDataTransmissionFactor() <em>Data Transmission Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransmissionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DATA_TRANSMISSION_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDataTransmissionFactor() <em>Data Transmission Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransmissionFactor()
	 * @generated
	 * @ordered
	 */
	protected double dataTransmissionFactor = DATA_TRANSMISSION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.DIRECTED_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode getTail() {
		if (tail != null && tail.eIsProxy()) {
			InternalEObject oldTail = (InternalEObject)tail;
			tail = (ExecutionNode)eResolveProxy(oldTail);
			if (tail != oldTail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationDSLPackage.DIRECTED_EDGE__TAIL, oldTail, tail));
			}
		}
		return tail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode basicGetTail() {
		return tail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTail(ExecutionNode newTail) {
		ExecutionNode oldTail = tail;
		tail = newTail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.DIRECTED_EDGE__TAIL, oldTail, tail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode getHead() {
		if (head != null && head.eIsProxy()) {
			InternalEObject oldHead = (InternalEObject)head;
			head = (ExecutionNode)eResolveProxy(oldHead);
			if (head != oldHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationDSLPackage.DIRECTED_EDGE__HEAD, oldHead, head));
			}
		}
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode basicGetHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(ExecutionNode newHead) {
		ExecutionNode oldHead = head;
		head = newHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.DIRECTED_EDGE__HEAD, oldHead, head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDataTransmissionFactor() {
		return dataTransmissionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTransmissionFactor(double newDataTransmissionFactor) {
		double oldDataTransmissionFactor = dataTransmissionFactor;
		dataTransmissionFactor = newDataTransmissionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR, oldDataTransmissionFactor, dataTransmissionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationDSLPackage.DIRECTED_EDGE__TAIL:
				if (resolve) return getTail();
				return basicGetTail();
			case ApplicationDSLPackage.DIRECTED_EDGE__HEAD:
				if (resolve) return getHead();
				return basicGetHead();
			case ApplicationDSLPackage.DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR:
				return getDataTransmissionFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationDSLPackage.DIRECTED_EDGE__TAIL:
				setTail((ExecutionNode)newValue);
				return;
			case ApplicationDSLPackage.DIRECTED_EDGE__HEAD:
				setHead((ExecutionNode)newValue);
				return;
			case ApplicationDSLPackage.DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR:
				setDataTransmissionFactor((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApplicationDSLPackage.DIRECTED_EDGE__TAIL:
				setTail((ExecutionNode)null);
				return;
			case ApplicationDSLPackage.DIRECTED_EDGE__HEAD:
				setHead((ExecutionNode)null);
				return;
			case ApplicationDSLPackage.DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR:
				setDataTransmissionFactor(DATA_TRANSMISSION_FACTOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApplicationDSLPackage.DIRECTED_EDGE__TAIL:
				return tail != null;
			case ApplicationDSLPackage.DIRECTED_EDGE__HEAD:
				return head != null;
			case ApplicationDSLPackage.DIRECTED_EDGE__DATA_TRANSMISSION_FACTOR:
				return dataTransmissionFactor != DATA_TRANSMISSION_FACTOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataTransmissionFactor: ");
		result.append(dataTransmissionFactor);
		result.append(')');
		return result.toString();
	}

} //DirectedEdgeImpl

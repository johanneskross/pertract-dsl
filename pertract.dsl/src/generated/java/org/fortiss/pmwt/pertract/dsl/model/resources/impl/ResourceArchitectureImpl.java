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
package org.fortiss.pmwt.pertract.dsl.model.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.pmwt.pertract.dsl.model.resources.NetworkChannel;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl#getNetworkChannel <em>Network Channel</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.resources.impl.ResourceArchitectureImpl#getResourceNodes <em>Resource Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceArchitectureImpl extends MinimalEObjectImpl.Container implements ResourceArchitecture {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkChannel() <em>Network Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkChannel()
	 * @generated
	 * @ordered
	 */
	protected NetworkChannel networkChannel;

	/**
	 * The cached value of the '{@link #getResourceNodes() <em>Resource Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceNode> resourceNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceDSLPackage.Literals.RESOURCE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkChannel getNetworkChannel() {
		return networkChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkChannel(NetworkChannel newNetworkChannel, NotificationChain msgs) {
		NetworkChannel oldNetworkChannel = networkChannel;
		networkChannel = newNetworkChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL, oldNetworkChannel, newNetworkChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkChannel(NetworkChannel newNetworkChannel) {
		if (newNetworkChannel != networkChannel) {
			NotificationChain msgs = null;
			if (networkChannel != null)
				msgs = ((InternalEObject)networkChannel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL, null, msgs);
			if (newNetworkChannel != null)
				msgs = ((InternalEObject)newNetworkChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL, null, msgs);
			msgs = basicSetNetworkChannel(newNetworkChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL, newNetworkChannel, newNetworkChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceNode> getResourceNodes() {
		if (resourceNodes == null) {
			resourceNodes = new EObjectContainmentEList<ResourceNode>(ResourceNode.class, this, ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES);
		}
		return resourceNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL:
				return basicSetNetworkChannel(null, msgs);
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES:
				return ((InternalEList<?>)getResourceNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NAME:
				return getName();
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL:
				return getNetworkChannel();
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES:
				return getResourceNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL:
				setNetworkChannel((NetworkChannel)newValue);
				return;
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES:
				getResourceNodes().clear();
				getResourceNodes().addAll((Collection<? extends ResourceNode>)newValue);
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
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL:
				setNetworkChannel((NetworkChannel)null);
				return;
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES:
				getResourceNodes().clear();
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
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__NETWORK_CHANNEL:
				return networkChannel != null;
			case ResourceDSLPackage.RESOURCE_ARCHITECTURE__RESOURCE_NODES:
				return resourceNodes != null && !resourceNodes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceArchitectureImpl

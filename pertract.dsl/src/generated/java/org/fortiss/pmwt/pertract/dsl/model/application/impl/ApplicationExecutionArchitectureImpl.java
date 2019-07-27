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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Execution Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl#getFramework <em>Framework</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl#getApplicationConfiguration <em>Application Configuration</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationExecutionArchitectureImpl#getTopNode <em>Top Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationExecutionArchitectureImpl extends MinimalEObjectImpl.Container implements ApplicationExecutionArchitecture {
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
	 * The default value of the '{@link #getFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected String framework = FRAMEWORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationConfiguration() <em>Application Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ApplicationConfiguration applicationConfiguration;

	/**
	 * The cached value of the '{@link #getTopNode() <em>Top Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionNode topNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationExecutionArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.APPLICATION_EXECUTION_ARCHITECTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFramework() {
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramework(String newFramework) {
		String oldFramework = framework;
		framework = newFramework;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK, oldFramework, framework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationConfiguration getApplicationConfiguration() {
		return applicationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationConfiguration(ApplicationConfiguration newApplicationConfiguration, NotificationChain msgs) {
		ApplicationConfiguration oldApplicationConfiguration = applicationConfiguration;
		applicationConfiguration = newApplicationConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION, oldApplicationConfiguration, newApplicationConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationConfiguration(ApplicationConfiguration newApplicationConfiguration) {
		if (newApplicationConfiguration != applicationConfiguration) {
			NotificationChain msgs = null;
			if (applicationConfiguration != null)
				msgs = ((InternalEObject)applicationConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION, null, msgs);
			if (newApplicationConfiguration != null)
				msgs = ((InternalEObject)newApplicationConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION, null, msgs);
			msgs = basicSetApplicationConfiguration(newApplicationConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION, newApplicationConfiguration, newApplicationConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode getTopNode() {
		return topNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopNode(ExecutionNode newTopNode, NotificationChain msgs) {
		ExecutionNode oldTopNode = topNode;
		topNode = newTopNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE, oldTopNode, newTopNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopNode(ExecutionNode newTopNode) {
		if (newTopNode != topNode) {
			NotificationChain msgs = null;
			if (topNode != null)
				msgs = ((InternalEObject)topNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE, null, msgs);
			if (newTopNode != null)
				msgs = ((InternalEObject)newTopNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE, null, msgs);
			msgs = basicSetTopNode(newTopNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE, newTopNode, newTopNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION:
				return basicSetApplicationConfiguration(null, msgs);
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE:
				return basicSetTopNode(null, msgs);
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
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__NAME:
				return getName();
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK:
				return getFramework();
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION:
				return getApplicationConfiguration();
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE:
				return getTopNode();
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
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK:
				setFramework((String)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION:
				setApplicationConfiguration((ApplicationConfiguration)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE:
				setTopNode((ExecutionNode)newValue);
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
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK:
				setFramework(FRAMEWORK_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION:
				setApplicationConfiguration((ApplicationConfiguration)null);
				return;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE:
				setTopNode((ExecutionNode)null);
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
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__FRAMEWORK:
				return FRAMEWORK_EDEFAULT == null ? framework != null : !FRAMEWORK_EDEFAULT.equals(framework);
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__APPLICATION_CONFIGURATION:
				return applicationConfiguration != null;
			case ApplicationDSLPackage.APPLICATION_EXECUTION_ARCHITECTURE__TOP_NODE:
				return topNode != null;
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
		result.append(", framework: ");
		result.append(framework);
		result.append(')');
		return result.toString();
	}

} //ApplicationExecutionArchitectureImpl

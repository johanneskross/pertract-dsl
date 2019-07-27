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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl#getDefaultParallelism <em>Default Parallelism</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl#getMemoryPerExecutor <em>Memory Per Executor</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl#getTaskSlotsPerExecutor <em>Task Slots Per Executor</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ApplicationConfigurationImpl#getMemoryPerTaskSlot <em>Memory Per Task Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ApplicationConfigurationImpl extends MinimalEObjectImpl.Container implements ApplicationConfiguration {
	/**
	 * The default value of the '{@link #getDefaultParallelism() <em>Default Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_PARALLELISM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultParallelism() <em>Default Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultParallelism()
	 * @generated
	 * @ordered
	 */
	protected int defaultParallelism = DEFAULT_PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutors() <em>Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutors() <em>Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected int executors = EXECUTORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryPerExecutor() <em>Memory Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPerExecutor()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_PER_EXECUTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryPerExecutor() <em>Memory Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPerExecutor()
	 * @generated
	 * @ordered
	 */
	protected int memoryPerExecutor = MEMORY_PER_EXECUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskSlotsPerExecutor() <em>Task Slots Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSlotsPerExecutor()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_SLOTS_PER_EXECUTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaskSlotsPerExecutor() <em>Task Slots Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSlotsPerExecutor()
	 * @generated
	 * @ordered
	 */
	protected int taskSlotsPerExecutor = TASK_SLOTS_PER_EXECUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryPerTaskSlot() <em>Memory Per Task Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPerTaskSlot()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_PER_TASK_SLOT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryPerTaskSlot() <em>Memory Per Task Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPerTaskSlot()
	 * @generated
	 * @ordered
	 */
	protected int memoryPerTaskSlot = MEMORY_PER_TASK_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.APPLICATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultParallelism() {
		return defaultParallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultParallelism(int newDefaultParallelism) {
		int oldDefaultParallelism = defaultParallelism;
		defaultParallelism = newDefaultParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM, oldDefaultParallelism, defaultParallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutors() {
		return executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutors(int newExecutors) {
		int oldExecutors = executors;
		executors = newExecutors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_CONFIGURATION__EXECUTORS, oldExecutors, executors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryPerExecutor() {
		return memoryPerExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPerExecutor(int newMemoryPerExecutor) {
		int oldMemoryPerExecutor = memoryPerExecutor;
		memoryPerExecutor = newMemoryPerExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR, oldMemoryPerExecutor, memoryPerExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaskSlotsPerExecutor() {
		return taskSlotsPerExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskSlotsPerExecutor(int newTaskSlotsPerExecutor) {
		int oldTaskSlotsPerExecutor = taskSlotsPerExecutor;
		taskSlotsPerExecutor = newTaskSlotsPerExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR, oldTaskSlotsPerExecutor, taskSlotsPerExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryPerTaskSlot() {
		return memoryPerTaskSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPerTaskSlot(int newMemoryPerTaskSlot) {
		int oldMemoryPerTaskSlot = memoryPerTaskSlot;
		memoryPerTaskSlot = newMemoryPerTaskSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT, oldMemoryPerTaskSlot, memoryPerTaskSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM:
				return getDefaultParallelism();
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__EXECUTORS:
				return getExecutors();
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR:
				return getMemoryPerExecutor();
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR:
				return getTaskSlotsPerExecutor();
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT:
				return getMemoryPerTaskSlot();
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
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM:
				setDefaultParallelism((Integer)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__EXECUTORS:
				setExecutors((Integer)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR:
				setMemoryPerExecutor((Integer)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR:
				setTaskSlotsPerExecutor((Integer)newValue);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT:
				setMemoryPerTaskSlot((Integer)newValue);
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
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM:
				setDefaultParallelism(DEFAULT_PARALLELISM_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__EXECUTORS:
				setExecutors(EXECUTORS_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR:
				setMemoryPerExecutor(MEMORY_PER_EXECUTOR_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR:
				setTaskSlotsPerExecutor(TASK_SLOTS_PER_EXECUTOR_EDEFAULT);
				return;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT:
				setMemoryPerTaskSlot(MEMORY_PER_TASK_SLOT_EDEFAULT);
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
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__DEFAULT_PARALLELISM:
				return defaultParallelism != DEFAULT_PARALLELISM_EDEFAULT;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__EXECUTORS:
				return executors != EXECUTORS_EDEFAULT;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_EXECUTOR:
				return memoryPerExecutor != MEMORY_PER_EXECUTOR_EDEFAULT;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__TASK_SLOTS_PER_EXECUTOR:
				return taskSlotsPerExecutor != TASK_SLOTS_PER_EXECUTOR_EDEFAULT;
			case ApplicationDSLPackage.APPLICATION_CONFIGURATION__MEMORY_PER_TASK_SLOT:
				return memoryPerTaskSlot != MEMORY_PER_TASK_SLOT_EDEFAULT;
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
		result.append(" (defaultParallelism: ");
		result.append(defaultParallelism);
		result.append(", executors: ");
		result.append(executors);
		result.append(", memoryPerExecutor: ");
		result.append(memoryPerExecutor);
		result.append(", taskSlotsPerExecutor: ");
		result.append(taskSlotsPerExecutor);
		result.append(", memoryPerTaskSlot: ");
		result.append(memoryPerTaskSlot);
		result.append(')');
		return result.toString();
	}

} //ApplicationConfigurationImpl

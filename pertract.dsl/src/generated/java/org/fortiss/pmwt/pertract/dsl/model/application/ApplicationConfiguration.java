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
 * A representation of the model object '<em><b>Application Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getDefaultParallelism <em>Default Parallelism</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getExecutors <em>Executors</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerExecutor <em>Memory Per Executor</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getTaskSlotsPerExecutor <em>Task Slots Per Executor</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerTaskSlot <em>Memory Per Task Slot</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface ApplicationConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Parallelism</em>' attribute.
	 * @see #setDefaultParallelism(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration_DefaultParallelism()
	 * @model required="true"
	 * @generated
	 */
	int getDefaultParallelism();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getDefaultParallelism <em>Default Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Parallelism</em>' attribute.
	 * @see #getDefaultParallelism()
	 * @generated
	 */
	void setDefaultParallelism(int value);

	/**
	 * Returns the value of the '<em><b>Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executors</em>' attribute.
	 * @see #setExecutors(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration_Executors()
	 * @model
	 * @generated
	 */
	int getExecutors();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getExecutors <em>Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executors</em>' attribute.
	 * @see #getExecutors()
	 * @generated
	 */
	void setExecutors(int value);

	/**
	 * Returns the value of the '<em><b>Memory Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Per Executor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Per Executor</em>' attribute.
	 * @see #setMemoryPerExecutor(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration_MemoryPerExecutor()
	 * @model
	 * @generated
	 */
	int getMemoryPerExecutor();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerExecutor <em>Memory Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Per Executor</em>' attribute.
	 * @see #getMemoryPerExecutor()
	 * @generated
	 */
	void setMemoryPerExecutor(int value);

	/**
	 * Returns the value of the '<em><b>Task Slots Per Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Slots Per Executor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Slots Per Executor</em>' attribute.
	 * @see #setTaskSlotsPerExecutor(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration_TaskSlotsPerExecutor()
	 * @model
	 * @generated
	 */
	int getTaskSlotsPerExecutor();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getTaskSlotsPerExecutor <em>Task Slots Per Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Slots Per Executor</em>' attribute.
	 * @see #getTaskSlotsPerExecutor()
	 * @generated
	 */
	void setTaskSlotsPerExecutor(int value);

	/**
	 * Returns the value of the '<em><b>Memory Per Task Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Per Task Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Per Task Slot</em>' attribute.
	 * @see #setMemoryPerTaskSlot(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getApplicationConfiguration_MemoryPerTaskSlot()
	 * @model
	 * @generated
	 */
	int getMemoryPerTaskSlot();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ApplicationConfiguration#getMemoryPerTaskSlot <em>Memory Per Task Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Per Task Slot</em>' attribute.
	 * @see #getMemoryPerTaskSlot()
	 * @generated
	 */
	void setMemoryPerTaskSlot(int value);

} // ApplicationConfiguration

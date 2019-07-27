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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getEdgesOfChildren <em>Edges Of Children</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getResourceProfile <em>Resource Profile</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isStartingNode <em>Starting Node</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isSpout <em>Spout</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getDataInput <em>Data Input</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode()
 * @model
 * @generated
 */
public interface ExecutionNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.application.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ExecutionNode)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Parent()
	 * @model
	 * @generated
	 */
	ExecutionNode getParent();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ExecutionNode value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Edges Of Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges Of Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges Of Children</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_EdgesOfChildren()
	 * @model containment="true"
	 * @generated
	 */
	EList<DirectedEdge> getEdgesOfChildren();

	/**
	 * Returns the value of the '<em><b>Resource Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Profile</em>' containment reference.
	 * @see #setResourceProfile(ResourceProfile)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_ResourceProfile()
	 * @model containment="true"
	 * @generated
	 */
	ResourceProfile getResourceProfile();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getResourceProfile <em>Resource Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Profile</em>' containment reference.
	 * @see #getResourceProfile()
	 * @generated
	 */
	void setResourceProfile(ResourceProfile value);

	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(int)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Parallelism()
	 * @model required="true"
	 * @generated
	 */
	int getParallelism();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(int value);

	/**
	 * Returns the value of the '<em><b>Starting Node</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Node</em>' attribute.
	 * @see #setStartingNode(boolean)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_StartingNode()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStartingNode();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isStartingNode <em>Starting Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Node</em>' attribute.
	 * @see #isStartingNode()
	 * @generated
	 */
	void setStartingNode(boolean value);

	/**
	 * Returns the value of the '<em><b>Spout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spout</em>' attribute.
	 * @see #setSpout(boolean)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_Spout()
	 * @model required="true"
	 * @generated
	 */
	boolean isSpout();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#isSpout <em>Spout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spout</em>' attribute.
	 * @see #isSpout()
	 * @generated
	 */
	void setSpout(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input</em>' reference.
	 * @see #setDataInput(DataInput)
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getExecutionNode_DataInput()
	 * @model
	 * @generated
	 */
	DataInput getDataInput();

	/**
	 * Sets the value of the '{@link org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode#getDataInput <em>Data Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Input</em>' reference.
	 * @see #getDataInput()
	 * @generated
	 */
	void setDataInput(DataInput value);

} // ExecutionNode

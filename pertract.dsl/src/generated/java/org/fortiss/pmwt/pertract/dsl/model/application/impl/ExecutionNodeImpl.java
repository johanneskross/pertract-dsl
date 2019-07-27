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

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.DataInput;
import org.fortiss.pmwt.pertract.dsl.model.application.DirectedEdge;
import org.fortiss.pmwt.pertract.dsl.model.application.ExecutionNode;
import org.fortiss.pmwt.pertract.dsl.model.application.Operation;
import org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getEdgesOfChildren <em>Edges Of Children</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getResourceProfile <em>Resource Profile</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#isStartingNode <em>Starting Node</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#isSpout <em>Spout</em>}</li>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.impl.ExecutionNodeImpl#getDataInput <em>Data Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionNodeImpl extends MinimalEObjectImpl.Container implements ExecutionNode {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ExecutionNode parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionNode> children;

	/**
	 * The cached value of the '{@link #getEdgesOfChildren() <em>Edges Of Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgesOfChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedEdge> edgesOfChildren;

	/**
	 * The cached value of the '{@link #getResourceProfile() <em>Resource Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProfile()
	 * @generated
	 * @ordered
	 */
	protected ResourceProfile resourceProfile;

	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final int PARALLELISM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected int parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStartingNode() <em>Starting Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartingNode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTING_NODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartingNode() <em>Starting Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartingNode()
	 * @generated
	 * @ordered
	 */
	protected boolean startingNode = STARTING_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpout() <em>Spout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpout() <em>Spout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpout()
	 * @generated
	 * @ordered
	 */
	protected boolean spout = SPOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInput()
	 * @generated
	 * @ordered
	 */
	protected DataInput dataInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationDSLPackage.Literals.EXECUTION_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ExecutionNode)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationDSLPackage.EXECUTION_NODE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionNode basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ExecutionNode newParent) {
		ExecutionNode oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ExecutionNode>(ExecutionNode.class, this, ApplicationDSLPackage.EXECUTION_NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedEdge> getEdgesOfChildren() {
		if (edgesOfChildren == null) {
			edgesOfChildren = new EObjectContainmentEList<DirectedEdge>(DirectedEdge.class, this, ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN);
		}
		return edgesOfChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProfile getResourceProfile() {
		return resourceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceProfile(ResourceProfile newResourceProfile, NotificationChain msgs) {
		ResourceProfile oldResourceProfile = resourceProfile;
		resourceProfile = newResourceProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE, oldResourceProfile, newResourceProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProfile(ResourceProfile newResourceProfile) {
		if (newResourceProfile != resourceProfile) {
			NotificationChain msgs = null;
			if (resourceProfile != null)
				msgs = ((InternalEObject)resourceProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE, null, msgs);
			if (newResourceProfile != null)
				msgs = ((InternalEObject)newResourceProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE, null, msgs);
			msgs = basicSetResourceProfile(newResourceProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE, newResourceProfile, newResourceProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelism(int newParallelism) {
		int oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__PARALLELISM, oldParallelism, parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartingNode() {
		return startingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingNode(boolean newStartingNode) {
		boolean oldStartingNode = startingNode;
		startingNode = newStartingNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__STARTING_NODE, oldStartingNode, startingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpout() {
		return spout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpout(boolean newSpout) {
		boolean oldSpout = spout;
		spout = newSpout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__SPOUT, oldSpout, spout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getDataInput() {
		if (dataInput != null && dataInput.eIsProxy()) {
			InternalEObject oldDataInput = (InternalEObject)dataInput;
			dataInput = (DataInput)eResolveProxy(oldDataInput);
			if (dataInput != oldDataInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT, oldDataInput, dataInput));
			}
		}
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput basicGetDataInput() {
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInput(DataInput newDataInput) {
		DataInput oldDataInput = dataInput;
		dataInput = newDataInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT, oldDataInput, dataInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ApplicationDSLPackage.EXECUTION_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN:
				return ((InternalEList<?>)getEdgesOfChildren()).basicRemove(otherEnd, msgs);
			case ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE:
				return basicSetResourceProfile(null, msgs);
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
			case ApplicationDSLPackage.EXECUTION_NODE__NAME:
				return getName();
			case ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS:
				return getOperations();
			case ApplicationDSLPackage.EXECUTION_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ApplicationDSLPackage.EXECUTION_NODE__CHILDREN:
				return getChildren();
			case ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN:
				return getEdgesOfChildren();
			case ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE:
				return getResourceProfile();
			case ApplicationDSLPackage.EXECUTION_NODE__PARALLELISM:
				return getParallelism();
			case ApplicationDSLPackage.EXECUTION_NODE__STARTING_NODE:
				return isStartingNode();
			case ApplicationDSLPackage.EXECUTION_NODE__SPOUT:
				return isSpout();
			case ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT:
				if (resolve) return getDataInput();
				return basicGetDataInput();
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
			case ApplicationDSLPackage.EXECUTION_NODE__NAME:
				setName((String)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__PARENT:
				setParent((ExecutionNode)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ExecutionNode>)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN:
				getEdgesOfChildren().clear();
				getEdgesOfChildren().addAll((Collection<? extends DirectedEdge>)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE:
				setResourceProfile((ResourceProfile)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__PARALLELISM:
				setParallelism((Integer)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__STARTING_NODE:
				setStartingNode((Boolean)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__SPOUT:
				setSpout((Boolean)newValue);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT:
				setDataInput((DataInput)newValue);
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
			case ApplicationDSLPackage.EXECUTION_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS:
				getOperations().clear();
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__PARENT:
				setParent((ExecutionNode)null);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__CHILDREN:
				getChildren().clear();
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN:
				getEdgesOfChildren().clear();
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE:
				setResourceProfile((ResourceProfile)null);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__PARALLELISM:
				setParallelism(PARALLELISM_EDEFAULT);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__STARTING_NODE:
				setStartingNode(STARTING_NODE_EDEFAULT);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__SPOUT:
				setSpout(SPOUT_EDEFAULT);
				return;
			case ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT:
				setDataInput((DataInput)null);
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
			case ApplicationDSLPackage.EXECUTION_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationDSLPackage.EXECUTION_NODE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ApplicationDSLPackage.EXECUTION_NODE__PARENT:
				return parent != null;
			case ApplicationDSLPackage.EXECUTION_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case ApplicationDSLPackage.EXECUTION_NODE__EDGES_OF_CHILDREN:
				return edgesOfChildren != null && !edgesOfChildren.isEmpty();
			case ApplicationDSLPackage.EXECUTION_NODE__RESOURCE_PROFILE:
				return resourceProfile != null;
			case ApplicationDSLPackage.EXECUTION_NODE__PARALLELISM:
				return parallelism != PARALLELISM_EDEFAULT;
			case ApplicationDSLPackage.EXECUTION_NODE__STARTING_NODE:
				return startingNode != STARTING_NODE_EDEFAULT;
			case ApplicationDSLPackage.EXECUTION_NODE__SPOUT:
				return spout != SPOUT_EDEFAULT;
			case ApplicationDSLPackage.EXECUTION_NODE__DATA_INPUT:
				return dataInput != null;
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
		result.append(", parallelism: ");
		result.append(parallelism);
		result.append(", startingNode: ");
		result.append(startingNode);
		result.append(", spout: ");
		result.append(spout);
		result.append(')');
		return result.toString();
	}

} //ExecutionNodeImpl

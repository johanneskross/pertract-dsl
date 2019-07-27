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
 * A representation of the model object '<em><b>Resource Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceProfile#getResourceDemands <em>Resource Demands</em>}</li>
 * </ul>
 *
 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceProfile()
 * @model
 * @generated
 */
public interface ResourceProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Demands</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.pmwt.pertract.dsl.model.application.ResourceDemand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Demands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demands</em>' containment reference list.
	 * @see org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage#getResourceProfile_ResourceDemands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceDemand> getResourceDemands();

} // ResourceProfile

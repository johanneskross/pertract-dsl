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
package org.fortiss.pmwt.pertract.dsl.model.dataworkload;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage
 * @generated
 */
public interface DataWorkloadDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWorkloadDSLFactory eINSTANCE = org.fortiss.pmwt.pertract.dsl.model.dataworkload.impl.DataWorkloadDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Workload Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Workload Architecture</em>'.
	 * @generated
	 */
	DataWorkloadArchitecture createDataWorkloadArchitecture();

	/**
	 * Returns a new object of class '<em>Record Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Data Model</em>'.
	 * @generated
	 */
	RecordDataModel createRecordDataModel();

	/**
	 * Returns a new object of class '<em>Open Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Data Source</em>'.
	 * @generated
	 */
	OpenDataSource createOpenDataSource();

	/**
	 * Returns a new object of class '<em>File Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Data Model</em>'.
	 * @generated
	 */
	FileDataModel createFileDataModel();

	/**
	 * Returns a new object of class '<em>File Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Specification</em>'.
	 * @generated
	 */
	FileSpecification createFileSpecification();

	/**
	 * Returns a new object of class '<em>Single Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Data Source</em>'.
	 * @generated
	 */
	SingleDataSource createSingleDataSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataWorkloadDSLPackage getDataWorkloadDSLPackage();

} //DataWorkloadDSLFactory

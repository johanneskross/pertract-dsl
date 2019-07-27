/*******************************************************************************
 * Copyright (C) 2018 fortiss GmbH
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     kross - initial implementation
 ******************************************************************************/
package org.fortiss.pmwt.pertract.dsl;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.dataworkload.DataWorkloadDSLPackage;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceArchitecture;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLFactory;
import org.fortiss.pmwt.pertract.dsl.model.resources.ResourceDSLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EMFPersistence {
	
	private static final Logger log = LoggerFactory.getLogger(EMFPersistence.class);
	public static final String FILE_EXTENSION_APP = "pta";
	public static final String FILE_EXTENSION_DATA = "ptd";
	public static final String FILE_EXTENSION_RESOURCE = "ptr";
	
	public static String persist(ApplicationExecutionArchitecture model) {
		ApplicationDSLPackage.eINSTANCE.eClass();
		ApplicationDSLFactory.eINSTANCE.eClass();
		return persist(model.getName(), FILE_EXTENSION_APP, model);
	}
	
	public static String persist(ApplicationExecutionArchitecture model, String path) {
		ApplicationDSLPackage.eINSTANCE.eClass();
		ApplicationDSLFactory.eINSTANCE.eClass();
		return persist(path+model.getName(), FILE_EXTENSION_APP, model);
	}

	public static String persist(ResourceArchitecture model) {
		ResourceDSLPackage.eINSTANCE.eClass();
		ResourceDSLFactory.eINSTANCE.eClass();
		return persist(model.getName(), FILE_EXTENSION_RESOURCE, model);
	}
	
	public static String persist(ResourceArchitecture model, String path) {
		ResourceDSLPackage.eINSTANCE.eClass();
		ResourceDSLFactory.eINSTANCE.eClass();
		return persist(path+model.getName(), FILE_EXTENSION_RESOURCE, model);
	}
	
	public static String persist(DataWorkloadArchitecture model) {
		DataWorkloadDSLPackage.eINSTANCE.eClass();
		DataWorkloadDSLFactory.eINSTANCE.eClass();
		return persist(model.getName(), FILE_EXTENSION_DATA, model);
	}
	
	public static String persist(DataWorkloadArchitecture model, String path) {
		DataWorkloadDSLPackage.eINSTANCE.eClass();
		DataWorkloadDSLFactory.eINSTANCE.eClass();
		return persist(path+model.getName(), FILE_EXTENSION_DATA, model);
	}
	
	private static String persist(String file, String fileExtension, EObject model) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put(fileExtension, new JsonResourceFactory());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(file + "." + fileExtension);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(model);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			log.info("Could not save EMF resource", e);
		}
		log.info("Model saved in " + uri.toFileString());
		return uri.toFileString();
	}
	
	public static ApplicationExecutionArchitecture loadApplicationExecutionArchitecture(String uri) {
		ApplicationDSLPackage.eINSTANCE.eClass();
		ApplicationDSLFactory.eINSTANCE.eClass();
		return (ApplicationExecutionArchitecture) load(uri, FILE_EXTENSION_APP);
	}
	
	public static ResourceArchitecture loadResourceArchitecture(String uri) {
		ResourceDSLPackage.eINSTANCE.eClass();
		ResourceDSLFactory.eINSTANCE.eClass();
		return (ResourceArchitecture) load(uri, FILE_EXTENSION_RESOURCE);
	}
	
	public static DataWorkloadArchitecture loadDataWorkloadArchitecture(String uri) {
		DataWorkloadDSLPackage.eINSTANCE.eClass();
		DataWorkloadDSLFactory.eINSTANCE.eClass();
		return (DataWorkloadArchitecture) load(uri, FILE_EXTENSION_DATA );
	}
	
	private static EObject load(String uri, String fileExtension) {
		log.info("loading model " + uri+"."+fileExtension);
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put(fileExtension, new JsonResourceFactory());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		return resource.getContents().get(0);
	}

}

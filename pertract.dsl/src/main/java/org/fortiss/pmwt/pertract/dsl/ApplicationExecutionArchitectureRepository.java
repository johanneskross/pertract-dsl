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

import java.util.List;

import org.fortiss.pmwt.pertract.dsl.model.application.ApplicationExecutionArchitecture;

public interface ApplicationExecutionArchitectureRepository {

	ApplicationExecutionArchitecture find(String applicationID);
	
	List<ApplicationExecutionArchitecture> findAll();
	
}

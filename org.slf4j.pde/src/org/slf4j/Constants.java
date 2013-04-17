/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.slf4j;

/**
 * Various constants used in the SLF4J API.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public interface Constants {
    
	/**
	 * The name of the system property to set in order to instruct
	 * {@link LoggerFactory} class to use a specific ILoggerFactory.
	 */
	final public static String LOGGER_FACTORY_PROPERTY = "org.slf4j.factory";
	
	/**
	 * Constant used to determine the name of the factory method for
	 * creating logger factories.
	 */
	final public static String LOGGER_FACTORY_FACTORY_METHOD_NAME = "getInstance";
}

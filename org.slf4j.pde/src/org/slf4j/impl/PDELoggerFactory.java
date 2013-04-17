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
package org.slf4j.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.ILoggerFactory;
import org.slf4j.pde.SLF4jPlugin;

/**
 * @author John J. Franey
 */
public class PDELoggerFactory implements ILoggerFactory {
	
	private static PDELogger log = new PDELogger(PDELoggerFactory.class.getName(),
			SLF4jPlugin.getDefault().getBundle());
	
	// map logger name to Logger
	Map loggerMap;
	
	// map logger name to sink bundle
	Map bundleMap;

	public PDELoggerFactory() {
		loggerMap = new HashMap();
		bundleMap = new HashMap();
		
	}

	public Logger getLogger(String name) {
		Logger ulogger = (Logger) loggerMap.get(name);
		if (ulogger == null) {
			ulogger = new PDELogger(name, getBundle(name));
			loggerMap.put(name, ulogger);
		}
		return ulogger;
	}

	private IExtension[] getExtensions() {
		return Platform.getExtensionRegistry()
			.getExtensionPoint("org.slf4j.pde.loggers")
			.getExtensions();
	}
	
	// TODO: loggerMapEntries should be sensitive to dynamic bundles.
	private List loggerMapEntries;
	
	/*
	 * get logger map entries by reading the registered extensions.
	 */
	private List getLoggerMapEntries() {
		if(loggerMapEntries == null) {
			List entries = new ArrayList();
			IExtension[] extensions = getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				IConfigurationElement[] configs = extensions[i]
						.getConfigurationElements();
				for (int j = 0; j < configs.length; j++) {
					IConfigurationElement c = configs[j];
					try {
						if (c.getName().equals("loggerMapEntry")) {
							String regex = c.getAttribute("regex");
							String symbolicName = c
									.getAttribute("symbolicName");
							LoggerMapEntry e = new LoggerMapEntry();
							e.setRegex(regex);
							e.setSymbolicName(symbolicName);
							entries.add(e);
						}
					} catch (Exception e) {
						log.error("Cannot obtain configuration: ", e);
					}
				}
			}
			loggerMapEntries = entries;
		}
		return loggerMapEntries;
	}
	
	
	private Bundle getBundle(String loggerName) {
		
		Bundle b = (Bundle)bundleMap.get(loggerName);
		if(b == null) {
			// default to slf4j's ILog
			b = SLF4jPlugin.getDefault().getBundle();
			List l = getLoggerMapEntries();
			for (Iterator i = l.iterator(); i.hasNext();) {
				LoggerMapEntry entry = (LoggerMapEntry) i.next();
								
				if(entry.matches(loggerName)) {
					b = Platform.getBundle(entry.getSymbolicName());
					bundleMap.put(loggerName, b);
					break;					
				}					
			}			
		}		
		return b;
	}
}

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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoggerMapEntry {
	private String symbolicName;
	private Pattern pattern;
	
	public String getRegex() {
		return pattern.pattern();
	}
	public void setRegex(String regex) {
		this.pattern = Pattern.compile(regex);
	}
	
	public String getSymbolicName() {
		return symbolicName;
	}
	public void setSymbolicName(String symbolicName) {
		this.symbolicName = symbolicName;
	}
	
	public Matcher matcher(String loggerName) {
		return pattern.matcher(loggerName);
	}
	
	public boolean matches(String loggerName) {
		return pattern.matcher(loggerName).matches();
	}
	
}

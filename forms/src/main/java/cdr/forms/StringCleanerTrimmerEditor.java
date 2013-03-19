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
package cdr.forms;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;

public class StringCleanerTrimmerEditor extends StringTrimmerEditor {

	public StringCleanerTrimmerEditor(boolean emptyAsNull) {
		super(emptyAsNull);
	}

	@Override
	public void setAsText(String text) {
		text = cleanCharsets(text);
		super.setAsText(text);
	}

	public static String cleanCharsets(String s) {
		// smart single quotes and apostrophe
		s = s.replaceAll("[\\u2018|\\u2019|\\u201A]", "'");
		// smart double quotes
		s = s.replaceAll("[\\u201C|\\u201D|\\u201E]", "\"");
		// ellipsis
		s = s.replaceAll("\\u2026", "...");
		// dashes
		s = s.replaceAll("[\\u2013|\\u2014]", "-");
		// circumflex
		s = s.replaceAll("\\u02C6", "^");
		// open angle bracket
		s = s.replaceAll("\\u2039", "<");
		// close angle bracket
		s = s.replaceAll("\\u203A", ">");
		// spaces
		s = s.replaceAll("[\\u02DC|\\u00A0]", " ");
		return s;
	}

}

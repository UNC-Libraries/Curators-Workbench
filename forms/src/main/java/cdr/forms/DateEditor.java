/**
 * Copyright 2008 The University of North Carolina at Chapel Hill
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

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import crosswalk.DatePrecision;
import crosswalk.util.ImpreciseDate;

public class DateEditor extends PropertyEditorSupport {
	private static Map<DatePrecision, DateFormat> formats = new HashMap<DatePrecision, DateFormat>();
	private DatePrecision defaultPrecision = DatePrecision.DAY;
	
	static {
		formats.put(DatePrecision.DAY, new SimpleDateFormat("yyyy-MM-dd"));
		formats.put(DatePrecision.MONTH, new SimpleDateFormat("yyyy-MM"));
		formats.put(DatePrecision.YEAR, new SimpleDateFormat("yyyy"));
	}

	public DateEditor() {
	}

	public void setAsText(String text) throws IllegalArgumentException {
		Date value = null;
		value = parseDate(DatePrecision.DAY, text);
		if(value == null) {
			value = parseDate(DatePrecision.MONTH, text);
		}
		if(value == null) {
			value = parseDate(DatePrecision.YEAR, text);
		}
		setValue(value);
	}
	
	private Date parseDate(DatePrecision precision, String text) {
		try {
			Date parsed = formats.get(precision).parse(text);
			ImpreciseDate result = new ImpreciseDate(parsed);
			result.setPrecision(precision);
			return result;
		} catch(ParseException ignored) {
			return null;
		}
	}

	public String getAsText() {
		Date value = (Date) getValue();
		if (value instanceof ImpreciseDate) {
			ImpreciseDate impDate = (ImpreciseDate) value;
			return (value != null ? formats.get(impDate.getPrecision()).format(value) : "");
		} else {
			return (value != null ? formats.get(defaultPrecision).format(value) : "");
		}
	}
}

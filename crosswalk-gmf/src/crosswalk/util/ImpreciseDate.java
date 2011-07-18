/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gregory Jansen
 *
 */
public class ImpreciseDate extends Date {
	/**
	 *
	 */
	private static final long serialVersionUID = -3018712925738860949L;

	public static enum DatePrecision {
		Century(), Decade(), Year(), Month(), Day(), Hour(), Minute(), Second();
	}

	private DatePrecision precision = DatePrecision.Hour;

	/**
	 * @param parse
	 */
	public ImpreciseDate(Date parse) {
		super(parse.getTime());
	}

	public DatePrecision getPrecision() {
		return this.precision;
	}

	public void setPrecision(DatePrecision precision) {
		this.precision = precision;
	}

	/**
	 * This currently will detect precisions of year, month, day, hour, minute and second, based on the presence of a placeholder.
	 * @param format
	 * @return
	 */
	public static DatePrecision getFormatPrecision(String format) {
		// detect the most precise first
		// FIXME detect when characters are quoted
		if(format.contains("s")) {
			return DatePrecision.Second;
		} else if(format.contains("m")) {
			return DatePrecision.Minute;
		} else if(format.contains("h") || format.contains("k") || format.contains("H") || format.contains("K")) {
			return DatePrecision.Hour;
		} else if(format.contains("d") || format.contains("D") || format.contains("F") || format.contains("E")) {
			return DatePrecision.Day;
		} else if(format.contains("M")) {
			return DatePrecision.Month;
		} else if(format.contains("y")) {
			return DatePrecision.Year;
		}
		return null;
	}
}

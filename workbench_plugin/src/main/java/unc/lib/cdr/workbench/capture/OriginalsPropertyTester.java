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
package unc.lib.cdr.workbench.capture;

import org.eclipse.core.expressions.PropertyTester;

import unc.lib.cdr.workbench.originals.OriginalFileStore;

public class OriginalsPropertyTester extends PropertyTester {

	public OriginalsPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		OriginalFileStore r = (OriginalFileStore) receiver;
		if (receiver instanceof OriginalFileStore && "isFile".equals(property)) {
			return expectedValue == null ? !r.fetchInfo().isDirectory()
					: r.fetchInfo().isDirectory() != ((Boolean) expectedValue).booleanValue();
		} else {
			return false;
		}
	}

}

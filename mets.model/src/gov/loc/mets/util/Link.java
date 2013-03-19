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
package gov.loc.mets.util;

import gov.loc.mets.DivType;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public enum Link {
	SURROGATE("has surrogate", "surrogate", "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSurrogate", new LinkTester() {
		@Override
		public Collection<DivType[]> potentialLinks(List list) {
			if(list.size() != 2) return Collections.EMPTY_LIST;
			DivType thumb = null;
			DivType subject = null;
			if (METSConstants.Div_File.equals(((DivType) list.get(0)).getTYPE())) {
				thumb = (DivType) list.get(0);
				subject = (DivType) list.get(1);
			} else {
				subject = (DivType) list.get(0);
				thumb = (DivType) list.get(1);
			}
			if(METSUtils.findLink(subject, Link.SURROGATE.uri, thumb) != null) {
				return Collections.EMPTY_LIST;
			} else {
				return Collections.singletonList(new DivType[] {subject, thumb});
			}
		}
	}),
	SUPPLEMENTAL("has supplemental", "supplemental", "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSupplemental",
			new AggregateRoleLinkTester("http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSupplemental")),
	ALPHABETICALORDER("has alphabetical order", "alphabetical", "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasAlphabeticalOrder",
			new AlphabeticalOrderLinkTester()),
	DEFAULTACCESS("has default access", "defaut access", "http://cdr.unc.edu/definitions/1.0/base-model.xml#defaultWebObject",
			new AggregateRoleLinkTester("http://cdr.unc.edu/definitions/1.0/base-model.xml#defaultWebObject"));	
	public String predicateText = null;
	public String label = null;
	public String uri = null;
	public LinkTester tester = null;
	Link(String predicateText, String label, String uri, LinkTester tester) {
		this.predicateText = predicateText;
		this.uri = uri;
		this.tester = tester;
		this.label = label;
	}
}

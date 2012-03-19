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

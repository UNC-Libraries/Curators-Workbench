/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
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
package gov.loc.mets.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gregory Jansen
 *
 */
public class METSConstants {
	public static enum Link {
		SURROGATE("has surrogate", "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSurrogate"),
		SUPPLEMENTAL("has surrogate", "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSurrogate");
		public String predicateText = null;
		public String uri = null;
		Link(String predicateText, String uri) {
			this.predicateText = predicateText;
			this.uri = uri;
		}
	}
	private static Map<String, Link> linkTypesByURI = null;
	static {
		linkTypesByURI = new HashMap<String, Link>();
		for (Link l : Link.values()) {
			linkTypesByURI.put(l.uri, l);
		}
	}
	public static Link getLinkForArcRole(String uri) {
		return linkTypesByURI.get(uri);
	}
	public static final String MetsProfile_UNC_LIBRARIES = "http://localhost/profiles/unc-libraries-profile";
	public static final String FLocat_USE_STAGE = "STAGE";
	// public static final String ChecksumTypeMD5 = "MD5";
	// public static final String LocType_OTHER = "OTHER";
	public static final String LocType_EFS_SCHEME = "EFS_URI";
	public static String MetsType_WORKBENCH = "WORKBENCH";
	public static String StructMapType_SNAPSHOT = "SNAPSHOT";
	public static String StructMapType_ARRANGED = "ARRANGED";
	public static String Div_File = "File";
	public static String Div_Folder = "Folder";
	public static String Div_Collection = "Collection";
	public static String Div_AggregateWork = "Aggregate Work";
	public static final String Div_Disk = "Disk";
	public static final String Div_Bag = "Bag";
	public static final String FILEGROUP_Objects = "OBJECTS";
	public static final String FILEGROUP_BatchMetadata = "BATCH_METADATA";
	public static final String FLocat_USE_ORIGINAL = "ORIGINAL";
	public static final String MD_STATUS_CROSSWALK_LINKED = "CROSSWALK_LINKED";
	public static final String MD_STATUS_CROSSWALK_NOT_LINKED = "CROSSWALK_NOT_LINKED";
	public static final String MD_STATUS_USER_EDITED = "USER_EDITED";
	public static final String MD_STATUS_CROSSWALK_USER_LINKED = "CROSSWALK_USER_LINKED";
	//public static final String LINK_HAS_SURROGATE_URI = "http://cdr.unc.edu/definitions/1.0/base-model.xml#hasSurrogate";
	//public static final String LINK_HAS_SURROGATE_LABEL = "has surrogate";
	// public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	static {
		// dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
}

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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.Form;

public class RequestHeaderAuthorizationHandler implements AuthorizationHandler {
	private String splitCharacter = null;
	private String groupsHeaderName = null;
	private List<String> groupsAlwaysPermitted = new ArrayList<String>();
	
	public List<String> getGroupsAlwaysPermitted() {
		return groupsAlwaysPermitted;
	}

	public void setGroupsAlwaysPermitted(List<String> groupsAlwaysPermitted) {
		this.groupsAlwaysPermitted = groupsAlwaysPermitted;
	}

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(RequestHeaderAuthorizationHandler.class);

	public String getSplitCharacter() {
		return splitCharacter;
	}

	public void setSplitCharacter(String splitCharacter) {
		this.splitCharacter = Pattern.quote(splitCharacter);
	}

	public String getGroupsHeaderName() {
		return groupsHeaderName;
	}

	public void setGroupsHeaderName(String groupsHeaderName) {
		this.groupsHeaderName = groupsHeaderName;
	}

	@Override
	public void checkPermission(String formId, Form form, HttpServletRequest request) throws PermissionDeniedException {
		if(form.getAuthorizedGroups() == null || form.getAuthorizedGroups().contains("public")) return;
		
		// get header string
		String groupsHeader = request.getHeader(getGroupsHeaderName());
		if(request.getRemoteUser() == null) {
			throw new PermissionDeniedException("You must first log in to use this deposit form.", form, formId);
		} else {
			if(groupsHeader == null) {
				throw new PermissionDeniedException("Your login is not authorized to use this form.", form, formId);
			}
			for(String group : groupsHeader.split(getSplitCharacter())) {
				if(this.groupsAlwaysPermitted.contains(group)) return;
				if(form.getAuthorizedGroups().contains(group)) return;
			}
			throw new PermissionDeniedException("Your login is not authorized to use this form.", form, formId);
		}
	}

}

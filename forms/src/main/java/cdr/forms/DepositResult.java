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

public class DepositResult {
	
	private String pid;
	
	public String getPid() {
		return pid;
	}
	
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public static enum Status { COMPLETE, PENDING, UNKNOWN, FAILED };
	
	private Status status = Status.UNKNOWN;
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	private String accessURL;

	/**
	 * @return The URL at which the deposited object can be found.
	 **/
	public String getAccessURL() {
		return accessURL;
	}
	
	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
	
	private String responseBody;

	/**
	 * @return The response body for the request associated with this deposit.
	 **/
	public String getResponseBody() {
		return responseBody;
	}
	
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	
}

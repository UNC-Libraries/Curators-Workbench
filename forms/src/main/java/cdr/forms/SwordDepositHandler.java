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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.abdera.Abdera;
import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Document;
import org.apache.abdera.model.Entry;
import org.apache.abdera.model.Text.Type;
import org.apache.abdera.parser.Parser;
import org.apache.abdera.parser.stax.FOMExtensibleElement;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cdr.forms.DepositResult.Status;


public class SwordDepositHandler implements DepositHandler {
	/**
	 * This option takes a Boolean object indicate if publication is desired.
	 */
	public static final String OPTION_PUBLISH = "publish";
	
	/**
	 * This option takes a string, indicating the observed mime-type.
	 */
	public static final String OPTION_MIMETYPE = "mime-type";

	private static final Logger LOG = LoggerFactory.getLogger(SwordDepositHandler.class);

	private String serviceUrl;
	private String username;
	private String password;

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private String defaultContainer = null;

	public String getDefaultContainer() {
		return defaultContainer;
	}

	/**
	 * Set the default deposit container. String should be appropriate
	 * @param defaultContainer
	 */
	public void setDefaultContainer(String defaultContainer) {
		this.defaultContainer = defaultContainer;
	}

	public DepositResult depositMultipart(String containerId, String pid, Part atomPart, Part payloadPart) {
		
		if (containerId == null || "".equals(containerId.trim()))
			containerId = this.getDefaultContainer();
		
		Part[] parts = { payloadPart, atomPart };

		String depositPath = getServiceUrl() + "collection/" + containerId;
		
		HttpClient client = new HttpClient();
		
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(this.getUsername(), this.getPassword());
		client.getState().setCredentials(getAuthenticationScope(depositPath), creds);
		client.getParams().setAuthenticationPreemptive(true);
		
		PostMethod post = new PostMethod(depositPath);
		
		RequestEntity multipartEntity = new MultipartRequestEntity(parts, post.getParams());
		String boundary = multipartEntity.getContentType();
		boundary = boundary.substring(boundary.indexOf("boundary=") + 9);
		
		Header header = new Header("Content-type", "multipart/related; type=application/atom+xml; boundary=" + boundary);
		post.addRequestHeader(header);
		
		Header slugHeader = new Header("Slug", pid);
		post.addRequestHeader(slugHeader);
		post.setRequestEntity(multipartEntity);
		
		int responseCode;

		DepositResult result = new DepositResult();
		
		// result.setObjectPid(pid);
		try {
			responseCode = client.executeMethod(post);
			if (responseCode >= 300) {
				LOG.error(String.valueOf(responseCode));
				LOG.error(post.getResponseBodyAsString());
				result.setStatus(Status.FAILED);
			} else {
				result.setStatus(Status.COMPLETE);
			}
			SAXBuilder sx = new SAXBuilder();
			try {
				org.jdom.Document d = sx.build(post.getResponseBodyAsStream());
				Namespace atom = d.getRootElement().getNamespace();
				List<Element> links = d.getRootElement().getChildren("link", atom);
				for (Element el : links) {
					if ("alternate".equals(el.getAttributeValue("rel"))) {
						String accessURL = el.getAttributeValue("href");
						result.setAccessURL(accessURL);
					}
				}
			} catch (JDOMException e) {
				LOG.error("There was a problem parsing the SWORD response.", e);
			}
			LOG.debug("response was: \n" + post.getResponseBodyAsString());
		} catch (HttpException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		} catch (IOException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		}
		return result;
	}
	
	public DepositResult depositPackaged(String containerId, String pid, File file, String contentType, String packageType) {
		
		if (containerId == null || "".equals(containerId.trim()))
			containerId = this.getDefaultContainer();

		String depositPath = getServiceUrl() + "collection/" + containerId;
		
		HttpClient client = new HttpClient();
		
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(this.getUsername(), this.getPassword());
		client.getState().setCredentials(getAuthenticationScope(depositPath), creds);
		client.getParams().setAuthenticationPreemptive(true);
		
		PostMethod post = new PostMethod(depositPath);
		
		RequestEntity fileRequestEntity = new FileRequestEntity(file, contentType);
		
		Header contentDispositionHeader = new Header("Content-Disposition", "attachment; filename=package.zip");
		post.addRequestHeader(contentDispositionHeader);
		
		Header packagingHeader = new Header("Packaging", packageType);
		post.addRequestHeader(packagingHeader);
		
		Header slugHeader = new Header("Slug", pid);
		post.addRequestHeader(slugHeader);
		
		post.setRequestEntity(fileRequestEntity);
		
		int responseCode;

		DepositResult result = new DepositResult();
		
		// result.setObjectPid(pid);
		try {
			responseCode = client.executeMethod(post);
			if (responseCode >= 300) {
				LOG.error(String.valueOf(responseCode));
				LOG.error(post.getResponseBodyAsString());
				result.setStatus(Status.FAILED);
			} else {
				result.setStatus(Status.COMPLETE);
			}
			SAXBuilder sx = new SAXBuilder();
			try {
				org.jdom.Document d = sx.build(post.getResponseBodyAsStream());
				Namespace atom = d.getRootElement().getNamespace();
				List<Element> links = d.getRootElement().getChildren("link", atom);
				for (Element el : links) {
					if ("alternate".equals(el.getAttributeValue("rel"))) {
						String accessURL = el.getAttributeValue("href");
						result.setAccessURL(accessURL);
					}
				}
			} catch (JDOMException e) {
				LOG.error("There was a problem parsing the SWORD response.", e);
			}
			LOG.debug("response was: \n" + post.getResponseBodyAsString());
		} catch (HttpException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		} catch (IOException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		}
		return result;
		
	}

	/**
	 * Generates a limited authentication scope for the supplied URL, so that an HTTP client will not send username and
	 * passwords to other URLs.
	 * 
	 * @param queryURL
	 *           the URL for the query.
	 * @return an authentication scope tuned to the requested URL.
	 * @throws IllegalArgumentException
	 *            if <code>queryURL</code> is not a well-formed URL.
	 */
	public static AuthScope getAuthenticationScope(String queryURL) {
		if (queryURL == null) {
			throw new NullPointerException("Cannot derive authentication scope for null URL");
		}
		try {
			URL url = new URL(queryURL);
			// port defaults to 80 unless the scheme is https
			// or the port is explicitly set in the URL.
			int port = 80;
			if (url.getPort() == -1) {
				if ("https".equals(url.getProtocol())) {
					port = 443;
				}
			} else {
				port = url.getPort();
			}
			return new AuthScope(url.getHost(), port);
		} catch (MalformedURLException mue) {
			throw new IllegalArgumentException("supplied URL <" + queryURL + "> is ill-formed:" + mue.getMessage());
		}
	}
}

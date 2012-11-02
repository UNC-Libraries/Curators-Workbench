<%--

    Copyright 2008 The University of North Carolina at Chapel Hill

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="crosswalk.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ page import="java.util.*"%>
<%@ page import="crosswalk.impl.*"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.io.*"%>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/static/css/reset.css" />
<link type="text/css" href="/static/css/jquery-ui.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/static/css/cdrui_styles.css" />
<link rel="stylesheet" type="text/css" href="css/cdr_forms.css" />

<script type="text/javascript" src="js/jquery.js"></script> 
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/expanding.js"></script>  

<%
int year = Calendar.getInstance().get(Calendar.YEAR);
pageContext.setAttribute("currentYear", new Integer(year));

Map<String,List<String>> vocabURLMap = new HashMap<String,List<String>>();
Set<String> freeTextKeys = new HashSet<String>();
int elementNum = 0;
for (Object element: ((FormImpl)request.getAttribute("form")).getElements()) {
	if (element instanceof MetadataBlockImpl) {
		String vocabKey = null;
		MetadataBlockImpl mdBlock = (MetadataBlockImpl)element;
		int fieldNum = 0;
		for (Object fieldObj: mdBlock.getPorts()) {
			if (fieldObj != null && fieldObj instanceof TextInputFieldImpl) {
				TextInputFieldImpl textField = (TextInputFieldImpl)fieldObj;
				String urlHash = null;
				if (textField.getVocabularyURL() != null) {
					urlHash = "" + textField.getVocabularyURL().hashCode();
					if (!vocabURLMap.containsKey(urlHash)) {
						List<String> vocabList = new ArrayList<String>();
						URL vocabURL = new URL(textField.getVocabularyURL());
						BufferedReader br = new BufferedReader(new InputStreamReader(vocabURL.openStream()));
						String vocabEntry;
						while ((vocabEntry = br.readLine()) != null) {
							vocabList.add(vocabEntry);
						}
						br.close();
						vocabURLMap.put(urlHash, vocabList);
					}
					vocabKey = urlHash;
				}
				
				if (textField.getValidValues() != null && textField.getValidValues().size() > 0) {
					List<String> vocabList = vocabURLMap.get(urlHash);
					List<String> validValues = textField.getValidValues();
					if (vocabList == null) {
						vocabKey = "elements" + elementNum + ".ports" + fieldNum + ".enteredValue";
						vocabURLMap.put(vocabKey, validValues);
					} else {
						List<String> mergedList = new ArrayList(vocabList);
						mergedList.addAll(validValues);
						vocabKey = urlHash + "_elements" + elementNum + ".ports" + fieldNum + ".enteredValue";
						vocabURLMap.put(vocabKey, mergedList);
					}
				}
				
				if (textField.isAllowFreeText() && vocabKey != null) {
					freeTextKeys.add(vocabKey);
				}
			}
			fieldNum++;
		}
	}
	elementNum++;
}
pageContext.setAttribute("vocabURLMap", vocabURLMap);
%>

<style>
	textarea, .textareaClone {
		min-height: 3em;
		max-height: 20em;
	}
</style>

<script type="text/javascript">
	$(document).ready( function() {
		$(".monthpicker").datepicker({
			dateFormat: 'yy-mm',
			defaultDate: new Date(),
			changeMonth: true,
			changeYear: true,
			showButtonPanel: false,
			onChangeMonthYear : function(year, month, inst) {
				var newDate = new Date(year, month - 1, 1);
				$(this).datepicker("setDate", newDate);
				$(this).val($.datepicker.formatDate('yy-mm', newDate));
			}, yearRange: "-200:+5"
		}).focus(function () {
			$(".ui-datepicker-calendar").hide();
			$("#ui-datepicker-div").position({
				my: "center top",
				at: "center bottom",
				of: $(this)
			});
		});
		
		$(".datepicker").datepicker({
			changeMonth: true,
	        changeYear: true,
	        showButtonPanel: false,
	        dateFormat: 'yy-mm-dd',
	        defaultDate: new Date(),
	        yearRange: "-200:+5"
		}).focus(function () {
			$(".ui-datepicker-calendar").show();
			$(".ui-datepicker-month").show();
		});
		
		$("textarea").expandingTextarea();
		
		<%
		for (String freeTextKey: freeTextKeys) {
			List<String> vocabList = vocabURLMap.get(freeTextKey);
			out.print("$(\".cv_" + freeTextKey.replaceAll("\\.", "\\\\\\\\.") + "\").autocomplete({source: [");
			boolean first = true;
			for (String vocabValue: vocabList) {
				if (first){
					first = false;
				} else {
					out.print(",");
				}
				out.print("\"" + vocabValue + "\"");
			}
			out.println("]});");
		}
		
		/*for (Map.Entry<String,List<String>> vocabEntry: vocabURLMap.entrySet()) {
			out.print("$(\".cv_" + vocabEntry.getKey().replaceAll("\\.", "\\\\\\\\.") + "\").autocomplete({source: [");
			boolean first = true;
			for (String vocabValue: vocabEntry.getValue()) {
				if (first){
					first = false;
				} else {
					out.print(",");
				}
				out.print("\"" + vocabValue + "\"");
			}
			out.println("]});");
		}*/
		%>
	});
</script>



<!--[if IE 8]>
	<link rel="stylesheet" type="text/css" href="/static/css/cdrui_styles_ie8.css" />
<![endif]-->
<meta name="description" content="Carolina Digital Repository Deposit Form" />
<meta name="keywords" content="Carolina Digital Repository, deposit" />
<meta name="robots" content="index, nofollow" />
<link rel="shortcut icon" href="/static/images/favicon.ico" type="image/x-icon" />
<title><c:out value="${form.title}"/></title>
</head>
<body>
<div id="pagewrap">
	<div id="pagewrap_inside">
		<div class="darkest shadowbottom" id="header">
			<div class="threecol dark shadowbottom">
				<div class="contentarea">
					<h1>Carolina Digital Repository</h1>
					<a href="/" id="titlelink"><img src="/static/images/carolinadigitalrepository.png"></a>
					
					
				</div>
			</div>
			<div class="fourcol darkest">
				<div class="contentarea">
				</div>
			</div>
		</div>
		<div id="content">
			<div class="contentarea">
<h2><c:out value="${form.title}"/></h2>
<p><c:out value="${form.description}"/></p>
<form:form modelAttribute="form" enctype="multipart/form-data">
	<c:forEach items="${form.elements}" varStatus="elementRow">
		<spring:bind path="form.elements[${elementRow.index}]" ignoreNestedPath="true">
			<% if(Paragraph.class.isInstance(status.getValue())) { 
					Paragraph p = (Paragraph)status.getValue(); 
					if(p.getHeading() != null) { %>
					<br/><h3><%= p.getHeading() %></h3>
					<% }
					if(p.getText() != null) { %>
					<p><%= ((Paragraph)status.getValue()).getText() %></p>
					<% } %>
			<% } else if(MetadataBlock.class.isInstance(status.getValue())) { 
					MetadataBlock mb = (MetadataBlock)status.getValue(); %>
					<div class="metadata_block">
						<br/><h3><%= ((MetadataBlock)status.getValue()).getName() %></h3>
						<% if(mb.getDescription() != null && ((MetadataBlock)status.getValue()).getDescription().length() > 0) { %>
						<p><%= ((MetadataBlock)status.getValue()).getDescription() %></p>
						<% } %>
						<div class="indented_block">
							<c:forEach items="${form.elements[elementRow.index].ports}" var="port" varStatus="portRow">
								<spring:bind path="form.elements[${elementRow.index}].ports[${portRow.index}]" ignoreNestedPath="true">
									<div class="form_field">
										<label><c:out value="${port.label}"/></label>
										<% if(status.getValue() instanceof DateInputField) { %>
										<c:choose>
											<c:when test="${port.datePrecision.name == 'month'}">
												<form:input cssClass="monthpicker" path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
											</c:when>
											<c:when test="${port.datePrecision.name == 'day'}">
												<form:input cssClass="datepicker" path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
											</c:when>
											<c:when test="${port.datePrecision.name == 'year'}">
												<form:select path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
													<%-- Display a select of years, from 190 in the past to 10 in the future --%>
													<c:forEach var="i" begin="0" end="200">
														<%-- Select the year from the form bean or the current year if none is provided --%>
														<c:choose>
															<c:when test="${(form.elements[elementRow.index].ports[portRow.index].enteredValue != null && form.elements[elementRow.index].ports[portRow.index].enteredValue.year == (currentYear - i + 10 - 1900))  
																	|| (form.elements[elementRow.index].ports[portRow.index].enteredValue == null && i == 10)}">
																<form:option value="${currentYear - i + 10}" selected="true"/>
															</c:when>
															<c:otherwise>
																<form:option value="${currentYear - i + 10}"/>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</form:select>
											</c:when>
										</c:choose>
										<% } else if(status.getValue() instanceof TextInputField) { %>
										<c:choose>
											<c:when test="${port.rows <= 1}">
												<c:choose>
													<c:when test="${port.vocabularyURL != null}">
														<c:choose>
															<c:when test="${port.allowFreeText}">
																<c:choose>
																	<c:when test="${port.validValues == null || port.validValues.size() == 0}">
																		<form:input path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" maxlength="${port.maxSize}" size="${port.preferredSize}" cssClass="cv_${port.vocabularyURL.hashCode()}"/>
																	</c:when>
																	<c:otherwise>
																		<form:input path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" maxlength="${port.maxSize}" size="${port.preferredSize}" cssClass="cv_${port.vocabularyURL.hashCode()}_elements${elementRow.index}.ports${portRow.index}.enteredValue"/>
																	</c:otherwise>
																</c:choose>
															</c:when>
															<c:otherwise>
																<form:select path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
																	<form:options items="${vocabURLMap[port.vocabularyURL.hashCode().toString()]}"/>
																	<form:options items="${port.validValues}"/>
																</form:select>
															</c:otherwise>
														</c:choose>
													</c:when>											
													<c:otherwise>
														<c:choose>
															<c:when test="${port.validValues == null || port.validValues.size() == 0}">
																<form:input path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" maxlength="${port.maxSize}" size="${port.preferredSize}" />
															</c:when>
															<c:otherwise>
																<form:select path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
																	<form:options items="${port.validValues}"/>
																</form:select>
															</c:otherwise>
														</c:choose>
													
														
													</c:otherwise>
												</c:choose>
											</c:when>
											<c:otherwise>
												<form:textarea path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" rows="${port.rows}" cols="${port.preferredSize}" maxlength="${port.maxSize}"/>
											</c:otherwise>
										</c:choose>
										
										
										<% } else { %>
										<form:input path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
										<% } %>
										<c:if test="${port.required}"><span class="red">*</span></c:if>
										<form:errors cssClass="red" path="elements[${elementRow.index}].ports[${portRow.index}].enteredValue" />
										<br/>
									</div>
								</spring:bind>
							</c:forEach>
						</div>
					</div>
			<% } %>
		</spring:bind>
	</c:forEach>
	<br/><h3>File for Deposit</h3>
	<div class="indented_block">
		<div class="form_field file_field">
			<input name="file" type="file" size="40"/> <span class="red">*</span> <spring:hasBindErrors name="form"><span class="red"><%= errors.getFieldError("file") == null ? "" : errors.getFieldError("file").getDefaultMessage() %></span></spring:hasBindErrors>
		</div>
	</div>
	<div class="submit_container">
		<input type="submit" value="submit deposit" />
	</div>
</form:form>
</div>
</div>
<div id="footer" class="darkest">
	<div class="threecol dark">
		<div class="contentarea">
			<p>
				<a href="/">Home</a>&nbsp;|&nbsp;
				<a href="search?types=Collection">Browse Collections</a>&nbsp;|&nbsp;
				<a href="external?page=about.about">About</a>&nbsp;|&nbsp;
				<a href="external?page=contact&amp;refer=https%3a%2f%2fcdr.lib.unc.edu%2f">Contact Us</a>&nbsp;|&nbsp;
				<a href="http://www.lib.unc.edu">Library Home</a>&nbsp;|&nbsp;
				<a href="http://www.lib.unc.edu/aoffice/policies/privacy_policy.html">Privacy Policy</a>
			</p>
		</div>
	</div>
	<div class="fourcol darkest">
		<div class="contentarea"><p class="left"><a href="http://www.unc.edu">UNC Home </a></p><a href="http://www.unc.edu"><img src="/static/images/uncwell.png" id="footer_uncwell"></a></div>
	</div>
</div>
</div>
</div>
</body>
</html>
<%--

    Copyright 2010 The University of North Carolina at Chapel Hill

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
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="crosswalk.*"%>
<%@ page import="java.util.*"%>
<%@ page import="crosswalk.impl.*"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.io.*"%>
<%@ page import="cdr.forms.*"%>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/static/css/reset.css" />
<link type="text/css" href="css/jquery-ui.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/static/css/cdrui_styles.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.qtip.min.css" />
<link rel="stylesheet" type="text/css" href="css/cdr_forms.css" />

<script type="text/javascript" src="js/jquery.js"></script> 
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/expanding.js"></script>
<script type="text/javascript" src="js/jquery.qtip.min.js"></script>  

<%
int year = Calendar.getInstance().get(Calendar.YEAR);
pageContext.setAttribute("currentYear", new Integer(year));

Map<String,List<String>> vocabURLMap = new HashMap<String,List<String>>();
Set<String> freeTextKeys = new HashSet<String>();
int elementNum = 0;
for (Object element: ((Deposit) request.getAttribute("deposit")).getForm().getElements()) {
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

<script type="text/javascript">
	$(document).ready( function() {
		$(".monthpicker").datepicker({
			dateFormat: 'yy-mm',
			changeMonth: true,
			changeYear: true,
			showButtonPanel: false,
			onChangeMonthYear : function(year, month, inst) {
				console.log("change moth");
				var newDate = new Date(year, month - 1, 1);
				$(this).datepicker("setDate", newDate);
				$(this).val($.datepicker.formatDate('yy-mm', newDate));
				$(".ui-datepicker-calendar").hide();
			}, yearRange: "-200:+5"
		}).focus(function () {
			console.log("monthpicker focus");
			$(".ui-datepicker-calendar").hide();
		}).attr("readonly", true).each(function(){
			if (!$(this).val()) {
				$(this).datepicker("setDate", new Date());
			}
		});
		
		$(".datepicker").datepicker({
			changeMonth: true,
	        changeYear: true,
	        showButtonPanel: false,
	        dateFormat: 'yy-mm-dd',
	        yearRange: "-200:+5",
	        beforeShow: function() {
				console.log("before show d");
			}
		}).focus(function () {
			console.log("datepicker focus");
			$(".ui-datepicker-calendar").show();
			$(".ui-datepicker-month").show();
		}).each(function(){
			if (!$(this).val()) {
				$(this).datepicker("setDate", new Date());
			}
		});
		
		$("a[title]").qtip();
		
		$("textarea").expandingTextarea().css("position", "static").outerWidth();
		$("textarea").css("position", "absolute");
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
				out.print("\"" + vocabValue.replaceAll("\"", "\\\"") + "\"");
			}
			out.println("]});");
		}
		%>
		
		<%-- Instead of submitting the form when a "Remove file" input is clicked, set the class of
		the containing div to "removed", which will hide the description and button and display the
		file input. Then, append a hidden field with the same name as the "Remove file" input, which
		will cause the file to be removed on submission of the form (or it will be replaced by
		another file). --%>
		
		$(".file_field .remove").each(function() {
			var button = $(this);
			$(this).on("click", function(e) {
				button.closest(".file_field").addClass("removed");
 				button.parent().append("<input type=\"hidden\" name=\"" + button.attr("name") + "\" value=\"true\">");
				return false;
			});
		});
		
	});
</script>



<!--[if IE 8]>
	<link rel="stylesheet" type="text/css" href="/static/css/cdrui_styles_ie8.css" />
<![endif]-->
<meta name="description" content="Carolina Digital Repository Deposit Form" />
<meta name="keywords" content="Carolina Digital Repository, deposit" />
<meta name="robots" content="index, nofollow" />
<link rel="shortcut icon" href="/static/images/favicon.ico" type="image/x-icon" />
<title><c:out value="${deposit.form.title}"/></title>
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

<c:if test="${not empty deposit.form.logo}">
<img src="${deposit.form.logo}" class="form_logo"/>
</c:if>

<h2><c:out value="${deposit.form.title}"/></h2>
<spring:hasBindErrors name="form">
	<% if (errors.getFieldError("file") != null) { %>
	<span class="red"><%= errors.getFieldError("file").getDefaultMessage() %></span>
	<br/><br/>
	<% } %>
</spring:hasBindErrors>
<p><c:out value="${deposit.form.description}"/></p>
<form:form modelAttribute="deposit" enctype="multipart/form-data" acceptCharset="UTF-8">
	
	<%-- Because we have other submit buttons within the form, include a hidden submit button at
	the top to act as the default. --%>
	<input type="submit" value="submit deposit" class="hidden_top_submit"/>
	
	<c:forEach items="${deposit.form.elements}" var="element" varStatus="elementRow">
		<spring:bind path="deposit.form.elements[${elementRow.index}]" ignoreNestedPath="true">
			<% if(Paragraph.class.isInstance(status.getValue())) { 
				Paragraph p = (Paragraph)status.getValue(); 
				if(p.getHeading() != null) { %>
				<br/><h3><%= p.getHeading() %></h3>
				<% }
				if(p.getText() != null) { %>
				<p><%= ((Paragraph)status.getValue()).getText() %></p>
				<% } %>
			<% } else if(FileBlock.class.isInstance(status.getValue())) {
				FileBlock f = (FileBlock)status.getValue(); 
				if(f.getName() != null) { %>
				<br/><h3><%= f.getName() %></h3>
				<% }
				if(f.getDescription() != null) { %>
				<p><%= ((FileBlock)status.getValue()).getDescription() %></p>
				<% } %>
				<div class="indented_block">
					<div class="form_field file_field ${not empty deposit.files[deposit.blockFileIndexMap[element]] ? "filled" : ""}">
						<label><c:if test="${not empty element.usage}"><a title="${element.usage}">(i)</a></c:if>&nbsp;</label>
						<input name="files[${deposit.blockFileIndexMap[element]}]" type="file" class="file" size="40"/>
						<c:if test="${not empty deposit.files[deposit.blockFileIndexMap[element]]}">
							<span class="description">
								<b><c:out value="${deposit.files[deposit.blockFileIndexMap[element]].filename}"/></b>
								<input type="submit" name="_files[${deposit.blockFileIndexMap[element]}]" value="Remove file" class="remove"/>
							</span>
						</c:if>
						<% if (f.isRequired()) { %><span class="red">*</span><% } %>
						<form:errors cssClass="red" path="files[${deposit.blockFileIndexMap[element]}]" />
					</div>
				</div>
			<% } else if(MetadataBlock.class.isInstance(status.getValue())) { 
					MetadataBlock mb = (MetadataBlock)status.getValue(); %>
					<div class="metadata_block">
						<h3><%= ((MetadataBlock)status.getValue()).getName() %></h3>
						<% if(mb.getDescription() != null && ((MetadataBlock)status.getValue()).getDescription().length() > 0) { %>
						<p><%= ((MetadataBlock)status.getValue()).getDescription() %></p>
						<% } %>
						<div class="indented_block">
							<c:forEach items="${deposit.form.elements[elementRow.index].ports}" var="port" varStatus="portRow">
								<spring:bind path="deposit.form.elements[${elementRow.index}].ports[${portRow.index}]" ignoreNestedPath="true">
									<% if(status.getValue() instanceof DateInputField) { %>
										<div class="form_field">
											<label><c:if test="${not empty port.usage}"><a title="${port.usage}">(i)</a>&nbsp;</c:if><c:out value="${port.label}"/></label>
											<c:choose>
												<c:when test="${port.datePrecision.name == 'month'}">
													<form:input cssClass="monthpicker" path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
												</c:when>
												<c:when test="${port.datePrecision.name == 'day'}">
													<form:input cssClass="datepicker" path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
												</c:when>
												<c:when test="${port.datePrecision.name == 'year'}">
													<form:select path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
														<%-- Display a select of years, from 190 in the past to 10 in the future --%>
														<c:forEach var="i" begin="0" end="200">
															<%-- Select the year from the form bean or the current year if none is provided --%>
															<c:choose>
																<c:when test="${(deposit.form.elements[elementRow.index].ports[portRow.index].enteredValue != null && form.elements[elementRow.index].ports[portRow.index].enteredValue.year == (currentYear - i + 10 - 1900))  
																		|| (deposit.form.elements[elementRow.index].ports[portRow.index].enteredValue == null && i == 10)}">
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
											<c:if test="${port.required}"><span class="red">*</span></c:if>
											<form:errors cssClass="red" path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" />
											<br/>
										</div>
									<% } else if(status.getValue() instanceof TextInputField) { %>
										<div class="form_field width_${port.width.name}">
											<label><c:if test="${not empty port.usage}"><a title="${port.usage}">(i)</a>&nbsp;</c:if><c:out value="${port.label}"/></label>
											<c:if test="${port.width.name == 'FullLine' && port.type.name != 'MultipleLines'}">
												<br/>
											</c:if>
											<c:choose>
												<c:when test="${port.type.name == 'MultipleLines'}">
													<div class="multi_notes">
														<c:if test="${port.required}"><span class="red">*</span></c:if>
														<form:errors cssClass="red" path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" />
													</div>
													<c:if test="${port.width.name == 'FullLine'}">
														<br/>
													</c:if>													
													<c:choose>
														<c:when test="${port.maxCharacters != null}">
															<form:textarea path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" placeholder="${port.usage}" maxlength="${port.maxCharacters}"/>
														</c:when>
														<c:otherwise>
															<form:textarea path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" placeholder="${port.usage}"/>
														</c:otherwise>
													</c:choose>
													<br/>
												</c:when>
												<c:otherwise>
													<c:choose>
														<c:when test="${port.vocabularyURL != null}">
															<c:choose>
																<c:when test="${port.allowFreeText}">
																	<c:choose>
																		<c:when test="${port.validValues == null || port.validValues.size() == 0}">
																			<form:input path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" placeholder="${port.usage}" maxlength="${port.maxCharacters}" cssClass="cv_${port.vocabularyURL.hashCode()}"/>
																		</c:when>
																		<c:otherwise>
																			<form:input path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" placeholder="${port.usage}" maxlength="${port.maxCharacters}" cssClass="cv_${port.vocabularyURL.hashCode()}_elements${elementRow.index}.ports${portRow.index}.enteredValue"/>
																		</c:otherwise>
																	</c:choose>
																</c:when>
																<c:otherwise>
																	<form:select path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
																		<form:options items="${vocabURLMap[port.vocabularyURL.hashCode().toString()]}"/>
																		<form:options items="${port.validValues}"/>
																	</form:select>
																</c:otherwise>
															</c:choose>
														</c:when>											
														<c:otherwise>
															<c:choose>
																<c:when test="${port.validValues == null || port.validValues.size() == 0}">
																	<form:input path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" placeholder="${port.usage}" maxlength="${port.maxCharacters}"/>
																</c:when>
																<c:otherwise>
																	<form:select path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}">
																		<form:options items="${port.validValues}"/>
																	</form:select>
																</c:otherwise>
															</c:choose>
														</c:otherwise>
													</c:choose>
													<c:if test="${port.required}"><span class="red">*</span></c:if>
													<form:errors cssClass="red" path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" />
													<br/>
												</c:otherwise>
											</c:choose>
										</div>
									<% } else { %>
									<form:input path="form.elements[${elementRow.index}].ports[${portRow.index}].enteredValue" title="${port.usage}" />
									<% } %>
								</spring:bind>
							</c:forEach>
						</div>
					</div>
			<% } %>
		</spring:bind>
	</c:forEach>
	
	<c:if test="${not deposit.form.hasFileBlocks}">
		<br/><h3>File for Deposit</h3>
		<div class="indented_block">
			<div class="form_field file_field ${not empty mainFile ? "filled" : ""}">
				<label>&nbsp;</label>
				<input name="mainFile" type="file" class="file" size="40"/>
				<c:if test="${not empty mainFile}">
					<span class="description">
						<b><c:out value="${mainFile.filename}"/></b>
						<input type="submit" name="_mainFile" value="Remove file" class="remove"/>
					</span>
				</c:if>
				<span class="red">*</span>
				<form:errors cssClass="red" path="mainFile" />
			</div>
		</div>
	</c:if>

	<c:if test="${deposit.form.canAddSupplementalFiles}">
		<br/><h3>Supplemental Files</h3>
		<div class="indented_block">
			<c:forEach items="${deposit.supplementalFiles}" var="file" varStatus="fileRow">
				<div class="form_field file_field ${not empty file ? "filled" : ""}">
					<label>&nbsp;</label>
					<input name="supplementalFiles[${fileRow.index}]" type="file" class="file" size="40"/>
					<c:if test="${not empty file}">
						<span class="description">
							<b><c:out value="${file.filename}"/></b>
							<input type="submit" name="_supplementalFiles[${fileRow.index}]" value="Remove file" class="remove"/>
						</span>
					</c:if>
				</div>
			</c:forEach>
		</div>
	</c:if>
	
	<br/><h3>Email Address for Deposit Receipt</h3>
	<p>Your deposit receipt will be emailed to the address below.</p>
	<div class="indented_block">
		<div class="form_field receipt_email_address_field">
			<label>&nbsp;</label>
    		<form:input path="receiptEmailAddress" />
    		<form:errors cssClass="red" path="receiptEmailAddress" />
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
				<a href="/search?types=Collection">Browse Collections</a>&nbsp;|&nbsp;
				<a href="/external?page=about.about">About</a>&nbsp;|&nbsp;
				<a href="/external?page=contact&amp;refer=https%3a%2f%2fcdr.lib.unc.edu%2f">Contact Us</a>&nbsp;|&nbsp;
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

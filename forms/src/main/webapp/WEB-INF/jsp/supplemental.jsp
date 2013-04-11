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
<%@ page import="java.util.Calendar"%>
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

%>

<script type="text/javascript">

$(document).ready(function() {

	$("textarea").expandingTextarea().css("position", "static").outerWidth();
	$("textarea").css("position", "absolute");
	
});

</script>

<style type="text/css">
  
  h3 {
    color: #335;
    font-size: 14px;
    border-bottom: 1px dotted #A0D0D0;
  }
  
  h4 {
    font-size: 14px;
    font-weight: bold;
  }
  
  h4.supplemental input {
  	margin-left: 0.5em;
  }
  
</style>

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

<h2><c:out value="${deposit.form.title}" /></h2>

<form:form modelAttribute="deposit" method="post" enctype="multipart/form-data">

	<br />
	<h3>Add a File</h3>

	<div class="indented_block">
		<div class="form_field file_field">
			<label>&nbsp;</label>
			<input type="file" name="added" multiple="multiple" />
			<input type="submit" value="Add to Deposit" />
		</div>
	</div>


	<c:if test="${not empty deposit.supplementalObjects}">

		<br />
		<h3>Files to Deposit</h3>

		<c:forEach items="${deposit.supplementalObjects}" var="object" varStatus="status">
			<div class="metadata_block">
				<h4 class="supplemental">
					<c:out value="${object.depositFile.filename}" />
					<input type="submit" name="_supplementalObjects[${status.index}]" value="Remove" />
				</h4>
				<div class="indented_block">

					<div class="form_field width_Normal">
						<label>Title</label>
						<form:input path="supplementalObjects[${status.index}].title" />
						<span class="red">*</span>
						<form:errors cssClass="red" path="supplementalObjects[${status.index}].title" />
						<br />
					</div>

					<div class="form_field width_Normal">
						<label>Medium</label>
						<form:input path="supplementalObjects[${status.index}].medium" />
						<span class="red">*</span>
						<form:errors cssClass="red" path="supplementalObjects[${status.index}].medium" />
						<br />
					</div>

					<div class="form_field width_Normal">
						<label>Dimensions</label>
						<form:input path="supplementalObjects[${status.index}].dimensions" />
						<span class="red">*</span>
						<form:errors cssClass="red" path="supplementalObjects[${status.index}].dimensions" />
						<br />
					</div>

					<div class="form_field">
						<label>Year</label>
						<form:select path="supplementalObjects[${status.index}].date">
							<c:forEach var="i" begin="0" end="9">
								<form:option value="${currentYear - i}" selected="${(currentYear - i) == object.date.year + 1900 ? true : null }" />
							</c:forEach>
						</form:select>
						<span class="red">*</span>
						<form:errors cssClass="red" path="supplementalObjects[${status.index}].date" />
					</div>

					<div class="form_field width_Normal">
						<label>Brief Narrative</label>
						<div class="multi_notes"></div>
						<form:textarea path="supplementalObjects[${status.index}].narrative" />
					</div>
				</div>
			</div>
		</c:forEach>

		<br />
		<h3>Submit Deposit</h3>

		<div class="submit_container">
			<input type="submit" name="deposit" value="Submit Deposit" />
		</div>

	</c:if>

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

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
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/static/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/static/css/cdrui_styles.css" />
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
<% if(session != null && session.getAttribute("user") != null) { %>
<h3>Not Authorized to Deposit</h3>
<p><c:out value="${message}"/></p>
<% } else { %>
<h3>Log In is Required</h3>
<p><c:out value="${message}"/></p>
<p style="text-align: center"><a href="/Shibboleth.sso/Login?target=%2fforms%2f${formId}.form">Log In</a></p>
<% } %>
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
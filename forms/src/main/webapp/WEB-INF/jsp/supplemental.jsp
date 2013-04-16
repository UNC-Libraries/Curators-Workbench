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

var multipleFileSupport = (function() {
	try {
		if (window.FormData === undefined || window.FileList === undefined)
			return false;
		
		var testInputElement = document.createElement("input");
		testInputElement.setAttribute("type", "file");
		testInputElement.setAttribute("multiple", "multiple");
		
		if (testInputElement.multiple !== true)
			return false;
	} catch (e) {
		return false;
	}
	
	return true;
})();

$(document).ready(function() {

	$("textarea").expandingTextarea().css("position", "static").outerWidth();
	$("textarea").css("position", "absolute");
	
	if (multipleFileSupport) {
		
		(function() {
			
			var MAX_UPLOAD_SIZE = <c:out value="${maxUploadSize}"/>;
			var queue;
			var count;
			
			function submitNextFile() {
				
				try {
				
					if (queue && queue.length > 0) {
						
						var file = queue.pop();
						
						var xhr = new XMLHttpRequest();
						var fd = new FormData();
						
						fd.append("file", file);
						  
						xhr.upload.addEventListener("progress", function(e) {
							var f;
							
							if (e.total)
								f = e.loaded / e.total;
							else
								f = 0.0;
								
							var c = (count - queue.length) - 1;
							var r = (c / count) + (f / count);
								
							$("#add_sample_progress").attr("value", r * 100);
							$("#add_sample_progress").attr("max", 100);
						}, false);
						  
						xhr.addEventListener("loadend", function() {
							submitNextFile();
						}, false);
						
						xhr.open("POST", "/forms/supplemental/files");
						xhr.send(fd);
						
						return;
						
					}
					
				} catch (e) {
					
				}

				$("#add_sample_progress").removeAttr("value");
				$("#add_sample_progress").removeAttr("max");
				
				$("#deposit").get(0).submit();
				
			}
			
			$("#add_sample_file").on("change", function() {
				
				var files = this.files;
				
				if (files.length > 0) {
					
					var bigger = [];
					
					for (var i = 0; i < files.length; i++) {
						if (files[i].size > MAX_UPLOAD_SIZE) {
							bigger.push(files[i].name);
						}
					}
					
					if (bigger.length > 0) {
						if (bigger.length == 1)
							alert("One of the files you selected is larger than the file size limit: " + bigger.join(", ") + ". Please omit this file from your submission.");
						else
							alert("Some of the files you selected are larger than the file size limit: " + bigger.join(", ") + ". Please omit these files from your submission.");
						
						this.value = "";
						return false;
					}
					
					count = files.length;
					queue = Array.prototype.slice.apply(files);
					failed = [];
					
					this.value = "";
					$("#multiple_submit").addClass("progress");
					$("#deposit input, #deposit select, #deposit textarea").attr("disabled", "disabled");
					
					submitNextFile();
					
				}
				
				return false;
				
			});
			
		})();
		
	}
	
	$("#deposit").on("submit", function() {
		setTimeout(function() {
			$("#deposit input, #deposit select, #deposit textarea").attr("disabled", "disabled");
			$("#deposit").addClass("submit");
		}, 1);
	});
	
	setInterval(function() {
		jQuery.ajax("/forms/supplemental/ping");
	}, 60000);
	
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
	
	#single_submit p {
		margin: 0.8em 1em 0 1em;
	}
	
	#add_sample_choose {
		margin: 0.8em auto 0 auto;
	}
	
	#add_sample_choose p {
		margin: 0.8em 1em 0 1em;
	}

	#add_sample_progress {
		margin: 0.8em 1em 0 1em;
		width: 300px;
	}
	
	#single_submit { display: block; }
	#multiple_submit { display: none; }
	
	.multiple #single_submit { display: none; }
	.multiple #multiple_submit { display: block; }
	
	#add_sample_choose { display: block; }
	#add_sample_progress { display: none; }
	.progress #add_sample_choose { display: none; }
	.progress #add_sample_progress { display: block; }
	
	#submit_progress {
		text-align: center;
		margin: 2em;
	}
	
	#submit { display: block; }
	.submit #submit { display: none; }
	
	#submit_progress { display: none; }
	.submit #submit_progress { display: block; }
  
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

<script>

if (multipleFileSupport)
	document.body.className = "multiple";
	
</script>

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

<h2><c:out value="${deposit.form.title}" /></h2>
<p><c:out value="${deposit.form.description}"/></p>
<form:form modelAttribute="deposit" method="post" enctype="multipart/form-data" id="deposit">

	<br />
	<h2>Add Work Samples</h2>

	<div id="single_submit">
		<p><input type="file" name="added" /> <input type="submit" value="Add Work Sample" /></p>
		<p>File size limit: <c:out value="${formattedMaxUploadSize}"/> per file. If any of your work samples are larger than this, please omit them from your submission and contact <a href="mailto:cdr@unc.edu">cdr@unc.edu</a>.</p>
	</div>

	<div id="multiple_submit">
		<div id="add_sample_choose">
			<p><input type="file" name="added" multiple="multiple" id="add_sample_file" /></p>
			<p>File size limit: <c:out value="${formattedMaxUploadSize}"/> per file. If any of your work samples are larger than this, please omit them from your submission and contact <a href="mailto:cdr@unc.edu">cdr@unc.edu</a>.</p>
		</div>

		<progress id="add_sample_progress"></progress>
	</div>

	<c:if test="${not empty deposit.supplementalObjects}">
		<br />
		<h3>Work Samples</h3>
	</c:if>

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
					<label>Medium/Materials</label>
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

	<c:if test="${not empty deposit.supplementalObjects}">
		<br />
		<h2>Submit Deposit</h2>
	
		<p>NOTE: Please be sure to include all of your work samples before hitting submit. You will not be able to go back and revise your submission after you hit submit.</p>
	</c:if>

	<div class="submit_container" id="submit">
		<c:if test="${not empty deposit.supplementalObjects}">
			<input type="submit" id="submit_deposit" name="deposit" value="Submit Deposit"/>
		</c:if>
	</div>
	
	<div id="submit_progress">
		<img src="images/loading-large.gif">
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

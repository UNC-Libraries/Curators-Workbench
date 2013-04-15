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
	
	if (multipleFileSupport) {
		
		(function() {
	
			var queue;
			var count;
			
			function submitNextFile() {
				
				try {
				
					if (queue.length > 0) {
						
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
			
			$("#add_sample_submit").on("click", function() {
				
				var files = $("#add_sample_file").get(0).files;
				
				if (files.length > 0) {
					count = files.length;
					queue = [];
					for (var i = 0; i < files.length; i++)
						queue.push(files[i]);
					
					$("#add_sample_file").get(0).value = "";
					$("#multiple_submit").addClass("progress");
					$("#deposit input, #deposit select, #deposit textarea").attr("disabled", "disabled");
					
					submitNextFile();
				}
				
				return false;
				
			});
			
			$("#deposit").addClass("multiple");
			
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
	
	#deposit #multiple_submit {
		display: none;
	}
	
	#deposit.multiple #multiple_submit {
		display: block;
	}
	
	#deposit.multiple #single_submit {
		display: none;
	}
	
	#multiple_submit.progress #add_sample {
		display: none;
	}
	
	#multiple_submit.progress #add_sample_progress {
		display: block;
	}

	#add_sample_progress {
		display: none;
	}
	
	#deposit #single_submit_empty_list { display: block; }
	#deposit.multiple #single_submit_empty_list { display: none; }
	
	#deposit #multiple_submit_empty_list { display: none; }
	#deposit.multiple #multiple_submit_empty_list { display: block; }
	
	#deposit #submit { display: block; }
	#deposit.submit #submit { display: none; }
	
	#deposit #submit_progress { display: none; }
	#deposit.submit #submit_progress { display: block; }
	
	#submit_progress {
		text-align: center;
		margin: 2em;
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

<c:if test="${not empty deposit.form.logo}">
<img src="${deposit.form.logo}" class="form_logo"/>
</c:if>

<h2><c:out value="${deposit.form.title}" /></h2>
<p><c:out value="${deposit.form.description}"/></p>
<form:form modelAttribute="deposit" method="post" enctype="multipart/form-data" id="deposit">

	<br />
	<h2>Add Work Samples</h2>

	<div class="indented_block" id="single_submit">
		<div class="form_field file_field">
			<label>&nbsp;</label>
			<input type="file" name="added"/>
			<input type="submit" value="Add Work Sample" />
		</div>
	</div>

	<div class="indented_block" id="multiple_submit">
		<div class="form_field file_field" id="add_sample">
			<label>&nbsp;</label>
			<input type="file" name="added" multiple="multiple" id="add_sample_file" />
			<input type="submit" value="Add Work Samples" id="add_sample_submit" />
		</div>
		
		<progress id="add_sample_progress"></progress>
	</div>
	
	<br />
	<h3>Work Samples</h3>
	
	<c:if test="${empty deposit.supplementalObjects}">
		<p id="single_submit_empty_list">No work samples added. To add a work sample, choose a file above and click &quot;Add Work Sample&quot;.</p>
		<p id="multiple_submit_empty_list">No work samples added. To add work samples, choose files above and click &quot;Add Work Samples&quot;.</p>
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
	<h2>Submit Deposit</h2>

	<div class="submit_container" id="submit">
		<c:choose>
			<c:when test="${empty deposit.supplementalObjects}">
				<input type="submit" id="submit_deposit" name="deposit" value="Submit Deposit" disabled="disabled" />
			</c:when>
			<c:otherwise>
				<input type="submit" id="submit_deposit" name="deposit" value="Submit Deposit"/>
			</c:otherwise>
		</c:choose>
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

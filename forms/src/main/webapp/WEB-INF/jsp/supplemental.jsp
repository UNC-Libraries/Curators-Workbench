<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Calendar"%>
<%

int year = Calendar.getInstance().get(Calendar.YEAR);
pageContext.setAttribute("currentYear", new Integer(year));

%>
<!DOCTYPE html>
<html>
<head>
	<style>
		
		label {
		 	display: block;
		}
		
		textarea {
		 	display: block;
		}
		
		h1 {
		  font-size: 18px;
		}
		
		.error {
			color: red;
		}

	</style>
</head>
<body>

	<form id="supplemental" action="/forms/supplemental" method="post" enctype="multipart/form-data">
		
		<h1>Add a File</h1>
		
		<input type="file" name="added" multiple="multiple"/>
		<input type="submit" value="Add to Deposit"/>
		
		<c:if test="${not empty supplemental.files}">
		
			<h1>Files to Deposit</h1>
	
			<c:forEach items="${supplemental.files}" var="file" varStatus="status">
				<fieldset>
					<legend>
						<c:out value="${file.depositFile.filename}"/>
						<input type="submit" name="_files[${status.index}]" value="Remove"/>
					</legend>
					
					<label>
						Title
						<form:input path="supplemental.files[${status.index}].title"/>
						<form:errors cssClass="error" path="supplemental.files[${status.index}].title" />
					</label>
					
					<label>
						Medium
						<form:input path="supplemental.files[${status.index}].medium"/>
						<form:errors cssClass="error" path="supplemental.files[${status.index}].medium" />
					</label>
					
					<label class="dimensions">
						Dimensions
						<form:input path="supplemental.files[${status.index}].dimensions"/>
						<form:errors cssClass="error" path="supplemental.files[${status.index}].dimensions" />
					</label>
					
					<label class="date">
						Year
						<form:select path="supplemental.files[${status.index}].date">
							<c:forEach var="i" begin="0" end="9">
								<form:option value="${currentYear - i}" selected="${(currentYear - i) == file.date.year + 1900 ? true : null }"/>
							</c:forEach>
						</form:select>
						<form:errors cssClass="error" path="supplemental.files[${status.index}].date" />
					</label>
					
					<label class="narrative">
						Brief Narrative
						<form:textarea path="supplemental.files[${status.index}].narrative"/>
					</label>
				</fieldset>
			</c:forEach>
			
			<h1>Submit Deposit</h1>
			<input type="submit" name="deposit" value="Submit Deposit"/>
		
		</c:if>
		
	</form>

</body>
</html>

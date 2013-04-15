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
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="crosswalk.*"%>
<p>
If you have any questions, please contact
<c:choose>
	<c:when test="${deposit.form.contactEmail != null && deposit.form.contactName != null}">
		<a href="mailto:${administratorEmail}"><c:out value="${administratorEmail}"/></a> or
		<c:out value="${deposit.form.contactName}"/> at <a href="mailto:${deposit.form.contactEmail}"><c:out value="${deposit.form.contactEmail}"/></a>.
	</c:when>
	<c:when test="${deposit.form.contactEmail != null}">
		<a href="mailto:${administratorEmail}"><c:out value="${administratorEmail}"/></a> or
		<a href="mailto:${deposit.form.contactEmail}"><c:out value="${deposit.form.contactEmail}"/></a>.
	</c:when>
	<c:otherwise>
		<a href="mailto:${administratorEmail}"><c:out value="${administratorEmail}"/></a>.
	</c:otherwise>
</c:choose>
</p>

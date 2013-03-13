<#--

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

-->
<html>
<head>
  <title>
    <p>Your submission was received by the ${siteName} at ${receivedDate?datetime}.</p>
  </title>
</head>
<body>
  <img style="float: right;" alt="UNC Libraries logo" src="${siteUrl}/static/images/email_logo.png"/>
  <h3>${siteName}</h3>
  <p>Your submission was received by the ${siteName} at ${receivedDate?datetime}.
  Please do not reply to this message.
  <#if form.contactEmail??>If you have any questions or concerns about your submission,
  please contact ${form.contactName!}: ${form.contactEmail}</#if></p>
  <p>You entered the following information on <a href="${siteUrl}/forms/${formId}.form">${form.title}</a>:
  <ul>
    <li>User: ${form.currentUser}</li>
  <#list form.elements as element>
  	<#if element.ports??>
    <#list element.ports as input>
    	<#attempt>
    <li>${input.label}: ${input.enteredValue}</li>
    	<#recover>
    <li>${input.label}: ${input.enteredValue?datetime}</li>
    	</#attempt>
    </#list>
    </#if>
  </#list>
  </ul></p>
  <p>Thank you for contributing to the <a href="${siteUrl}">${siteName}</a>, a service of the <a href="http://www.lib.unc.edu/">University of North Carolina at Chapel Hill Libraries</a>.</p>
</body>
</html>
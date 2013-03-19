<#--

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

-->
Your submission was received by the ${siteName} at ${receivedDate?datetime}.

Please do not reply to this message.<#if form.contactEmail??> If you have any questions or concerns about your submission, please contact ${form.contactName!}: ${form.contactEmail}</#if>

You entered the following information on ${form.title} at ${siteUrl}/forms/${formId}.form:
 * User: ${form.currentUser!""}
  <#list form.elements as element>
  	<#if element.ports??>
    <#list element.ports as input>
    	<#if input.class.name == "crosswalk.impl.DateInputFieldImpl">
 * ${input.label}: ${input.enteredValue?datetime!""}
    	<#else>
 * ${input.label}: ${input.enteredValue!""}
    	</#if>
    </#list>
    </#if>
  </#list>

Thank you for contributing to the ${siteName}, a service of the University of North Carolina at Chapel Hill Libraries.

    Carolina Digital Repository:    ${siteUrl}
      UNC Chapel Hill Libraries:    http://www.lib.unc.edu/
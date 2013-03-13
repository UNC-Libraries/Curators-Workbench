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
An unrecoverable error occurred on ${form.title} at ${receivedDate?datetime}.
Please do not reply to this message.
The following information was entered on ${siteUrl}/forms/${formId}.form
 * Depositor Username: ${form.currentUser}
 * Depositor Email: ${depositorEmail!"not available"}
  <#list form.elements as element>
  	<#if element.ports??>
    <#list element.ports as input>
    	<#attempt>
 * ${input.label}: ${input.enteredValue}
    	<#recover>
 * ${input.label}: ${input.enteredValue?datetime}
    	</#attempt>
    </#list>
    </#if>
  </#list>
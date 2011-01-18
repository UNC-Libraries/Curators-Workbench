/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.xwalk;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetadataSourcePropertyTester extends PropertyTester {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(MetadataSourcePropertyTester.class);

    public MetadataSourcePropertyTester() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
	LOG.debug("property tester called: " + receiver + " " + property + " " + expectedValue);
	boolean result = false;
	if (receiver instanceof IFile && "isTabularMetadataSource".equals(property)) {
	    LOG.debug("here 1");
	    IContentType actualContentType = null;
	    IFile file = (IFile) receiver;
	    if (!file.exists()) {
		return false;
	    }
	    LOG.debug("here 2");
	    IContentDescription contentDescription = null;
	    try {
		contentDescription = file.getContentDescription();
	    } catch (CoreException e) {
		throw new Error(e);
	    }
	    if (contentDescription != null) {
		actualContentType = contentDescription.getContentType();
	    } else {
		actualContentType = Platform.getContentTypeManager().findContentTypeFor(file.getName());
	    }
	    if (actualContentType != null) {
		LOG.debug("found content type: "+actualContentType.getId()+" "+actualContentType.toString());
		//if (isKindOfUsed)
		//    return actualContentType.isKindOf(Platform.getContentTypeManager().getContentType(expectedValue));
		//return expectedValue.equals(actualContentType.getId());
	    }
	    return false;
	}
	return false;
    }

}

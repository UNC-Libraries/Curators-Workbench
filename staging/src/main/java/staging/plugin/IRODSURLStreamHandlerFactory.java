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
package staging.plugin;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class IRODSURLStreamHandlerFactory implements URLStreamHandlerFactory {

	public URLStreamHandler createURLStreamHandler(String protocol) {
		if("irods".equals(protocol)) {
			return new Handler();
		} else {
			return null;
		}
	}
	
	public class Handler extends URLStreamHandler {

		@Override
		protected URLConnection openConnection(URL u) throws IOException {
			throw new UnsupportedOperationException("This handler is a stub and does not support opening of iRODS streams.");
		}

	}

}

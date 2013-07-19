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

package staging.plugin;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.osgi.service.url.AbstractURLStreamHandlerService;

public class IRODSURLStreamHandler extends AbstractURLStreamHandlerService {

	@Override
	public URLConnection openConnection(URL u) throws IOException {
		throw new UnsupportedOperationException("This doesn't work yet. We use EFS instead.");
	}

}

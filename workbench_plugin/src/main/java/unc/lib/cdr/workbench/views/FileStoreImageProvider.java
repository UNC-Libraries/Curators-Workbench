package unc.lib.cdr.workbench.views;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileStoreImageProvider implements ImageProvider {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(FileStoreImageProvider.class);
	
	private IFileStore fs = null;

	public FileStoreImageProvider(IFileStore fs) {
		this.fs = fs;
	}

	@Override
	public Image getImage(Device device) {
		/*
		 * TODO Do we need to be smarter? It might make sense to check the file extension to see if it's worth attempting
		 * to extract an image from the file. For now, performance seems adequate and there does not seem to be any
		 * bizarre side-effects.
		 */
		InputStream in = null;
		try {
			in = fs.openInputStream(EFS.NONE, new NullProgressMonitor());
			return new Image(device, in);
		} catch (SWTException e) {
			if (e.code != SWT.ERROR_UNSUPPORTED_FORMAT)
				LOG.info("unsupported image format", e);
		} catch (Exception e) {
			LOG.error("unexpected error", e);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
		return null;
	}

	@Override
	public void disposeImage(Image image) {
		image.dispose();
	}

}

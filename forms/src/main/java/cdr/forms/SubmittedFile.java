package cdr.forms;

import java.io.File;
import java.util.regex.Pattern;

public class SubmittedFile {
	
	private File file;
	private String filename;
	private String contentType;
	
	public File getFile() {
		return file;
	}
	
	public void setFile(File file) {
		this.file = file;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public String getExtension() {
		String extension = "";
		int index = filename.lastIndexOf('.');
		if (index > 0)
			extension = filename.substring(index);
		if (!Pattern.matches("^\\.[a-zA-Z0-9]+$", extension))
			extension = "";
		return extension;
	}
	
	public String getContentType() {
		return contentType;
	}
	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}

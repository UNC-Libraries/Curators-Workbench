package cdr.forms;

import java.io.File;
import java.util.regex.Pattern;

public class DepositFile {
	
	private File file;
	private String filename;
	private String contentType;
	private long size;
	
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
	
	public String getContentType() {
		return contentType;
	}
	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	public long getSize() {
		return size;
	}
	
	public void setSize(long size) {
		this.size = size;
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
	
}

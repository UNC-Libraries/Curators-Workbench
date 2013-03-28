package cdr.forms;

import java.beans.PropertyEditorSupport;
import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class DepositFileEditor extends PropertyEditorSupport {

	public void setValue(Object value) {
		if (value instanceof MultipartFile) {
			MultipartFile multipartFile = (MultipartFile) value;
			try {
				File temp = File.createTempFile("temp", ".tmp");
				multipartFile.transferTo(temp);
				
				DepositFile depositFile = new DepositFile();
				depositFile.setFile(temp);
				depositFile.setFilename(multipartFile.getOriginalFilename());
				depositFile.setContentType(multipartFile.getContentType());
				depositFile.setSize(multipartFile.getSize());
				
				super.setValue(depositFile);
			} catch (IOException e) {
				throw new IllegalArgumentException(e);
			}
		} else if (value instanceof DepositFile) {
			super.setValue(value);
		} else {
			super.setValue(null);
		}
	}
	
}

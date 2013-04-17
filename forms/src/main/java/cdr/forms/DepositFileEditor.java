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

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

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import crosswalk.FileBlock;
import crosswalk.Form;

public class Deposit {
	
	private Form form;
	private String formId;
	private String receiptEmailAddress;
	private DepositFile[] files;
	private IdentityHashMap<FileBlock, Integer> blockFileIndexMap;
	private DepositFile mainFile;
	private DepositFile[] supplementalFiles;

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}
	
	public String getFormId() {
		return formId;
	}
	
	public void setFormId(String formId) {
		this.formId = formId;
	}
	
	public String getReceiptEmailAddress() {
		return receiptEmailAddress;
	}

	public void setReceiptEmailAddress(String receiptEmailAddress) {
		this.receiptEmailAddress = receiptEmailAddress;
	}
	
	public DepositFile[] getFiles() {
		return files;
	}
	
	public void setFiles(DepositFile[] files) {
		this.files = files;
	}
	
	public IdentityHashMap<FileBlock, Integer> getBlockFileIndexMap() {
		return blockFileIndexMap;
	}
	
	public void setBlockFileIndexMap(IdentityHashMap<FileBlock, Integer> blockFileIndexMap) {
		this.blockFileIndexMap = blockFileIndexMap;
	}
	
	public DepositFile getMainFile() {
		return mainFile;
	}

	public void setMainFile(DepositFile mainFile) {
		this.mainFile = mainFile;
	}

	public DepositFile[] getSupplementalFiles() {
		return supplementalFiles;
	}

	public void setSupplementalFiles(DepositFile[] supplementalFiles) {
		this.supplementalFiles = supplementalFiles;
	}
	
	public void deleteAllFiles() {
		for (DepositFile depositFile : this.getAllFiles()) {
			if (depositFile.getFile() != null)
				depositFile.getFile().delete();
		}
	}
	
	public List<DepositFile> getAllFiles() {
		List<DepositFile> files = new ArrayList<DepositFile>();
		
		if (this.getFiles() != null) {
			for (DepositFile depositFile : this.getFiles()) {
				if (depositFile != null)
					files.add(depositFile);
			}
		}
		
		if (this.getMainFile() != null)
			files.add(this.getMainFile());
		
		if (this.getSupplementalFiles() != null) {
			for (DepositFile depositFile : this.getSupplementalFiles()) {
				if (depositFile != null)
					files.add(depositFile);
			}
		}
		
		return files;
	}

}

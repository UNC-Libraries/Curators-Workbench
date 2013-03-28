package cdr.forms;

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
		if (this.getFiles() != null) {
			for (DepositFile depositFile : this.getFiles()) {
				if (depositFile != null && depositFile.getFile() != null)
					depositFile.getFile().delete();
			}
		}
		
		if (this.getMainFile() != null && this.getMainFile().getFile() != null)
			this.getMainFile().getFile().delete();
		
		if (this.getSupplementalFiles() != null) {
			for (DepositFile depositFile : this.getSupplementalFiles()) {
				if (depositFile != null && depositFile.getFile() != null)
					depositFile.getFile().delete();
			}
		}
	}

}

package cdr.forms;

import java.util.ArrayList;
import java.util.List;

public class SupplementalDeposit {
	
	private List<SupplementalObject> files;

	public List<SupplementalObject> getFiles() {
		return files;
	}

	public void setFiles(List<SupplementalObject> files) {
		this.files = files;
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
			for (SupplementalObject supplementalObject : this.getFiles()) {
				if (supplementalObject != null && supplementalObject.getDepositFile() != null) {
					files.add(supplementalObject.getDepositFile());
				}
			}
		}
		
		return files;
	}
	
}

package cdr.forms;

import java.util.ArrayList;
import java.util.List;

public class SupplementalDeposit {
	
	private List<SupplementalFile> files;

	public List<SupplementalFile> getFiles() {
		return files;
	}

	public void setFiles(List<SupplementalFile> files) {
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
			for (SupplementalFile supplementalFile : this.getFiles()) {
				if (supplementalFile != null && supplementalFile.getDepositFile() != null) {
					files.add(supplementalFile.getDepositFile());
				}
			}
		}
		
		return files;
	}
	
}

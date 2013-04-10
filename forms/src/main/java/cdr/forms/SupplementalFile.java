package cdr.forms;

import java.util.Date;

public class SupplementalFile {
	private DepositFile depositFile;
	private String title;
	private String medium;
	private String dimensions;
	private Date date;
	private String narrative;
	
	public DepositFile getDepositFile() {
		return depositFile;
	}
	
	public void setDepositFile(DepositFile depositFile) {
		this.depositFile = depositFile;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMedium() {
		return medium;
	}
	
	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
}

package cdr.forms;

import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.XmlDataType1;
import gov.loc.mods.mods.AbstractDefinition;
import gov.loc.mods.mods.DateDefinition;
import gov.loc.mods.mods.DateEncodingAttributeDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.StringPlusAuthorityPlusType;
import gov.loc.mods.mods.StringPlusSupplied;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.XsString;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SupplementalObject {
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
	
	public MdSecType getDescriptiveMetadata() {
		
		MdSecType mdSec = MetsFactory.eINSTANCE.createMdSecType();
		
		MdWrapType mdWrap = MetsFactory.eINSTANCE.createMdWrapType();
		mdWrap.setMDTYPE(MDTYPEType.MODS);
		mdSec.setMdWrap(mdWrap);
		
		XmlDataType1 xmlData = MetsFactory.eINSTANCE.createXmlDataType1();
		mdWrap.setXmlData(xmlData);
		
		ModsDefinition modsDefinition = MODSFactory.eINSTANCE.createModsDefinition();
		xmlData.getAny().add(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), modsDefinition);
		
		// Title
		
		TitleInfoDefinition titleInfo = MODSFactory.eINSTANCE.createTitleInfoDefinition();
		modsDefinition.getTitleInfo().add(titleInfo);
		
		XsString title = MODSFactory.eINSTANCE.createXsString();
		title.setValue(this.getTitle());
		titleInfo.getTitle().add(title);
		
		// Year
		
		OriginInfoDefinition originInfo = MODSFactory.eINSTANCE.createOriginInfoDefinition();
		modsDefinition.getOriginInfo().add(originInfo);
		
		DateDefinition dateCreated = MODSFactory.eINSTANCE.createDateDefinition();
		dateCreated.setEncoding(DateEncodingAttributeDefinition.ISO8601);
		dateCreated.setValue(new SimpleDateFormat("yyyy").format(this.getDate()));
		originInfo.getDateCreated().add(dateCreated);
		
		// Material and dimensions
		
		PhysicalDescriptionDefinition physicalDescription = MODSFactory.eINSTANCE.createPhysicalDescriptionDefinition();
		modsDefinition.getPhysicalDescription().add(physicalDescription);
		
		StringPlusAuthorityPlusType materialForm = MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType();
		materialForm.setType("material");
		materialForm.setValue(this.getMedium());
		physicalDescription.getForm().add(materialForm);
		
		StringPlusSupplied dimensionsExtent = MODSFactory.eINSTANCE.createStringPlusSupplied();
		dimensionsExtent.setValue(this.getDimensions());
		physicalDescription.getExtent().add(dimensionsExtent);
		
		// Narrative
		
		if (this.getNarrative() != null && this.getNarrative().trim().length() > 0) {
		
			AbstractDefinition narrative = MODSFactory.eINSTANCE.createAbstractDefinition();
			narrative.setValue(this.getNarrative());
			modsDefinition.getAbstract().add(narrative);
			
		}
		
		return mdSec;
		
	}
	
}

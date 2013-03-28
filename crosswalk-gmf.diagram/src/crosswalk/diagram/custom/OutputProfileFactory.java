package crosswalk.diagram.custom;

import edu.unc.lib.schemas.acl.AclPackage;
import gov.loc.mods.mods.MODSPackage;
import crosswalk.CrosswalkFactory;
import crosswalk.OutputMetadataSections;
import crosswalk.OutputProfile;

public class OutputProfileFactory {

	public static OutputProfile getMODSProfile() {
		OutputProfile result = CrosswalkFactory.eINSTANCE.createOutputProfile();
		result.setName("MODS Profile");
		result.setDescription("Allows the mapping of MODS elements to a descriptive metadata section (dmdSec).");
		result.setMetadataLabel("Crosswalked Description");
		result.setMetadataType("MODS");
		result.setMetadataSection(OutputMetadataSections.DMD_SEC);
		result.setParentMappedFeature(MODSPackage.eINSTANCE.getDocumentRoot_Mods());
		result.setStartMappingAtChildren(true);
		return result;
	}
	
	public static OutputProfile getACLProfile() {
		OutputProfile result = CrosswalkFactory.eINSTANCE.createOutputProfile();
		result.setName("Access Controls Profile");
		result.setDescription("Allows mapping of an Access Control element to a rights metadata section (rightsMD).");
		result.setMetadataLabel("Crosswalked Access Control");
		result.setMetadataType("ACL");
		result.setMetadataSection(OutputMetadataSections.RIGHTS_MD);
		result.setParentMappedFeature(AclPackage.eINSTANCE.getDocumentRoot_AccessControl());
		result.setStartMappingAtChildren(false);
		return result;
	}
}

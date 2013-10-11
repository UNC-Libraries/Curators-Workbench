package unc.lib.cdr.workbench.stage;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.staging.StagingArea;
import gov.loc.mets.FLocatType;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;

/**
 * Migrates projects from local-seeming drives to their tag URI equivalent.
 * 
 * 1) prompt user to map drives for staging areas 2a) see if project staging
 * base is within a mapped location 2b) ask user to pick the staging area 3) ask
 * user to select staging area root within old base
 * 
 * 
 * @author count0
 * 
 */
public class RepairProjectStagingWizard extends Wizard {
	private static final Logger log = LoggerFactory
			.getLogger(RepairProjectStagingWizard.class);
	MetsProjectNature nature = null;
	URI oldStagingBase = null;
	StagingArea selectedStagingArea = null;
	URI oldReplacementBaseURI = null;
	PickStagingAreaPage projectAreaPage;
	MatchURIPathDepthPage projectReplacePrefixPage;
	RepairConfirmPage confirmPage;

	public URI getOldReplacementBaseURI() {
		return oldReplacementBaseURI;
	}

	public void setOldReplacementBaseURI(URI oldReplacementBaseURI) {
		this.oldReplacementBaseURI = oldReplacementBaseURI;
	}

	public StagingArea getSelectedStagingArea() {
		return selectedStagingArea;
	}

	public void setSelectedStagingArea(StagingArea selectedStagingArea) {
		this.selectedStagingArea = selectedStagingArea;
	}

	/**
	 * Selected destination staging base
	 */
	URI newStagingBase = null;

	Map<URI, URI> old2newBaseURI = new HashMap<URI, URI>();

	public RepairProjectStagingWizard(MetsProjectNature nature) {
		super();
		this.nature = nature;
		String desc1 = "Choose the staging area that corresponds to this old staging location";
		projectAreaPage = new PickStagingAreaPage(
				"Resolve Project Staging Base", desc1, nature.getStagingBase());
		String desc2 = "This portion of previously staged file URIs will be replaced with the new staging area base URI.";
		projectReplacePrefixPage = new MatchURIPathDepthPage(
				"Pick part of old URIs to replace", desc2,
				nature.getStagingBase());
		confirmPage = new RepairConfirmPage("Confirmation",
				"Confirm your staging repair choices.");
	}

	@Override
	public boolean performFinish() {
		log.debug("finishing up");
		String oldPrefix = projectReplacePrefixPage.getReplacedURIPrefix()
				.toString();
		String newPrefix = projectAreaPage.getSelection().getURI().toString();
		nature.getEMFSession().save();
		// TODO make a backup of the workbench METS
		MetsType mets = nature.getMets();
		for (TreeIterator<EObject> iter = mets.eAllContents(); iter.hasNext();) {
			EObject next = iter.next();
			if (!(next instanceof FLocatType))
				continue;
			FLocatType loc = (FLocatType) next;
			if (!METSConstants.FLocat_USE_STAGE.equals(loc.getUSE()))
				continue;
			String old = loc.getHref();
			if (old.startsWith(oldPrefix)) {
				String newHref = old
						.substring(oldPrefix.length(), old.length());
				System.err.println("newHref: " + newHref);
				newHref = newPrefix + newHref;
				System.out.println(old + " => " + newHref);
			}
		}
		return true;
	}

	@Override
	public void addPages() {
		this.addPage(new WarningPage());
		this.addPage(projectAreaPage);
		this.addPage(projectReplacePrefixPage);
		this.addPage(confirmPage);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage currentPage) {
		IWizardPage page = super.getNextPage(currentPage);
		if (page == confirmPage) {
			confirmPage.onEnterPage(this);
		} else if (page == projectReplacePrefixPage) {
			projectReplacePrefixPage.onEnterPage(projectAreaPage.getSelection()
					.getURI());
		}
		return page;
	}

	@Override
	public boolean canFinish() {
		return (this.projectAreaPage.getSelection() != null)
				&& (this.projectReplacePrefixPage.getReplacedURIPrefix() != null);
	}

	public class WarningPage extends WizardPage implements IWizardPage {

		protected WarningPage() {
			super("Map Drives First");
			this.setTitle("Map Drives First");
			this.setDescription("You will have better results if you map staging areas to local drives first.");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			composite
					.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			composite.setLayout(new GridLayout(1, false));
			setControl(composite);
		}
	}

}

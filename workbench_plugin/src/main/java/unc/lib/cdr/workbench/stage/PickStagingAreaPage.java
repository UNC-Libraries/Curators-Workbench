package unc.lib.cdr.workbench.stage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.StagingArea;

public class PickStagingAreaPage extends WizardPage implements IWizardPage {
	private static final Logger log = LoggerFactory.getLogger(PickStagingAreaPage.class);
	URI migratingURI;
	StagingArea detectedStagingArea = null;
	List<String> stagingAreas = new ArrayList<String>();
	Stages stages = null;
	StagingArea selection = null;
	
	public StagingArea getSelection() {
		return selection;
	}
	public void setSelection(StagingArea selection) {
		this.selection = selection;
	}

	private Text oldStageText;
	private Text detectedStageText;
	private org.eclipse.swt.widgets.List stagesList;
	
	public PickStagingAreaPage(String name, String desc, URI migratingURI) {
		super(name);
		setTitle(name);
		this.setDescription(desc);
		this.migratingURI = migratingURI;
		this.stages = StagingPlugin.getDefault().getStages();
		this.detectedStagingArea = stages.findMatchingArea(migratingURI);
		for(URI u : stages.getAllAreas().keySet()) {
			stagingAreas.add(u.toString());
		}
	}
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		GridLayout gl_container = new GridLayout(2, false);
		gl_container.verticalSpacing = 10;
		gl_container.marginWidth = 10;
		container.setLayout(gl_container);
		
		Label lblOldStagingBase = new Label(container, SWT.NONE);
		lblOldStagingBase.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOldStagingBase.setText("Old Staging Base");
		
		oldStageText = new Text(container, SWT.BORDER);
		oldStageText.setEditable(false);
		oldStageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		oldStageText.setText(this.migratingURI.toString());
		
		Label lblDetectedArea = new Label(container, SWT.NONE);
		lblDetectedArea.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDetectedArea.setText("Detected Area");
		
		detectedStageText = new Text(container, SWT.BORDER);
		detectedStageText.setEditable(false);
		detectedStageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		detectedStageText.setText((this.detectedStagingArea == null ? "none" : this.detectedStagingArea.getURI().toString()));
		
		CLabel lblStagingArea = new CLabel(container, SWT.NONE);
		lblStagingArea.setAlignment(SWT.CENTER);
		GridData gd_lblStagingArea = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_lblStagingArea.verticalIndent = 10;
		lblStagingArea.setLayoutData(gd_lblStagingArea);
		lblStagingArea.setText("Choose the staging area that matches this staging location.");
		
		stagesList = new org.eclipse.swt.widgets.List(container, SWT.BORDER);
		stagesList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = stagesList.getSelectionIndex();
				URI u = URI.create(stagingAreas.get(i));
				selection = stages.getStage(u);
				log.debug("got selection: index "+i+" uri "+u.toString()+" stage "+selection);
				getWizard().getContainer().updateButtons();
			}
		});
		GridData gd_stagesList = new GridData(SWT.FILL, SWT.FILL, false, true, 2, 1);
		gd_stagesList.minimumHeight = 20;
		stagesList.setLayoutData(gd_stagesList);
		stagesList.setItems(this.stagingAreas.toArray(new String[] {}));
		
		if(this.detectedStagingArea != null) {
			stagesList.select(this.stagingAreas.indexOf(this.detectedStagingArea.getURI().toString()));
		}
	}
	
	@Override
	public boolean canFlipToNextPage() {
		return selection != null;
	}
	
	
	
}
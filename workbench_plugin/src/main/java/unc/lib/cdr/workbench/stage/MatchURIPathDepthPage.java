package unc.lib.cdr.workbench.stage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;

public class MatchURIPathDepthPage extends WizardPage implements
		IWizardPage {
	URI migrationURI;
	String[] pathSegments;
	private Scale urlPortionScale;
	private Text oldURIPortionText;
	URI replacedURIPrefix;
	private Text stagingAreaURIText;

	public URI getReplacedURIPrefix() {
		return replacedURIPrefix;
	}

	public void setReplacedURIPrefix(URI replacedURIPrefix) {
		this.replacedURIPrefix = replacedURIPrefix;
	}

	protected MatchURIPathDepthPage(String name, String desc, URI migrationURI) {
		super(name);
		setTitle(name);
		setDescription(desc);
		this.migrationURI = migrationURI;
		pathSegments = this.migrationURI.getPath().split("/");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		GridLayout gl_container = new GridLayout(2, false);
		gl_container.verticalSpacing = 10;
		gl_container.marginWidth = 10;
		container.setLayout(gl_container);
		
		CLabel lblThisIsA = new CLabel(container, SWT.NONE);
		lblThisIsA.setAlignment(SWT.CENTER);
		GridData gd_lblThisIsA = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_lblThisIsA.verticalIndent = 10;
		lblThisIsA.setLayoutData(gd_lblThisIsA);
		lblThisIsA.setText("Select the part of staged file URIs to replace with the new staging area URI:");
		
		Label lblNewStage = new Label(container, SWT.NONE);
		lblNewStage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewStage.setText("Staging Area URI");
		
		stagingAreaURIText = new Text(container, SWT.BORDER);
		stagingAreaURIText.setEditable(false);
		stagingAreaURIText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblReplaces = new Label(container, SWT.NONE);
		lblReplaces.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblReplaces.setText("Replaced URI Prefix");
		
		oldURIPortionText = new Text(container, SWT.BORDER);
		oldURIPortionText.setEditable(false);
		oldURIPortionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);
		
		urlPortionScale = new Scale(container, SWT.NONE);
		urlPortionScale.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handlePortionSelected();
			}
		});
		urlPortionScale.setMaximum(pathSegments.length);
		urlPortionScale.setMinimum(1);
		urlPortionScale.setPageIncrement(1);
		urlPortionScale.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		StyledText styledText = new StyledText(container, SWT.READ_ONLY | SWT.WRAP);
		styledText.setText("Staged files in the manifest with be adjusted, replacing the prefix selected above with the new staging area URI.");
		Color c = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);
		styledText.setBackground(c);
		GridData gd_styledText = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2);
		gd_styledText.verticalIndent = 10;
		styledText.setLayoutData(gd_styledText);
	}
	
	void onEnterPage(URI area) {
		stagingAreaURIText.setText(area.toString());
		urlPortionScale.setSelection(pathSegments.length-1);
		handlePortionSelected();
	}

	@Override
	public boolean canFlipToNextPage() {
		return this.getReplacedURIPrefix() != null;
	}

	private void handlePortionSelected() {
		int trimSegments = urlPortionScale.getMaximum() - urlPortionScale.getSelection();
		String uri = migrationURI.toString();
		List<String> segments = new ArrayList<String>();
		Collections.addAll(segments, uri.split("/"));
		for(int i = 0; i < trimSegments ; i++) {
			segments.remove(segments.size()-1);
		}
		StringBuilder sb = new StringBuilder();
		for(String seg : segments) {
			sb.append(seg).append("/");
		}
		replacedURIPrefix = URI.create(sb.toString());
		oldURIPortionText.setText(replacedURIPrefix.toString());
		getWizard().getContainer().updateButtons();
	}
	
	

}

package staging.plugin;

import java.net.URI;
import java.net.URL;
import java.util.Map;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.StagingException;

public class WorkbenchPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {
	private Stages stages;
	private Table repositoryTable;
	private Button addButton;
	private Button removeButton;

	public WorkbenchPreferencePage() {
	}

	public WorkbenchPreferencePage(String title) {
		super(title);
	}

	public WorkbenchPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(StagingPlugin.getDefault().getPreferenceStore());
		String json = getPreferenceStore().getString(
				StagingPlugin.LOCAL_STAGING_CONFIG_JSON);
		try {
			this.setByJSON(json);
		} catch (StagingException e) {
			throw new Error("Cannot initialize preferences", e);
		}
	}

	@Override
	public boolean performOk() {
		String config = this.stages.getLocalConfig();
		getPreferenceStore().setValue(StagingPlugin.LOCAL_STAGING_CONFIG_JSON,
				config);
		try {
			StagingPlugin.getDefault().loadStages();
		} catch (Exception ignored) {
		}
		return true;
	}

	private void setByJSON(String json) throws StagingException {
		this.stages = new Stages(json, new EFSResolver());
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		String json = StagingPlugin.getDefault().getPreferenceStore()
				.getDefaultString(StagingPlugin.LOCAL_STAGING_CONFIG_JSON);
		try {
			this.setByJSON(json);
			updateView();
		} catch (StagingException e) {
			throw new Error("Cannot set defaults", e);
		}
	}

	private void tableSelectionChanged() {
		// TODO fill in staging area details pane
	}

	@Override
	protected Control createContents(Composite parent) {
		setTitle("Repository Staging");
		setDescription("Set up the staging locations used by repositories.");
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(3, false);
		result.setLayout(layout);
		result.setLayoutData(new GridData(GridData.FILL_BOTH));

		// list the remotes configurations
		repositoryTable = new Table(result, SWT.BORDER | SWT.MULTI);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		repositoryTable.setLayoutData(gd);
		repositoryTable.setLinesVisible(true);
		repositoryTable.setHeaderVisible(true);
		TableColumn hostnameCol = new TableColumn(repositoryTable, SWT.NONE);
		hostnameCol.setText("Repository");
		TableColumn stagesCol = new TableColumn(repositoryTable, SWT.NONE);
		stagesCol.setText("Stages Connected");

		repositoryTable.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableSelectionChanged();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				tableSelectionChanged();
			}
		});

		addButton = new Button(result, SWT.NONE);
		addButton.setText("Add");
		removeButton = new Button(result, SWT.NONE);
		removeButton.setText("Remove");

		// TODO list locally defined areas (not used yet)
		registerButtons();
		stagesCol.pack();
		hostnameCol.pack();
		updateView();
		return result;
	}

	private void registerButtons() {
		addButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				InputDialog d = new InputDialog(event.widget.getDisplay()
						.getActiveShell(), "Repository URL",
						"Enter repository host name or URL.", null, null);
				if (d.open() == Window.OK) {
					try {
						stages.addRepositoryConfigURL(d.getValue());
						updateView();
					} catch (StagingException e) {
						MessageDialog.openError(event.widget.getDisplay()
								.getActiveShell(), "Cannot add repository", e
								.getLocalizedMessage());
					}
				}
			}
		});
		removeButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				TableItem[] select = repositoryTable.getSelection();
				for (TableItem i : select) {
					String configURL = (String) i.getData();
					stages.removeRepositoryConfigURL(configURL);
				}
				updateView();
			}
		});
	}

	private void updateView() {
		repositoryTable.clearAll();
		for (URL repoConfig : this.stages.getRepositoryConfigURLs()) {
			TableItem add = new TableItem(repositoryTable, SWT.NULL);
			add.setText(0, repoConfig.getHost());
			Map<URI, SharedStagingArea> areas = this.stages
					.getAreas(repoConfig);
			int attachedCnt = 0;
			for (SharedStagingArea a : areas.values()) {
				if (a.isConnected())
					attachedCnt++;
			}
			int stageCnt = this.stages.getAreas(repoConfig).size();
			add.setText(
					1,
					String.valueOf(attachedCnt) + " of "
							+ String.valueOf(stageCnt)+" autoconnected");
			add.setData(repoConfig);
		}
		repositoryTable.getColumns()[0].pack();
	}
}

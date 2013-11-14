package unc.lib.cdr.workbench.project;

import java.net.URI;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import staging.plugin.views.StagingFolderDialog;
import unc.lib.cdr.workbench.stage.StagingJob;
import edu.unc.lib.staging.SharedStagingArea;

public class StagingAreaContributionItem extends ContributionItem {
	private static final Logger log = LoggerFactory.getLogger(StagingAreaContributionItem.class);

	public StagingAreaContributionItem() {
	}

	public StagingAreaContributionItem(String id) {
		super(id);
	}

	@Override
	public void fill(Menu menu, int index) {
		IProject project = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelection selection = window.getActivePage().getSelection();
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection s = (IStructuredSelection)selection;
			if(s.getFirstElement() instanceof IProject) {
				project = (IProject)s.getFirstElement();
			}
		}
		if(project == null) return;
		final MetsProjectNature mpn = MetsProjectNature.get(project);
		if(mpn == null) return;
		
		// submenu button
		MenuItem submenuitem = new MenuItem(menu, SWT.CASCADE, index);
		submenuitem.setText("Staging Area");
		
		Menu subMenu = new Menu (menu);
		submenuitem.setMenu (subMenu);
		
		for(Entry<URI, SharedStagingArea> area : StagingPlugin.getDefault().getStages().getAllAreas().entrySet()) {
			if(!area.getValue().isReadOnly())
				addStageMenuItem(area.getValue(), subMenu, mpn);
		}
	}
	
	private void addStageMenuItem(final SharedStagingArea area, Menu menu, final MetsProjectNature mpn) {
		final String name = area.getName();
		final URI base = area.getURI();
		final MenuItem menuItem = new MenuItem(menu, SWT.RADIO);
		menuItem.setText(name);
		menuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(!menuItem.getSelection()) return;
				Shell shell = Display.getDefault().getActiveShell();
				URI projectManifestBase = null;
				if (!area.getURI().isAbsolute()) {
					projectManifestBase = area.makeURI("");
				} else {
					StagingFolderDialog d = new StagingFolderDialog(shell, area);
					d.open();
					log.debug("Made relative path: {}", d.getRelativePath());
					projectManifestBase = area.makeURI(d.getRelativePath(), mpn.getProject().getName());
					log.debug("Made manifest base: {}", projectManifestBase);
				}
				boolean okay = MessageDialog.openConfirm(shell, "Switch Staging Area", 
						"Please confirm migration to "+name+" ("+projectManifestBase+").");
				if(!okay) return;
				mpn.setStagingBase(projectManifestBase.toString());
				if (mpn.getAutomaticStaging()) {
					Job stagingJob = new StagingJob("Staging after capture", mpn.getProject());
					stagingJob.setRule(StagingJob.mySchedulingRule);
					stagingJob.schedule();
				}
			}
		});
		URI stagingBase = mpn.getStagingManifestURI();
		if(stagingBase != null && area.isWithinManifestNamespace(stagingBase)) {
			menuItem.setSelection(true);
			menuItem.setEnabled(false);
		}
	}

}

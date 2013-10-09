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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import staging.plugin.StagingPlugin;
import unc.lib.cdr.workbench.stage.StagingJob;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.StagingArea;

public class StagingAreaContributionItem extends ContributionItem {

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
	
	private void addStageMenuItem(StagingArea area, Menu menu, final MetsProjectNature mpn) {
		final String name = area.getName();
		final URI base = area.getURI();
		final MenuItem menuItem = new MenuItem(menu, SWT.RADIO);
		menuItem.setText(name);
		menuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(!menuItem.getSelection()) return;
				boolean okay = MessageDialog.openConfirm(Display.getDefault().getActiveShell(), "Switch Staging Area", 
						"Please confirm that you want to switch the staging area to "+name+" and migrate previously staged files.");
				if(!okay) return;
				mpn.setStagingBase(base.toString());
				if (mpn.getAutomaticStaging()) {
					Job stagingJob = new StagingJob("Staging after capture", mpn.getProject());
					stagingJob.setRule(StagingJob.mySchedulingRule);
					stagingJob.schedule();
				}
			}
		});
		URI stagingBase = mpn.getStagingBase();
		if(stagingBase != null && stagingBase.equals(area.getURI())) {
			menuItem.setSelection(true);
			menuItem.setEnabled(false);
		}
	}

}

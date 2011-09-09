package unc.lib.cdr.workbench.commands;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class AutoStageAction implements IObjectActionDelegate {
	ISelection selection = null;

	public AutoStageAction() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					try {
						toggleStaging(project);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * @param project
	 */
	private void toggleStaging(IProject project) throws CoreException {
		MetsProjectNature mpn = (MetsProjectNature)project.getNature(MetsProjectNature.NATURE_ID);
		boolean setting = mpn.getAutomaticStaging(project);
		mpn.setAutomaticStaging(!setting, project);
		System.out.println("toggled auto staging, it now says "+mpn.getAutomaticStaging(project));
		if(mpn.getAutomaticStaging(project)) {
			project.build(IncrementalProjectBuilder.FULL_BUILD, MetsProjectNature.STAGING_BUILDER_ID, Collections.EMPTY_MAP,
				new NullProgressMonitor());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 * org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 * org.eclipse.ui.IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selectionChanged(action, targetPart.getSite().getPage().getSelection());
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					try {
						MetsProjectNature mpn = (MetsProjectNature)project.getNature(MetsProjectNature.NATURE_ID);
						boolean status = mpn.getAutomaticStaging(project);
						action.setChecked(new Boolean(status));
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}

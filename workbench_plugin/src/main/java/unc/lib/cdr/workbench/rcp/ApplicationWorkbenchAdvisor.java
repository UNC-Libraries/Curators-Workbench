/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.rcp;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.ISaveParticipant;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	private static final String PERSPECTIVE_ID = "cdr-workbench.AccessionPerspective"; // "org.eclipse.ui.resourcePerspective";
	protected static URL surveyURL = null;

	static {
		try {
			surveyURL = new URL("https://docs.google.com/forms/d/12y8uyaQSWzZHU9WVNK114VbWDkkZjYPFYxANjioyfeI/viewform");
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}
	
	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	@Override
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
		IDE.registerAdapters();
		// done with workspace location stuff

		ISaveParticipant saveParticipant = new METSWorkspaceSaveParticipant();
		try {
			// restore models from workbench files
			// for(IProject p :
			// ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			// if(p.isOpen() && p.hasNature(MetsProjectNature.NATURE_ID)) {
			// MetsProjectNature n =
			// (MetsProjectNature)p.getNature(MetsProjectNature.NATURE_ID);
			// n.load();
			// }
			// }
			ResourcesPlugin.getWorkspace().addSaveParticipant(
					Activator.PLUGIN_ID, saveParticipant);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean preShutdown() {
		try {
			ResourcesPlugin.getWorkspace().save(true, null);
		} catch (CoreException e) {
			System.err.println(e.getMessage());
		}
		return super.preShutdown();
	}

	@Override
	public void postStartup() {
		boolean prompted = Activator.getDefault().getPreferenceStore()
				.getBoolean("USER_SURVEY_PROMPTED");
		if (!prompted) {
			Activator.getDefault().getWorkbench().getDisplay()
					.asyncExec(new Runnable() {
						@Override
						public void run() {
							boolean okay = MessageDialog
									.openConfirm(
											Activator.getDefault()
													.getWorkbench()
													.getDisplay()
													.getActiveShell(),
											"User Survey",
											"Thank you for installing the free and open source Curator's Workbench.\n"
													+ "If you have time, please take a minute to fill out our user survey.");
							Activator.getDefault().getPreferenceStore().setValue("USER_SURVEY_PROMPTED", true);
							if (okay) {
								try {
									PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(surveyURL);
								} catch (PartInitException ignore) {}
							}
						}
					});
		}
		super.postStartup();
	}

}

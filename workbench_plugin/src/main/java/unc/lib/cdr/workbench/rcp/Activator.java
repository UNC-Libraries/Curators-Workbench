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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;
import org.osgi.framework.BundleContext;

import unc.lib.cdr.workbench.stage.StagingJob;
import unc.lib.cdr.workbench.xwalk.CrosswalkJob;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "workbench_plugin";

	// The shared instance
	private static Activator plugin;

	// InstanceScope node holding preferences that name the available staging locations
	public static final String STAGE_LOCATIONS = "StageLocationsPreference";

	public static final String AUTOSTAGE_PREFERENCE = "AutoStagingPreference";

	/**
	 * The constructor
	 */
	public Activator() {
		super();
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);
		// LabelImageFactory.initializeImageRegistry(reg);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		UIJob job = new UIJob("InitCommandsWorkaround") {

			@Override
			public IStatus runInUIThread(@SuppressWarnings("unused") IProgressMonitor monitor) {

				ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getService(ICommandService.class);
				Command command = commandService.getCommand("workbench_plugin.commandSetDivType");
				command.isEnabled();
				return new Status(IStatus.OK, PLUGIN_ID, "Init commands workaround performed succesfully");
			}

		};
		job.schedule();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		IJobManager manager = Platform.getJobManager();
		manager.cancel(StagingJob.stagingJobFamilyObject);
		Job[] stagingJobs = manager.find(StagingJob.stagingJobFamilyObject);
		for(Job sj : stagingJobs) {
			if(!sj.cancel())
				sj.join();
		}
		manager.cancel(CrosswalkJob.crosswalkJobFamilyObject);
		Job[] cwjobs = manager.find(CrosswalkJob.crosswalkJobFamilyObject);
		for(Job cwj : cwjobs) {
			if(!cwj.cancel())
				cwj.join();
		}
		manager.cancel(null);
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 *
	 * @param path
	 *           the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public List<String[]> getDefaultStagingLocationsPreference() {
		return convert(getPreferenceStore().getDefaultString(Activator.STAGE_LOCATIONS));
	}

	public List<String[]> getStagingLocationsPreference() {
		return convert(getPreferenceStore().getString(Activator.STAGE_LOCATIONS));
	}

	private static List<String[]> convert(String str) {
		List<String[]> result = new ArrayList<String[]>();
		String[] lines = str.split("\n");
		for (String lin : lines) {
			int space = lin.indexOf("|");
			String uri = lin.substring(0, space);
			String name = lin.substring(space + 1);
			result.add(new String[] { name, uri });
		}
		return result;
	}

	public void setStagingLocationsPreference(List<String[]> locs) {
		getPreferenceStore().setValue(Activator.STAGE_LOCATIONS, convertLocationsToPref(locs));
	}

	public static String convertLocationsToPref(List<String[]> locs) {
		StringBuffer buffer = new StringBuffer();
		for (String[] l : locs) {
			buffer.append(l[1]).append("|").append(l[0]).append("\n");
		}
		return buffer.toString();
	}

}

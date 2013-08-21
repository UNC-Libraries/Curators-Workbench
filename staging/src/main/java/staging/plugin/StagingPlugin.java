package staging.plugin;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Hashtable;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.service.url.URLConstants;
import org.osgi.service.url.URLStreamHandlerService;

import staging.plugin.views.StagingAreasView;
import edu.unc.lib.staging.Stages;

public class StagingPlugin extends AbstractUIPlugin implements
		PropertyChangeListener {
	private static StagingPlugin plugin;
	// The plug-in ID
	public static final String PLUGIN_ID = "staging.plugin";
	public static final String LOCAL_STAGING_CONFIG_JSON = "localStagingConfigJSON";
	private Stages stages;

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static StagingPlugin getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		Hashtable<String, String[]> properties = new Hashtable<String, String[]>();
		properties.put(URLConstants.URL_HANDLER_PROTOCOL,
				new String[] { "irods" });
		context.registerService(URLStreamHandlerService.class.getName(),
				new IRODSURLStreamHandler(), properties);
		loadStages();
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().showView(StagingAreasView.ID);
				} catch (RuntimeException ignored) {
				} catch (PartInitException ignored) {
				}
			}
		});
	}

	public void loadStages() throws Exception {
		String localConfig = Platform.getPreferencesService().getString(
				PLUGIN_ID, LOCAL_STAGING_CONFIG_JSON, null, null);
		this.stages = new Stages(localConfig, new EFSResolver());
		this.stages.addChangeListener(this);
		refreshViews();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	public Stages getStages() {
		return this.stages;
	}

	public void saveConfig() {
		String config = stages.getLocalConfig();
		getPreferenceStore().setValue(StagingPlugin.LOCAL_STAGING_CONFIG_JSON,
				config);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (this.stages.equals(evt.getSource())) {
			refreshViews();
		}
	}

	private void refreshViews() {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IViewPart view = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.findView(StagingAreasView.ID);
				if (view != null) {
					StagingAreasView myview = (StagingAreasView) view
							.getAdapter(StagingAreasView.class);
					if (myview != null) {
						myview.refreshView();
					}
				}
			}
		});
	}
}

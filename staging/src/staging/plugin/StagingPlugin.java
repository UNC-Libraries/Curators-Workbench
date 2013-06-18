package staging.plugin;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.unc.lib.staging.IrodsURIPattern;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.TagURIPattern;
import edu.unc.lib.staging.URIPattern;


public class StagingPlugin extends AbstractUIPlugin {
	private static StagingPlugin plugin;
	// The plug-in ID
	public static final String PLUGIN_ID = "staging.plugin";
	public static final String LOCAL_STAGING_CONFIG_JSON = "localStagingConfigJSON";
	Stages stages;
	
	/**
	 * Returns the shared instance
	 * @return the shared instance
	 */
	public static StagingPlugin getDefault() {
		return plugin;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// load config
		IEclipsePreferences prefs = DefaultScope.INSTANCE.getNode(StagingPlugin.PLUGIN_ID);
		String localConfig = prefs.get(LOCAL_STAGING_CONFIG_JSON, null);
		List<URIPattern> patterns = new ArrayList<URIPattern>();
		patterns.add(new TagURIPattern());
		patterns.add(new IrodsURIPattern());
		this.stages = new Stages(localConfig, new EFSResolver(), patterns);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}
}

package staging.plugin;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.unc.lib.staging.CleanupPolicy;
import edu.unc.lib.staging.StagingArea;

/**
 * Represents a staging area in a subdirectory of the Eclipse project. This follows BagIt conventions
 * where the project folder is considered the bag.
 * 
 * manifest URIs: data/<original path>
 * staged URLs: file:<project path>/data/<original path>
 *  
 * @author count0
 *
 */
public class ProjectBagItDataStage implements StagingArea {
	Logger log = LoggerFactory.getLogger(ProjectBagItDataStage.class);
	IProject project;
	IPath projectPath;
	File dataDir;
	URL baseStagedFileURL;
	URI baseManifestURI;
	

	public ProjectBagItDataStage(IProject project) {
		super();
		this.project = project;
		try {
			this.projectPath = project.getLocation();
			this.dataDir = new File(projectPath.toFile(), "data");
			this.baseStagedFileURL = dataDir.toURI().toURL();
			this.baseManifestURI = new URI("data/");
		} catch(IOException e) {
			throw new Error("Unexpected problems with project path.", e);
		} catch (URISyntaxException e) {
			throw new Error("Unexpected problems with project path.", e);
		}
	}

	@Override
	public URI getURI() {
		return this.baseManifestURI;
	}

	@Override
	public String getName() {
		return "BagIt Data Folder for Project";
	}

	@Override
	public CleanupPolicy getIngestCleanupPolicy() {
		return null;
	}

	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public String getStatus() {
		if(dataDir.exists()) {
			return "Data folder created";
		} else {
			return "Data folder not yet created";			
		}
	}

	@Override
	public String getScheme() {
		return "bagit";
	}

	@Override
	public URL makeStagedFileURL(String projectName, String originalPath) {
		try {
			File f = new File(this.dataDir, originalPath);
			log.info(f.getAbsolutePath());
			URL result = new URL("file","",f.getAbsolutePath());
			log.info(result.toString());
			return result;
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}

	@Override
	public URL getStagedURL(URI manifestURI) {
		// TODO encode path segments properly
		try {
			return project.getLocation().append(manifestURI.getPath()).toFile().toURI().toURL();
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}

	@Override
	public boolean isWithin(URI manifestURI) {
		return manifestURI != null && manifestURI.getPath() != null && manifestURI.getPath().startsWith("data/");
	}

	@Override
	public URI getManifestURI(URL stagedURL) {
		IPath stagedPath = new Path(stagedURL.getPath());
		IPath projRelPath = stagedPath.makeRelativeTo(this.projectPath);
		StringBuilder sb = new StringBuilder();
		String basePath = baseManifestURI.getPath();
		sb.append(basePath.endsWith("/") ? basePath.substring(0, basePath.length()-1) : basePath);
		String putPath = projRelPath.toString();
		try {
			for(String seg : putPath.split("/")) {
				sb.append("/").append(URLEncoder.encode(seg,"utf-8"));
			}
		} catch (UnsupportedEncodingException e) {
			throw new Error(e);
		}
		try {
			return new URI(sb.toString());
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
	}

}

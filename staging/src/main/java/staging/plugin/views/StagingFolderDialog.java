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
package staging.plugin.views;

import java.net.URI;
import java.util.ArrayList;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.StagingException;

public class StagingFolderDialog extends ElementTreeSelectionDialog {
	private static final Logger log = LoggerFactory
			.getLogger(StagingFolderDialog.class);
	private SharedStagingArea area = null;
	private String relativePath = null;

	public StagingFolderDialog(Shell parent, SharedStagingArea area) {
		super(parent, new EFSLabelProvider(), new EFSTreeContentProvider());
		this.area = area;
		setTitle("Optionally stage to a sub-folder.");
		setAllowMultiple(false);
		IFileStore fs;
		try {
			fs = EFS.getStore(area.getConnectedStorageURI());
		} catch (CoreException e1) {
			throw new Error(e1);
		}
		this.setInput(fs);
	}

	@Override
	protected void computeResult() {
		log.debug("in compute result");
		super.computeResult();
		IFileStore selected = (IFileStore) getFirstResult();
		if (selected != null) {
			URI storageURI = selected.toURI();
			log.debug("got a folder storage URI of {}", storageURI);
			URI manifestParentFolderURI;
			try {
				manifestParentFolderURI = area.getManifestURI(storageURI);
			} catch (StagingException e) {
				throw new Error(e);
			}
			relativePath = area.getUriPattern().getRelativePath(area.getURI(),
					manifestParentFolderURI);
		} else {
			relativePath = null;
		}
	}

	public String getRelativePath() {
		return this.relativePath;
	}

	public static class EFSLabelProvider implements ILabelProvider {

		@Override
		public void addListener(ILabelProviderListener listener) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return true;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
		}

		@Override
		public Image getImage(Object element) {
			return StagingPlugin.getDefault().getImageRegistry()
					.get(StagingPlugin.FOLDER_IMAGE_ID);
		}

		@Override
		public String getText(Object element) {
			return ((IFileStore) element).getName();
		}

	}

	public static class EFSTreeContentProvider implements ITreeContentProvider {

		public EFSTreeContentProvider() {
			super();
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			try {
				IFileStore[] result = ((IFileStore) inputElement).childStores(
						EFS.NONE, new NullProgressMonitor());
				ArrayList<IFileStore> containers = new ArrayList<IFileStore>();
				for (IFileStore f : result) {
					if (f.fetchInfo().isDirectory()) {
						containers.add(f);
					}
				}
				return containers.toArray(new IFileStore[] {});
			} catch (CoreException e) {
				throw new Error(e);
			}
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return getElements(parentElement);
		}

		@Override
		public Object getParent(Object element) {
			return ((IFileStore) element).getParent();
		}

		@Override
		public boolean hasChildren(Object element) {
			return true;
		}

	}

}

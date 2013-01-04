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
package unc.lib.cdr.workbench.arrange;

//import gov.loc.mets.DivType;
import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.FileType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructLinkType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.properties.IPropertySource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.ICustomEObjectBucket;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ArrangementContentProvider extends AdapterFactoryContentProvider /* implements IResourceChangeListener */{
	private static final Logger log = LoggerFactory.getLogger(ArrangementContentProvider.class);
	private TreeViewer tviewer = null;

	// private AdapterFactoryContentProvider provider = new
	// AdapterFactoryContentProvider(MetsProjectNature.getAdapterFactory());
	// private static final Class<?> ITreeItemContentProviderClass =
	// ITreeItemContentProvider.class;
	// private TreeViewer viewer = null;

	public ArrangementContentProvider() {
		super(MetsProjectNature.getAdapterFactory());
		// ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
		MetsProjectNature.getAdapterFactory().addListener(this);
	}

	/*
	 * Returns the Original File Sets for a project and descendents. (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang. Object)
	 */
	@Override
	public Object[] getChildren(Object parent) {
		// log.debug("getChildren:"+parent.toString());
		List<Object> results = new ArrayList<Object>();
		try {
			if (parent instanceof IProject) {
				IProject p = (IProject) parent;
				if (p.isOpen()) {
					MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
					results.add(n.getArrangementElement());
				}
			} else if (parent instanceof ArrangementProjectElement) {
				MetsType mets = null;
				ArrangementProjectElement e = (ArrangementProjectElement) parent;
				// return all the snapshots of this URI
				mets = e.getProjectNature().getMets();
				return METSUtils.findBagDiv(mets).getDiv().toArray();
				// ITreeItemContentProvider treeItemContentProvider =
				// (ITreeItemContentProvider) MetsProjectNature
				// .getAdapterFactory().adapt(METSUtils.findBagDiv(mets),
				// ITreeItemContentProviderClass);
				// if (treeItemContentProvider != null) {
				// results.addAll(treeItemContentProvider.getChildren(METSUtils.findBagDiv(mets)));
				// } else {
				// log.debug("Cannot find tree item provider for bag div");
				// }
			} else if (parent instanceof DivType) {
				DivType div = (DivType) parent;
				MetsType mets = MetsProjectNature.getNatureForMetsObject(div).getMets();
				if (mets.getStructLink() != null && mets.getStructLink().getSmLink() != null) {
					for (SmLinkType l : mets.getStructLink().getSmLink()) {
						if (div.equals(l.getXlinkFrom())) {
							results.add(l);
						}
					}
				}
				for (Object o : super.getChildren(parent)) {
					results.add(o);
				}
			} else if (parent instanceof ICustomEObjectBucket) {
				ICustomEObjectBucket bucket = (ICustomEObjectBucket) parent;
				return bucket.getChildren();
			} else {
				for (Object o : super.getChildren(parent)) {
					results.add(o);
				}
			}
			/*
			 * else if (parent instanceof DivType) { ITreeItemContentProvider treeItemContentProvider =
			 * (ITreeItemContentProvider) MetsProjectNature .getAdapterFactory().adapt(parent,
			 * ITreeItemContentProviderClass); if (treeItemContentProvider != null) {
			 * results.addAll(treeItemContentProvider.getChildren(parent)); } }
			 */
		} catch (CoreException e) {
			throw new Error(e);
		}
		return results.toArray();
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ArrangementProjectElement) {
			return ((ArrangementProjectElement) element).getParent();
		} else if (element instanceof ICustomEObjectBucket) {
			return ((ICustomEObjectBucket) element).getParent();
		} else {
			return super.getParent(element);
		}
		/*
		 * else if (element instanceof EObject) { ITreeItemContentProvider treeItemContentProvider =
		 * (ITreeItemContentProvider) MetsProjectNature .getAdapterFactory().adapt(element,
		 * ITreeItemContentProviderClass); if (treeItemContentProvider != null) { return
		 * treeItemContentProvider.getParent(element); } } return null;
		 */
	}

	@Override
	public boolean hasChildren(Object element) {
		// log.debug("hasChildren:"+element.toString());
		if (element instanceof IProject) {
			return true;
		} else if (element instanceof ArrangementProjectElement) {
			return true;
		} else if (element instanceof ICustomEObjectBucket) {
			return true;
		} else {
			return super.hasChildren(element);
		}
		/*
		 * else if (element instanceof DivType) { DivType d = (DivType) element; if (d.getDiv().size() > 0) { return true;
		 * } else { return false; } } else { return false; }
		 */
	}

	@Override
	public Object[] getElements(Object element) {
		return this.getChildren(element);
	}

	@Override
	public IPropertySource getPropertySource(Object object) {
		log.debug("getPropertySource called with " + object);
		return super.getPropertySource(object);
	}

	@Override
	public void dispose() {
		// ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		MetsProjectNature.getAdapterFactory().removeListener(this);
		super.dispose();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
		this.tviewer = (TreeViewer) viewer;
		super.inputChanged(viewer, oldInput, newInput);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.INotifyChangedListener#notifyChanged(org
	 * .eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		System.err.println("notifier is " + notification.getNotifier());
		if (tviewer != null) {
			final Set<Object> updates = new HashSet<Object>();
			if (notification.getNotifier() instanceof FileType) {
				FileType f = (FileType) notification.getNotifier();
				OriginalFileStore orig = MetsProjectNature.getOriginal(f);
				updates.add(orig);
				updates.add(orig.getMetsDivType());
			} else if (notification.getNotifier() instanceof DivType) {
				DivType d = (DivType) notification.getNotifier();
				if (METSConstants.Div_Bag.equals(d.getTYPE())) {
					updates.add(MetsProjectNature.getNatureForMetsObject(d).getArrangementElement());
				} else if (METSConstants.Div_File.equals(d.getTYPE())) {
					updates.add(d);
					updates.add(MetsProjectNature.getOriginal(d));
				} else {
					updates.add(d);
				}
			} else if (notification.getNotifier() instanceof MetsType) {
				MetsType mets = (MetsType) notification.getNotifier();
				if (notification.getOldValue() instanceof MdSecType) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							if (tviewer != null && tviewer.getControl() != null && !tviewer.getControl().isDisposed()) {
								tviewer.refresh();
							}
						}
					});
				}
			} else if(notification.getNotifier() instanceof AmdSecType) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (tviewer != null && tviewer.getControl() != null && !tviewer.getControl().isDisposed()) {
							tviewer.refresh();
						}
					}
				});
			} else if(notification.getNotifier() instanceof StructLinkType) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (tviewer != null && tviewer.getControl() != null && !tviewer.getControl().isDisposed()) {
							tviewer.refresh();
						}
					}
				});
			}
			if (updates.size() > 0) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (tviewer != null && tviewer.getControl() != null && !tviewer.getControl().isDisposed()) {
							for (Object o : updates) {
								if (o != null)
									tviewer.refresh(o, true);
							}
						}
					}
				});
			}
		}
	}

}

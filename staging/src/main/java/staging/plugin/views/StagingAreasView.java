package staging.plugin.views;

import java.io.File;
import java.net.URI;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import staging.plugin.StagingPlugin;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.StagingArea;
import edu.unc.lib.staging.StagingException;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class StagingAreasView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "staging.plugin.views.StagingAreasView";

	private TableViewer viewer;
	private static final int NAME_COL = 0;
	private static final int STATUS_COL = 1;
	private static final int BASE_URI_COL = 2;
	private static final int WRITABLE_COL = 3;

	private Action actionReloadConfiguration;
	private Action actionConnect;

	private ImageDescriptor imageDescrRefresh = StagingPlugin.imageDescriptorFromPlugin(StagingPlugin.PLUGIN_ID, "icons/refresh.gif");
	private Image imageConnected = PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED).createImage();
	private Image imageDisconnected = PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED_DISABLED).createImage();
	
	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return StagingPlugin.getDefault().getStages().getAllAreas()
					.values().toArray();
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			StagingArea stage = (StagingArea) obj;
			switch (index) {
			case NAME_COL:
				return stage.getName();
			case BASE_URI_COL:
				return stage.getURI().toString();
			case STATUS_COL:
				return stage.isConnected() ? "connected" : "";
			case WRITABLE_COL:
				return stage.isReadOnly() ? "no" : "yes";
			}
			return "";
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			String s1 = ((SharedStagingArea)e1).getName();
			String s2 = ((SharedStagingArea)e2).getName();
			return super.compare(viewer, s1, s2);
		}
		
	}

	/**
	 * The constructor.
	 */
	public StagingAreasView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		ViewLabelProvider labelProvider = new ViewLabelProvider();
		createColumns(parent, labelProvider);
		viewer.setContentProvider(new ViewContentProvider());
		//viewer.setLabelProvider(labelProvider);
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		viewer.getTable().setLinesVisible(true);
		viewer.getTable().setHeaderVisible(true);
		
		ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE); 

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(viewer.getControl(), "staging.plugin.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void createColumns(Composite parent, ViewLabelProvider labelProvider) {
		String[] titles = { "Stage Name", "Base URI", "Status", "Writable" };
		int[] bounds = { 250, 300, 200, 200 };

		TableViewerColumn col0 = createTableViewerColumn(titles[0], bounds[0], 0);
		col0.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((StagingArea)element).getName();
			}
		});
		TableViewerColumn col1 = createTableViewerColumn(titles[1], bounds[1], 1);
		col1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((StagingArea)element).getURI().toString();
			}

			@Override
			public String getToolTipText(Object element) {
				return getAreaTooltip(element);
			}
		});
		TableViewerColumn col2 = createTableViewerColumn(titles[2], bounds[2], 2);
		col2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				boolean conn = ((StagingArea)element).isConnected();
				if(conn) {
					return imageConnected;
				} else {
					return imageDisconnected;
				}
			}

			@Override
			public String getText(Object element) {
				return ((StagingArea)element).getStatus();
			}

			@Override
			public String getToolTipText(Object element) {
				return getAreaTooltip(element);
			}
		});
		TableViewerColumn col3 = createTableViewerColumn(titles[3], bounds[3], 3);
		col3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((StagingArea)element).isReadOnly() ? "no" : "yes";
			}

			@Override
			public String getToolTipText(Object element) {
				return getAreaTooltip(element);
			}
		});
	}
	
	private String getAreaTooltip(Object element) {
		StagingArea area = (StagingArea)element;
		StringBuilder sb = new StringBuilder();
		sb.append(area.getName()).append("\n");
		sb.append(area.getURI()).append("\n");
		sb.append(area.getStatus()).append("\n");
		if(area.isConnected() && area.getConnectedStorageURI() != null) {
			sb.append("\nmapped to ").append(area.getConnectedStorageURI().getPath()).append("\n");
		}
		sb.append( area.isReadOnly() ? "Read Only: can capture existing files" : "Writable: can stage any files" );
		return sb.toString();
	}
	
	public void refreshView() {
		if(this.viewer != null) {
			viewer.refresh();
		}
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				StagingAreasView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actionReloadConfiguration);
	}

	private void fillContextMenu(IMenuManager manager) {
		IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
		SharedStagingArea stage = (SharedStagingArea)sel.getFirstElement();
		if(!stage.isConnected()) manager.add(actionConnect);
		// Other plug-ins can contribute there actions here
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionReloadConfiguration);
	}

	private void makeActions() {
		actionReloadConfiguration = new Action() {
			public void run() {
				try {
					StagingPlugin.getDefault().loadStages();
					showMessage("Repository staging configuration reloaded.");
				} catch (Exception e) {
					showMessage("Problem reloading repository staging configuration: "
							+ e.getMessage());
				}
			}
		};
		actionReloadConfiguration.setText("Reload configuration");
		actionReloadConfiguration
				.setToolTipText("Update staging areas for your repositories.");
		actionReloadConfiguration.setImageDescriptor(imageDescrRefresh);

		actionConnect = new Action() {
			public void run() {
				IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
				SharedStagingArea stage = (SharedStagingArea)sel.getFirstElement();
				StagingPlugin.getDefault().getStages().connect(stage.getURI());
				if (!stage.isConnected()
						&& stage.getUriPattern().isLocallyMapped()) {
					DirectoryDialog d = new DirectoryDialog(viewer.getTable()
							.getShell(), SWT.OPEN);
					String path = d.open();
					if (path != null) {
						File f = new File(path);
						try {
							URI url = f.toURI();
							StagingPlugin.getDefault().getStages()
									.setStorageMapping(stage.getURI(), url);
						} catch (StagingException ignored) {
						}
						StagingPlugin.getDefault().saveConfig();
						StagingPlugin.getDefault().getStages()
								.connect(stage.getURI());
					}
				}
			}
		};
		actionConnect.setText("Connect");
		actionConnect.setToolTipText("Connect to this staging area.");
		actionConnect.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				actionConnect.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Staging Areas", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
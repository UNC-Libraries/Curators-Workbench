package unc.lib.cdr.workbench.views;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class PropertySheetPropertySection extends AbstractPropertySection {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(PropertySheetPropertySection.class);

	/**
	 * The Property Sheet Page.
	 */
	protected PropertySheetPage page;

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, final TabbedPropertySheetPage atabbedPropertySheetPage) {
		super.createControls(parent, atabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		page = new PropertySheetPage() {

			@Override
			public void setRootEntry(IPropertySheetEntry entry) {

				// TODO Auto-generated method stub
				super.setRootEntry(entry);
			}

		};
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(MetsProjectNature.getAdapterFactory()));

		page.createControl(composite);
		FormData data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		page.getControl().setLayoutData(data);

		page.getControl().addControlListener(new ControlAdapter() {

			@Override
			public void controlResized(ControlEvent e) {
				atabbedPropertySheetPage.resizeScrolledComposite();
			}
		});
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		LOG.debug("setInput called: " + selection + selection.getClass());
		IStructuredSelection s = (IStructuredSelection) selection;
		// if (s.getFirstElement() instanceof DivType) {
		// DivType d = (DivType) s.getFirstElement();
		// MdSecType userModsSection = null;
		// if (d.getDMDID() != null) {
		// for (String id : d.getDMDID()) {
		// MdSecType md = (MdSecType) d.eResource().getEObject(id);
		// if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
		// userModsSection = md;
		// break;
		// }
		// }
		// s = new StructuredSelection(userModsSection.getMdWrap().getXmlData().getAny().toArray()[0]);
		// LOG.debug("overriding selection to : "+s);
		// }
		// }
		super.setInput(part, s);
		page.selectionChanged(part, s);
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();

		if (page != null) {
			page.dispose();
			page = null;
		}

	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
	 */
	@Override
	public void refresh() {
		page.refresh();
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

}

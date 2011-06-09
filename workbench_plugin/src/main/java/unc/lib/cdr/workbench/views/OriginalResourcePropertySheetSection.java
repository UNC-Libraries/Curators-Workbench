package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
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
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class OriginalResourcePropertySheetSection extends AbstractPropertySection {

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
				super.setRootEntry(entry);
			}
		};

		page.createControl(composite);
		FormData data = new FormData();
		data.left = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.right = new FormAttachment(95, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.HSPACE);
		data.bottom = new FormAttachment(95, ITabbedPropertyConstants.HSPACE);
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
		// LOG.debug("setInput called: " + selection + selection.getClass());
		ISelection pageSelect = null;
		IResource original = null;
		IStructuredSelection s = (IStructuredSelection) selection;
		if (s.getFirstElement() instanceof DivType) {
			DivType d = (DivType) s.getFirstElement();
			original = MetsProjectNature.getOriginal(d);
			pageSelect = new ListSelection(Collections.singletonList(original));
			page.selectionChanged(part, pageSelect);
		}
		// LOG.debug("get original: " + original);
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

	static class ListSelection implements IStructuredSelection {
		List list = null;

		ListSelection(List list) {
			this.list = list;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.ISelection#isEmpty()
		 */
		@Override
		public boolean isEmpty() {
			return list.isEmpty();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredSelection#getFirstElement()
		 */
		@Override
		public Object getFirstElement() {
			return list.isEmpty() ? null : list.get(0);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredSelection#iterator()
		 */
		@Override
		public Iterator iterator() {
			return list.iterator();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredSelection#size()
		 */
		@Override
		public int size() {
			return list.size();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredSelection#toArray()
		 */
		@Override
		public Object[] toArray() {
			return list.toArray();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredSelection#toList()
		 */
		@Override
		public List toList() {
			return list;
		}

	}

}

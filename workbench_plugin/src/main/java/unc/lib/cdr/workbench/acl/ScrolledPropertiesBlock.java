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
package unc.lib.cdr.workbench.acl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.schemas.acl.AclFactory;
import edu.unc.lib.schemas.acl.AclPackage;
import edu.unc.lib.schemas.acl.GrantType;
import edu.unc.lib.schemas.acl.impl.GrantTypeImpl;

/**
 * @author Gregory Jansen
 *
 */
public class ScrolledPropertiesBlock extends MasterDetailsBlock implements ISelectionChangedListener {
	private AccessControlFormPage page;
	private TreeViewer viewer;
	private SelectionChangedEvent selectionEvent;
	boolean debug = false; // true for console debug output

	public AdapterFactoryTreeEditor ADFTE;

	public ScrolledPropertiesBlock(AccessControlFormPage page) {
		this.page = page;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#createMasterPart(org.eclipse. ui.forms.IManagedForm,
	 * org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) {
		FormToolkit toolkit = managedForm.getToolkit();
		Section section = toolkit.createSection(parent, Section.TITLE_BAR);
		section.setText("Roles Granted"); //$NON-NLS-1$
		section.marginWidth = 10;
		section.marginHeight = 5;
		
		Label descriptionLabel = new Label(section, SWT.WRAP);
		descriptionLabel.setText("Add, edit or remove the roles granted at this level."); //$NON-NLS-1$
		section.setDescriptionControl(descriptionLabel);
		
		Composite client = toolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);

		Tree tr = null;
		tr = toolkit.createTree(client, SWT.NULL);
		// Table t = toolkit.createTable(client, SWT.NULL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 100; // was 20
		gd.widthHint = 100;
		gd.verticalSpan = 2;
		tr.setLayoutData(gd);
		toolkit.paintBordersFor(client);

		Button addB = toolkit.createButton(client, "Add", SWT.PUSH); //$NON-NLS-1$
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		addB.setLayoutData(gd);
		addB.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GrantType newGrant = AclFactory.eINSTANCE.createGrantType();
				newGrant.setGroup("public");
				newGrant.setRole("patron");
				Command cmd = AddCommand.create(MetsProjectNature.getEditingDomain(page.model), page.model, AclPackage.eINSTANCE.getAccessControlType_Grant(), newGrant);
				if(cmd.canExecute()) {
					MetsProjectNature.getNatureForMetsObject(page.model).getCommandStack().execute(cmd);
				}
				viewer.refresh();
			}
		});

		Button delB = toolkit.createButton(client, "Remove", SWT.PUSH); //$NON-NLS-1$
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		delB.setLayoutData(gd);
		delB.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ITreeSelection sel = (ITreeSelection) viewer.getSelection();
				if (!sel.isEmpty()) {
					Object o = sel.getFirstElement();
					if (o instanceof GrantType) {
						GrantType g = (GrantType) o;
						Command cmd = RemoveCommand.create(MetsProjectNature.getEditingDomain(page.model), page.model, AclPackage.eINSTANCE.getAccessControlType_Grant(), g);
						if(cmd.canExecute()) {
							MetsProjectNature.getNatureForMetsObject(page.model).getCommandStack().execute(cmd);
						}
					}
				}
				viewer.refresh();
			}
		});

		section.setClient(client);
		final SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);
		viewer = new TreeViewer(tr);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(spart, event.getSelection());
			}
		});
		viewer.setContentProvider(new AdapterFactoryContentProvider(MetsProjectNature.getAdapterFactory()));

		viewer.setLabelProvider(new AdapterFactoryLabelProvider(MetsProjectNature.getAdapterFactory()));

		page.getSite().setSelectionProvider(viewer);

		ADFTE = new AdapterFactoryTreeEditor(viewer.getTree(), MetsProjectNature.getAdapterFactory());

		viewer.setInput(page.model);
		viewer.addSelectionChangedListener(this);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#registerPages(org.eclipse.ui. forms.DetailsPart)
	 */
	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.registerPage(GrantTypeImpl.class, new GrantTypeDetailsPage());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#createToolBarActions(org.eclipse .ui.forms.IManagedForm)
	 */
	@Override
	protected void createToolBarActions(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		Action haction = new Action("horizontal", Action.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				sashForm.setOrientation(SWT.HORIZONTAL);
				form.reflow(true);
			}
		};
		haction.setChecked(true);
		haction.setToolTipText("Horizontal orientation");

		/*
		 * haction.setImageDescriptor(Bd7Plugin.getDefault() .getImageRegistry()
		 * .getDescriptor(Bd7Plugin.IMG_HORIZONTAL));
		 */
		Action vaction = new Action("vertical", Action.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				form.reflow(true);
			}
		};
		vaction.setChecked(false);
		vaction.setToolTipText("Vertical orientation");
		/*
		 * vaction.setImageDescriptor(Bd7Plugin.getDefault() .getImageRegistry().getDescriptor(Bd7Plugin.IMG_VERTICAL));
		 */

		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
	 * org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		this.selectionEvent = event;
	}

}

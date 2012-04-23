/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.acl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclPackage;

/**
 * @author Gregory Jansen
 *
 */
public class AccessControlFormPage extends FormPage {
	private ScrolledPropertiesBlock block;
	protected AccessControlType model;
	private Button inheritFlag;
	private Button discoverableFlag;
	private Button embargoFlag;
	private DateTime untilDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private AccessControlFormEditor acleditor = null;

	public AccessControlFormPage(AccessControlFormEditor editor) {
		super(editor, "fourth", "Access Controls");
		block = new ScrolledPropertiesBlock(this);
		model = editor.model;
		this.acleditor = editor;
	}

	@Override
	protected void createFormContent(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		form.setText("Edit Access Controls"); //$NON-NLS-1$
		Composite parent = form.getBody();
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		// first block
		createInheritContent(parent, toolkit);
		createDiscoverableContent(parent, toolkit);
		createEmbargoContent(parent, toolkit);
		// form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(
		// FormArticlePlugin.IMG_FORM_BG));

		Composite masterBlock = toolkit.createComposite(parent);
		TableWrapData mbtd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB);
		masterBlock.setLayoutData(mbtd);
		block.createContent(managedForm, masterBlock);
	}

	/**
	 * @param parent
	 * @param toolkit
	 */
	private void createEmbargoContent(Composite parent, FormToolkit toolkit) {
		TableWrapData gd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE);
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setText("Embargo"); //$NON-NLS-1$
		s1.setDescription("You may embargo this object (and its contents) until a specified date."); //$NON-NLS-1$
		s1.marginWidth = 10;
		s1.marginHeight = 5;
		s1.setLayoutData(gd);

		Composite client = toolkit.createComposite(s1);
		TableWrapLayout twl = new TableWrapLayout();
		twl.numColumns = 2;
		client.setLayout(twl);

		TableWrapData twd = new TableWrapData(TableWrapData.RIGHT, TableWrapData.MIDDLE, 1, 1);
		embargoFlag = toolkit.createButton(client, "Yes, embargo until", SWT.CHECK); //$NON-NLS-1$
		embargoFlag.setSelection(model.isSetEmbargoUntil());
		embargoFlag.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				untilDate.setEnabled(embargoFlag.getSelection());
				updateEmbargo();
			}
		});
		embargoFlag.setLayoutData(twd);
		untilDate = new DateTime(client, SWT.DATE | SWT.BORDER);
		if (model.isSetEmbargoUntil() && model.getEmbargoUntil() != null) {
			XMLGregorianCalendar cal = model.getEmbargoUntil();
			untilDate.setYear(cal.getYear());
			untilDate.setMonth(cal.getMonth() - 1);
			untilDate.setDay(cal.getDay());
		} else {
			// default 3 years from current day
			Calendar cal = GregorianCalendar.getInstance();
			cal.add(Calendar.YEAR, 3);
			untilDate.setYear(cal.get(Calendar.YEAR));
			untilDate.setMonth(cal.get(Calendar.MONTH));
			untilDate.setDay(cal.get(Calendar.DAY_OF_MONTH));
		}
		untilDate.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateEmbargo();
			}

		});
		s1.setClient(client);
	}

	/**
     *
     */
	protected void updateEmbargo() {
		Command cmd = null;
		if (embargoFlag.getSelection()) {
			Date dt = new Date(untilDate.getYear() - 1900, untilDate.getMonth(), untilDate.getDay());
			XMLGregorianCalendar fromDate = XMLTypeFactory.eINSTANCE.createDate(sdf.format(dt));
			cmd = SetCommand.create(MetsProjectNature.getEditingDomain(model), model, AclPackage.eINSTANCE.getAccessControlType_EmbargoUntil(), fromDate);
		} else { // no embargo
			cmd = SetCommand.create(MetsProjectNature.getEditingDomain(model), model, AclPackage.eINSTANCE.getAccessControlType_EmbargoUntil(), null);
		}
		if(cmd.canExecute()) {
			MetsProjectNature.getNatureForMetsObject(model).getCommandStack().execute(cmd);
		}
	}

	/**
	 * @param parent
	 * @param toolkit
	 */
	private void createInheritContent(Composite parent, FormToolkit toolkit) {
		TableWrapData gd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE);
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setText("Inherited Roles"); //$NON-NLS-1$
		s1.setDescription("Roles may have been granted to groups above this object. Do you want those groups to retain roles inherited in this way?"); //$NON-NLS-1$
		s1.marginWidth = 10;
		s1.marginHeight = 5;
		s1.setLayoutData(gd);

		inheritFlag = toolkit.createButton(s1, "Yes, groups may retain roles granted above this level.", SWT.CHECK); //$NON-NLS-1$
		for(IItemPropertyDescriptor d : acleditor.itemDelegator.getPropertyDescriptors(model)) {
			System.out.println(d);
		}
		inheritFlag.setSelection(model.isInherit());
		inheritFlag.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (model != null) {
					Command cmd = SetCommand.create(MetsProjectNature.getEditingDomain(model), model, AclPackage.eINSTANCE.getAccessControlType_Inherit(), inheritFlag.getSelection());
					if(cmd.canExecute()) {
						MetsProjectNature.getNatureForMetsObject(model).getCommandStack().execute(cmd);
					}
				}
			}
		});
		gd = new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE);
		// gd.heightHint
		inheritFlag.setLayoutData(gd);
		s1.setClient(inheritFlag);
	}

	/**
	 * @param parent
	 * @param toolkit
	 */
	private void createDiscoverableContent(Composite parent, FormToolkit toolkit) {
		TableWrapData gd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE);
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setText("Allow Discovery"); //$NON-NLS-1$
		s1.setDescription("Do you want this object to be discovered by repository search and browse functions?"); //$NON-NLS-1$
		s1.marginWidth = 10;
		s1.marginHeight = 5;
		s1.setLayoutData(gd);
		discoverableFlag = toolkit.createButton(s1, "Yes, allow discovery via search and browse.", SWT.CHECK); //$NON-NLS-1$
		discoverableFlag.setSelection(model.isDiscoverable());
		discoverableFlag.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (model != null) {
					Command cmd = SetCommand.create(MetsProjectNature.getEditingDomain(model), model, AclPackage.eINSTANCE.getAccessControlType_Discoverable(), discoverableFlag.getSelection());
					if(cmd.canExecute()) {
						MetsProjectNature.getNatureForMetsObject(model).getCommandStack().execute(cmd);
					}
				}
			}
		});
		gd = new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE);
		// gd.heightHint
		discoverableFlag.setLayoutData(gd);
		s1.setClient(discoverableFlag);
	}
}

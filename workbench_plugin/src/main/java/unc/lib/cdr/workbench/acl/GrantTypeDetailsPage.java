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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.schemas.acl.AclPackage;
import edu.unc.lib.schemas.acl.GrantType;

/**
 * @author Gregory Jansen
 *
 */
public class GrantTypeDetailsPage implements IDetailsPage {
	public static final String[] roles = new String[] { "metadata-patron", "access-copies-patron", "patron", "observer", "ingester", "processor", "curator" };
	private IManagedForm mform;
	private GrantType input;
	private Combo roleCombo;
	private Text groupText;
	private boolean isDirty = false;
	private boolean updating = false;

	public GrantTypeDetailsPage() {
		// editor.getSite().getPage().addPartListener(this);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#initialize(org.eclipse.ui.forms.IManagedForm )
	 */
	@Override
	public void initialize(IManagedForm form) {
		this.mform = form;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#dispose()
	 */
	@Override
	public void dispose() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return isDirty;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#commit(boolean)
	 */
	@Override
	public void commit(boolean onSave) {
		if (input != null) {
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(SetCommand.create(MetsProjectNature.getEditingDomain(input), input, AclPackage.eINSTANCE.getGrantType_Role(), roleCombo.getText()));
			cmd.append(SetCommand.create(MetsProjectNature.getEditingDomain(input), input, AclPackage.eINSTANCE.getGrantType_Group(), groupText.getText()));
			if(cmd.canExecute()) {
				MetsProjectNature.getNatureForMetsObject(input).getCommandStack().execute(cmd);
				isDirty = false;
				this.mform.dirtyStateChanged();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#setFormInput(java.lang.Object)
	 */
	@Override
	public boolean setFormInput(Object input) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#setFocus()
	 */
	@Override
	public void setFocus() {
		this.roleCombo.setFocus();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#isStale()
	 */
	@Override
	public boolean isStale() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IFormPart#refresh()
	 */
	@Override
	public void refresh() {
		update();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IPartSelectionListener#selectionChanged(org.eclipse .ui.forms.IFormPart,
	 * org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection) selection;
		if (ssel.size() == 1) {
			input = (GrantType) ssel.getFirstElement();
		} else {
			input = null;
		}
		update();
	}

	/**
	 * Update form from model
	 */
	private void update() {
		updating = true;
		if (this.input != null) {
			if (this.input.getGroup() != null) {
				this.groupText.setText(this.input.getGroup());
			} else {
				this.groupText.setText("");
			}
			if (this.input.getRole() != null) {
				for(int i = 0; i < this.roleCombo.getItems().length; i++) {
					if(this.input.getRole().equals(this.roleCombo.getItem(i))) {
						this.roleCombo.select(i);
						break;
					}
				}
			}
		}
		isDirty = false;
		updating = false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.forms.IDetailsPage#createContents(org.eclipse.swt.widgets .Composite)
	 */
	@Override
	public void createContents(Composite parent) {
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 2;
		layout.bottomMargin = 2;
		parent.setLayout(layout);

		FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setText("Grant Detail"); //$NON-NLS-1$
		s1.setDescription("Edit the role granted to the group."); //$NON-NLS-1$
		s1.marginWidth = 10;
		// s1.marginHeight = 5;
		TableWrapData td = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB);
		td.grabHorizontal = true;
		s1.setLayoutData(td);

		Composite client = toolkit.createComposite(s1);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 2;
		glayout.verticalSpacing = 10;
		client.setLayout(glayout);
		client.setLayoutData(td);

		toolkit.createLabel(client, "Role"); //$NON-NLS-1$
		roleCombo = new Combo(client, SWT.SINGLE | SWT.BORDER | SWT.READ_ONLY);
		//toolkit.createText(client, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		roleCombo.setItems(roles);
		roleCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!updating) {
				isDirty = true;
				mform.dirtyStateChanged();
				commit(false);
				}
			}
		});

		GridData gd;
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 10;
		gd.heightHint = 15;
		roleCombo.setLayoutData(gd);

		toolkit.createLabel(client, "Group"); //$NON-NLS-1$
		groupText = toolkit.createText(client, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		groupText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(!updating) {
				isDirty = true;
				mform.dirtyStateChanged();
				commit(false);
				}
			}
		});
		groupText.setLayoutData(gd);

		s1.setClient(client);
	}

}

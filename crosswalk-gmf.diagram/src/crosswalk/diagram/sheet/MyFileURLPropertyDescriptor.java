package crosswalk.diagram.sheet;

import java.io.File;
import java.net.URI;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class MyFileURLPropertyDescriptor extends PropertyDescriptor implements
		IPropertyDescriptor {

	public MyFileURLPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		ILabelProvider editLabelProvider = getEditLabelProvider();
		return new ExtendedDialogCellEditor(composite, editLabelProvider) {

			@Override
			protected void updateContents(Object object) {
				if (getDefaultLabel() != null && labelProvider != null) {
					getDefaultLabel().setText(labelProvider.getText(object));
				}
			}

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				FileDialog d = new FileDialog(cellEditorWindow.getShell(),
						SWT.OPEN);
				if (this.getValue() != null && this.getValue() instanceof URI) {
					String filterpath = ((URI)this.getValue()).getPath();
					filterpath = filterpath.substring(0, filterpath.lastIndexOf("/"));
					d.setFilterPath(filterpath);
				}
				String filepath = d.open();
				if (filepath != null) {
					File f = new File(filepath);
					return f.toURI();
				} else {
					return null;
				}
				
			}

			@Override
			protected void doSetValue(Object value) {
				super.doSetValue(value);
			}

		};
	}

}

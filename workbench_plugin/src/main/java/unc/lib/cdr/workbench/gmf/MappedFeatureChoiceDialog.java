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
package unc.lib.cdr.workbench.gmf;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Gregory Jansen
 *
 */
public class MappedFeatureChoiceDialog extends Dialog {
    private String message;
    private List<EStructuralFeature> features;
    private EStructuralFeature answer;

    public MappedFeatureChoiceDialog(Shell parent, int style) {
	super(parent, style);
	setText("Model Mapping");
	setMessage("Please enter a value:");
    }

    public MappedFeatureChoiceDialog(Shell parent) {
	// Pass the default styles here
	this(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
    }

    /**
     * Opens the dialog and returns the input
     *
     * @return String
     */
    public EStructuralFeature open() {
      // Create the dialog window
      Shell shell = new Shell(getParent(), getStyle());
      shell.setText(getText());
      createContents(shell);
      shell.pack();
      shell.open();
      Display display = getParent().getDisplay();
      while (!shell.isDisposed()) {
        if (!display.readAndDispatch()) {
          display.sleep();
        }
      }
      // Return the entered value, or null
      return answer;
    }

    /**
     * Creates the dialog's contents
     *
     * @param shell the dialog window
     */
    private void createContents(final Shell shell) {
      shell.setLayout(new GridLayout(2, true));

      // Show the message
      Label label = new Label(shell, SWT.NONE);
      label.setText(message);
      GridData data = new GridData();
      data.horizontalSpan = 2;
      label.setLayoutData(data);

      // Display the input combo
      final org.eclipse.swt.widgets.List choice = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
      data = new GridData(GridData.FILL_HORIZONTAL);
      data.horizontalSpan = 2;
      choice.setLayoutData(data);

      if(this.getFeatures() != null) {
	  for(EStructuralFeature r : this.getFeatures()) {
	      choice.add(r.getName());
	      choice.setData(r.getName(), r);
	  }
      }


      // Create the OK button and add a handler
      // so that pressing it will set input
      // to the entered value
      final Button ok = new Button(shell, SWT.PUSH);
      ok.setText("OK");
      data = new GridData(GridData.FILL_HORIZONTAL);
      ok.setLayoutData(data);
      ok.setEnabled(false);
      ok.addSelectionListener(new SelectionAdapter() {
        @Override
	public void widgetSelected(SelectionEvent event) {
          String answerTxt = choice.getItem(choice.getSelectionIndex());
          answer = (EStructuralFeature) choice.getData(answerTxt);
          shell.close();
        }
      });

      choice.addSelectionListener(new SelectionAdapter() {
	@Override
	public void widgetSelected(SelectionEvent e) {
	    if(choice.getSelectionIndex() >= 0) {
		ok.setEnabled(true);
	    } else {
		ok.setEnabled(false);
	    }
	}
      });

      // Create the cancel button and add a handler
      // so that pressing it will set input to null
      Button cancel = new Button(shell, SWT.PUSH);
      cancel.setText("Cancel");
      data = new GridData(GridData.FILL_HORIZONTAL);
      cancel.setLayoutData(data);
      cancel.addSelectionListener(new SelectionAdapter() {
        @Override
	public void widgetSelected(SelectionEvent event) {
          answer = null;
          shell.close();
        }
      });

      // Set the OK button as the default, so
      // user can type input and press Enter
      // to dismiss
      shell.setDefaultButton(ok);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<EStructuralFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<EStructuralFeature> features) {
        this.features = features;
    }

    public EStructuralFeature getAnswer() {
        return answer;
    }

    public void setAnswer(EStructuralFeature answer) {
        this.answer = answer;
    }

}

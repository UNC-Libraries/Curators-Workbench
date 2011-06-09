/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
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
package unc.lib.cdr.workbench.arrange;

import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gregory Jansen
 * 
 */
public class ArrangementDragSourceListener implements DragSourceListener {
	TreeViewer viewer = null;

	public ArrangementDragSourceListener(TreeViewer viewer) {
		super();
		this.viewer = viewer;
	}

	private static final Logger LOG = LoggerFactory.getLogger(ArrangementDragSourceListener.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragStart(org.eclipse.swt.dnd. DragSourceEvent)
	 */
	@Override
	public void dragStart(DragSourceEvent event) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragSetData(org.eclipse.swt.dnd .DragSourceEvent)
	 */
	@Override
	public void dragSetData(DragSourceEvent event) {
		ITreeSelection selection = (ITreeSelection) viewer.getSelection();
		LocalSelectionTransfer transfer = LocalSelectionTransfer.getTransfer();
		if (transfer.isSupportedType(event.dataType)) {
			transfer.setSelection(selection);
			event.data = selection;
		}
		LOG.debug("drag event data has been set: " + event.data);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragFinished(org.eclipse.swt.dnd .DragSourceEvent)
	 */
	@Override
	public void dragFinished(DragSourceEvent event) {
	}

}

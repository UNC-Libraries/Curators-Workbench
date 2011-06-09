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
package unc.lib.cdr.workbench.accession;

import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gregory Jansen
 * 
 */
public class OriginalsDragSourceListener implements DragSourceListener {
	private static final Logger log = LoggerFactory.getLogger(OriginalsDragSourceListener.class);

	private final TreeViewer viewer;

	public OriginalsDragSourceListener(TreeViewer viewer) {
		this.viewer = viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragStart(org.eclipse.swt.dnd. DragSourceEvent)
	 */
	@Override
	public void dragStart(DragSourceEvent event) {
		log.debug("drag started");
		ISelection selection = viewer.getSelection();
		LocalSelectionTransfer.getTransfer().setSelection(selection);
		LocalSelectionTransfer.getTransfer().setSelectionSetTime(event.time & 0xFFFFFFFFL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragSetData(org.eclipse.swt.dnd .DragSourceEvent)
	 */
	@Override
	public void dragSetData(DragSourceEvent event) {
		log.debug("drag set data called");
		event.data = LocalSelectionTransfer.getTransfer().getSelection();
		// if(ResourceTransfer.getInstance().isSupportedType(event.dataType)) {
		// event.data = selection.toArray();
		// }
		// if(LocalSelectionTransfer.getTransfer().isSupportedType(event.dataType)) {
		// log.debug("local selection data set");
		// LocalSelectionTransfer.getTransfer().setSelection(selection);
		// LocalSelectionTransfer.getTransfer().setSelectionSetTime(event.time & 0xFFFF);
		// }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.dnd.DragSourceListener#dragFinished(org.eclipse.swt.dnd .DragSourceEvent)
	 */
	@Override
	public void dragFinished(DragSourceEvent event) {
		log.debug("drag finished");
		LocalSelectionTransfer.getTransfer().setSelection(null);
		LocalSelectionTransfer.getTransfer().setSelectionSetTime(0);
	}

}

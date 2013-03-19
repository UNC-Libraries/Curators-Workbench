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
package unc.lib.cdr.workbench.views;

import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;

public interface ImageProvider {
	/**
	 * This method returns an {@link Image}. The implementor must return an image that can be disposed() by the caller.
	 * The implementor is not given any notification that the dispose is occurring.
	 * 
	 * @param target
	 *           The device the image will be displayed on.
	 * 
	 * @return {@link Image}
	 */
	Image getImage(Device target);

	/**
	 * This method is used to dispose an image obtained by the getImage(Device) method.
	 * 
	 * @param image
	 *           the image that needs to be disposed of.
	 */
	void disposeImage(Image image);
}

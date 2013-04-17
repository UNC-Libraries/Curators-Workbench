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
package org.slf4j.impl;

import org.slf4j.Marker;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


/**
 * An almost trivial implementation of the {@link Marker} interface. 
 *
 * <p><code>BasicMarker</code> lets users specify marker
 * information. However, it does not offer any useful operations on
 * that information. 
 *
 * <p>Simple logging systems which ignore marker data, just return
 * instances of this class in order to conform to the SLF4J API.
 *
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public class BasicMarker implements Marker {
  String name;
  List children;

  BasicMarker(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public synchronized void add(Marker child) {
    if (child == null) {
      throw new NullPointerException(
        "Null children cannot be added to a Marker.");
    }
    if (children == null) {
      children = new Vector();
    }
    children.add(child);
  }

  public synchronized boolean hasChildren() {
    return ((children != null) && (children.size() > 0));
  }

  public synchronized Iterator iterator() {
    if (children != null) {
      return children.iterator();
    } else {
      return Collections.EMPTY_LIST.iterator();
    }
  }

  public synchronized boolean remove(Marker markerToRemove) {
    if (children == null) {
      return false;
    }

    int size = children.size();
    for (int i = 0; i < size; i++) {
      Marker m = (Marker) children.get(i);
      if( m == markerToRemove) {
          return false;
      }
    }
    // could not find markerToRemove
    return false;
  }
}

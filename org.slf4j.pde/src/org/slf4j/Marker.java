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
package org.slf4j;

import java.util.Iterator;

/**
 * Markers are named objects used to enrich log statements. Conforming
 * logging system Implementations of SLF4J determine how information
 * conveyed by markers are used, if at all. In particular, many
 * conformant logging systems may ignore marker data.
 * 
 * <p>Markers can contain child markers, which in turn  can contain children 
 * of their own.
 *
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public interface Marker {
 
  /**
   * Get the name of this Marker.
   * @return name of marker
   */ 
  public String getName();

  /**
   * Add a child Marker to this Marker.
   * @param child a child marker
   */
  public void add(Marker child);
  
  /**
   * Remove a child Marker.
   * @param child the child Marker to remove
   * @return true if child could be found and removed, false otherwise.
   */
  public boolean remove(Marker child);
  
  /**
   * Does this marker have children?
   * @return true if this marker has children, false otherwise.
   */
  public boolean hasChildren();
  
  /**
   * Returns an Iterator which can be used to iterate over the
   * children of this marker. An empty iterator is returned when this
   * marker has no children.
   * 
   * @return Iterator over the children of this marker
   */
  public Iterator iterator();
  
//  void makeImmutable();
//  public boolean isImmutable();
}

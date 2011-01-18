/* 
 * Copyright (c) 2004-2005 SLF4J.ORG
 * Copyright (c) 2004-2005 QOS.ch
 *
 * All rights reserved.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute, and/or sell copies of  the Software, and to permit persons
 * to whom  the Software is furnished  to do so, provided  that the above
 * copyright notice(s) and this permission notice appear in all copies of
 * the  Software and  that both  the above  copyright notice(s)  and this
 * permission notice appear in supporting documentation.
 * 
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR  A PARTICULAR PURPOSE AND NONINFRINGEMENT
 * OF  THIRD PARTY  RIGHTS. IN  NO EVENT  SHALL THE  COPYRIGHT  HOLDER OR
 * HOLDERS  INCLUDED IN  THIS  NOTICE BE  LIABLE  FOR ANY  CLAIM, OR  ANY
 * SPECIAL INDIRECT  OR CONSEQUENTIAL DAMAGES, OR  ANY DAMAGES WHATSOEVER
 * RESULTING FROM LOSS  OF USE, DATA OR PROFITS, WHETHER  IN AN ACTION OF
 * CONTRACT, NEGLIGENCE  OR OTHER TORTIOUS  ACTION, ARISING OUT OF  OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 * 
 * Except as  contained in  this notice, the  name of a  copyright holder
 * shall not be used in advertising or otherwise to promote the sale, use
 * or other dealings in this Software without prior written authorization
 * of the copyright holder.
 *
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

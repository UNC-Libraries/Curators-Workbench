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

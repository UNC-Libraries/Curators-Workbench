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

import org.slf4j.impl.StaticMarkerBinder;
import org.slf4j.impl.Util;

// WARNING
// WARNING Modifications MUST be made to the original file found at
// WARNING $SLF4J_HOME/src/filtered-java/org/slf4j/MarkerFactory.java
// WARNING

/**
 * MarkerFactory is a utility class producing {@link Marker} instances as
 * appropriate for the logging system currently in use.
 * 
 * <p>
 * This class is essentially implemented as a wrapper around an
 * {@link IMarkerFactory} instance bound at compile time.
 * 
 * <p>
 * Please note that all methods in this class are static.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml; </a>
 */
public class MarkerFactory {
  static IMarkerFactory markerFactory;

  private MarkerFactory() {
  }

  // 
  // WARNING Do not modify copies but the original at
  //         $SLF4J_HOME/src/filtered-java/org/slf4j/
  //
  static {

    try {
      markerFactory = StaticMarkerBinder.SINGLETON.getMarkerFactory();
    } catch (Exception e) {
      // we should never get here
      Util.reportFailure("Could not instantiate instance of class ["
          + StaticMarkerBinder.SINGLETON.getMarkerFactoryClassStr() + "]", e);
    }
  }

  /**
   * Return a Marker instnace as specified by the name parameter using the
   * previously bound {@link IMarkerFactory}instance.
   * 
   * @param name
   *          The name of the {@link Marker}object to return.
   * @return marker
   */
  public static Marker getMarker(String name) {
    return markerFactory.getMarker(name);
  }

  /**
   * Return the {@link IMarkerFactory}instance in use.
   * 
   * <p>
   * Usually, the IMarkerFactory instance is bound with this class at compile
   * time.
   * 
   * @return the IMarkerFactory instance in use
   */
  public static IMarkerFactory getIMarkerFactory() {
    return markerFactory;
  }
}
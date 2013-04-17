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

import org.slf4j.Constants;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * Allows for dynamic binding as specified by information contained
 * in the {@link Constants#LOGGER_FACTORY_PROPERTY} java system property.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public class SystemPropBinder implements LoggerFactoryBinder {
  String factoryFactoryClassName = null;

  /**
   * Fetch the appropriate ILoggerFactory as instructed by the system properties.
   * 
   * Constants.LOGGER_FACTORY_FACTORY_METHOD_NAME
   * @return The appropriate ILoggerFactory instance as directed from the system
   *         properties
   */
  public ILoggerFactory getLoggerFactory() {

    try {
      if (getLoggerFactoryClassStr() == null) {
        return null;
      }

      Class factoryFactoryClass = Class.forName(getLoggerFactoryClassStr());
      Class[] EMPTY_CLASS_ARRAY = {};
      java.lang.reflect.Method factoryFactoryMethod = factoryFactoryClass
          .getDeclaredMethod(Constants.LOGGER_FACTORY_FACTORY_METHOD_NAME,
              EMPTY_CLASS_ARRAY);
      ILoggerFactory loggerFactory = (ILoggerFactory) factoryFactoryMethod
          .invoke(null, null);
      return loggerFactory;
    } catch (Exception e) {
      Util.reportFailure("Failed to fetch ILoggerFactory instnace using the "
          + factoryFactoryClassName + " class.", e);

    }

    // we could not get an adapter
    return null;
  }

  public String getLoggerFactoryClassStr() {
    if (factoryFactoryClassName == null) {
      try {
        factoryFactoryClassName = System
            .getProperty(Constants.LOGGER_FACTORY_PROPERTY);
      } catch (Exception e) {
        Util.reportFailure("Failed to fetch "
            + Constants.LOGGER_FACTORY_PROPERTY
            + " system property.", e);
      }
    }
    return factoryFactoryClassName;
  }
}
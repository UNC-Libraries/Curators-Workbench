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
// TOTO

package org.apache.commons.logging.impl;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;

/**
 * Implementation of {@link Log org.apache.commons.logging.Log} interface which 
 * delegates all processing to a wrapped {@link Logger org.slf4j.Logger} instance.
 * 
 * <p>JCL's FATAL and TRACE levels are mapped to ERROR and DEBUG respectively. All 
 * other levels map one to one.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public class SLF4JLog implements Log {

  private Logger logger;

  SLF4JLog(Logger logger) {
    this.logger = logger;
  }

  /**
   * Directly delegates to the wrapped <code>org.slf4j.Logger</code> instance.
   */
  public boolean isDebugEnabled() {
    return logger.isDebugEnabled();
  }

  /**
   * Directly delegates to the wrapped <code>org.slf4j.Logger</code> instance.
   */
  public boolean isErrorEnabled() {
    return logger.isErrorEnabled();
  }

  /**
   * Delegates to the <code>isErrorEnabled<code> method of the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   */
  public boolean isFatalEnabled() {
    return logger.isErrorEnabled();
  }

  /**
   * Directly delegates to the wrapped <code>org.slf4j.Logger</code> instance.
   */
  public boolean isInfoEnabled() {
    return logger.isInfoEnabled();
  }

  /**
   * Delegates to the <code>isDebugEnabled<code> method of the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   */
  public boolean isTraceEnabled() {
    return logger.isDebugEnabled();
  }

  /**
   * Directly delegates to the wrapped <code>org.slf4j.Logger</code> instance.
   */
  public boolean isWarnEnabled() {
    return logger.isWarnEnabled();
  }

  /**
   * Converts the input parameter to String and then delegates to 
   * the debug method of the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   */
  public void trace(Object message) {
    logger.debug(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the debug method of the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void trace(Object message, Throwable t) {
    logger.debug(message.toString(), t);
  }

  /**
   * Converts the input parameter to String and then delegates to the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String} 
   */
  public void debug(Object message) {
    logger.debug(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void debug(Object message, Throwable t) {
    logger.debug(message.toString(), t);
  }

  /**
   * Converts the input parameter to String and then delegates to the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String} 
   */
  public void info(Object message) {
    logger.info(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void info(Object message, Throwable t) {
    logger.info(message.toString(), t);
  }

  /**
   * Converts the input parameter to String and then delegates to the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   */
  public void warn(Object message) {
    logger.warn(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void warn(Object message, Throwable t) {
    logger.warn(message.toString(), t);
  }

  /**
   * Converts the input parameter to String and then delegates to the wrapped 
   * <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   */
  public void error(Object message) {
    logger.error(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void error(Object message, Throwable t) {
    logger.error(message.toString(), t);
  }


 
  /**
   * Converts the input parameter to String and then delegates to 
   * the error method of the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   */
  public void fatal(Object message) {
    logger.error(message.toString());
  }

  /**
   * Converts the first input parameter to String and then delegates to 
   * the error method of the wrapped <code>org.slf4j.Logger</code> instance.
   * 
   * @param message the message to log. Converted to {@link String}  
   * @param t the exception to log
   */
  public void fatal(Object message, Throwable t) {
    logger.error(message.toString(), t);
  }

}
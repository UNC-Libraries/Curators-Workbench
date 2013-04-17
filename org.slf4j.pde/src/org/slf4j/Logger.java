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

/**
 * 
 * The main user interface to logging. It is expected that logging
 * takes place through concrete implementations of this interface.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public interface Logger {


  /**
   * Return the name of this <code>Logger</code> instance.
   */
  public String getName();

  /**
   * Is the logger instance enabled for the DEBUG level?
   * @return True if this Logger is enabled for the DEBUG level,
   * false otherwise.
   */
  public boolean isDebugEnabled();
  
  /**
   * Log a message at the DEBUG level.
   *
   * @param msg the message string to be logged
   */
  public void debug(String msg);
  

  /**
   * Log a message at the DEBUG level according to the specified format
   * and argument.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the DEBUG level. </p>
   *
   * @param format the format string 
   * @param arg  the argument
   */
  public void debug(String format, Object arg);


  
  /**
   * Log a message at the DEBUG level according to the specified format
   * and arguments.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the DEBUG level. </p>
   *
   * @param format the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void debug(String format, Object arg1, Object arg2);

  /**
   * Log an exception (throwable) at the DEBUG level with an
   * accompanying message. 
   * 
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */ 
  public void debug(String msg, Throwable t);
 
  
  /**
   * Is the logger instance enabled for the INFO level?
   * @return True if this Logger is enabled for the INFO level,
   * false otherwise.
   */
  public boolean isInfoEnabled();

  
  /**
   * Log a message at the INFO level.
   *
   * @param msg the message string to be logged
   */
  public void info(String msg);
  

  /**
   * Log a message at the INFO level according to the specified format
   * and argument.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the INFO level. </p>
   *
   * @param format the format string 
   * @param arg  the argument
   */
  public void info(String format, Object arg);

  
  /**
   * Log a message at the INFO level according to the specified format
   * and arguments.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the INFO level. </p>
   *
   * @param format the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void info(String format, Object arg1, Object arg2);

  /**
   * Log an exception (throwable) at the INFO level with an
   * accompanying message. 
   * 
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log 
   */
  public void info(String msg, Throwable t);

  /**
   * Is the logger instance enabled for the WARN level?
   * @return True if this Logger is enabled for the WARN level,
   * false otherwise.
   */
  public boolean isWarnEnabled();

  /**
   * Log a message at the WARN level.
   *
   * @param msg the message string to be logged
   */
  public void warn(String msg);

 /**
   * Log a message at the WARN level according to the specified format
   * and argument.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the WARN level. </p>
   *
   * @param format the format string 
   * @param arg  the argument
   */
  public void warn(String format, Object arg);

  /**
   * Log a message at the WARN level according to the specified format
   * and arguments.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the WARN level. </p>
   *
   * @param format the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void warn(String format, Object arg1, Object arg2);
  
  /**
   * Log an exception (throwable) at the WARN level with an
   * accompanying message. 
   * 
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log 
   */
  public void warn(String msg, Throwable t);
  

  /**
   * Is the logger instance enabled for the ERROR level?
   * @return True if this Logger is enabled for the ERROR level,
   * false otherwise.
   */
  public boolean isErrorEnabled();
  
  /**
   * Log a message at the ERROR level.
   *
   * @param msg the message string to be logged
   */
  public void error(String msg);
  
 /**
   * Log a message at the ERROR level according to the specified format
   * and argument.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the ERROR level. </p>
   *
   * @param format the format string 
   * @param arg  the argument
   */
  public void error(String format, Object arg);

  /**
   * Log a message at the ERROR level according to the specified format
   * and arguments.
   * 
   * <p>This form avoids superfluous object creation when the logger
   * is disabled for the ERROR level. </p>
   *
   * @param format the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void error(String format, Object arg1, Object arg2);

  /**
   * Log an exception (throwable) at the ERROR level with an
   * accompanying message. 
   * 
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */
  public void error(String msg, Throwable t);

}

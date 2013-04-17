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
 * Extension of the {@link Logger} interface adding {@link Marker} support.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public interface MarkingLogger extends Logger {



  /**
   * Similar to {@link #isDebugEnabled()} method except that the
   * marker data is also taken into account.
   * 
   * @param marker The marker data to take into consideration
   */
  public boolean isDebugEnabled(Marker marker);
  
  /**
   * Log a message with the specific Marker at the DEBUG level.
   * 
   * @param marker the marker data specific to this log statement
   * @param msg the message string to be logged
   */
  public void debug(Marker marker, String msg);
  
  /**
   * This method is similar to {@link #debug(String, Object)} method except that the 
   * marker data is also taken into consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format the format string
   * @param arg the argument
   */
  public void debug(Marker marker, String format, Object arg);
 
 
  /**
   * This method is similar to {@link #debug(String, Object, Object)}
   * method except that the marker data is also taken into
   * consideration.
   *
   * @param marker the marker data specific to this log statement
   * @param format  the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void debug(Marker marker, String format, Object arg1, Object arg2);
  
  /**
   * This method is similar to {@link #debug(String, Throwable)} method except that the
   * marker data is also taken into consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */ 
  public void debug(Marker marker, String msg, Throwable t);
  
  
  /**
   * Similar to {@link #isInfoEnabled()} method except that the marker
   * data is also taken into consideration.
   *
   * @param marker The marker data to take into consideration
   */
  public boolean isInfoEnabled(Marker marker);
  
  /**
   * Log a message with the specific Marker at the INFO level.
   * 
   * @param marker The marker specific to this log statement
   * @param msg the message string to be logged
   */
  public void info(Marker marker, String msg);
  
  /**
   * This method is similar to {@link #info(String, Object)} method except that the 
   * marker data is also taken into consideration.
   *
   * @param marker the marker data specific to this log statement
   * @param format the format string
   * @param arg the argument
   */
  public void info(Marker marker, String format, Object arg);
  
  /**
   * This method is similar to {@link #info(String, Object, Object)}
   * method except that the marker data is also taken into
   * consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format  the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void info(Marker marker, String format, Object arg1, Object arg2);  
  
  /**
   * This method is similar to {@link #info(String, Throwable)} method
   * except that the marker data is also taken into consideration.
   * 
   * @param marker the marker data for this log statement
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */ 
  public void info(Marker marker, String msg, Throwable t); 

  /**
   * Similar to {@link #isWarnEnabled()} method except that the marker
   * data is also taken into consideration.
   *
   * @param marker The marker data to take into consideration
   */
  public boolean isWarnEnabled(Marker marker);
 
  /**
   * Log a message with the specific Marker at the WARN level.
   * 
   * @param marker The marker specific to this log statement
   * @param msg the message string to be logged
   */
  public void warn(Marker marker, String msg); 
  
  /**
   * This method is similar to {@link #warn(String, Object)} method except that the 
   * marker data is also taken into consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format the format string
   * @param arg the argument
   */
  public void warn(Marker marker, String format, Object arg);
  
  /**
   * This method is similar to {@link #warn(String, Object, Object)}
   * method except that the marker data is also taken into
   * consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format  the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void warn(Marker marker, String format, Object arg1, Object arg2);  
  
  
  /**
   * This method is similar to {@link #warn(String, Throwable)} method
   * except that the marker data is also taken into consideration.
   * 
   * @param marker the marker data for this log statement
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */ 
  public void warn(Marker marker, String msg, Throwable t); 
  



  /**
   * Similar to {@link #isErrorEnabled()} method except that the
   * marker data is also taken into consideration.
   *
   * @param marker The marker data to take into consideration
   */
  public boolean isErrorEnabled(Marker marker);
  
  /**
   * Log a message with the specific Marker at the ERROR level.
   * 
   * @param marker The marker specific to this log statement
   * @param msg the message string to be logged
   */
  public void error(Marker marker, String msg); 
  
  /**
   * This method is similar to {@link #error(String, Object)} method except that the 
   * marker data is also taken into consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format the format string
   * @param arg the argument
   */
  public void error(Marker marker, String format, Object arg);
  
  /**
   * This method is similar to {@link #error(String, Object, Object)}
   * method except that the marker data is also taken into
   * consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param format  the format string
   * @param arg1  the first argument
   * @param arg2  the second argument
   */
  public void error(Marker marker, String format, Object arg1, Object arg2);  
  
  
  /**
   * This method is similar to {@link #error(String, Throwable)}
   * method except that the marker data is also taken into
   * consideration.
   * 
   * @param marker the marker data specific to this log statement
   * @param msg the message accompanying the exception
   * @param t the exception (throwable) to log
   */ 
  public void error(Marker marker, String msg, Throwable t);
  
}

/* 
 * Copyright (c) 2004-2005 SLF4J.ORG
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

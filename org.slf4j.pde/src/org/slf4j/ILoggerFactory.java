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
 * <code>ILoggerFactory</code> instances manufacture {@link Logger}
 * instances by name.
 * 
 * <p>Most users retreive {@link Logger} instances through the static
 * {@link LoggerFactory#getLogger} mehtod. An instance of of this
 * interface is bound internally with {@link LoggerFactory} class at 
 * compile time. Only developers of SLF4J conformant logging systems 
 * need to worry about this interface. 
 * 
 * <p>See the section <a href="http://slf4j.org/faq.html#3">Implementing 
 * the SLF4J API</a> in the FAQ for details on how to make your logging 
 * system conform to SLF4J.
 * 
 * @author <a href="http://www.qos.ch/log4j/">Ceki G&uuml;lc&uuml;</a>
 */
public interface ILoggerFactory {
  
  /**
   * Return an appropriate {@link Logger} instance as specified by the
   * <code>name</code> parameter.
   * 
   * <p>Null-valued name arguments are considered invalid.
   *
   * <p>Certain extremely simple logging systems, e.g. NOP, may always
   * return the same logger instance regardless of the requested name.
   * 
   * @param name the name of the Logger to return
   */
  public Logger getLogger(String name);
}

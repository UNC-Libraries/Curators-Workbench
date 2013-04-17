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

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.slf4j.Marker;
import org.slf4j.MarkingLogger;
import org.slf4j.pde.SLF4jPlugin;



/**
 * @author john
 *
 */
public class PDELogger implements MarkingLogger {

	Bundle bundle;
	String name;
	public PDELogger(String n, Bundle b) {
		this.name = n;
		this.bundle = b;
	}
	
	
	private IStatus mkStatus(Marker marker, int severity, int code, String msg, Throwable t) {
		return new Status(severity,
				bundle.getSymbolicName(),
				code,
				msg,
				t);
	}
			
	private IStatus mkStatus(int severity, int code, String msg, Throwable t) {
		return new Status(severity,
				bundle.getSymbolicName(),
				code,
				msg,
				t);
	}
	
	private ILog getLog() {
		return Platform.getLog(bundle);
	}
	
	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#isDebugEnabled(org.slf4j.Marker)
	 */
	public boolean isDebugEnabled(Marker marker) {
		return SLF4jPlugin.getDefault().isDebugging();
	}

	
	
	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#debug(org.slf4j.Marker, java.lang.String)
	 */
	public void debug(Marker marker, String msg) {
		if(isDebugEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.OK, 0, msg, null));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void debug(Marker marker, String format, Object arg) {
		if(isDebugEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.OK,
					0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		if(isDebugEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.OK,
					0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#debug(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void debug(Marker marker, String msg, Throwable t) {
		if(isDebugEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.OK, 0, msg, t));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#isInfoEnabled(org.slf4j.Marker)
	 */
	public boolean isInfoEnabled(Marker marker) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#info(org.slf4j.Marker, java.lang.String)
	 */
	public void info(Marker marker, String msg) {
		if(isInfoEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.INFO, 0, msg, null));		
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#info(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void info(Marker marker, String format, Object arg) {
		if(isInfoEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.INFO,
					0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#info(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		if(isInfoEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.INFO,
					0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#info(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void info(Marker marker, String msg, Throwable t) {
		if(isInfoEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.INFO, 0, msg, t));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#isWarnEnabled(org.slf4j.Marker)
	 */
	public boolean isWarnEnabled(Marker marker) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#warn(org.slf4j.Marker, java.lang.String)
	 */
	public void warn(Marker marker, String msg) {
		if(isWarnEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.WARNING, 0, msg, null));		
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void warn(Marker marker, String format, Object arg) {
		if(isWarnEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.WARNING,
					0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		if(isWarnEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.WARNING,
					0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#warn(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void warn(Marker marker, String msg, Throwable t) {
		if(isInfoEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.WARNING, 0, msg, t));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#isErrorEnabled(org.slf4j.Marker)
	 */
	public boolean isErrorEnabled(Marker marker) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#error(org.slf4j.Marker, java.lang.String)
	 */
	public void error(Marker marker, String msg) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(marker, IStatus.ERROR, 0, msg, null));	
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#error(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void error(Marker marker, String format, Object arg) {
		if(isErrorEnabled(marker)) {
			getLog().log(mkStatus(marker, IStatus.ERROR,
					0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#error(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(marker, IStatus.ERROR,
					0, MessageFormatter.format(format, arg1, arg2), null));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.MarkingLogger#error(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void error(Marker marker, String msg, Throwable t) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(marker, IStatus.ERROR,	0, msg, t));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#isDebugEnabled()
	 */
	public boolean isDebugEnabled() {
		return SLF4jPlugin.getDefault().isDebugging(); 
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#debug(java.lang.String)
	 */
	public void debug(String msg) {
		if(isDebugEnabled()) {
			getLog().log(mkStatus(IStatus.OK, 0, msg, null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object)
	 */
	public void debug(String format, Object arg) {
		if(isDebugEnabled()) {
			getLog().log(mkStatus(IStatus.OK, 0,
					MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void debug(String format, Object arg1, Object arg2) {
		if(isDebugEnabled()) {
			getLog().log(mkStatus(IStatus.OK, 0,
					MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Throwable)
	 */
	public void debug(String msg, Throwable t) {
		if(isDebugEnabled()) {
			getLog().log(mkStatus(IStatus.OK, 0, msg, t));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#isInfoEnabled()
	 */
	public boolean isInfoEnabled() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#info(java.lang.String)
	 */
	public void info(String msg) {
		if(isInfoEnabled()) {
			getLog().log(mkStatus(IStatus.INFO, 0, msg, null));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object)
	 */
	public void info(String format, Object arg) {
		if(isInfoEnabled()) {
			getLog().log(mkStatus(IStatus.INFO, 0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void info(String format, Object arg1, Object arg2) {
		if(isInfoEnabled()) {
			getLog().log(mkStatus(IStatus.INFO, 0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Throwable)
	 */
	public void info(String msg, Throwable t) {
		if(isInfoEnabled()) {
			getLog().log(mkStatus(IStatus.INFO, 0, msg, t));
		}

	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#isWarnEnabled()
	 */
	public boolean isWarnEnabled() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#warn(java.lang.String)
	 */
	public void warn(String msg) {
		if(isWarnEnabled()) {
			getLog().log(mkStatus(IStatus.WARNING, 0, msg, null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object)
	 */
	public void warn(String format, Object arg) {
		if(isWarnEnabled()) {
			getLog().log(mkStatus(IStatus.WARNING, 0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void warn(String format, Object arg1, Object arg2) {
		if(isWarnEnabled()) {
			getLog().log(mkStatus(IStatus.WARNING, 0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Throwable)
	 */
	public void warn(String msg, Throwable t) {
		if(isWarnEnabled()) {
			getLog().log(mkStatus(IStatus.WARNING, 0, msg, t));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#isErrorEnabled()
	 */
	public boolean isErrorEnabled() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#error(java.lang.String)
	 */
	public void error(String msg) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(IStatus.ERROR, 0, msg, null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object)
	 */
	public void error(String format, Object arg) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(IStatus.ERROR, 0, MessageFormatter.format(format, arg), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void error(String format, Object arg1, Object arg2) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(IStatus.ERROR, 0, MessageFormatter.format(format, arg1, arg2), null));
		}
	}

	/* (non-Javadoc)
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Throwable)
	 */
	public void error(String msg, Throwable t) {
		if(isErrorEnabled()) {
			getLog().log(mkStatus(IStatus.ERROR, 0, msg, t));
		}

	}

}

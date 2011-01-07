package unc.lib.cdr.workbench.rcp;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
    /*
     * (non-Javadoc)
     *
     * @seeorg.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
     * IApplicationContext)
     */
    public Object start(IApplicationContext context) throws Exception {
	System.out.println("Application.start()");
	Display display = null;
	try {
	    Location instanceLoc = Platform.getInstanceLocation();
	    //String userHome = System.getProperty("user.home");
	    //String sep = System.getProperty("file.separator");
	    //instanceLoc.set(new URL("file", null, userHome + sep + "cdr_workbench_workspace"), false);
	    // get what the user last said about remembering the workspace
	    // location
	    /*
	     * boolean remember = PickWorkspaceDialog.isRememberWorkspace();
	     *
	     * // get the last used workspace location URL lastUsedWs =
	     * PickWorkspaceDialog.getLastSetWorkspaceLocation();
	     *
	     * // if we have a "remember" but no last used workspace, it's not
	     * much // to // remember if (remember && (lastUsedWs == null)) {
	     * remember = false; }
	     *
	     * // check to ensure the workspace location is still OK if
	     * (remember) { // if there's any problem whatsoever with the
	     * workspace, force a // dialog which in its turn will tell them
	     * what's bad String ret =
	     * PickWorkspaceDialog.checkWorkspaceLocation
	     * (Display.getDefault().getActiveShell(), lastUsedWs, false,
	     * false); if (ret != null) { remember = false; }
	     *
	     * }
	     *
	     * // if we don't remember the workspace, show the dialog if
	     * (!remember) { PickWorkspaceDialog pwd = new
	     * PickWorkspaceDialog(false, null); int pick = pwd.open();
	     *
	     * // if the user cancelled, we can't do anything as we need a //
	     * workspace, so in this case, we tell them and exit if (pick ==
	     * Window.CANCEL) {
	     * MessageDialog.openError(display.getActiveShell(), "Error",
	     * "The application can not start without a workspace root and will now exit."
	     * ); try { PlatformUI.getWorkbench().close(); } catch (Exception
	     * err) {
	     *
	     * } System.exit(0); return IApplication.EXIT_OK; } else { // tell
	     * Eclipse what the selected location was and continue
	     * instanceLoc.set(pwd.getSelectedWorkspaceLocation(), true); } }
	     * else { instanceLoc.set(lastUsedWs, true); }
	     */

	    display = PlatformUI.createDisplay();
	    int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
	    if (returnCode == PlatformUI.RETURN_RESTART)
		return IApplication.EXIT_RESTART;
	    else
		return IApplication.EXIT_OK;
	} finally {
	    if(display != null) {
		display.dispose();
	    }
	}

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.equinox.app.IApplication#stop()
     */
    public void stop() {
	final IWorkbench workbench = PlatformUI.getWorkbench();
	if (workbench == null)
	    return;
	final Display display = workbench.getDisplay();
	display.syncExec(new Runnable() {
	    public void run() {
		if (!display.isDisposed())
		    workbench.close();
	    }
	});
    }

}

package unc.lib.cdr.workbench.rcp;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.about.AboutAction;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    private IWorkbenchAction newWizardDropDownAction;
    private IWorkbenchAction aboutAction;
    private IContributionItem newWizardMenu;

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
	super(configurer);
    }

    @Override
    protected void makeActions(IWorkbenchWindow window) {
	newWizardDropDownAction = ActionFactory.NEW_WIZARD_DROP_DOWN.create(window);
	register(newWizardDropDownAction);
	newWizardMenu = ContributionItemFactory.NEW_WIZARD_SHORTLIST.create(window);
	aboutAction = ActionFactory.ABOUT.create(window);
    }

    @Override
    protected void fillMenuBar(IMenuManager menuBar) {
	MenuManager menu = new MenuManager("File", IWorkbenchActionConstants.M_FILE);
	{
	    // create the New submenu, using the same id for it as the New
	    // action
	   MenuManager newMenu = new MenuManager("New", "new");
	   newMenu.add(this.newWizardMenu);
	   menu.add(newMenu);
	   menu.add(aboutAction);
	}
	menuBar.add(menu);
    }

    @Override
    protected void fillCoolBar(ICoolBarManager coolBar) {
	ToolBarManager toolbar = new ToolBarManager(SWT.FLAT);
	toolbar.add(newWizardDropDownAction);
	coolBar.add(toolbar);
    }

}

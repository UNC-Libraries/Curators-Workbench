/**
 * Copyright 2008 The University of North Carolina at Chapel Hill
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
package cdr.forms;

import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclFactory;
import gov.loc.mods.mods.DocumentRoot;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.ModsDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cdr.forms.DepositResult.Status;

import com.philvarner.clamavj.ClamScan;
import com.philvarner.clamavj.ScanResult;

import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.MetadataBlock;
import crosswalk.OutputElement;

@Controller
@RequestMapping(value = { "/*", "/**" })
@SessionAttributes("form")
public class FormController {

	@Autowired
	ClamScan clamScan = null;
	
	public ClamScan getClamScan() {
		return clamScan;
	}

	public void setClamScan(ClamScan clamScan) {
		this.clamScan = clamScan;
	}

	public FormController() {
		LOG.debug("FormController created");
	}

	private static final Logger LOG = LoggerFactory.getLogger(FormController.class);
	
	@Autowired
	private DepositHandler depositHandler;
	
	public DepositHandler getDepositHandler() {
		return depositHandler;
	}

	public void setDepositHandler(DepositHandler depositHandler) {
		this.depositHandler = depositHandler;
	}
	
	@Autowired
	public String administratorEmail = null;

	public String getAdministratorEmail() {
		return administratorEmail;
	}

	public void setAdministratorEmail(String administratorEmail) {
		this.administratorEmail = administratorEmail;
	}

	@Autowired
	AbstractFormFactory factory = null;

	public AbstractFormFactory getFactory() {
		return factory;
	}

	public void setFactory(AbstractFormFactory factory) {
		this.factory = factory;
	}
	
	@Autowired
	private AuthorizationHandler authorizationHandler = null;

	public AuthorizationHandler getAuthorizationHandler() {
		return authorizationHandler;
	}

	public void setAuthorizationHandler(AuthorizationHandler authorizationHandler) {
		this.authorizationHandler = authorizationHandler;
	}
	
	@Autowired
	private NotificationHandler notificationHandler = null;

	public NotificationHandler getNotificationHandler() {
		return notificationHandler;
	}

	public void setNotificationHandler(NotificationHandler notificationHandler) {
		this.notificationHandler = notificationHandler;
	}

	@InitBinder
   protected void initBinder(WebDataBinder binder) {
       binder.setValidator(new FormValidator());
       binder.registerCustomEditor(java.util.Date.class, new DateEditor());
       //binder.setBindEmptyMultipartFiles(false);
       binder.registerCustomEditor(java.lang.String.class, new StringCleanerTrimmerEditor(true));
   }
	
//	@ModelAttribute("form")
//	protected Form getForm(@PathVariable String formId) {
//		return factory.getForm(formId);
//	}
	
	// get always loads the form model into modelmap as just "form"
	// also sets modelmap "formId"
	// successful save will destroy the specific model?

	@RequestMapping(value = "/{formId}.form", method = RequestMethod.GET)
	public String showForm(@PathVariable String formId, ModelMap modelmap, HttpServletRequest request) throws PermissionDeniedException {
		LOG.debug("in GET for form " + formId);
		String sessionFormId = (String)modelmap.get("formId");
		Form form = null;
		if(sessionFormId == null || !sessionFormId.equals(formId)) {
			form = factory.getForm(formId);
			if(form == null) {
				return "404";
			}
			this.getAuthorizationHandler().checkPermission(formId, form, request);
			modelmap.put("form", form);
			modelmap.put("formId", formId);
		}
		return "form";
	}

	@RequestMapping(value = "/{formId}.form", method = RequestMethod.POST)
	public String processForm(@PathVariable String formId, @Valid @ModelAttribute("form") Form form, BindingResult errors,
			Principal user, @RequestParam("file") MultipartFile file, @RequestParam(value="supplementalFile", required=false) MultipartFile[] supplementalFiles, SessionStatus sessionStatus, HttpServletRequest request) throws PermissionDeniedException {
		
		gov.loc.mods.mods.DocumentRoot modsDocumentRoot;
		edu.unc.lib.schemas.acl.DocumentRoot aclDocumentRoot;

		String pid;
		
		SubmittedFile submittedFile;
		List<SubmittedFile> supplementalSubmittedFiles;
		
		DepositResult result;

		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			LOG.error("Failed to set character encoding", e);
		}
		
		if (user != null)
			form.setCurrentUser(user.getName());
		
		this.getAuthorizationHandler().checkPermission(formId, form, request);
		
		
		// Handle uploaded files, exiting to report errors if we find any
		
		submittedFile = handleUploadedFile(file, errors);

		if (submittedFile == null)
			errors.addError(new FieldError("form", "file", "You must select a file for upload."));
		
		supplementalSubmittedFiles = new ArrayList<SubmittedFile>();
		
		for (MultipartFile supplementalFile : supplementalFiles) {
			SubmittedFile sf = handleUploadedFile(supplementalFile, errors);
			if (sf != null)
				supplementalSubmittedFiles.add(sf);
		}

		if (errors.hasErrors()) {
			LOG.debug(errors.getErrorCount() + " errors");
			return "form";
		}
		
		
		// Deposit
		
		pid = "uuid:" + UUID.randomUUID().toString();
		modsDocumentRoot = makeMods(form);
		aclDocumentRoot = makeAcl(form);
		
		result = this.getDepositHandler().deposit(form.getDepositContainerId(), pid, modsDocumentRoot, aclDocumentRoot, submittedFile, supplementalSubmittedFiles);
		
		
		// Handle a failed deposit response

		if (result.getStatus() == Status.FAILED) {
			LOG.error("deposit failed");
			errors.addError(new FieldError("form", "file", "Deposit failed with response code: " + result.getStatus()));
			return "form";
		}
		getNotificationHandler().notifyDeposit(form, result, user.getName());
		
		
		// Clean up: delete the temporary file, clear the session
		
		if (submittedFile.getFile() != null)
			submittedFile.getFile().delete();
		
		for (SubmittedFile sf : supplementalSubmittedFiles) {
			if (sf.getFile() != null)
				sf.getFile().delete();
		}
		
		sessionStatus.setComplete();
		request.setAttribute("formId", formId);

		return "success";
		
	}
	
	private SubmittedFile handleUploadedFile(MultipartFile file, BindingResult errors) {
		
		if (file.isEmpty())
			return null;
			
		SubmittedFile submittedFile = new SubmittedFile();

		try {

			// Copy or save the uploaded file to the temporary directory

			File temp = File.createTempFile("form", ".data");
			file.transferTo(temp);

			// Run the virus scan on the file, adding an error and moving on to
			// the next one if there's a non-null result

			String scanResult = virusScan(temp);

			if (scanResult != null) {
				errors.addError(new FieldError("form", "file", scanResult));
				temp.delete();
				temp = null;

				return null;
			}

			submittedFile.setFile(temp);

		} catch (IOException e) {
			throw new Error(e);
		} catch (IllegalStateException e) {
			throw new Error(e);
		}

		submittedFile.setFilename(file.getOriginalFilename().replaceAll(Pattern.quote("\""), ""));

		if (file.getContentType() == null)
			submittedFile.setContentType("application/octet-stream");
		else
			submittedFile.setContentType(file.getContentType());

		return submittedFile;
		
	}

	private synchronized String virusScan(File depositFile) {
		try {
			ScanResult result = this.getClamScan().scan(new FileInputStream(depositFile));
			switch(result.getStatus()) {
				case PASSED:
					return null;
				case FAILED:
					return "A virus was detected in your file. Please scan your computer for viruses or report this issue to technical support.";
				case ERROR:
					throw new Error("There was a problem running the virus scan.", result.getException());
			}
		} catch (FileNotFoundException e) {
			throw new Error("There was a problem finding the uploaded file: "+depositFile.getName(), e);
		}
		return null;
	}

	@ExceptionHandler(PermissionDeniedException.class)
	public ModelAndView handleForbidden(PermissionDeniedException e) {
		ModelAndView modelview = new ModelAndView("403");
		modelview.addObject("formId", e.getFormId());
		modelview.addObject("form", e.getForm());
		modelview.addObject("message", e.getMessage()+" \nSend email to "+this.getAdministratorEmail()+" to request access.");
		return modelview;
	}
	
	private gov.loc.mods.mods.DocumentRoot makeMods(Form form) {
		// run the mapping and get a MODS record. (report any errors)
		ModsDefinition mods = MODSFactory.eINSTANCE.createModsDefinition();
		gov.loc.mods.mods.DocumentRoot root = MODSFactory.eINSTANCE.createDocumentRoot();
		root.setMods(mods);
		for (FormElement fe : form.getElements()) {
			if(MetadataBlock.class.isInstance(fe)) {
				MetadataBlock mb = (MetadataBlock)fe;
				for(OutputElement oe : mb.getElements()) {
					oe.updateRecord(mods);
				}
			}
		}
		return root;
	}
	
	private edu.unc.lib.schemas.acl.DocumentRoot makeAcl(Form form) {
		
		AccessControlType accessControl = AclFactory.eINSTANCE.createAccessControlType();
		edu.unc.lib.schemas.acl.DocumentRoot root = AclFactory.eINSTANCE.createDocumentRoot();
		root.setAccessControl(accessControl);
		
		// If the form specifies that the object should be reviewed before publication,
		// the ACL should specify that it is not published.
		
		if (form.isReviewBeforePublication())
			accessControl.setPublished(false);
		
		return root;
		
	}

}
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
package cdr.forms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cdr.forms.DepositResult.Status;

import com.philvarner.clamavj.ClamScan;
import com.philvarner.clamavj.ScanResult;

import crosswalk.CrosswalkPackage;
import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;

@Controller
@RequestMapping(value = { "/*", "/**" })
@SessionAttributes("deposit")
public class FormController {
	
	private static final String SUPPLEMENTAL_OBJECTS_FORM_ID = "studio-art";

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
	Long maxUploadSize = null;
	
	public Long getMaxUploadSize() {
		return maxUploadSize;
	}
	
	public void setMaxUploadSize(Long maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
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
	
	@Autowired(required=false)
	private NotificationHandler notificationHandler = null;

	public NotificationHandler getNotificationHandler() {
		return notificationHandler;
	}

	public void setNotificationHandler(NotificationHandler notificationHandler) {
		this.notificationHandler = notificationHandler;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new DepositValidator());
		binder.registerCustomEditor(java.util.Date.class, new DateEditor());
		binder.registerCustomEditor(java.lang.String.class, new StringCleanerTrimmerEditor(true));
		binder.registerCustomEditor(DepositFile.class, new DepositFileEditor());
		binder.setBindEmptyMultipartFiles(false);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		final Map<String, Form> forms = factory.getForms();
		
		List<String> ids = new ArrayList<String>(forms.keySet());
		
		Collections.sort(ids, new Comparator<String>() {
			public int compare(String a, String b) {
				return forms.get(a).getTitle().compareTo(forms.get(b).getTitle());
			}
		});
		
		model.addAttribute("ids", ids);
		model.addAttribute("forms", forms);
		
		return "index";
		
	}

	@RequestMapping(value = "/{formId}.form", method = RequestMethod.GET)
	public String showForm(@PathVariable String formId, Model model, Principal user, HttpServletRequest request) throws PermissionDeniedException {
		
		request.setAttribute("hasSupplementalObjectsStep", formId.equals(SUPPLEMENTAL_OBJECTS_FORM_ID));
		
		//
		
		Form form = factory.getForm(formId);
		
		if (form == null)
			return "404";
		
		this.getAuthorizationHandler().checkPermission(formId, form, request);
		
		//

		Deposit deposit = new Deposit();

		deposit.setForm(form);
		deposit.setFormId(formId);
		
		//
		
		IdentityHashMap<FileBlock, Integer> blockFileIndexMap = new IdentityHashMap<FileBlock, Integer>();

		int index = 0;
		
		for (FormElement element : form.getElements()) {
			if (element instanceof FileBlock) {
				blockFileIndexMap.put((FileBlock) element, new Integer(index));
				index++;
			}
		}
	    
	    deposit.setFiles(new DepositFile[index]);
	    deposit.setBlockFileIndexMap(blockFileIndexMap);
	    
	    //
	    
	    deposit.setSupplementalFiles(new DepositFile[3]);
	    
	    //
	    
	    deposit.setSupplementalObjects(new ArrayList<SupplementalObject>());
	    
	    //
	    
	    String receiptEmailAddress = null;
		
		if (request.getHeader("mail") != null) {
			receiptEmailAddress = request.getHeader("mail");
			
			if (receiptEmailAddress.endsWith("_UNC"))
				receiptEmailAddress = receiptEmailAddress.substring(0, receiptEmailAddress.length() - 4);
		}
		
		deposit.setReceiptEmailAddress(receiptEmailAddress);
		
		//
		
		if (user != null)
			deposit.getForm().setCurrentUser(user.getName());
		
		
		model.addAttribute("deposit", deposit);
		
		return "form";
		
	}

	@RequestMapping(value = "/{formId}.form", method = RequestMethod.POST)
	public String collectDeposit(
			Model model,
			@PathVariable(value="formId") String formId,
			@Valid @ModelAttribute("deposit") Deposit deposit,
			BindingResult errors,
			SessionStatus sessionStatus,
			HttpServletRequest request,
			HttpServletResponse response) throws PermissionDeniedException {
		
		request.setAttribute("hasSupplementalObjectsStep", formId.equals(SUPPLEMENTAL_OBJECTS_FORM_ID));
		
		
		// Validate request and ensure character encoding is set
		
		if (!deposit.getFormId().equals(formId))
			throw new Error("Form ID in session doesn't match form ID in path");
		
		this.getAuthorizationHandler().checkPermission(formId, deposit.getForm(), request);
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			LOG.error("Failed to set character encoding", e);
		}
		
		
		// Check the deposit's files for virus signatures
		
		IdentityHashMap<DepositFile, String> signatures = scanDepositFiles(deposit.getAllFiles());
		
		
		// Handle viruses, errors, and the supplemental files form

		request.setAttribute("formId", formId);
		request.setAttribute("administratorEmail", getAdministratorEmail());
		
		if (signatures.size() > 0) {
			
			request.setAttribute("signatures", signatures);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "virus";
			
		}
		
		if (errors.hasErrors()) {
			
			return "form";
			
		}
		
		if (formId.equals(SUPPLEMENTAL_OBJECTS_FORM_ID)) {
			
			return "redirect:/supplemental";
			
		}
		
		
		// Try to deposit
		
		DepositResult result = this.getDepositHandler().deposit(deposit);
	
		if (result.getStatus() == Status.FAILED) {
		
			LOG.error("deposit failed");
			
			if (getNotificationHandler() != null)
				getNotificationHandler().notifyError(deposit.getForm(), result, deposit.getReceiptEmailAddress(), formId);
			
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "failed";
		
		} else {
	
			if (getNotificationHandler() != null)
				getNotificationHandler().notifyDeposit(deposit.getForm(), result, deposit.getReceiptEmailAddress(), formId);

			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "success";
			
		}
		
	}
	
	@RequestMapping(value = "/supplemental")
	public String collectSupplementalObjects(
			@Valid @ModelAttribute("deposit") Deposit deposit,
			BindingResult errors,
			SessionStatus sessionStatus,
			@RequestParam(value="added", required=false) DepositFile[] addedDepositFiles,
			@RequestParam(value="deposit", required=false) String submitDepositAction,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		// Validate request and ensure character encoding is set
		
		this.getAuthorizationHandler().checkPermission(deposit.getFormId(), deposit.getForm(), request);
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			LOG.error("Failed to set character encoding", e);
		}
		
		
		// Update supplemental objects
		
		Iterator<SupplementalObject> iterator = deposit.getSupplementalObjects().iterator();
		
		while (iterator.hasNext()) {
			SupplementalObject file = iterator.next();
			if (file == null)
				iterator.remove();
		}
		
		if (addedDepositFiles != null) {
			for (DepositFile depositFile : addedDepositFiles) {
				if (depositFile != null) {
					SupplementalObject object = new SupplementalObject();
					object.setDepositFile(depositFile);
					
					deposit.getSupplementalObjects().add(object);
				}
			}
		}
		
		Collections.sort(deposit.getSupplementalObjects(), new Comparator<SupplementalObject>() {
			public int compare(SupplementalObject sf1, SupplementalObject sf2) {
		        return sf1.getDepositFile().getFilename().compareTo(sf2.getDepositFile().getFilename());
			}
		});
		
		
		// Check the deposit's files for virus signatures
		
		IdentityHashMap<DepositFile, String> signatures = scanDepositFiles(deposit.getAllFiles());
		
		
		// Validate supplemental objects
		
		if (submitDepositAction != null) {
			Validator validator = new SupplementalObjectValidator();
			
			int i = 0;
			
			for (SupplementalObject object : deposit.getSupplementalObjects()) {
				errors.pushNestedPath("supplementalObjects[" + i + "]");
				validator.validate(object, errors);
				errors.popNestedPath();
				
				i++;
			}
		}
		
		
		// Handle viruses, validation errors, and the deposit not having been finally submitted

		request.setAttribute("formId", deposit.getFormId());
		request.setAttribute("administratorEmail", getAdministratorEmail());
		
		if (signatures.size() > 0) {
			
			request.setAttribute("signatures", signatures);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "virus";
			
		}
		
		if (errors.hasErrors()) {	
			
			return "supplemental";
			
		}
		
		if (submitDepositAction == null) {
			
			return "supplemental";
			
		}
		
		
		// Try to deposit
		
		DepositResult result = this.getDepositHandler().deposit(deposit);
	
		if (result.getStatus() == Status.FAILED) {
		
			LOG.error("deposit failed");
			
			if (getNotificationHandler() != null)
				getNotificationHandler().notifyError(deposit.getForm(), result, deposit.getReceiptEmailAddress(), deposit.getFormId());
			
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "failed";
		
		} else {
	
			if (getNotificationHandler() != null)
				getNotificationHandler().notifyDeposit(deposit.getForm(), result, deposit.getReceiptEmailAddress(), deposit.getFormId());

			deposit.deleteAllFiles();
			sessionStatus.setComplete();
			
			return "success";
			
		}
		
	}
	
	@RequestMapping(value = "/supplemental/files", method = RequestMethod.POST)
	@ResponseBody
	public void addSupplementalObject(
			@Valid @ModelAttribute("deposit") Deposit deposit,
			BindingResult errors,
			@RequestParam(value="file") DepositFile depositFile) {
		
		if (depositFile != null) {
			SupplementalObject object = new SupplementalObject();
			object.setDepositFile(depositFile);
			deposit.getSupplementalObjects().add(object);
	
			Collections.sort(deposit.getSupplementalObjects(), new Comparator<SupplementalObject>() {
				public int compare(SupplementalObject sf1, SupplementalObject sf2) {
			        return sf1.getDepositFile().getFilename().compareTo(sf2.getDepositFile().getFilename());
				}
			});
		}
		
	}
	
	private IdentityHashMap<DepositFile, String> scanDepositFiles(List<DepositFile> files) {
		
		IdentityHashMap<DepositFile, String> signatures = new IdentityHashMap<DepositFile, String>();
			
		for (DepositFile depositFile : files) {
		
			if (depositFile != null && depositFile.getFile() != null) {
				ScanResult result = this.getClamScan().scan(depositFile.getFile());
				
				switch(result.getStatus()) {
					case PASSED:
						continue;
					case FAILED:
						signatures.put(depositFile, result.getSignature());
						continue;
					case ERROR:
						throw new Error("There was a problem running the virus scan.", result.getException());
				}
			}
			
		}
		
		return signatures;
		
	}

	@ExceptionHandler(PermissionDeniedException.class)
	public ModelAndView handleForbidden(PermissionDeniedException e) {
		ModelAndView modelview = new ModelAndView("403");
		modelview.addObject("formId", e.getFormId());
		modelview.addObject("form", e.getForm());
		modelview.addObject("message", e.getMessage()+" \nSend email to "+this.getAdministratorEmail()+" to request access.");
		return modelview;
	}

}
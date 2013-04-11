package cdr.forms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import cdr.forms.DepositResult.Status;

import com.philvarner.clamavj.ClamScan;

import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.InputField;
import crosswalk.MetadataBlock;

@Controller
@RequestMapping(value = { "/*", "/**" })
@SessionAttributes("deposit")
public class SupplementalController {
	
	public class SupplementalObjectValidator implements Validator {

		@Override
		public boolean supports(Class<?> clazz) {
			 return SupplementalObject.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "field.required", "This field is required.");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "medium", "field.required", "This field is required.");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dimensions", "field.required", "This field is required.");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "date", "field.required", "This field is required.");
		}

	}
	
	private static final Logger LOG = LoggerFactory.getLogger(SupplementalController.class);

	@Autowired
	ClamScan clamScan = null;
	
	public ClamScan getClamScan() {
		return clamScan;
	}

	public void setClamScan(ClamScan clamScan) {
		this.clamScan = clamScan;
	}
	
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
		binder.registerCustomEditor(DepositFile.class, new DepositFileEditor());
		binder.registerCustomEditor(java.util.Date.class, new DateEditor());
		binder.registerCustomEditor(java.lang.String.class, new StringCleanerTrimmerEditor(true));
	}
	
	@RequestMapping(value = "/supplemental", method = RequestMethod.GET)
	public String show(
			@ModelAttribute("deposit") Deposit deposit,
			HttpServletRequest request) {
		
		if (deposit.getSupplementalObjects() == null)
			deposit.setSupplementalObjects(new ArrayList<SupplementalObject>());
		
		return "supplemental";
		
	}
	
	@RequestMapping(value = "/supplemental", method = RequestMethod.POST)
	public String update(
			@ModelAttribute("deposit") Deposit deposit,
			BindingResult errors,
			@RequestParam(value="added", required=false) DepositFile[] addedDepositFiles,
			@RequestParam(value="deposit", required=false) String submitDepositAction,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		// If the "ready to submit" button was clicked, validate and submit
		
		if (submitDepositAction != null) {
			
			Validator validator = new SupplementalObjectValidator();
			
			int i = 0;
			
			for (SupplementalObject object : deposit.getSupplementalObjects()) {
				errors.pushNestedPath("supplementalObjects[" + i + "]");
				validator.validate(object, errors);
				errors.popNestedPath();
				
				i++;
			}
			
			if (!errors.hasErrors()) {
				
				DepositResult result = this.getDepositHandler().deposit(deposit);
				
				String view;
				
				if (result.getStatus() == Status.FAILED) {
					LOG.error("deposit failed");
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					
					view = "failed";
				} else {
					view = "success";
				}
				
				return view;
				
			}
			
		}
		
		// Remove file instances set to null by binder
		
		Iterator<SupplementalObject> iterator = deposit.getSupplementalObjects().iterator();
		
		while (iterator.hasNext()) {
			SupplementalObject file = iterator.next();
			if (file == null)
				iterator.remove();
		}
		
		// Add file instances
		
		if (addedDepositFiles != null) {
			for (DepositFile depositFile : addedDepositFiles) {
				if (depositFile != null) {
					SupplementalObject file = new SupplementalObject();
					file.setDepositFile(depositFile);
					
					deposit.getSupplementalObjects().add(0, file);
				}
			}
		}
		
		// Sort files by name
		
		Collections.sort(deposit.getSupplementalObjects(), new Comparator<SupplementalObject>() {
			public int compare(SupplementalObject sf1, SupplementalObject sf2) {
		        return sf1.getDepositFile().getFilename().compareTo(sf2.getDepositFile().getFilename());
			}
		});
		
		return "supplemental";
		
	}

}

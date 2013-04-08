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
import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.InputField;
import crosswalk.MetadataBlock;

@Controller
@RequestMapping(value = { "/*", "/**" })
@SessionAttributes("supplemental")
public class SupplementalController {
	
	public class SupplementalFile {
		private DepositFile depositFile;
		private String title;
		private String medium;
		private String dimensions;
		private Date date;
		private String narrative;
		
		public DepositFile getDepositFile() {
			return depositFile;
		}
		
		public void setDepositFile(DepositFile depositFile) {
			this.depositFile = depositFile;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getMedium() {
			return medium;
		}
		
		public void setMedium(String medium) {
			this.medium = medium;
		}

		public String getDimensions() {
			return dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getNarrative() {
			return narrative;
		}

		public void setNarrative(String narrative) {
			this.narrative = narrative;
		}
	}
	
	public class SupplementalDeposit {
		private List<SupplementalFile> files;

		public List<SupplementalFile> getFiles() {
			return files;
		}

		public void setFiles(List<SupplementalFile> files) {
			this.files = files;
		}
	}
	
	public class SupplementalDepositValidator implements Validator {

		@Override
		public boolean supports(Class<?> clazz) {
			 return SupplementalDeposit.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			SupplementalDeposit deposit = (SupplementalDeposit) target;
			
			for (SupplementalFile file : deposit.getFiles()) {
				if (file == null)
					continue;
				
				String base = "files[" + deposit.getFiles().indexOf(file) + "]"; 
				
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, base + ".title", "field.required", "This field is required.");
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, base + ".medium", "field.required", "This field is required.");
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, base + ".dimensions", "field.required", "This field is required.");
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, base + ".date", "field.required", "This field is required.");
			}
		}

	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(DepositFile.class, new DepositFileEditor());
		binder.registerCustomEditor(java.util.Date.class, new DateEditor());
		binder.registerCustomEditor(java.lang.String.class, new StringCleanerTrimmerEditor(true));
	}
	
	@RequestMapping(value = "/supplemental", method = RequestMethod.GET)
	public String show(
			Model model,
			HttpServletRequest request) {
		
		if (request.getSession(true).getAttribute("supplementalContainerPid") == null) {
			System.out.println("No container PID");
		}
		
		if (!model.containsAttribute("supplemental")) {
			SupplementalDeposit supplemental = new SupplementalDeposit();
			supplemental.setFiles(new ArrayList<SupplementalFile>());
			model.addAttribute("supplemental", supplemental);
		}
		
		return "supplemental";
		
	}
	
	@RequestMapping(value = "/supplemental", method = RequestMethod.POST)
	public String update(
			@ModelAttribute("supplemental") SupplementalDeposit supplemental,
			BindingResult errors,
			@RequestParam(value="added", required=false) DepositFile[] addedDepositFiles,
			@RequestParam(value="deposit", required=false) String submitDepositAction) {
		
		// If the "ready to submit" button was clicked, validate
		
		if (submitDepositAction != null) {
			Validator validator = new SupplementalDepositValidator();
			validator.validate(supplemental, errors);
			
			if (!errors.hasErrors())
				return "supplemental/success";
		}
		
		// Remove file instances set to null by binder
		
		Iterator<SupplementalFile> iterator = supplemental.getFiles().iterator();
		
		while (iterator.hasNext()) {
			SupplementalFile file = iterator.next();
			if (file == null)
				iterator.remove();
		}
		
		// Add file instances
		
		if (addedDepositFiles != null) {
			for (DepositFile depositFile : addedDepositFiles) {
				if (depositFile != null) {
					SupplementalFile file = new SupplementalFile();
					file.setDepositFile(depositFile);
					
					supplemental.getFiles().add(0, file);
				}
			}
		}
		
		// Sort files by name
		
		Collections.sort(supplemental.getFiles(), new Comparator<SupplementalFile>() {
			public int compare(SupplementalFile sf1, SupplementalFile sf2) {
		        return sf1.getDepositFile().getFilename().compareTo(sf2.getDepositFile().getFilename());
			}
		});
		
		return "supplemental";
		
	}

}

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

import gov.loc.mods.mods.DocumentRoot;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.util.MODSResourceFactoryImpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
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
import org.w3._1999.xlink.XlinkPackage;

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
	ResourceSet rs = null;
	
	
	@Autowired
	ClamScan clamScan = null;
	
	public ClamScan getClamScan() {
		return clamScan;
	}

	public void setClamScan(ClamScan clamScan) {
		this.clamScan = clamScan;
	}

	public FormController() {
		rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mods", new MODSResourceFactoryImpl());
		rs.getPackageRegistry().put(MODSPackage.eNS_URI, MODSPackage.eINSTANCE);
		rs.getPackageRegistry().put(XlinkPackage.eNS_URI, XlinkPackage.eINSTANCE);
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

	@InitBinder
   protected void initBinder(WebDataBinder binder) {
       binder.setValidator(new FormValidator());
       binder.registerCustomEditor(java.util.Date.class, new DateEditor());
       //binder.setBindEmptyMultipartFiles(false);
       binder.registerCustomEditor(java.lang.String.class, new StringTrimmerEditor(true));
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
			this.getAuthorizationHandler().checkPermission(formId, form, request);
			modelmap.put("form", form);
			modelmap.put("formId", formId);
		}
		return "form";
	}

	@RequestMapping(value = "/{formId}.form", method = RequestMethod.POST)
	public String processForm(@PathVariable String formId, @Valid @ModelAttribute("form") Form form, BindingResult errors,
			Principal user, @RequestParam("file") MultipartFile mpfile, SessionStatus sessionStatus, HttpServletRequest request) throws PermissionDeniedException {
		LOG.debug("in POST for form " + formId);
		this.getAuthorizationHandler().checkPermission(formId, form, request);
		if (user != null) form.setCurrentUser(user.getName());
		String mods = makeMods(form);
		LOG.debug(mods);
		File depositFile = null;
		if(mpfile.isEmpty()) {
			errors.addError( new FieldError("form", "file", "You must select a file for upload."));
		} else {
			depositFile = handleUpload(mpfile);
			String scanResult = virusScan(depositFile);
			if(scanResult != null) {
				errors.addError( new FieldError("form", "file", scanResult));
				depositFile.delete();
				depositFile = null;
			}
		}
		if (errors.hasErrors()) {
			LOG.debug(errors.getErrorCount() + " errors");
			return "form";
		}
		
		LOG.debug("mpfile.getOriginalFilename(): "+mpfile.getOriginalFilename());
		
		// perform a deposit with the default handler.
		DepositResult result = this.getDepositHandler().deposit(form.getDepositContainerId(), mods, mpfile.getOriginalFilename(), depositFile, mpfile.getContentType());
		
		if(result.getStatus() == Status.FAILED) {
			LOG.error("deposit failed");
			errors.addError( new FieldError("form","file", "Deposit failed with response code: "+result.getStatus()));
			return "form";
		}
		
		// TODO email notices

		// delete files
		if(depositFile != null) depositFile.delete();
		// clear session
		sessionStatus.setComplete();
		return "success";
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

	private File handleUpload(MultipartFile file) {
		File result = null;
		OutputStream out = null;
		try {
			result = File.createTempFile("form", ".data");
			InputStream stream = file.getInputStream();
			out = new BufferedOutputStream(new FileOutputStream(result));
			for(int i = stream.read(); i >= 0; i = stream.read()) {
				out.write(i);
			}
			out.flush();
		} catch(IOException e) {
			throw new Error(e);
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(IOException ignored) {}
			}
		}
		return result;
	}

	@ExceptionHandler(PermissionDeniedException.class)
	public ModelAndView handleForbidden(PermissionDeniedException e) {
		ModelAndView modelview = new ModelAndView("403");
		modelview.addObject("formId", e.getFormId());
		modelview.addObject("form", e.getForm());
		modelview.addObject("message", e.getMessage()+" \nSend email to "+this.getAdministratorEmail()+" to request access.");
		return modelview;
	}
	
	private String makeMods(Form form) {
		// run the mapping and get a MODS record. (report any errors)
		ModsDefinition mods = MODSFactory.eINSTANCE.createModsDefinition();
		DocumentRoot root = MODSFactory.eINSTANCE.createDocumentRoot();
		root.setMods(mods);
		for (FormElement fe : form.getElements()) {
			if(MetadataBlock.class.isInstance(fe)) {
				MetadataBlock mb = (MetadataBlock)fe;
				for(OutputElement oe : mb.getElements()) {
					oe.updateRecord(mods);
				}
			}
		}
		File tmp;
		try {
			tmp = File.createTempFile("tmp", ".mods");
		} catch (IOException e1) {
			throw new Error(e1);
		}
		URI uri = URI.createURI(tmp.toURI().toString());
		XMLResource res = (XMLResource) rs.createResource(uri);
		res.getContents().add(root);
		
		StringWriter sw = new StringWriter();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "utf-8");

		options.put(XMLResource.OPTION_DECLARE_XML, "");
		options.put(XMLResource.OPTION_LINE_WIDTH, new Integer(80));
		options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(mods));
		try {
			res.save(sw, options);
		} catch (IOException e) {
			throw new Error("failed to serialize XML for model object", e);
		}
		return sw.toString();
	}

}
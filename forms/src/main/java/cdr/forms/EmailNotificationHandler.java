package cdr.forms;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import crosswalk.Form;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class EmailNotificationHandler implements NotificationHandler {
	private static final Logger LOG = LoggerFactory
			.getLogger(EmailNotificationHandler.class);
	private Template depositReceiptHtmlTemplate = null;
	private Template depositReceiptTextTemplate = null;
	private Template depositNoticeHtmlTemplate = null;
	private Template depositNoticeTextTemplate = null;
	private Template depositErrorHtmlTemplate = null;
	private Template depositErrorTextTemplate = null;

	private JavaMailSender mailSender = null;

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public Configuration getFreemarkerConfiguration() {
		return freemarkerConfiguration;
	}

	public void setFreemarkerConfiguration(Configuration freemarkerConfiguration) {
		this.freemarkerConfiguration = freemarkerConfiguration;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	private Configuration freemarkerConfiguration = null;

	private String fromAddress = null;
	
	private String administratorAddress = null;
	
	private String siteUrl = null;
	
	private String siteName = null;

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getAdministratorAddress() {
		return administratorAddress;
	}

	public void setAdministratorAddress(String administratorAddress) {
		this.administratorAddress = administratorAddress;
	}

	public void init() {
		try {
			depositReceiptHtmlTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositReceiptHtml.ftl", Locale.getDefault(), "utf-8");
			depositReceiptTextTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositReceiptText.ftl", Locale.getDefault(), "utf-8");
			depositNoticeHtmlTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositNoticeHtml.ftl", Locale.getDefault(), "utf-8");
			depositNoticeTextTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositNoticeText.ftl", Locale.getDefault(), "utf-8");
			depositErrorHtmlTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositErrorHtml.ftl", Locale.getDefault(), "utf-8");
			depositErrorTextTemplate = getFreemarkerConfiguration().getTemplate(
					"DepositErrorText.ftl", Locale.getDefault(), "utf-8");
		} catch (IOException e) {
			throw new Error("Cannot load email templates", e);
		}
	}

	@Override
	public List<String> notifyDeposit(Form form, DepositResult result,
			String depositorEmail, String formId) {
		// put data into the model
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("form", form);
		model.put("formId", formId);
		model.put("result", result);
		model.put("siteUrl", this.getSiteUrl());
		model.put("siteName", this.getSiteName());
		model.put("receivedDate", new Date(System.currentTimeMillis()));
		
		List<String> receiptNotified = sendReceipt(model, depositorEmail, form);
		List<String> noticeNotified = sendNotice(model, form);
		
		HashSet<String> notified = new HashSet<String>();
		
		if (receiptNotified != null)
			notified.addAll(receiptNotified);

		if (noticeNotified != null)
			notified.addAll(noticeNotified);
		
		return new ArrayList<String>(notified);
	}
	
	@Override
	public List<String> notifyError(Form form, DepositResult result,
			String depositorEmail, String formId) {
		// put data into the model
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("form", form);
		model.put("formId", formId);
		model.put("result", result);
		model.put("depositorEmail", depositorEmail);
		model.put("siteUrl", this.getSiteUrl());
		model.put("siteName", this.getSiteName());
		model.put("receivedDate", new Date(System.currentTimeMillis()));
		StringWriter htmlsw = new StringWriter();
		StringWriter textsw = new StringWriter();
		try {
			depositErrorHtmlTemplate.process(model, htmlsw);
			depositErrorTextTemplate.process(model, textsw);
		} catch (TemplateException e) {
			LOG.error("cannot process email template", e);
			return null;
		} catch (IOException e) {
			LOG.error("cannot process email template", e);
			return null;
		}

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper message = new MimeMessageHelper(mimeMessage,
					MimeMessageHelper.MULTIPART_MODE_MIXED);
			if(administratorAddress != null && administratorAddress.trim().length() > 0) {
				message.addTo(this.administratorAddress);
			}
			if(form.getEmailDepositNoticeTo() != null && !form.getEmailDepositNoticeTo().isEmpty()) {
				for(String addy : form.getEmailDepositNoticeTo()) {
					message.addTo(addy);
				}
			}
			if(depositorEmail != null && depositorEmail.trim().length() > 0) message.addTo(depositorEmail);
			message.setSubject("Deposit Error for " + form.getTitle());
			message.setFrom(this.getFromAddress());
			message.setText(textsw.toString() , htmlsw.toString());
			this.mailSender.send(mimeMessage);
			
			ArrayList<String> notified = new ArrayList<String>();
			for (Address address : mimeMessage.getAllRecipients())
				notified.add(address.toString());
			return notified;
		} catch (MessagingException e) {
			LOG.error("problem sending error notification message", e);
			return null;
		}
		
	}
	
	private List<String> sendReceipt(HashMap<String, Object> model, String email, Form form) {
		
		// The receipt is only sent to the depositor's address, given by the "email" parameter,
		// so if that is blank, just return an empty list.
		
		if (email == null || email.trim().length() == 0)
			return new ArrayList<String>(0);
		
		StringWriter htmlsw = new StringWriter();
		StringWriter textsw = new StringWriter();
		try {
			depositReceiptHtmlTemplate.process(model, htmlsw);
			depositReceiptTextTemplate.process(model, textsw);
		} catch (TemplateException e) {
			LOG.error("cannot process email template", e);
			return null;
		} catch (IOException e) {
			LOG.error("cannot process email template", e);
			return null;
		}

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper message = new MimeMessageHelper(mimeMessage,
					MimeMessageHelper.MULTIPART_MODE_MIXED);
			message.addTo(email);
			message.setSubject("Deposit Receipt for " + form.getTitle());
			message.setFrom(this.getFromAddress());
			message.setText(textsw.toString() , htmlsw.toString());
			this.mailSender.send(mimeMessage);

			ArrayList<String> notified = new ArrayList<String>();
			for (Address address : mimeMessage.getAllRecipients())
				notified.add(address.toString());
			return notified;
		} catch (MessagingException e) {
			LOG.error("problem sending deposit message", e);
			return null;
		}
	}
	
	private List<String> sendNotice(HashMap<String, Object> model, Form form) {
		
		if (form.getEmailDepositNoticeTo() == null || form.getEmailDepositNoticeTo().isEmpty())
			return new ArrayList<String>(0);
		
		StringWriter htmlsw = new StringWriter();
		StringWriter textsw = new StringWriter();
		try {
			depositNoticeHtmlTemplate.process(model, htmlsw);
			depositNoticeTextTemplate.process(model, textsw);
		} catch (TemplateException e) {
			LOG.error("cannot process email template", e);
			return null;
		} catch (IOException e) {
			LOG.error("cannot process email template", e);
			return null;
		}

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper message = new MimeMessageHelper(mimeMessage,
					MimeMessageHelper.MULTIPART_MODE_MIXED);
			for(String addy : form.getEmailDepositNoticeTo()) {
				message.addTo(addy);
			}
			message.setSubject("Deposit to " + form.getTitle() + " by "+form.getCurrentUser());
			message.setFrom(this.getFromAddress());
			message.setText(textsw.toString() , htmlsw.toString());
			this.mailSender.send(mimeMessage);
			
			ArrayList<String> notified = new ArrayList<String>();
			for (Address address : mimeMessage.getAllRecipients())
				notified.add(address.toString());
			return notified;
		} catch (MessagingException e) {
			LOG.error("problem sending deposit message", e);
			return null;
		}
	}

}

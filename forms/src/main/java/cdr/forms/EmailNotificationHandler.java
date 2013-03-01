package cdr.forms;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;

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
	private Template depositHtmlTemplate = null;
	private Template depositTextTemplate = null;

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

	public void init() {
		try {
			depositHtmlTemplate = getFreemarkerConfiguration().getTemplate(
					"depositHtml.ftl", Locale.getDefault(), "utf-8");
			depositTextTemplate = getFreemarkerConfiguration().getTemplate(
					"depositText.ftl", Locale.getDefault(), "utf-8");
		} catch (IOException e) {
			throw new Error("Cannot load email templates", e);
		}
	}

	@Override
	public void notifyDeposit(Form form, DepositResult result,
			String depositorEmail) {
		// put data into the model
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("form", form);
		model.put("result", result);

		StringWriter htmlsw = new StringWriter();
		StringWriter textsw = new StringWriter();
		try {
			depositHtmlTemplate.process(model, htmlsw);
			depositTextTemplate.process(model, textsw);
		} catch (TemplateException e) {
			LOG.error("cannot process email template", e);
			return;
		} catch (IOException e) {
			LOG.error("cannot process email template", e);
			return;
		}

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper message = new MimeMessageHelper(mimeMessage,
					MimeMessageHelper.MULTIPART_MODE_MIXED);

			for (String addy : form.getEmailDepositNoticeTo()) {
				message.addTo(addy);
			}
			message.setSubject("Deposit to " + form.getTitle());

			message.setFrom(this.getFromAddress());
			message.setText(textsw.toString(), htmlsw.toString());
			this.mailSender.send(mimeMessage);
		} catch (MessagingException e) {
			LOG.error("problem sending deposit message", e);
		}
	}

}

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cdr.forms.CachedXMIFormFactory;
import cdr.forms.DepositResult;
import cdr.forms.DepositResult.Status;
import cdr.forms.EmailNotificationHandler;
import crosswalk.DateInputField;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.InputField;
import crosswalk.MetadataBlock;
import crosswalk.TextInputField;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/email-test-service-context.xml" })
public class EmailNotificationTest {
	
	@Resource
	JavaMailSender javaMailSender = null;
	
	@Resource
	EmailNotificationHandler emailNotificationHandler = null;
	
	@Resource
	CachedXMIFormFactory formFactory = null;
	
	public void setMailMock() {
		// setup mail sender mock invocations
		reset(this.javaMailSender);
		when(this.javaMailSender.createMimeMessage()).thenCallRealMethod();

		Answer dumpMessage = new Answer() {
			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				Object arg = invocation.getArguments()[0];
				if (arg instanceof MimeMessage) {
					MimeMessage m = (MimeMessage) arg;
					System.out.println("EMAIL DUMP:");
					m.writeTo(System.out);
				} else if (arg instanceof SimpleMailMessage) {
					SimpleMailMessage m = (SimpleMailMessage) arg;
					System.out.println("EMAIL DUMP:");
					System.out.println(m.toString());
				} else {
					throw new Error("Could not print email: " + arg);
				}
				return null;
			}
		};
		doAnswer(dumpMessage).when(this.javaMailSender).send(any(MimeMessage.class));
		doAnswer(dumpMessage).when(this.javaMailSender).send(any(SimpleMailMessage.class));
	}
	
	@Test
	public void testDepositNotification() {
		setMailMock();
		Form form = this.formFactory.getForm("test");
		fillForm(form);
		DepositResult result = new DepositResult();
		result.setAccessURL("http://example.org/the/deposit/url");
		result.setStatus(Status.PENDING);
		
		emailNotificationHandler.notifyDeposit(form, result, "test@example.org", "test");
		verify(this.javaMailSender, times(2)).send(any(MimeMessage.class));
	}
	
	@Test
	public void testDepositError() {
		setMailMock();
		Form form = this.formFactory.getForm("test");
		fillForm(form);
		DepositResult result = new DepositResult();
		result.setAccessURL("http://example.org/the/deposit/url");
		result.setStatus(Status.FAILED);
		Throwable exception = new Exception("example error trace").fillInStackTrace();
		StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		result.setResponseBody(sw.toString());
		
		emailNotificationHandler.notifyError(form, result, "test@example.org", "test");
		verify(this.javaMailSender, times(1)).send(any(MimeMessage.class));
	}
	
	private void fillForm(Form form) {
		form.setCurrentUser("testuser");
		for(FormElement el : form.getElements()) {
			if(el instanceof MetadataBlock) {
				MetadataBlock mb = (MetadataBlock)el;
				for(InputField inf : mb.getPorts()) {
					if(inf instanceof DateInputField) {
						DateInputField dif = (DateInputField)inf;
						dif.setEnteredValue(new Date());
					} else if(inf instanceof TextInputField) {
						TextInputField tif = (TextInputField)inf;
						String val = "Test"+ tif.getLabel();
						if(tif.getMaxCharacters() != null && val.length() > tif.getMaxCharacters()) {
							val.subSequence(0, tif.getMaxCharacters());
						}
						tif.setEnteredValue(val);
					}
				}
			}
		}
	}

}

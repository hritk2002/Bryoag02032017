package com.bryoag.shared.util;

import com.bryoag.shared.util.pojo.EmailPojo;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticleDisplay;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * The Class SwcMailServiceUtil.
 */
public final class MailTemplateUtil {

	/** The Constant LOG. */
	private static final Log LOG = LogFactoryUtil.getLog(MailTemplateUtil.class);

	/**
	 * Instantiates a new swc mail service util.
	 */
	private MailTemplateUtil() {
		// dummy constructor
	}

	/**
	 * Send email.
	 *
	 * @param emailDto the email dto
	 * @param themeDisplay the theme display
	 * @return true, if successful
	 */
	public static boolean sendEmail(final EmailPojo emailDto, final ThemeDisplay themeDisplay) {
		if (emailDto != null) {
			String subjectTemplate = StringPool.BLANK;
			String bodyTemplate = StringPool.BLANK;

			JournalArticleDisplay journalArticle =
					SharedUtil.getJournalArticleDisplay(themeDisplay, emailDto.getWebContentId());

			if (journalArticle != null) {
				bodyTemplate = journalArticle.getContent();
				subjectTemplate = journalArticle.getDescription();
			} else {
				MailTemplateUtil.LOG.debug("No webcontent found for template id: " + emailDto.getWebContentId());
				return false;
			}

			if (!Validator.isBlank(bodyTemplate)) {
				emailDto.setBody(SharedUtil.parseTemplate(bodyTemplate, emailDto.getBodyTemplateData()));
			}

			if (!Validator.isBlank(subjectTemplate)) {
				emailDto.setSubject(SharedUtil.parseTemplate(subjectTemplate, emailDto.getSubjectTemplateData()));
			}

			return MailTemplateUtil.send(emailDto);
		} else {
			return false;
		}
	}

	/**
	 * Send email.
	 *
	 * @param emailDto the email dto
	 * @return true, if successful
	 */
	private static boolean send(final EmailPojo emailDto) {
		boolean email = false;
		String toAddress[] = emailDto.getTo();
		if (toAddress == null || toAddress.length == 0) {
			MailTemplateUtil.LOG.error("Error occured while sending email. To email address is not valid");
			return false;
		} else {
			for (int l = 0; l < toAddress.length; l++) {
				if (StringPool.BLANK.trim().equals(toAddress[l]) || !Validator.isEmailAddress(toAddress[l])) {
					MailTemplateUtil.LOG.error("Error occured while sending email. To email address is not valid");
					return false;
				}
			}
		}
		if (!Validator.isBlank(emailDto.getFrom()) && !Validator.isBlank(emailDto.getFromName())) {
			try {
				MailServiceUtil.sendEmail(MailTemplateUtil.createMailMessage(emailDto));
				email = true;
			} catch (AddressException | UnsupportedEncodingException | SystemException e) {
				MailTemplateUtil.LOG.error("Error occured while sending email.", e);
			}
		}
		return email;
	}

	/**
	 * Creates the mail message.
	 *
	 * @param emailDto the email dto
	 * @return the mail message
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws AddressException the address exception
	 * @throws SystemException the system exception
	 */
	private static MailMessage createMailMessage(final EmailPojo emailDto) throws UnsupportedEncodingException,
			AddressException, SystemException {
		MailMessage mailMessage = new MailMessage();

		InternetAddress from = null;
		InternetAddress[] to = null;
		InternetAddress[] cc = null;
		InternetAddress[] bcc = null;

		from = new InternetAddress(emailDto.getFrom(), emailDto.getFromName());
		mailMessage.setFrom(from);

		if (null != emailDto.getTo()) {
			to = new InternetAddress[emailDto.getTo().length];
			for (int i = 0; i < emailDto.getTo().length; i++) {
				to[i] = MailTemplateUtil.createInternetAddress(emailDto.getTo()[i]);
			}
			mailMessage.setTo(to);
		}

		if (null != emailDto.getCc()) {
			cc = new InternetAddress[emailDto.getCc().length];
			for (int i = 0; i < emailDto.getCc().length; i++) {
				cc[i] = MailTemplateUtil.createInternetAddress(emailDto.getCc()[i]);
			}
			mailMessage.setCC(cc);
		}

		if (null != emailDto.getBcc()) {
			bcc = new InternetAddress[emailDto.getBcc().length];
			for (int i = 0; i < emailDto.getBcc().length; i++) {
				bcc[i] = MailTemplateUtil.createInternetAddress(emailDto.getBcc()[i]);
			}
			mailMessage.setBCC(bcc);
		}

		MailTemplateUtil.setEmailAttachment(emailDto, mailMessage);

		if (!Validator.isBlank(emailDto.getBody())) {
			mailMessage.setBody(emailDto.getBody());
		}
		if (!Validator.isBlank(emailDto.getSubject())) {
			mailMessage.setSubject(emailDto.getSubject());
		}

		mailMessage.setHTMLFormat(true);

		return mailMessage;
	}

	/**
	 * Sets the email attachment.
	 *
	 * @param emailDto the email dto
	 * @param mailMessage the mail message
	 */
	private static void setEmailAttachment(final EmailPojo emailDto, final MailMessage mailMessage) {
		if (null != emailDto.getAttachment()) {
			Iterator<Entry<String, File>> iterator = emailDto.getAttachment().entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, File> pair = (Map.Entry<String, File>) iterator.next();
				File file = (File) pair.getValue();
				String fileName = (String) pair.getKey();
				mailMessage.addFileAttachment(file, fileName);
			}
		}
	}

	/**
	 * A simple method which create InternetAddress of a given string.
	 * 
	 * @param email the email address whose internetAddress is supposed to made.
	 * @return internetAddress of a given string.
	 * @throws AddressException the address exception.
	 */
	private static InternetAddress createInternetAddress(final String email) throws AddressException {

		return new InternetAddress(email);
	}
}

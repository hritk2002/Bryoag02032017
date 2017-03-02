package com.bryoag.shared.util.pojo;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/**
 * The Class EmailPojo.
 */
public class EmailPojo implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6157205159185116563L;

	/** The subject. */
	private String subject;

	/** The body. */
	private String body;

	/** The from. */
	private String from;

	/** The from name. */
	private String fromName;

	/** The to. */
	private String[] to;

	/** The cc. */
	private String[] cc;

	/** The bcc. */
	private String[] bcc;

	/** The attachment. */
	private Map<String, File> attachment;

	/** The web content id. */
	private String webContentId;

	/** The subject template data. */
	private Map<String, Object> subjectTemplateData;

	/** The body template data. */
	private Map<String, Object> bodyTemplateData;

	/**
	 * Instantiates a new email pojo.
	 */
	public EmailPojo() {
		super();
	}

	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 *
	 * @param subject the new subject
	 */
	public void setSubject(final String subject) {
		this.subject = subject;
	}

	/**
	 * Gets the body.
	 *
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Sets the body.
	 *
	 * @param body the new body
	 */
	public void setBody(final String body) {
		this.body = body;
	}

	/**
	 * Gets the from.
	 *
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Sets the from.
	 *
	 * @param from the new from
	 */
	public void setFrom(final String from) {
		this.from = from;
	}

	/**
	 * Gets the from name.
	 *
	 * @return the from name
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * Sets the from name.
	 *
	 * @param fromName the new from name
	 */
	public void setFromName(final String fromName) {
		this.fromName = fromName;
	}

	/**
	 * Gets the to.
	 *
	 * @return the to
	 */
	public String[] getTo() {
		String[] toArray = null;
		if (to != null && to.length > 0) {
			toArray = Arrays.copyOf(to, to.length);
		}
		return toArray;
	}

	/**
	 * Sets the to.
	 *
	 * @param to the new to
	 */
	public void setTo(final String[] to) {
		if (to != null) {
			this.to = to.clone();
		}
	}

	/**
	 * Gets the cc.
	 *
	 * @return the cc
	 */
	public String[] getCc() {
		String[] ccArray = null;
		if (cc != null && cc.length > 0) {
			ccArray = Arrays.copyOf(cc, cc.length);
		}
		return ccArray;
	}

	/**
	 * Sets the cc.
	 *
	 * @param cc the new cc
	 */
	public void setCc(final String[] cc) {
		if (cc != null) {
			this.cc = cc.clone();
		}
	}

	/**
	 * Gets the bcc.
	 *
	 * @return the bcc
	 */
	public String[] getBcc() {
		String[] bccArray = null;
		if (bcc != null && bcc.length > 0) {
			bccArray = Arrays.copyOf(bcc, bcc.length);
		}
		return bccArray;
	}

	/**
	 * Sets the bcc.
	 *
	 * @param bcc the new bcc
	 */
	public void setBcc(final String[] bcc) {
		if (bcc != null) {
			this.bcc = bcc.clone();
		}
	}

	/**
	 * Gets the attachment.
	 *
	 * @return the attachment
	 */
	public Map<String, File> getAttachment() {
		return attachment;
	}

	/**
	 * Sets the attachment.
	 *
	 * @param attachment the attachment
	 */
	public void setAttachment(final Map<String, File> attachment) {
		this.attachment = attachment;
	}

	/**
	 * Gets the web content id.
	 *
	 * @return the web content id
	 */
	public String getWebContentId() {
		return webContentId;
	}

	/**
	 * Sets the web content id.
	 *
	 * @param webContentId the new web content id
	 */
	public void setWebContentId(final String webContentId) {
		this.webContentId = webContentId;
	}

	/**
	 * Gets the subject template data.
	 *
	 * @return the subject template data
	 */
	public Map<String, Object> getSubjectTemplateData() {
		return subjectTemplateData;
	}

	/**
	 * Sets the subject template data.
	 *
	 * @param subjectTemplateData the subject template data
	 */
	public void setSubjectTemplateData(final Map<String, Object> subjectTemplateData) {
		this.subjectTemplateData = subjectTemplateData;
	}

	/**
	 * Gets the body template data.
	 *
	 * @return the body template data
	 */
	public Map<String, Object> getBodyTemplateData() {
		return bodyTemplateData;
	}

	/**
	 * Sets the body template data.
	 *
	 * @param bodyTemplateData the body template data
	 */
	public void setBodyTemplateData(final Map<String, Object> bodyTemplateData) {
		this.bodyTemplateData = bodyTemplateData;
	}

}

package com.bryoag.shared.util;

import com.bryoag.shared.util.constant.SharedConstants;
import com.bryoag.shared.util.keys.SwcKeys;
import com.liferay.portal.NoSuchGroupException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncStringWriter;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.template.StringTemplateResource;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateException;
import com.liferay.portal.kernel.template.TemplateManagerUtil;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;
import com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticleDisplay;
import com.liferay.portlet.journalcontent.util.JournalContentUtil;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;

/**
 * The Class SwcUtil. This class contains the utility methods used through out the swiss world
 * cargo application.
 */
public final class SharedUtil {

	/** The log. */
	private static final Log LOG = LogFactoryUtil.getLog(SharedUtil.class);

	/** The Constant TRUE_VALUE. */
	private static final String TRUE_VALUE = "1";

	/** The Constant FALSE_VALUE. */
	private static final String FALSE_VALUE = "0";

	/** The Constant FOUR. */
	private static final int FOUR = 4;

	/** The Constant THREE. */
	private static final int THREE = 3;

	/** The Constant ONE. */
	private static final int ONE = 1;

	/** The Constant STRING_BUFFER_DEFAULT_SIZE. */
	private static final int STRING_BUFFER_DEFAULT_SIZE = 50;

	/** The Constant OPEN_BRACKET_SYMBOL. */
	private static final char OPEN_BRACKET_SYMBOL = '[';

	/** The Constant CLOSE_BRACKET_SYMBOL. */
	private static final char CLOSE_BRACKET_SYMBOL = ']';

	/**
	 * private constructor.
	 */
	private SharedUtil() {
	}

	/**
	 * This method gets the web corresponding to template id.
	 *
	 * @param themeDisplay the theme display
	 * @param templateId the template id
	 * @return the template
	 */
	public static String getTemplate(final ThemeDisplay themeDisplay, final String templateId) {
		String content = StringPool.BLANK;
		JournalArticleDisplay articleDisplay =
				JournalContentUtil.getDisplay(themeDisplay.getScopeGroupId(), templateId, StringPool.BLANK,
						StringPool.BLANK, themeDisplay);
		if (articleDisplay != null) {
			content = articleDisplay.getContent();
		} else {
			SharedUtil.LOG.debug("No content found for id " + templateId);
		}
		return content;
	}

	/**
	 * This method gets the web content corresponding to template id.
	 *
	 * @param themeDisplay the theme display
	 * @param templateId the template id
	 * @return the template
	 */
	public static JournalArticleDisplay getJournalArticleDisplay(final ThemeDisplay themeDisplay,
			final String templateId) {
		JournalArticleDisplay articleDisplay =
				JournalContentUtil.getDisplay(themeDisplay.getScopeGroupId(), templateId, StringPool.BLANK,
						StringPool.BLANK, themeDisplay);

		return articleDisplay;
	}

	/**
	 * This method gets the vm template corresponding to template id.
	 *
	 * @param scopeGroupId the scope group id
	 * @param templateId the template id
	 * @return the VM template
	 */
	public static String getVMTemplate(final long scopeGroupId, final String templateId) {
		String template = StringPool.BLANK;
		try {
			DDMTemplate ddmTemplate =
					DDMTemplateLocalServiceUtil.getTemplate(scopeGroupId,
							PortalUtil.getClassNameId(DDMStructure.class), templateId);
			if (ddmTemplate != null) {
				template = ddmTemplate.getScript();
			}
		} catch (PortalException | SystemException e) {
			SharedUtil.LOG.error("Exception occurred during fetching template for maps of network data", e);
		}
		return template;
	}

	/**
	 * This method parse the template provided against Map of data provided.
	 *
	 * @param template the template
	 * @param templateData the template data
	 * @return the string
	 */
	public static String parseTemplate(final String template, final Map<String, Object> templateData) {
		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();
		try {
			if (template == null || template.equals(StringPool.BLANK)) {
				SharedUtil.LOG.debug("Template is not found.");
				unsyncStringWriter.close();
				return StringPool.BLANK;
			}
			Template finalTemplate =
					TemplateManagerUtil.getTemplate(TemplateConstants.LANG_TYPE_VM, new StringTemplateResource(
							"test.vm", template), false);
			if (templateData != null) {
				for (Map.Entry<String, Object> entry : templateData.entrySet()) {
					String key = entry.getKey();
					Object value = entry.getValue();

					if (Validator.isNotNull(key)) {
						finalTemplate.put(key, value);
					}
				}
			}
			finalTemplate.processTemplate(unsyncStringWriter);
		} catch (TemplateException e) {
			SharedUtil.LOG.error("TemplateException occurred while parsing template", e);
		}
		return unsyncStringWriter.toString();
	}

	/**
	 * This methods returns the portlet url for a given portlet id and parameters.
	 *
	 * @param portletRequest the portlet request
	 * @param groupId the group id
	 * @param portletId the portlet id
	 * @param parameters the parameters
	 * @param portletPhase the portlet phase
	 * @return the full portlet url
	 */
	public static PortletURL getFullPortletURL(final PortletRequest portletRequest, final long groupId,
			final String portletId, final Map<String, String[]> parameters, final String portletPhase) {
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(portletRequest);
		httpRequest = PortalUtil.getOriginalServletRequest(httpRequest);

		// Retrieve layout id of another portlet
		long plid = 0;
		try {
			plid = PortalUtil.getPlidFromPortletId(groupId, portletId);
		} catch (PortalException | SystemException e) {
			SharedUtil.LOG.error("Exception occurred while fetching portlet url", e);
		}
		PortletURL portletURL = PortletURLFactoryUtil.create(httpRequest, portletId, plid, portletPhase);
		if (parameters != null) {
			portletURL.setParameters(parameters);
		}
		return portletURL;
	}

	/**
	 * This methods returns the groupId of the website.
	 *
	 * @return the company Id
	 */
	public static long getGroupId() {
		Company company;
		try {
			company = CompanyLocalServiceUtil.getCompanyByWebId(PropsUtil.get(SwcKeys.WEB_ID_SWISS));
			Group group = null;
			String groupName = PropsUtil.get(SwcKeys.GROUP_ID_SWISS);
			if (Validator.isNull(groupName)) {
				groupName = GroupConstants.GUEST;
			}
			try {
				group = GroupLocalServiceUtil.getGroup(company.getCompanyId(), groupName);
			} catch (NoSuchGroupException groupException) {
				groupName = GroupConstants.GUEST;
				group = GroupLocalServiceUtil.getGroup(company.getCompanyId(), groupName);
			}

			return group.getGroupId();
		} catch (PortalException | SystemException e) {
			SharedUtil.LOG.error("Exception occurred while fetching GroupId", e);
			return -1;
		}
	}

	/**
	 * This methods returns the CompanyId of the website.
	 *
	 * @return the company Id
	 */
	public static long getCompanyId() {
		try {
			Company company = CompanyLocalServiceUtil.getCompanyByWebId(PropsUtil.get(SwcKeys.WEB_ID_SWISS));
			return company.getCompanyId();

		} catch (PortalException | SystemException e) {
			SharedUtil.LOG.error("Exception occurred while fetching Company Id", e);
			return -1;
		}
	}

	/**
	 * This method check for exception and return the correct DateTime formatter
	 * 
	 * @param dateFormate the date format to be checked
	 * @param locale the theme locale for different language
	 * @param dateFormateConstant the dateformatter on exception
	 * @return dateformatter correct date format
	 */
	public static String
			checkDateFormat(final String dateFormate, final Locale locale, final String dateFormateConstant) {

		String dateFormatter = SharedUtil.getDateFormatter(dateFormate, locale, dateFormateConstant).toString();
		return dateFormatter.substring(dateFormatter.indexOf(SharedUtil.OPEN_BRACKET_SYMBOL) + SharedUtil.ONE,
				dateFormatter.lastIndexOf(SharedUtil.CLOSE_BRACKET_SYMBOL));
	}

	/**
	 * This method check for exception and return the correct DateTime formatter
	 * 
	 * @param dateFormate the required date formatter
	 * @param locale the theme locale for different language
	 * @param dateFormateConstant the dateformatter on exception
	 * @return dateFormatter the Format for DateTime
	 */
	public static Format getDateFormatter(final String dateFormate, final Locale locale,
			final String dateFormateConstant) {

		Format dateFormatter = null;
		try {
			dateFormatter = FastDateFormatFactoryUtil.getSimpleDateFormat(dateFormate, locale);
		} catch (IllegalArgumentException e) {
			SharedUtil.LOG.error("The desired Date format is not correct", e);
			dateFormatter = FastDateFormatFactoryUtil.getSimpleDateFormat(dateFormateConstant, locale);
		}
		return dateFormatter;
	}

	/**
	 * This methods convert date to String in according formate provided as parameter.
	 *
	 * @param date the date
	 * @param dateFormate the date formate
	 * @return the string
	 */
	public static String formateDate(final Date date, final String dateFormate) {
		if (date != null) {
			Locale locale = Locale.ENGLISH;
			Format formatter = SharedUtil.getDateFormatter(dateFormate, locale, SharedConstants.DATE_TIME_FORMATE);
			String displayDate = StringPool.BLANK;
			displayDate = formatter.format(date);
			return displayDate;
		}
		return StringPool.BLANK;
	}

	/**
	 * convertToDate convert date string to Date.
	 *
	 * @param dateStr the date str
	 * @param formate the formate
	 * @return the date
	 */
	public static Date convertToDate(final String dateStr, final String formate) {
		Locale locale = Locale.ENGLISH;
		SimpleDateFormat formatter = new SimpleDateFormat(formate, locale);
		Date date = null;
		try {
			date = formatter.parse(dateStr);
		} catch (ParseException e) {
			SharedUtil.LOG.error("ParseException occurred while converting string to Date", e);
		}
		return date;
	}

	/**
	 * This method returns the html of a link for given href and value.
	 *
	 * @param href the href
	 * @param value the value
	 * @return the link html
	 */
	public static String getLinkHtml(final String href, final String value) {
		StringBuilder link = new StringBuilder(SharedUtil.STRING_BUFFER_DEFAULT_SIZE);
		link.append("<a target='_blank' href='").append(href).append("'>").append(value).append("</a>");
		return link.toString();
	}

	/**
	 * Returns a String of all contact emails wrapped in anchor tag.
	 * 
	 * @param emailGroup - A string of contact emails
	 * @return String of all contact emails wrapped in an anchor tag.
	 */
	public static String getEmailToDisplay(final String emailGroup) {

		String[] emails = emailGroup.split(";");
		StringBuffer emailList = new StringBuffer(SharedUtil.STRING_BUFFER_DEFAULT_SIZE);
		for (int i = 0; i < emails.length; i++) {
			emailList.append("<p class='clearfix wordwrap'><a class='maillink' href='mailto:" + emails[i] + "'>"
					+ emails[i] + "</a></p>");
		}

		return emailList.toString();
	}

	/**
	 * Boolean to int string.
	 *
	 * @param value the value
	 * @return the string
	 */
	public static String booleanToIntString(final boolean value) {
		if (value) {
			return SharedUtil.TRUE_VALUE;
		} else {
			return SharedUtil.FALSE_VALUE;
		}
	}

	/**
	 * This method return the base url for Station info page.
	 *
	 * @param request the request
	 * @param groupId the group id
	 * @return the station page base url
	 */
	public static String getStationPageBaseUrl(final PortletRequest request, final long groupId) {
		String portletId = SharedConstants.STATION_INFO_CONTACT_PORTLET_ID;
		PortletURL portletUrl =
				SharedUtil.getFullPortletURL(request, groupId, portletId, null, PortletRequest.RENDER_PHASE);
		if (portletUrl != null) {
			return portletUrl.toString();
		} else {
			return StringPool.BLANK;
		}

	}

	/**
	 * This method return the station page url for given station code.
	 *
	 * @param baseUrl the base url
	 * @param stationCode the station code
	 * @return the station page url
	 */
	public static String getStationPageUrl(final String baseUrl, final String stationCode) {
		StringBuilder url = new StringBuilder();
		url.append(baseUrl).append(StringPool.AMPERSAND).append(SharedConstants.CURRENT_STATION_PARAM)
				.append(StringPool.EQUAL).append(stationCode);
		return url.toString();
	}

	/**
	 * This method return the station code from stationName value selected from autocomplete
	 * logic.
	 *
	 * @param stationName the station name
	 * @return the station code
	 */
	public static String getStationCode(final String stationName) {
		if (!Validator.isBlank(stationName) && stationName.contains("(")) {
			return stationName.substring(stationName.length() - SharedUtil.FOUR, stationName.length() - 1)
					.toUpperCase();
		} else if (stationName.length() >= SharedUtil.THREE) {
			return stationName.substring(0, SharedUtil.THREE).toUpperCase();
			/* return stationName.toUpperCase(); */
		} else {
			return StringPool.BLANK;
		}

	}

	/**
	 * Check if the string is empty or not and return dash if empty.
	 *
	 * @param information the information
	 * @return String
	 */
	public static String stringEmptyCheck(final String information) {

		if (Validator.isBlank(information)) {
			return SharedConstants.DASH;
		}

		return information;
	}

}

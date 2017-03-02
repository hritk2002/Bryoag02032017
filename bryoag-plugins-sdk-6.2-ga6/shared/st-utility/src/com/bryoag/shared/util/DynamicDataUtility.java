package com.bryoag.shared.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Dynamic data list utility class.
 */
public final class DynamicDataUtility {

	/** The log. */
	private static final Log LOG = LogFactoryUtil.getLog(DynamicDataUtility.class);

	/**
	 * Private constructor
	 */
	private DynamicDataUtility() {
	}

	/**
	 * This method fetch the ddl list for ddlName and return the map corresponding to that
	 * list.
	 *
	 * @param ddlName the ddl name
	 * @param locale the locale
	 * @param groupId the group id
	 * @return the configurations map
	 */
	public static Map<String, String>
			getConfigurationsMap(final String ddlName, final Locale locale, final long groupId) {
		Map<String, String> configMap = new HashMap<String, String>();
		try {
			List<DDLRecordSet> ddlList = DDLRecordSetLocalServiceUtil.getRecordSets(groupId);
			DDLRecordSet ddlRecordSet = null;
			for (DDLRecordSet record : ddlList) {
				if (record.getNameCurrentValue().equals(ddlName)) {
					ddlRecordSet = record;
					break;
				}
			}
			if (ddlRecordSet != null) {
				List<DDLRecord> ddlRecordList = ddlRecordSet.getRecords();
				DynamicDataUtility.LOG.debug("ddlList fetched successfully for listName " + ddlName);

				for (DDLRecord ddlRecord : ddlRecordList) {
					String temp = ddlRecord.getFieldValue("key", locale).toString();
					configMap.put(temp, ddlRecord.getFieldValue("value", locale).toString());
				}
			} else {
				DynamicDataUtility.LOG.debug("No ddlList found for listName " + ddlName);
			}
		} catch (SystemException e) {
			DynamicDataUtility.LOG.error("SystemException will getting configuration map for ddl list" + ddlName, e);
		} catch (PortalException e) {
			DynamicDataUtility.LOG.error("PortalException will getting configuration map for ddl list" + ddlName, e);
		}
		return configMap;
	}

}

package com.bryoag.shared.util;

import com.bryoag.shared.util.constant.SharedConstants;
import com.liferay.portal.kernel.util.StringPool;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * The Class SwcDateUtil.
 */
public final class DateFormateUtil {

	/** The Constant THOUSAND. */
	private static final int THOUSAND = 1000;

	/** The Constant SIXTY. */
	private static final int SIXTY = 60;

	/** The Constant TWENTY_FOUR. */
	private static final int TWENTY_FOUR = 24;

	/**
	 * Instantiates a new swc date util.
	 */
	private DateFormateUtil() {

	}

	/**
	 * This method returns the number of days difference between two dates.
	 *
	 * @param startDate the start date
	 * @param endDate the end date
	 * @return the date difference
	 */
	public static String getDateDifference(final Date startDate, final Date endDate) {
		int diff =
				(int) (endDate.getTime() / (DateFormateUtil.THOUSAND * DateFormateUtil.SIXTY * DateFormateUtil.SIXTY * DateFormateUtil.TWENTY_FOUR))
						- (int) (startDate.getTime() / (DateFormateUtil.THOUSAND * DateFormateUtil.SIXTY
								* DateFormateUtil.SIXTY * DateFormateUtil.TWENTY_FOUR));
		return String.valueOf(diff);
	}

	/**
	 * This method return the Date in dateFormat for given date plus no. of days.
	 *
	 * @param dateFormat the desired dateDayMonth format
	 * @param date the date
	 * @param day the day
	 * @param locale the theme locale for different language
	 * @return the date day month
	 */
	public static String getDateDayMonth(final String dateFormat, final Date date, final int day, Locale locale) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, day);
		Format sdf = SharedUtil.getDateFormatter(dateFormat, locale, SharedConstants.DATE_DAY_MONTH_FORMATE);
		return sdf.format(calendar.getTime());
	}

	/**
	 * This method return the time to be shown for endDate with plus/minus days to given start
	 * date.
	 *
	 * @param startDate the start date
	 * @param endDate the end date
	 * @return the display time
	 */
	public static String getDisplayTime(final Date startDate, final Date endDate) {
		StringBuilder displayTime = new StringBuilder();
		SimpleDateFormat timeFormat = new SimpleDateFormat(SharedConstants.TIME_FORMATE, Locale.ENGLISH);
		displayTime.append(timeFormat.format(endDate));

		int day =
				(int) (endDate.getTime() / (DateFormateUtil.THOUSAND * DateFormateUtil.SIXTY * DateFormateUtil.SIXTY * DateFormateUtil.TWENTY_FOUR))
						- (int) (startDate.getTime() / (DateFormateUtil.THOUSAND * DateFormateUtil.SIXTY
								* DateFormateUtil.SIXTY * DateFormateUtil.TWENTY_FOUR));
		if (day > 0) {
			displayTime =
					displayTime.append(StringPool.OPEN_PARENTHESIS).append(StringPool.PLUS).append(day)
							.append(StringPool.CLOSE_PARENTHESIS);
		} else if (day < 0) {
			displayTime =
					displayTime.append(StringPool.OPEN_PARENTHESIS).append(day).append(StringPool.CLOSE_PARENTHESIS);
		}
		return displayTime.toString();
	}

}

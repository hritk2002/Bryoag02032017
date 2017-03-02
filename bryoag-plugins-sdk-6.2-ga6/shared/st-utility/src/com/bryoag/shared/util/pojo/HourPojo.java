package com.bryoag.shared.util.pojo;

/**
 * The Class HourPojo stores the contact hour.
 */
public class HourPojo {

	/** The start day. */
	private int startDay;

	/** The end day. */
	private int endDay;

	/** The time. */
	private String time;

	/** The days. */
	private String days;

	/**
	 * Gets the start day.
	 *
	 * @return the start day
	 */
	public int getStartDay() {
		return startDay;
	}

	/**
	 * Sets the start day.
	 *
	 * @param startDay the new start day
	 */
	public void setStartDay(final int startDay) {
		this.startDay = startDay;
	}

	/**
	 * Gets the end day.
	 *
	 * @return the end day
	 */
	public int getEndDay() {
		return endDay;
	}

	/**
	 * Sets the end day.
	 *
	 * @param endDay the new end day
	 */
	public void setEndDay(final int endDay) {
		this.endDay = endDay;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param time the new time
	 */
	public void setTime(final String time) {
		this.time = time;
	}

	/**
	 * Gets the days.
	 *
	 * @return the days
	 */
	public String getDays() {
		return days;
	}

	/**
	 * Sets the days.
	 *
	 * @param days the new days
	 */
	public void setDays(final String days) {
		this.days = days;
	}

	/**
	 * Instantiates a new hour pojo.
	 *
	 * @param startDay the start day
	 * @param endDay the end day
	 * @param time the time
	 */
	public HourPojo(final int startDay, final int endDay, final String time) {
		super();
		this.startDay = startDay;
		this.endDay = endDay;
		this.time = time;
	}

	/**
	 * Default constructor
	 */
	public HourPojo() {
		super();
	}

}

package Classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Interfaces.DateInterface;

/**
 * Object adaptor class. The adaptee is the GregorianCalendar Class and its
 * super Calendar Class. This class also inherits the provided interface
 * DateInterface with the following methods.
 * 
 * @author jquin
 * 
 *
 *
 */
public class DateImpl implements DateInterface {
	private GregorianCalendar date;

	public DateImpl() {
		super();
		this.date = new GregorianCalendar();
	}

	/**
	 * Returns the year
	 * 
	 * @return the year stored by the object
	 */
	@Override
	public int getYear() {
		return this.date.get(Calendar.YEAR);
	}

	/**
	 * Sets the year
	 * 
	 * @param year
	 * @return true
	 */
	@Override
	public boolean setYear(int year) {
		if (year < this.date.getActualMaximum(Calendar.YEAR) && year > this.date.getActualMinimum(Calendar.YEAR)) {
			this.date.set(Calendar.YEAR, year);
			return true;
		}

		return false;
	}

	/**
	 * Returns the month: 0 for January, 1 for February, etc., and 11 for December.
	 * 
	 * @return integer corresponding to the month
	 */
	@Override
	public int getMonth() {
		return this.date.get(Calendar.MONTH);
	}

	/**
	 * Sets the month, provided it is between 0 and 11; otherwise no changes are
	 * made. month must be consistent with the year and day of month. For example,
	 * if month is 1 (Februray), but year is 2016 and day of month is 30 as stored
	 * in the DateInterface object, the month stored in the object must not be
	 * changed. The client must do some extra work to effect the change: for
	 * example, change the 2 day to 1 and then change month. Anther example is
	 * changing month to 3 (April) when day of month is 31.
	 * 
	 * @param month should be between 0 and 11
	 * @return returns true if month is valid and a change could be made
	 */
	@Override
	public boolean setMonth(int month) {
		if (month < this.date.getActualMaximum(Calendar.MONTH) && month > this.date.getActualMinimum(Calendar.MONTH)) {
			this.date.set(Calendar.MONTH, month);
			return true;
		}
		return false;
	}

	/**
	 * Returns the day
	 * 
	 * @return day of the month
	 */
	@Override
	public int getDayOfMonth() {
		return this.date.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Sets the day of the month. Should be a valid day or no action is taken. For
	 * example, if you set 29 for February and the year is 1900 as stored in the
	 * object, the change will not be made. Essentially, the change in dayOfMonth
	 * must not potentially be an inconsistent date. The client must do some extra
	 * work to effect the change: for example, change the month to 11 and then
	 * change month.
	 * 
	 * @param date a valid date for the month and year
	 * @return true only if the day is valid and a change could be made
	 */
	@Override
	public boolean setDayOfMonth(int date) {
		if (date < this.date.getActualMaximum(Calendar.DAY_OF_MONTH)
				&& date > this.date.getActualMinimum(Calendar.DAY_OF_MONTH)) {
			this.date.set(Calendar.DAY_OF_MONTH, date);
			return true;
		}
		return false;
	}

	/**
	 * Returns the hour between 0 and 23
	 * 
	 * @return the hour in military time
	 */
	@Override
	public int getHours() {
		return this.date.get(Calendar.HOUR);
	}

	/**
	 * Sets the hour. Should be between 0 and 23 or no action is taken
	 * 
	 * @param hours between 0 and 23
	 * @return true only if hours is valid and a change could be made
	 */
	@Override
	public boolean setHours(int hours) {
		if (hours < this.date.getActualMaximum(Calendar.HOUR) && hours > this.date.getActualMinimum(Calendar.HOUR)) {
			this.date.set(Calendar.HOUR, hours);
			return true;
		}
		return false;
	}

	/**
	 * Returns the number of minutes past the hour
	 * 
	 * @return number of minutes past the hour
	 */
	@Override
	public int getMinutes() {
		return this.date.get(Calendar.MINUTE);
	}

	/**
	 * Sets the minutes of this object; should be between 0 and 59 or no changes are
	 * made
	 * 
	 * @param minutes 0-59
	 * @return true only if hours is valid and a change could be made
	 */
	@Override
	public boolean setMinutes(int minutes) {
		if (minutes < this.date.getActualMaximum(Calendar.MINUTE)
				&& minutes > this.date.getActualMinimum(Calendar.MINUTE)) {
			this.date.set(Calendar.MINUTE, minutes);
			return true;
		}
		return false;
	}

	/**
	 * Returns the number of seconds past the minute
	 * 
	 * @return the number of seconds past the minute
	 */
	@Override
	public int getSeconds() {
		return this.date.get(Calendar.SECOND);
	}

	/**
	 * 3 Sets the seconds of this object; should be between 0 and 59 or no changes
	 * are made
	 * 
	 * @param seconds 0-59
	 * @return true only if seconds is valid and a change could be made 4
	 */
	@Override
	public boolean setSeconds(int seconds) {
		if (seconds < this.date.getActualMaximum(Calendar.SECOND)
				&& seconds > this.date.getActualMinimum(Calendar.SECOND)) {
			this.date.set(Calendar.SECOND, seconds);
			return true;
		}
		return false;
	}

	/**
	 * Returns true if and only if the year is a leap year
	 * 
	 * @return true if and only if the year is a leap year
	 */
	@Override
	public boolean isLeapYear() {
		return this.date.isLeapYear(Calendar.YEAR);
	}

}

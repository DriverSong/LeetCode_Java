package ch.makery.address.util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	/*The date pattern used for conversion*/
	private static final String DATE_PATTERN = "dd.MM.yyyy";
	
	/*the date formatter*/
	private static final DateTimeFormatter DATETIME_FORMATTER = 
			DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	/*
	 * Converts the DateTime to a formatted String.
	 * The Pattern is used as {@link DateUtil#DATE_PATTERN}.
	 * 
	 * @param date: the DateTime to be converted to String.
	 * @return formatted String or null as the input is null.
	 */
	public static String format(LocalDate date) {
		if(date == null) return null;
		return date.format(DATETIME_FORMATTER);
//		return DATETIME_FORMATTER.format(date);
	}
	
	/*
	 * Converts a String date in the format of {@link DateUtil#DATE_PATTERN}
	 * to an {@link LocalDate} object.
	 * 
	 * @param a formatted String;
	 * @return a LocalDate object or null as the input is null.
	 */
	public static LocalDate parse(String stringDate) {
		if (stringDate == null) return null;
		try {
//			return DATETIME_FORMATTER.parse(stringDate, LocalDate::from);
			return LocalDate.parse(stringDate, DATETIME_FORMATTER);
		}catch(DateTimeException e) {
			return null;
		}
	}
	
	/*
	 * Checks the string whether it is in a valid format
	 * 
	 * @param String
	 * @return boolean
	 */
	public static boolean checkValid(String stringDate) {
		return DateUtil.parse(stringDate) != null;
	}
	
	

}

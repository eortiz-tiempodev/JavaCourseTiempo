package com.tiempo.activities.activity1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class PrintMonth {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Month and Year: ");

			String monthText = in.next();
			String yearText = in.next();

			in.close();

			try {
				int month = Integer.parseInt(monthText);
				int year = Integer.parseInt(yearText);

				// check if it's a valid month and year
				if (month < 1 || month > 12 || year < 0){
					throw new Exception("Invalid index for month: " + month);
				}
				
				printCalendarMonth(month, year);
			} catch (NumberFormatException e) {
				System.err.println("Numberat Error: " + e.getMessage());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

		/*
		 * Prints calendar month
		 */
		private static void printCalendarMonth(int month, int year) {

			Calendar cal = new GregorianCalendar();
			cal.clear();
			cal.set(year, month - 1, 1);

			// Calendar Header
			System.out.println("\n       "+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " " + cal.get(Calendar.YEAR));
			System.out.println("S   M   Tu  W   T   F   S");

			int weekdayIndex = 0;												// Weekday Index
			int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);			// Get weekday of the first day of month.
			int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// Get all days in month.

			// leave/skip Weekdays
			for (int day = 1; day < firstWeekdayOfMonth; day++) {
				System.out.print("    ");
				weekdayIndex++;
			}

			// Days of month in tabular format.
			int day = 0;
			String printDay = "";
			for (day = 1; day <= numberOfMonthDays; day++) {
				// Print Day
				printDay = (day<10)? " "+day : ""+day;
				System.out.printf(printDay);

				// Next Weekday
				weekdayIndex++;
				// if it is the last weekday
				if (weekdayIndex == 7) {
					// reset it
					weekdayIndex = 0;
					// and go to next line
					System.out.println();
				} else { 
					// print space
					System.out.print("  ");
				}
			}
			System.out.println();
		}

}

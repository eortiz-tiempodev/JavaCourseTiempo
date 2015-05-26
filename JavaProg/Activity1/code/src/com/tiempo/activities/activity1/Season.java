package com.tiempo.activities.activity1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Month and Day: ");

		String monthText = in.next();
		String dayText = in.next();

		in.close();

		try {
			int month = Integer.parseInt(monthText);
			int day = Integer.parseInt(dayText);

			// check if it's a valid month and year
			if (month < 1 || month > 12 || day < 1 || day > 31){
				throw new Exception("Invalid index for month or day");
			}
			
			printSeason(month, day);
		} catch (NumberFormatException e) {
			System.err.println("Numberat Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
		
	/*
	 * Prints Season
	 */
	private static void printSeason(int month, int day) {
		if((month==3 && day>=21) || (month>3 && month<6) || (month==6 && day<=20)){
			System.out.print("Spring...");
		} else if ((month==6 && day>=21) || (month>6 && month<9) || (month==9 && day<=21)){
			System.out.print("Summer...");
		} else if((month==9 && day>=22) || (month>9 && month<12) || (month==12 && day<=21)){
			System.out.print("Fall...");
		} else if((month==12 && day>=22) || (month>0 && month<3) || (month==3 && day<=20)){
			System.out.print("Winter...");
		} else {
			System.out.print("Does not exist a valid season for the input data");
		}
	}

}

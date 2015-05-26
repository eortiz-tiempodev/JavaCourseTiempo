package com.tiempo.activities.activity2;

import java.util.Scanner;

/*************************************************************************
 *  Compilation:  javac Birthday.java
 *  Execution:    java Birthday D
 *  
 *  Computes the number of people (by simulation) that must enter a room
 *  until two of them share a birthday. Assumes birthdays a uniform
 *  and independent from 0 to D-1.
 *  
 *  % java Birthday 365
 *  25
 *
 *  % java Birthday 365
 *  22
 *
 *************************************************************************/


public class Birthday { 

    public static void main(String[] args) { 
   	   Scanner in = new Scanner(System.in);
   	   System.out.print("Number of Days : ");

   	   String enter = in.next();
    	
        int D = Integer.parseInt(enter);		 // number of days
        int people = 0;                        // total number of people

        //  days[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] days = new boolean[D];

        while (true) {
            people++;
            int d = (int) (D * Math.random());    // integer between 0 and D-1
            if (days[d]) break;                   // two people with the same birthday, so break out of loop
            days[d] = true;                       // update days[d]
        }

        System.out.println(people);
    }
}
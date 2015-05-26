package com.tiempo.activities.activity2;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Number of powers of 2^N : ");

		String powers = in.next();
		in.close();
    	
        // read in one command-line argument
        int N = Integer.parseInt(powers);
        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals N
        while (i <= N) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}

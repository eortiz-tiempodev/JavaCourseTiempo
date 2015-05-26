package com.tiempo.activities.activity2;

import java.util.Scanner;

/*************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *  
 *  Prints out n in binary.
 * 
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 * 
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 *************************************************************************/

public class Binary { 
    public static void main(String[] args) { 

 	   Scanner in = new Scanner(System.in);
 	   System.out.print("Number to Binary : ");

 	   String number = in.next();
 	   in.close();
       long n = Long.parseLong(number);

       System.out.println("HEX VALUE: "+Long.toHexString(n));
       
        // set v to the largest power of two that is <= n
        int v = 1;
        while (v <= n/2) {
            v = v * 2;
        }
  
        System.out.print("BIN VALUE: ");
        // check for presence of powers of 2 in n, from largest to smallest
        while (v > 0) {

            // v is not present in n 
            if (n < v) {
                System.out.print(0);
            }

            // v is present in n, so remove v from n
            else {
                System.out.print(1);
                n = n - v;
            }

            // next smallest power of 2
            v = v / 2;
        }

        System.out.println();
        System.out.println("HEXADECIMAL FIRST 256 NUMBERS: ");
        for(int i=0; i<256; i++){
        	System.out.println("INT: "+i+" - HEX: "+Integer.toHexString(i));
        }
    }
}
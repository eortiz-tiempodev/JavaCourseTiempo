package com.tiempo.activities.activity1;

public class Ex {
	   
	public static void main(String[] args) { 
	       int N = Integer.parseInt(args[0]);
	        for (int i = -N; i <= N; i++) {
	        	for (int j = -N; j <= N; j++) {
	        		if ((i == -j) || (i == j)){ 
	        			System.out.print("* ");
	        		} else {
	        			System.out.print(". ");
	        		}
            }
            System.out.println();
        }
    }
}

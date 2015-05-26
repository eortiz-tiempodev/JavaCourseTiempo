package com.tiempo.activities.activity1;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of dots of Triangle: ");

		String dots = in.next();
		in.close();

		int triangleDots = Integer.parseInt(dots);
		
		for(int i=0; i<triangleDots; i++){
			for(int j=0; j<i; j++){
				System.out.print(" . ");		// Print dots
			}
			for(int k=0; k<triangleDots-i; k++){
				System.out.print(" * ");		// Print Triangle
			}
			System.out.println();
		}
		
	}
}

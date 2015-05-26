package com.tiempo.activities.activity1;

public class Activities {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean c = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
		System.out.println(c);
		
		System.out.println(10/3);
		
		System.out.println('b'); 
		System.out.println((int) 'a');
		System.out.println((int) 'b');
		System.out.println((int) 'c'); 
		System.out.println('b' + 'c'); 
		System.out.println((char) ('a' + 4));
		System.out.println((char) (101)); 

		int x = 2147483647;
		System.out.println(x); 
		System.out.println(x + 1); 
		System.out.println(2 - x); 
		System.out.println(-2 - x); 
		System.out.println(2 * x); 
		System.out.println(4 * x); 
		
		double y = 3.14159;
		System.out.println(y); 
		System.out.println(y + 1); 
		System.out.println(8 / (int) y); 
		System.out.println(8 / y); 
		System.out.println((int) (8 / y)); 
		System.out.println((8 / y));

        int i;
        int j;
        //for (i = 0, j = 0; i < 10; i++) j += i;
        //for (i = 0, j = 1; i < 10; i++) j += j;
        //for (j = 0; j < 10; j++) j += j;
        for (i = 0, j = 0; i < 10; i++) j += j++; 
        System.out.println("i value: "+i);
        System.out.println("j value: "+j);
		
        int N = Integer.parseInt(args[0]);
        int M = 1;
        while (N >= 1) {
           System.out.println(M);
           M = 2 * M;
           N = N / 2;
        }

        
	}

}

package com.syntax.class1011;

public class GroupTask3 {

	public static void main(String[] args) {
		
		// Coding Task #3
		// Create a 2D array of integer type where you will store odd 
		// and even numbers. Develop a program which will identify/print 
		// the even numbers only.

		int array[][] = { 
						{ 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 } 
						};

		int i = 0, j = 0;
		

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 4; j++) {

				if (array[i][j] % 2 == 0) {

					System.out.println(array[i][j]);
										
				}
					
			}

		}
	}

}

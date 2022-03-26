package com.syntax.class1011;

public class GroupTask4 {

	public static void main(String[] args) {
		
		// Coding Task #4
				// Create a 2D array of integers. Develop a program 
				//which will calculate the sum of even and odd numbers for that array.
						
				int array[][] = { 
							{ 1, 2, 3}, 
							{ 5, 6, 7}, 
							{ 9, 10, 11}
							};

				int i = 0;
				int j = 0;
				int sumOdd=0; 
				int sumEven=0;

				for (i = 0; i < array.length; i++) {

					for (j = 0; j < array[i].length; j++) {

						if (array[i][j] % 2 == 0) {
							
							sumEven += array[i][j];
							
												
					} else  {
						
						sumOdd += array[i][j];
						
							
					}
				}	
					
			}
				
						System.out.println("Sum of even numbers is equal to: " + sumEven);
						
						System.out.println("Sum of odd numbers is equal to: " + sumOdd);
				
				
				

	}

}

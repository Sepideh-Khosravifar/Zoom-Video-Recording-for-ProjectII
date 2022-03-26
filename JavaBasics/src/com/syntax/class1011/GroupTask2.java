package com.syntax.class1011;

public class GroupTask2 {

	public static void main(String[] args) {
		
		// Coding Task #2
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = {

				{ 1, 5, 7, 10, 15 }, 
				{ 22, 12, 10, 8, 54 }, 
				{ 11, 23, 45, 67, 78 } 
				
				};

		int sum = 0;
		
		for (int row = 0; row < numbers.length; row++) {
			
			for (int col = 0; col < numbers[0].length; col++) {

				sum += numbers[row][col];
			}
		}

		System.out.println("The sum of all 2D array numbers is equal to = " + sum);
	}

}

package com.syntax.class1011;

import java.util.Scanner;

public class GroupTask1 {

	public static void main(String[] args) {
		
		// Task #1 - Create an array on int values using a scanner
				// and calculate the sum of all stored elements in that array.

				Scanner s = new Scanner(System.in);

				System.out.println("Please enter the length of the array:");

				int length = s.nextInt();

				int[] myArray = new int[length];
				
				System.out.println("The length of the array is: " + length);
				
				System.out.println("Please enter the array's values:");

				for (int i = 0; i < length; i++) {
					
					myArray[i] = s.nextInt();			
				}
				
				int sum = 0;

				for (int i : myArray) {
					
					sum += i;
				}
				
				System.out.println("The sum of the array values are equal to: " +sum);

	}

}

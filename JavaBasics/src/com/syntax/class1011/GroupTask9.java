package com.syntax.class1011;

import java.util.Arrays;

public class GroupTask9 {

	public static void main(String[] args) {
			
		// Task 9
		// Write a Java program to find the second largest number in the array.
				
				
				int num []= {12, 75, 46, 77, 89, 40, 66};
				
				int n = num.length;
				
				Arrays.sort(num);
				
				System.out.print("Elements of array sorted in ascending order: "); 
				
				for (int i = 0; i < n; i++)   
				{       
				System.out.print("  " + num[i]);   
				}   
				
				
				System.out.println("\nThe second largest number in the array is: " +num[n-2]);
				

	}

}

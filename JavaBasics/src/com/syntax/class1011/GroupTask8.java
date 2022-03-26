package com.syntax.class1011;

public class GroupTask8 {

	public static void main(String[] args) {
		
		// Coding Task #8
				// Maximum and minimum number in the array.
				
				
				
			int max = 0;
			int [] array= {12, 75, 46, 77, 89, 40, 66};

			for(int i = 0; i < array.length; i++) {
				
				if(array[i] > max) {
					
					max = array[i];
				}
			}
			
				System.out.println("The maximum number in the array is equal to: " + max);	


			int min = array[0];

			for(int i = 0; i < array.length; i++ ) {
		   
				if(array[i] < min) {
					
					min = array[i];
				}
			}
				
			System.out.println("The minimum number in the array is equal to: " + min);
			

	}

}

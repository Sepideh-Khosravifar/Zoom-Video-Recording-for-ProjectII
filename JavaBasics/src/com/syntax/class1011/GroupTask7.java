package com.syntax.class1011;

public class GroupTask7 {

	public static void main(String[] args) {
	
		// Coding Task #7
				//The Fibonacci sequence is a series of numbers in which 
				//each number is the sum of the two that precede it. Starting 
				//at 0 and 1, the sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on 

				int num1 = 0, num2 = 1;
				  
		        int counter = 0;
		        int N = 10;
		        
		        while (counter < N) {
		  
		           
		            System.out.print(num1 + " ");
		  
		           
		            int num3 = num2 + num1;
		            num1 = num2;
		            num2 = num3;
		            counter = counter + 1;
		        }

	}

}

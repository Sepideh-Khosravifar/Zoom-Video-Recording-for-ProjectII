package com.syntax.class1011;

public class GroupTask6 {

	public static void main(String[] args) {
		
		// Coding Task #6
		//A prime number is a natural number greater than 1 which 
		//is divisible by only 1 and itself. For example 2, 3, 5, 7, 11  
		//are prime numbers because they can neither be divided nor is a result of the multiplication. 
				
				
				int number = 12;
				
				for (int i=2; i <=number/i; i++) {
					
					if (number % i == 0) {
						
										
						System.out.println("Number " + number + " is not prime");
						
				  } else { 
					  
					  	  			  		
						System.out.println("Number " + number + " is prime");
						
						}
				
				
					}

	}

}

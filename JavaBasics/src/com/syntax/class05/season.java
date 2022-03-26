package com.syntax.class05;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your birth month: ");

	int birthmonth=input.nextInt();
	 
		System.out.println("Your birth month is: " + birthmonth);
	
	if (birthmonth >= 1 && birthmonth <= 3) {

		System.out.println("It's Spring time!");
			
	} else if (birthmonth >= 3 && birthmonth <= 6) {    
				
			System.out.println("It's Summer time!");
			
	} else if (birthmonth >= 6 && birthmonth <= 9) {    
		
		System.out.println("It's Fall time!");
		
	} else if (birthmonth >= 9 && birthmonth <= 12) {    
		
		System.out.println("It's Winter time!");
		
		}
	
	}

}

package com.syntax.class04;

import java.util.Scanner;

public class tempreature {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your city: ");
		String city=input.nextLine(); // in case if the name of city is two part
		System.out.println("Please enter your temperature ");
		
		{int farenheight, celesius;
			
	
		farenheight=input.nextInt();
		
		celesius = ((farenheight-32)*5)/9;
		
		
		System.out.println("The temperature in " + city + " is " + celesius);
		
		}
		
				
		
		
		
		
	}

}

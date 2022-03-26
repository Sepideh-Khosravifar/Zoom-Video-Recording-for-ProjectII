package com.syntax.class05;

import java.util.Scanner;

public class HeightinInches {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches: ");
		
		int height = input.nextInt();
				
				
		if (height < 60) {
			
			System.out.println("You are considered as short.");
			
		} else if (height >= 60 && height <= 72) {     
				
				System.out.println("You are considered as medium");
			
		} else if (height > 72) {
				
				System.out.println("You are considered as tall");
				
		}					
		
	}

}

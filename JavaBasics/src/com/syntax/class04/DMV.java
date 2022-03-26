package com.syntax.class04;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
	
	int age = scan.nextInt();
	
	if (age >= 18) {
		
		System.out.println("You can get a driver liscense");
		
	}else if (age < 18)	{
			
		System.out.println("You can get a learner permit");
		
	}else {
		
		System.out.println("Congratulation!");
			
		  }

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class YearsWorkedandSalary {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter years worked: ");
		
		int years=input.nextInt();
				
		System.out.println("Please enter your salary: ");
		
		int salary=input.nextInt();
		
		
		if (years >= 5) {
			
			System.out.println("You are eligible for a bonus");
			
			if (salary >= 50000) {
				
				System.out.println("You will receive $5000");
			
			} else if (salary < 50000) {
				
				System.out.println("You will receive $3000");
			}					
		} 
			
		else {
			
			System.out.println("You are not eligible to receive a bonus");

		}

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the loan amount you would like to get: ");
		
		int loan = scan.nextInt();
		
		if (loan <= 200000) {
			
			System.out.println("You can get the loan");
			
		}else if (loan > 200000)	{
				
			System.out.println("You cannot get the loan");
			
		}else {
			
			System.out.println("Congratulation!");
		
		}
		
	}

}

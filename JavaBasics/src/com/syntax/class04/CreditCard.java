package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
	
	boolean creditcard=input.nextBoolean();
	
	
	if (creditcard == false) {
	
		System.out.println("Congratulations! We can offer you a credit card.");
		
	} else  {
		
			System.out.println("What is the balance on your card?");
	
		 int balance=input.nextInt();
	
		 if (balance >= 1000) {

			System.out.println("Please pay off your balance immediately.");
			
		} else {
			
			System.out.println("Great! You can spend more.");
			
			}
			
		}
	

	}

}

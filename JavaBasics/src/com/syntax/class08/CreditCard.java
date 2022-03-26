package com.syntax.class08;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		String answer;
		
		do {
			System.out.println("Do you want to apply for a credit card?");
			
			answer = input.nextLine();
			
		} while (!answer.equals("yes"));
		
		System.out.println("Congrats!");
	}

}

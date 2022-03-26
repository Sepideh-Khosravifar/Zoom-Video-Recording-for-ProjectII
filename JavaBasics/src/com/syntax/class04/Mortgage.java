package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		double mortgageRate = 3.5;
		int mortgagePrice = 70000;
		
		if (mortgageRate > 4.5) {
			 
			System.out.println("you can not buy a house");
		
		} else {
			
			System.out.println("you can buy a house");
		
			if (mortgagePrice > 50000) {
				
				System.out.println("you should take a loan");
			
			} else {
				
				System.out.println("You can pay cash");
			}
			

		}
		

	}

}

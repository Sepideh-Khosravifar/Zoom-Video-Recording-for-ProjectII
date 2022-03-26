package com.syntax.class05;
import java.util.Scanner;
public class CountryLanguage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("please enter your country name");
		
		String country = input.nextLine();
		
				
		if (country.equals("france")) {
			
				System.out.println("you speak french.");
			
		} else if (country.equals("england")) {     
				
			System.out.println("you speak english.");
			
			
		} else if (country.equals("japan")) {     
			
			System.out.println("you speak japanese.");
			
		} else {
			
			System.out.println("Invalid country name!");
		
		}		
				
		
	}

}

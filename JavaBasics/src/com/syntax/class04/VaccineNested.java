package com.syntax.class04;

public class VaccineNested {

	public static void main(String[] args) {
		
		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {

			System.out.println("How many doses you have?");

			if (dose == 1) {

				System.out.println("You need another shot");

			} else {

				System.out.println("You are fully vaccinated");
			}
		}
		System.out.println("----------------------");
		
		/*declare a variable for allergy---->
		 * 									if you have pollen
		 * 									if you have peanut
		 * 									if you have wheat
		 * if no allergy ---> you are lucky!
		 * 
		 */
		
		 boolean allergy=true;
		 if(allergy) { 				//outer if
			 System.out.println ("Let's check what allergies you have");
			 
			 String allergyType="pollen";
			 
			 //nested if --> always has a dependency on outer if.
			 //Outer if MUST be TRUE in order for nested if to be executed
			 
			 if(allergyType.equals("pollen")) {
				 System.out.println ("Please stay at home");
				 
			 }else if (allergyType.equals("peanut")) {
				 System.out.println ("Please don't eat peanut");
				 
			 }else if (allergyType.equals("gluten")) {	 
				 
					 System.out.println("please follow gluten free diet");
		  
		      }else {

		    	  	System.out.println("I don't know what suggestion to give you");
		      }
			 
		 }else {
			 System.out.println("You are Lucky!");
		 }
	}

}

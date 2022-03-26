package com.syntax.class07;

import java.util.Scanner;

public class NameAge5Times {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int x = 0; x <= 5; x++) { 
			
				System.out.print("Please enter your name:");
		
				String name=input.next(); 
				
						
					System.out.print("Please enter your last name:");
		
				String lastname=input.next(); 
				
						
					System.out.print (name + " Please enter your age: ");
		
				int age=input.nextInt();
				
				
					System.out.println("Your name is "+ name + " " + lastname + " and you are "+ age + " years old");
		
		}
		
		
		
			
	}

}

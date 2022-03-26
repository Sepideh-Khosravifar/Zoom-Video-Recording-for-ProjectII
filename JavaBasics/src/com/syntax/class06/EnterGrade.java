package com.syntax.class06;

import java.util.Scanner;

public class EnterGrade {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in); 
		
		String grade = null;
					
		String answer = null;
		
		System.out.println("Please enter your grade:");
		
		grade = scan.next();
		
		
		switch (grade) {
		
		case "A":
		answer = "Excellent";
		break;
		
		case "B":		
		answer = "Good";
		break;
		
		case "C":
		answer = "Average";
		break;
		
		case "D":
		answer = "Bad";
				
		default:
		answer = "Not Acceptable";
		}
		
		
		System.out.println("You entered your grade " + grade + " which is " + answer);
	

	}

}

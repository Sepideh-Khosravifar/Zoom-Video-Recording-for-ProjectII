package com.syntax.class06;

import java.util.Scanner;

public class CalculatorIfStatement {

	public static void main(String[] args) {
		int num1, num2, result;
		char sign;  
		
		Scanner input = new Scanner(System.in);
	      
		System.out.println("Enter value of 1st number :");
		      
		num1 = input.nextInt();

		System.out.println("Enter value of 2nd number :");
		      
		num2 = input.nextInt();
								
		System.out.print("Enter the mathematical operator to be used: "); 
				
		sign = input.next().charAt(0);
		
				
		if (sign == '+' )   {
					
			result = num1 + num2;
					
			System.out.println(num1 + " " + sign +" "+ num2 +" = " + " " + result );
				
				
		} else if(sign == '-') {
				
			result = num1 - num2;
					
			System.out.println(num1 + " " + sign + " " + num2 + "= " + " " + result );
				
				
		} else if(sign == '*') {
					
			result = num1 * num2;
						
			System.out.println(num1 +  " " + sign + " " + num2 + "= " + " " + result );
			  
				
		} else if(sign == '/') {
									
			result = num1 / num2;
						
			System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + result );
						
		} else {
					
				System.out.println("Invalid input");
				
				}
					

	}

}

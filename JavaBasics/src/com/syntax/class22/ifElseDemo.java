package com.syntax.class22;

public class ifElseDemo {

	public static void main(String[] args) {
		
		
		int number = 10;
		
		//the ternary operator has the limitation that it must return 
		//something we can not use it to print out
		
		//number>10 ? System.out.println("Number is greater") : System.out.println("Number is smaller");
		
		
	}	
		
	
	int maxNumber(int num1, int num2) {
		
		/*if (num1 > num2) {
			return num1;
			
		} else {
			return  num2;
			
			}*/
		
		
		return num1 > num2 ? num1 : num2;    //num1 > num1 --> the condition part
		
	
		}
	}
	
	



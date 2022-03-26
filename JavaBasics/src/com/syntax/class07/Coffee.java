package com.syntax.class07;

import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		
		 double price=3;
	     System.out.print("Enter your payment for coffee: ");
	     
	     Scanner in = new Scanner(System.in);
	     double pay;
	      	       	      		
	      do {
	    	  pay = in.nextDouble();
        		if (pay > price)   {
	     
	      			System.out.println("Please pay less");
	    
	      		} else if (pay < price)  {
	      
	      			System.out.println("Please pay more");
	      			
	      		}
	      		     		
	      		} while (pay != price);
	      		
	      		System.out.println("Enjoy your coffee!");
	      
	     	
		
	}

}

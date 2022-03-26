package com.syntax.class06;

import java.util.Scanner;

public class SalesDiscount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	      float totalCost, costToPay, discount;
	      char sale;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Are you going for shopping?");
	      
	      sale = input.next().charAt(0);
	      
	      if (sale == 'N') {
	    	  
	    	  System.out.println("You are not going for shopping.");
	    	  
	      } else if (sale == 'Y') {
	    	  
	    	  System.out.println("You are going for shopping");
	      }
	      
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      
	      totalCost = scan.nextFloat();
	      
	      		if (totalCost < 20)   {
	     
	      			discount = (totalCost*10)/100;
		      
	      			costToPay = totalCost - discount;
	    
	      		} else if(totalCost >= 20 && totalCost <= 100)  {
	      
	      			discount = (totalCost*20)/100;
	         
	      			costToPay = totalCost - discount;
	     
	      		} else if(totalCost >=100 && totalCost <=500) {
	      
	      			discount = (totalCost*30)/100;
	         
	      			costToPay = totalCost - discount;
	      
	      		} else {
	      
	      			discount = (totalCost*50)/100;
	         
	      			costToPay = totalCost - discount;
	         
			     }
	      
	      System.out.println("The cost to be Paid is: " + costToPay);
	      		         
	      
		
	}

}

package com.syntax.class09;

public class HW6 {

	public static void main(String[] args) {
			
		 int [] num = {10, 12, 17, 46, 77, 98, 300};
	       
		 int i;
	           
	     int max = num[0];
	        
	         for (i = 1; i < num.length; i++) {
	             if (num[i] > max) {
	                 max = num[i];
	             }
	         }
	    
	         
	         System.out.println("Largest number in given array is: " + max);
	       

	}

}

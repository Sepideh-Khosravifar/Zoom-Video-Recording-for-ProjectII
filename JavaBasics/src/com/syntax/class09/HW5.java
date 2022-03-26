package com.syntax.class09;

public class HW5 {

	public static void main(String[] args) {
		
int[] nums = {10, 12, 17, 46, 77, 98, 300};
		
		for (int number:nums) {
			
			System.out.print(number+ " ");
			
		}
		
		int sum = 0;
		
		for(int i : nums) {
		    sum += i;
		}

		System.out.println("\nThe addition of 7 integer numbers is equal to: "+sum);
		
		
	}

}

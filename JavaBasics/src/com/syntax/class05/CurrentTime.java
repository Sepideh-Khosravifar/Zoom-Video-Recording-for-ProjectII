package com.syntax.class05;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the current time ");
		
		int time = input.nextInt();
				
				
		if (time >= 1 && time <= 11) {
			
			System.out.println("It is morning!");
			
		} else if (time >= 12 && time <= 15) {     
				
				System.out.println("It is afternoon");
			
		} else if (time >= 16 && time <= 20) {
				
				System.out.println("It is Evening!");
				
		} else if (time >= 21 && time <= 24) {
			
			System.out.println("It is Night!");
			
			
		}				


	}

}

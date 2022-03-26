package com.syntax.class03;

public class DeclarePosOrNeg {

	public static void main(String[] args) {
		
		int number = 14;
		if (number < 0) {
			System.out.println("the number "+ number + " is negative");
		} else if (number > 0){
			System.out.println("the number "+ number + " is Positive");
		} else {
			System.out.println("the number is " + number);
		}

	}

}

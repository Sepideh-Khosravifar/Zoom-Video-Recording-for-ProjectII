package com.syntax.class04;

import java.util.Scanner;// we need to import scanner into our class

public class NameAge {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		
		//if you want to capture a single string --> use next();
		
		String name=input.next(); // scanner is waiting for an input string
		
		System.out.println("Your name is: " + name);
		
		//if you want to capture integer --> use nextInt();
		System.out.println(name + " Please enter your age: ");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+ name + " and your age is "+ age);
	}

}

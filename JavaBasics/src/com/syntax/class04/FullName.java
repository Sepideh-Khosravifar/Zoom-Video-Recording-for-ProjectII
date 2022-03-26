package com.syntax.class04;

import java.util.Scanner;

public class FullName {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter your full name:");
		
		
		//If you need to capture more than one word --> use nextLine();
		
		String name=in.nextLine();
		
		System.out.println(name);
		

	}

}

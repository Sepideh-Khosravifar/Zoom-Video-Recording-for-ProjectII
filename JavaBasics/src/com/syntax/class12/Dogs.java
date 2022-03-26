package com.syntax.class12;

public class Dogs {

	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name + " is running");
	}
	
	void printCompleteInfo() {
		System.out.println("name = " + name);
		System.out.println("breed = " + breed);
		System.out.println("age = " + age);
		System.out.println("weight = " + weight);
				
	}
	
	public static void main(String[] args) {
		
		Dogs Husky= new Dogs();
		
		Husky.name="asal";
		Husky.breed="husky";
		Husky.age=5;
		Husky.weight=50;
		Husky.run();
		
		Husky.printCompleteInfo();
		
		System.out.println("***************");
		
		Dogs Bulldog=new Dogs();
		
		Bulldog.name="milo";
		Bulldog.breed="bulldog";
		Bulldog.age=7;
		Bulldog.weight=70;
		Bulldog.run();
		
		Bulldog.printCompleteInfo();
		
	
System.out.println("***************");
		
		Dogs Labrador=new Dogs();
		
		Labrador.name="sweetie";
		Labrador.breed="Labrador";
		Labrador.age=12;
		Labrador.weight=30;
		Labrador.run();
		
		Labrador.printCompleteInfo();
		
		
	}

}

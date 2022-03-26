package com.syntax.groupProjectII;

class CarTester{
	
    public static void main(String[] args) {

        //creating objects for super class and subclasses as well as calling the method

        Car c = new Car(35000,"red");
        System.out.println("Price of the car is: "+ c.calculatePrice());

        Car t = new Truck(85000, "grey", 3645);
        System.out.println("Price of the Truck after discount is: "+t.calculatePrice());

        Car s = new Sedan(40000,"white",187.3);
        System.out.println("Price of Sedan after discount is: "+ s.calculatePrice());
    }
}
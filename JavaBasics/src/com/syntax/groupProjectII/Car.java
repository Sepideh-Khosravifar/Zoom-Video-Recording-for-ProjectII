
package com.syntax.groupProjectII;

	public class Car {
	    double carPrice;
	    String color;

	    //constructor to initialize values of instance variables
	    public Car(double carPrice, String color) {
	        this.carPrice = carPrice;
	        this.color = color;
	    }
	    //method
	    double calculatePrice(){
	        return carPrice;
	    }
	    }

	class Truck extends Car {
	        double Weight;

	    //constructor calling super constructor
	        
	    public Truck(double carPrice, String color, double Weight) {
	        super(carPrice, color);
	        this.Weight = Weight;
	    }

	    //method calculating discount
	    
	    double calculatePrice() {
	        double discount;

	        if(Weight > 2000) {
	            discount= carPrice - (carPrice * 0.10);

	        }else{
	        	
	            discount = carPrice - (carPrice * 0.20);
	        }

	        return discount;
	    }
	}

	class Sedan extends Car{
	    double length;

	    //constructor calling super constructor
	    public Sedan(double carPrice, String color, double length) {
	        super(carPrice, color);
	        this.length = length;
	    }

	    //method calculating discounted price
	    double calculatePrice(){
	        double discount;

	        if(length>20){

	            discount = carPrice - (carPrice * 0.05);

	        } else{

	            discount = carPrice - (carPrice * 0.1);
	        }

	        return discount;
	    }
	}

	
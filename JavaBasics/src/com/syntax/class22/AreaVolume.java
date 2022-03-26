package com.syntax.class22;

public class AreaVolume {

	double width, length;
    
	AreaVolume(double width, double length) { 		
    
		this.width = width;
    
		this.length = length;								
    
    }
}

    class RectangleClass extends AreaVolume {
    	
    	RectangleClass (double width, double length) {
    		
    		super(width, length);
    	}	
   
    	
     double areaOfRectangle () {
    	
    	 double area = width * length;
    	 
    	 return area;
     }
     
   

    public static void main(String[] args) {
		
      	RectangleClass obj = new RectangleClass(4, 8);	
    	
    	//System.out.println(obj.areaOfRectangle());
    		
    }
    
}
    
    
    
    	
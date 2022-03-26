package com.syntax.class08;

import java.text.DecimalFormat;

public class Clock {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("00");	
		
		for (int hours = 1; hours <= 12; hours ++)	
			
		{
			for (int minutes = 0; minutes <= 59; minutes ++)
				
			{
				
				for (int seconds = 0; seconds <= 59; seconds ++)
			
				{ 
					
					System.out.println(formatter.format(hours) + ":" +
					formatter.format(minutes) + ":" +
					formatter.format (seconds));
					
						
				}
	}

}
		
	}
	
}

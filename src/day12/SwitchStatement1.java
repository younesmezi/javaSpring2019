package day12;

import java.util.Scanner;

public class SwitchStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner s = new Scanner(System.in);

		    System.out.println("how is weather today?");

		    String weather = s.next();

		    if (weather.equals("sunny")) {
		      
		      System.out.println("go swimming");
		    
		    } else if (weather.equals("windy")) {
		    
		      System.out.println("go fly a plane ");
		      
		    } else if (weather.equals("rainy")) {
		      
		      System.out.println("stay home ");

		    } else if (weather.equals("snowy")) {
		      
		      System.out.println("go snowboarding ");
		    
		    }else{
		      System.out.println("are you sure this is a right weather");
		    }

		
		   
	}

}

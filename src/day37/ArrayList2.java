package day37;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREATE ARRAYLIST OF DOUBLE
	    // CALL IT priceList
	    // Add 5 prices
	    // try to get 3rd items
	    // iterate over arraylist using both loops
	    // and print out
	    ArrayList<Double> priceList = new ArrayList<>();
	    priceList.add(1.2);
	    priceList.add(10.12);
	    priceList.add(1.4);
	    priceList.add(1.5);
	    priceList.add(12.6);

	    System.out.println(priceList.get(2));

	    for (int i = 0; i < priceList.size(); i++) {
	      System.out.println(priceList.get(i));
	    }
	    System.out.println("--------------------");
	    for( Double eachDouble : priceList) {
	      System.out.println(eachDouble);
	      
	    }
	    // in another loop
	    // only print out price more than 10 ;
System.out.println("====================");
		
		for(Double d: priceList) {
			if(d>10.0)
				System.out.println(d);
			
		}
		// in another loop
	    // GET THE SUM OF ALL PRICES ;
	    
	    System.out.println("PRINT SUM ");
	    // arithmatic operation only happens for primitives 
	    // if you try to add wrapper objects it will be unboxed 
	    double sum = 0 ; 
	    for (double each : priceList) {
	      sum += each ; 
	    }
	    System.out.println(   sum);
	        
		}
	}

	

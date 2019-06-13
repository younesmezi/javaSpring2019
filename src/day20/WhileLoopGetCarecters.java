package day20;

import java.util.Scanner;

public class WhileLoopGetCarecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how many letter a showed up in this String
	    String str = "Ali K Durhan";
	    
	    // go through each and every character
	    // if i see a , i will increment my counter by 1
	    
	    int count= 0 ; 
	    int x = 0;  
	        
	    do {
	      
	      char c = str.charAt(x) ; 
	      if(c=='a' || c=='A') {
	        System.out.println("BINGO at " + x);
	        ++count ; //count = count + 1;  
	      }
	      //System.out.println(  + " ");
	      x++ ; 
	      
	    }while(x<str.length());
	    
	    System.out.println( count  );

	
	}

}

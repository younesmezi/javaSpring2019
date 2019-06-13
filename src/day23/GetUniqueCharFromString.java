package day23;

import java.util.Scanner;

public class GetUniqueCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 /*
	     * write a program to get unique characters from a string  
	     * : aaabbccc —> abc
	     * */
	    String str = "aaabbccc" ; 
	    String uniqueStr = "" ; 
	    
	    for (int i = 0; i < str.length(); i++) {
	      
	      String eachChar = str.substring(i, i+1) ; 
	      
	      if(! uniqueStr.contains(eachChar) ) {
	        uniqueStr += eachChar ; 
	        System.out.println(eachChar);
	      }
	      
	      //System.out.println(eachChar);
			
		
			
	}

	}
}

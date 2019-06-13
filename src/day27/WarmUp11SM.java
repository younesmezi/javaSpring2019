package day27;

import java.util.Scanner;

public class WarmUp11SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter a sentence");
	    String sentence = scan.nextLine(); 
	    String[] words =  sentence.split(" "); 
	    
	    for(String eachWord : words) {
	      
	      //System.out.println(eachWord);
//	      String word = "Break time" ; 
	      char[] wordChars = eachWord.toCharArray(); 
	      for (char c : wordChars) {
	        System.out.print( c + "-");
	      }
	      System.out.println();
	    
	    }
	    // break till 2:15   We will continue For each loop and Arrays class methods 
	    
	    
	    
	    
	    
	    

	}

}

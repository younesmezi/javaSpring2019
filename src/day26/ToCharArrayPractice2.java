package day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 2 
	    // get user input using scanner as String name
	    // turn it into char Array and count letter a 
	    
	    Scanner scan = new Scanner(System.in) ; 
	    System.out.println("Enter name ");
	    String name  = scan.next(); 
	    // ASK USER TO ENTER THE CHAR TO COUNT 
	    // SINCE WE CAN NOT store user input as a character 
	    // we will just ask for String then turn it into character 
	    
	    // for example if user enter "A" --> "A".charAt(0) ---> 'a'
	    System.out.println("Enter char to count ");
	    String userCharstr = scan.next();
	    char charToLookFor = userCharstr.charAt(0); 
	    
	    
	    char[] nameChars = name.toCharArray() ; 
	    System.out.println( Arrays.toString(nameChars) );
	    
	    int counter = 0 ; 
	    
	    for (int i = 0; i < nameChars.length; i++) {
	      
	      if( nameChars[i] == charToLookFor ) {
	        counter ++ ; 
	      }
	      
	    }
	    
	    System.out.println( "The count is "  + counter   );
	    
	}

}

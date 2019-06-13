package day18;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String theAnswer = ""  ; 
	    
	    while(! theAnswer.equalsIgnoreCase("yes")) {
	    
	      System.out.println("DO YOU LOVE JAVA ? ");
	      theAnswer = scan.next(); 
	      
	    }
	    System.out.println("FINALLY , CORRECT ANSWER");

	  }

	}



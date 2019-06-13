package day27;

import java.util.Scanner;

public class WarmUp9SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * ask user a word turn that word into a charArray then print out using for each
	     * loop Cybertek --> C-y-b-e-r-t-e-k-
	     */
	    System.out.println("Please enter a word");

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

	    char[] characs = word.toCharArray();

	    for (char yes : characs) {
	      System.out.print(yes + "-");
	    }
	    System.out.println();
	    
	    
	    String[] splitted = word.split(""); 
	    for( String each :splitted ) {
	      System.out.print(each + "-");
	    }
	    
	    
	      
	      /*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */

	    /*
	     * Optional : use combine above two for each loop to finish our previous tasks
	     * 
	     */

	}

}

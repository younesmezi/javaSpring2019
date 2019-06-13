package day19;

import java.util.Scanner;

public class WhileLoop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER A name");
	    // Ask user a name 
	    // for example  Bilal ----> B-i-l-a-l-
	    String name = scan.nextLine() ;
	    
//	    int x = 0 ; 
//	    while(x< name.length() ) {
//	      
//	      System.out.print (  name.charAt(x)  + "-");
//	      ++x ;   //x++ ; 
//	    }
	    // TASK 3 : referring above code --> reverse your name 
	    // OPTIONAL : Check how many a do you have in your name
	    int count = name.length() ;  // ABC 
	    while(count>0) {

	      count-- ; 
	      System.out.print( name.charAt(count) + " "   );      
	      
//	      System.out.print( name.charAt(count-1) + " "   );
//	      count-- ; 
	}

}
}
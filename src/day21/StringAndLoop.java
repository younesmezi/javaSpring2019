package day21;

import java.util.Scanner;

public class StringAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan= new Scanner(System.in);
//System.out.println("Enter your name");
//String name= scan.next();

//for(x=0;x<name.length();x++) {
	//System.out.print(name.charAt(x)+ " ");

	//}
		// EVERY FOR LOOP CAN BE WRITTEN IN WHILE LOOP

	    // use for loop to print your name char by char
	    // and print reverse order char by char

	    // OPTIONALLY Save it into another variable
	          // 012345
	    String name = "Dilnur";
	// TASK 3.1
//	    for (int d = 0; d < name.length(); d++) {
//	      System.out.print(name.charAt(d) + " ");
//	    }
//	    System.out.println();
//	    // TASK 3.1
//	    for (int d = name.length() - 1; d >=0 ; d-- ) {
//	      System.out.print(name.charAt(d) + " ");
//	    }
	//    
	    // TASK 3.3
	    String newStr = "" ; 
	    for (int d = name.length() - 1; d >=0 ; d-- ) {
	      //System.out.print(name.charAt(d) + " ");
	      char eachChar = name.charAt(d); 
	      newStr = newStr + eachChar ;
	    }
	    System.out.println( newStr);
	    
	    
//	    int x = 0 ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
	    
	    
//	    int x = name.length()-1 ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
	    
	    
	    
	    

}
}
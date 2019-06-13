package day20;

import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break statement is used to break out of switch statement
	    // and loops 
	    
	    /*int x = 10 ; 
	    do {
	      
	      System.out.println( x );
	      x++ ;   // x = x+ 1 ;  
	      if(x>50) {
	        break; 
	      }
	      
	    } while (x<100);*/
	    
	    Scanner scan =new Scanner(System.in);
	    int x=1;
	    int sum=0;
	    
	    do {
	    	sum=sum + x;
	    	System.out.println("x: " +x+ " sum: "+sum);
	    	
	    	x++;
	    	
	    }while(x<=10);
	    

		
	}

}

package day24;

import java.util.Scanner;

public class MinAndMAxOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ; 
	    int[] arr = new int[3] ; 

	    for (int i = 0; i < arr.length; i++) {
	      
	      System.out.println("enter number " + (i+1) );
	      arr[i] = scan.nextInt();
	      System.out.println( arr[i] );
	    
	    }
	    
	    
	    // BAD WAY TO GET THE MAX 
	    // INITIAL VALUE PREFERRABLY THE FIRST ITEM 
//	    int max = 0 ; 
//	    for (int i = 0; i < arr.length; i++) {
//	      
//	      if(arr[i]> max  ) {
//	        max = arr[i] ; 
//	      }
//	      
//	    }
//	    System.out.println(max);
	    
	    int min = arr[0] ; 
	    for (int i = 1; i < arr.length; i++) {
	      
	      if(arr[i]< min  ) {
	        min = arr[i] ; 
	      }
	      
	    }
	    System.out.println("min value is : "+ min);
	     
	    
	    
	    
	}

}

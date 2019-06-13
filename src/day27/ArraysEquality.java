package day27;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,3,4,65,2} ; 
	    int[] arr2 = {1,3,4,65,2} ; 
	    int[] arr3 = {3,1,4,65,2} ; 
	    
	    // comparing two variable 
	    // it will alwayse check whether they have 
	    // same exact thing stored inside the variable 
	    System.out.println(  arr1==arr2  );
	    
	    // Arrays class has equals method to check whether 2 array 
	    // has same content or not 
	    boolean sameOrNot = Arrays.equals(arr1, arr2) ; 
	    System.out.println(sameOrNot);
	    System.out.println("Arr2 compare to Arr3 " +  Arrays.equals(arr2, arr3) );
	    Arrays.sort(arr2);
	    Arrays.sort(arr3);
	    
	    System.out.println("Arr2 compare to Arr3 -- after sorting  " 
	        +  Arrays.equals(arr2, arr3) );
	    
	    
	    

	}

}

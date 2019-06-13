package day28;

import java.util.Arrays;

public class AddItemsToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
	     * Arrays Class methods to work with array object 
	     * 
	     * toString(arrObject) --->> return string rep of array items 
	     * sort(arrObject) ; --->  sort the array 
	     * copyOf(arrObject , lengOfNewArr) ---> new array with length defined 
	     *               and everything copied from original 
	     * copyOfRange(arrObject, from,to)  --> works like subString
	     * equals(arr1, arr2) ---> true false if all elements are the same and in same order
	     * 
	     * binarySearch
	     * */
	    String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"}; 
	     
	     Arrays.sort(words);
	     System.out.println( Arrays.toString(words) );
	     
	     String[] first2words = Arrays.copyOf(words, 2) ;
	     System.out.println( Arrays.toString(first2words) );
	     
	     String[] tenItem = Arrays.copyOf(words,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	    
	     String[] codingStart = Arrays.copyOfRange(words,3,4+1) ; 
	     System.out.println( Arrays.toString(codingStart) );
	     
	     
	     
	     
	     
	    
	    
	    

	}

}

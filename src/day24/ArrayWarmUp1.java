package day24;

public class ArrayWarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Review 
	    
	    /*
	     * Array is an object can store multiple items of same type
	    
	     * */
	    int[] nums = new int[3];
	    System.out.println( nums[0] );
	    System.out.println( nums[1]);
	    System.out.println( nums[2]);
	    
	    boolean[] bools = new boolean[4]; 
	    bools[0] = false ; 
	    bools[1] = false ; 
	    bools[2] = true ;
	    bools[3] = true ;
	    
	    
	    int[] nums2 = new int[] {1,2,3,4,5,65,6} ; 
	    System.out.println(nums2[5]);
	    
	    int[] nums3 =  {1,2,3,4,5,65,6} ; 
	    
	    // the declaration and initilization need to happen in same line 
//	    int[] nums4  ; 
//	     nums4 =  {1,2,3,4,5,65,6} ; 
	    
	    // getting the count of items 
	    System.out.println(  nums3.length  );
	    
	    
	    
	
	}

}

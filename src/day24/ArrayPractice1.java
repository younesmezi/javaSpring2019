package day24;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an int array of 5 items and assign values ; 
	    //{1,4,6,8,9}
	   /* int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    // double the value of 3rd item  : for example 6 --> 12 
	    nums[2] = nums[2] * 2 ; 
	    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
	    nums[3] = nums[0] + nums[1] ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }*/
	    // print them out using the loop 
	    
	      // OPTIONALLY SWAP the value of first and last items --> {9,.....,1}
	      
	      
	      // get the sum of all numbers 
	      // get the max number 
	      
	  
	    
	    int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    
	    int temp = nums[nums.length-1]; 
	    nums[nums.length-1] = nums[0] ; 
	    nums[0] = temp ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	
	    }
	    System.out.println();
	    int sum=0;
	    for(int y =0; y<nums.length;y++) {
	    	sum=sum+nums[y];
	    }
	    System.out.println(sum);
	    int j = 0 ; 
//	    do {
//	      sum = sum + nums[j] ; 
//	      j++ ; 
//	    } while (j<nums.length);
	//    
	    //int z = 0 ; 
	    //while (z<nums.length) {
	      //sum = sum + nums[z];
	      //z++ ; 
	    
}
}
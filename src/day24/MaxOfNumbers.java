package day24;

public class MaxOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums []= {1,4,6,8,9,5};
	    
	    int max = nums[0] ;
	    
	    
	    for (int i = 1; i < nums.length; i++) {
	      
	      if( nums[i] > max ) {
	        max =  nums[i] ; 
	      }
	      
	    }
	    /*// we assume the first item is the max 
	     * then compare the first item to the rest of them 
	     * and replace the value of max with actual max number
	     * in each iteration 
	     * max 1 
	     * iteration 1 ---> 4>1  ----> max 4
	     * iteration 2 ---> 6>4  ----> max 6
	     * iteration 3 ---> 8>6  ----> max 8
	     * iteration 4 ---> 9>8  ----> max 9
	     * iteration 5 ---> 5>9 false ----> max 9
	     * 
	     *  
	     * */
	    
	    System.out.println(max);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

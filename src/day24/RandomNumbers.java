package day24;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random() ; 
	    int[] nums = new int[10] ; 
	    
	    for (int x = 0; x < 10; x++) {
	      // 0- 100-1
	      nums[x] = rand.nextInt(100);
	      
	    }
	    
	    System.out.println( Arrays.toString(nums) );

	}

}

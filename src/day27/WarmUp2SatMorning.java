package day27;

import java.util.Arrays;

public class WarmUp2SatMorning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    /*
	     * /Task 2 :
	      given : 
	      String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	      
	      use the method your learned to get each words
	      and store it into String array: 
	      
	      loop through each items -- 
	        in each iteratrion loop : 
	           turn each word into char array 
	           print each char out with seperated by -
	      output : 
	        C-y-b-e-r-t-e-k-
	        B-a-t-c-h-
	        S-p-a-r-t-a-n-
	        i-s-
	        m-o-s-t-
	        h-a-r-d-w-o-r-k-i-n-g-
	        o-n-e-
	        e-v-e-r-

	     * */
	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" "); 
	    System.out.println( Arrays.toString(words)  );
	    
	    
	}

}

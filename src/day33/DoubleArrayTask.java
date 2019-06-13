package day33;

import java.util.Arrays;

public class DoubleArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] prices1 = {1.1,3.99, 2.2}; 
	    double[] prices2 = {2.4,2.88}; 
	    
	    double[] prices3 = combineArrays(prices1,prices2); 
	    
	    double[] expected = new double[]{1.1,3.99, 2.2, 2.4,2.88};  
	    
	    if(Arrays.equals(prices3,expected )) {
	      System.out.println("Test has passed ");
	    }else {
	      System.out.println("Test Failed");
	    }
	    
	  }
	  
	  // Task 2 
	  /*
	   * create a static method called expected
	   * it takes 2  parameters  and both data type as double array 
	   * and return another double array with 2 array items combined
	   *  
	   *  example result of calling this method 
	   * {1.1,3.99, 2.2}  {2.4,2.88}  ---> {1.1,3.99, 2.2, 2.4,2.88} 
	   * */
	  public static double[] combineArrays(double[] d1,double[] d2) {
	    
	    int size = d1.length+d2.length ;
	    double[] combined = new double[size]; 
	    //{0,0,0,0,0} 
	    //{1.1,3.99, 2.2}  {2.4,2.88}  ---> {1.1,3.99, 2.2, 2.4,2.88} 
	    
	    for (int i = 0; i < d1.length; i++) {
	      combined[i] = d1[i]; 
	    }
	    
	    for (int j = 0; j < d2.length; j++) {
	      combined[d1.length + j] = d2[j]; 
	    }
	    
	    
	    return combined ; 
	    
	  }
	  
	  

	}



	



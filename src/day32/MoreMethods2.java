package day32;

public class MoreMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int biggerNum = giveMeBiggerNumber(10, 12) ; 
	     System.out.println(biggerNum);
	     
	     System.out.println(giveMeBiggerNumber(100, 11) );
	}
	public static int giveMeBiggerNumber(int num1 , int num2) {
	    
	    int max =  (num1>num2) ? num1 : num2 ; 
	    return max ; 
	    // return (num1>num2) ? num1 : num2 ;
	    
	  }
}

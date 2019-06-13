package day8;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isTimeToEndClass = true;

	    boolean isTopicFinished = true;

	    // if the variable itself is boolean type == true is optional
	    // if( isTimeToEndClass ){

	    if (isTimeToEndClass == true && isTopicFinished == true) {
	      System.out.println("OK lets end the class");
	    } else {
	      System.out.println("hang on tight");
	    }
	    
	    if(isTopicFinished){
	      System.out.println("can we finish it in few extra mins");
	    }else{
	      System.out.println("OK WE CAN GO NOW");
	    }

	}

}

package day21;

public class MostInterviewQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "AAccBBBdEEEf" ; 
		    // get unique character out of above String 
		    
		    String newStr = "" ; 
		    
		    // store first char into newStr 
		    // store the next char into newStr if it's not already there
		    
//		    newStr = newStr + str.charAt(0); 
		//    
//		    if(! newStr.contains( str.charAt(1)+""  )) {
//		      newStr = newStr + str.charAt(1); 
//		    }
		    System.out.println(str);
		    for (int i = 0; i < str.length(); i++) {
		    
		      String eachChar = str.charAt(i)+"" ; 
		      
		      if( newStr.contains( eachChar  )) {
		        System.out.println(eachChar + " duplicate");
		      }else {
		        newStr = newStr + eachChar ; 
		      }
		      
		    }
		    
		    System.out.println(newStr);
		    
		    //    for (int i = 0; i < str.length(); i++) {
//		      System.out.println(str.charAt(i));
//		    }
		    
		    
	}

}

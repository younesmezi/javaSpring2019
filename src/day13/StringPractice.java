package day13;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// s1.contains("something")  ---> check for part of string inside another string
	    // s1.indexOf("s")  ---> this will give you position of certain part of the string
	    
	    //String s1 = "younes" ; 
	    //boolean uExistsOrNot = s1.contains("u")  ; 
	    
	   //System.out.println(  "does name contains u : " +   s1.contains("u")     );
	    
	    //System.out.println(  "what is the position of u : "  + s1.indexOf("u") );
	    
	 // s1.contains("something")  ---> check for part of string inside another string
	    // s1.indexOf("s")  ---> this will give you position of certain part of the string
	    
	    
	    
	    String s1 = "Zuhkra" ; 
	    boolean uExistsOrNot = s1.contains("u")  ; 
	    
	    System.out.println(  "does name contains u : " +   s1.contains("u")     );
	    
	    
	    System.out.println(  "what is the position of u : "  + s1.indexOf("u") );
	    
	    // subString(beginning index , ending index )
	    // it will return part of a string staring from beginning till right before ending index
	    
	     //012345
	    //"Zuhkra" ; substring(1, 4) ---> u
	    String partOfString = s1.substring(1, 4) ; 
	    System.out.println(  partOfString);
	    
	    // 0123456    
	    // SAYYARA ---YAR
	    String s2 = "SAYYARA" ; 
	    System.out.println(  s2.substring(3, 6)  );
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

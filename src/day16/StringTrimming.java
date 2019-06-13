package day16;

public class StringTrimming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String sent= "   goo Java      SPARSATN";
		System.out.println(sent);
		System.out.println(sent.trim());
		System.out.println(sent.indexOf(""));
		System.out.println(sent.indexOf("J"));
		System.out.println(sent.substring(7));*/
String str = "    GOO   JAVA SPARTAN   " ; 
        
        System.out.println(str);
        
        //System.out.println(str.trim() );
        
        // get  JAVA SPARTAN from above String 
        int indexO = str.lastIndexOf("O"); 
        
        String part = str.substring(indexO + 1) ; 
        System.out.println( part.trim()      );
        
        
        System.out.println(   str.substring(indexO + 1)    );
        System.out.println(   str.substring(indexO + 1).trim()      );
        //str.length().trim() ;  BAD
        

	}

}

package day27;

public class WarmUp6SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
	    /*
	     * String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	      ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
	     * */
	    
	    
	    
	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" ");  
	    String reversedSentence = "";
	    
	    for (int j = 0; j < words.length; j++) {
	      //System.out.println(words[j]);
	    
	      String one = words[j] ;  // in each iteration this will be a new word
	      char[] wordChars = one.toCharArray(); // this create char array for words
	      int lastIndex = wordChars.length-1 ; 
	      
	      for (int i = 0; i < wordChars.length/2; i++) {
	        /// create a temp char variable so we can temp store the value we want to swap
	         char temp = wordChars[i]; 
	         wordChars[i] =  wordChars[lastIndex-i] ; 
	         wordChars[lastIndex-i] = temp ; 
	      }
	      // how to change char array to a String 
	      String reversed = new String(wordChars);
	      
	      reversedSentence = reversedSentence + reversed + " " ; 
	      //System.out.println(reversed);
	    
	    }
	    
	    System.out.println(reversedSentence);

	    
	    
	    
	    
	//    
//	    String revString="";
	//    
//	    for(int k=0;k<cyberTek.length;k++)
//	    {
//	      String word=cyberTek[k];
//	      
//	      String revWord="";
//	      for(int l=word.length()-1;l>=0;l--)
//	      {
//	        revWord=revWord+word.charAt(l);
//	      }
//	      revString=revString+revWord+" ";
//	    }
//	    System.out.println();
//	    System.out.println(revString);
	//
	}

}

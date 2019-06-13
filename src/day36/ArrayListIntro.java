package day36;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // NO PRIMITIVE TYPES ALLOWED AS TYPE 
	    // ArrayList<int> numList ; THIS IS BAD 
	    
	    // arraylist that store only Integer
	    ArrayList<Integer> numList = new ArrayList<>(); 
	    //numList.add("ABC"); 
	    
	    Integer i = 100 ; // autoboxing to Integer Object 
	    
	    // ADDING ITEM 
	    // WE call add method from Arraylist class 
	        
	    numList.add(i); 
	    numList.add(200) ; 
	    numList.add(300) ; 
	     
	    //GETTING SINGLE ITEM FROM ARRAYLIST 
	    
	    System.out.println( numList  );
	}

}

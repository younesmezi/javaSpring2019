package day37;

import java.util.ArrayList;

public class RemoveItemFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
	     * 
	     * */
	    
	    ArrayList<Integer> lst = new ArrayList<>(); 
	    lst.add(1); 
	    lst.add(2); 
	    lst.add(3); 
	    lst.add(4); 
	    
	    lst.remove(2); 
	    //lst.remove( new Integer(2));
	    //lst.remove( Integer.valueOf(2));
	    
	    System.out.println(lst);
	    
	}

}

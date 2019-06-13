package day25;

import java.util.Arrays;

public class ArraysWarmUp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
	for(int i=0;i<courses.length;i++) {
        
        System.out.println("The course id for <"+courses[i]+"> is <"+courseId[i]+">");        
    }
	// find out the ID of online Java Programming course 
	  
	  for(int i=0; i<courses.length;i++) {
	    
	    String eachCourse = courses[i] ; 
	    //System.out.println(eachCourse);
	    if(eachCourse.equals("Online-Java Programming")) {
	      System.out.println("INDEX IS " +  courseId[i]  );
	      break; 
	}
	  }
	  for (int i = 0; i < courses.length; i++) {
			if(courseId[i]==203) {
	
	System.out.println(courses[i]);
}
	  
	}
	
	}
}

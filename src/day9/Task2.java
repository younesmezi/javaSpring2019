package day9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Grade book 
	    int score = 90 ; 
	    
	    // if the score is between 90- A 
	    // if the score is between 80-89  B 
	    // if the score is between 70-79  B 
	    
	    
	    // ELSE D and print study harder

	    // 80<score>89 ? 
	    
	    if(score >= 90){
	      System.out.println(" YOU GOT A ");
	    
	    }else if(score>=80 && score<90){
	      
	      System.out.println(" YOU GOT B ");
	    
	    }else if(score>=70 && score<80){
	      
	      System.out.println(" YOU GOT C ");
	      
	    }else {
	      
	      System.out.println("study harder ");
	      
	    }
	      
	    
	    
	    
	    
	    

	  }

	}


package day18;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x ; 
	    int y = 10 ; 
	    
	    if (y>5) {
	      x = 10 ; 
	    }else {
	      x = 5 ; 
	    }
	    
	    System.out.println(x);*/
		Scanner input= new Scanner(System.in);
		int x=0;
		//while(!(x==5 || x==10)){
		while(x!=5&&x!=10) {
			System.out.println("Give me $5 bill or $10 bill ");
			x=input.nextInt();
		}
		System.out.println("Thank You!");
	}

}

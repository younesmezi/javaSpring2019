package day21;

import java.util.Scanner;

public class WhileLoopWarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int x=0, y=0;
int tryCount = 0 ; 
do {
	System.out.println("Enter num1");
	x=scan.nextInt();
	System.out.println("Enter num2");
	y=scan.nextInt();
	
	++tryCount ;
    if(tryCount==3) {
      //System.out.println("YOU LOST!");
    } break; 
    
}while(x+y<=100);
System.out.println("The end");





	}

}

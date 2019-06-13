package day20;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Enter your name");
String name= scan.next();
int x =0;
do {
	System.out.print(name.charAt(x)+ " ");
	x++;
	
}while(x<name.length());

	}

}

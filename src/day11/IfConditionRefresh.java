package day11;

import java.util.Scanner;

public class IfConditionRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you number");
		int num = scan.nextInt();
		
		if(num%5==0 && num%3==0 ) {
			System.out.println("fizz buzz");
		}
		
		else if(num%5==0 && num%3!=0) {
			System.out.println("fizz");
		}
		else if(num%5!=0 && num%3==0) {
			System.out.println("buzz");
		}
	}

}

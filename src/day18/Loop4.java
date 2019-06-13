package day18;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your number");
		int number= scan.nextInt();
		int x=1;
		while(x<=number) {
			
			System.out.print(x++ +" ");
			
		}
		
	}

}

package day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name");
		String name= scan.next();
		char[] myChars1 = name.toCharArray(); 
	    System.out.println(Arrays.toString(myChars1)   );
	    int count= myChars1.length;
	    System.out.println(count);
	}

}

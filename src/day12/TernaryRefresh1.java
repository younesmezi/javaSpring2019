package day12;

import java.util.Scanner;

public class TernaryRefresh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// ALWAYSE USE str1.equal(str2) for String equality check
		String weather;
		String action;
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather?");
		weather = scan.next();
		action = (weather.equals("sunny")) ? "go hiking" : "stay home";
		System.out.println(action);
		// if(weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("nice") ){
		// action = "go out";
		// }else{
		// action = "stay home";
		// action = (weather.equalsIgnoreCase("sunny") ||
		// weather.equalsIgnoreCase("nice") )
		// ? "go out" : "stay home" ;

		// System.out.println("THE ACTION according to weather is : " + action
	}

}

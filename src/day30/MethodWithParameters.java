package day30;

public class MethodWithParameters {
	
	public static void reverseString(String name) {
		for(int i= name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	
	public static void reportName(String firstName, String lastName) {
		System.out.println("the lenght of firstName :" + firstName.length());
		System.out.println("the lenght of firstName :" + lastName.length());
		System.out.println("the FI of firstName :" + firstName.charAt(0));
		System.out.println("the FI of lastName :" + lastName.charAt(0));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reportName("younes","mez");
		reverseString("younes");
		reverseString("mezi");
	
}
}
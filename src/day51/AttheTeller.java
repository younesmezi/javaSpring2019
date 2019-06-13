package day51;

public class AttheTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

SavingAccount s1= new SavingAccount("Ashraf", 12345, 11000,2.3); 
		
		System.out.println(s1.toString());
		s1.deposit(1);
		s1.deposit(1);
		
		System.out.println("current amount is " + s1.balance);
		s1.withdraw(10000);
		System.out.println("current amount is " + s1.balance);
	}

}

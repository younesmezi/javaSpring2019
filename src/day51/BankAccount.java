package day51;

public class BankAccount {

	public String accountName;
	public long accountNumber;
	public double balance;
	public BankAccount(String accountName, 
			long accountNumber, double balance) {
		//super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// toString method
	@Override
	public String toString() {
		return "BankAccount [accountName=" 
				+ accountName 
				+ ", accountNumber=" + accountNumber 
				+ ", balance=" + balance
				+ "]";
	}

	// deposit accept one int as parameter
	// and it changes the balance accordingly
	public void deposit(int money) {
		this.balance += money;
	}

	// withdraw accept one int as parameter
	// and it changes the balance accordingly
	public void withdraw(int money) {
		this.balance -= money;
}
}

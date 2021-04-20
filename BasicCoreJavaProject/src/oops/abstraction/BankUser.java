package oops.abstraction;

public class BankUser {
	
	public static void main(String[] args) {
	script(new HDFC());
	script(new ICICI());
	script(new SBI());
	}
	public static void script(RBI bank)
	{
		bank.savingsAccount();
		bank.currentAccount();
		bank.debitCard();
		bank.creditCard();
	}
}

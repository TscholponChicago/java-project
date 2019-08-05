package objectDataType;

public class BankAccount {

	String type, holderName;
	int accountNumber;
	double balance;
 
	public void deposit(double amount) {
		System.out.println(amount + " is deposited to your account ");
		balance += amount;
	}
	public void transfer(double amount) {
		System.out.println(amount + " is transferred from your account ");
		balance -= amount;
	}
	public void info() {
		System.out.println("Name : "+ holderName);
		System.out.println("Balance : "+ balance);
		System.out.println("Type : "+ type);
		System.out.println("Account number: "+ accountNumber);
	}


}

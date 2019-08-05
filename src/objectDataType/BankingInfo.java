package objectDataType;

public class BankingInfo {

	public static void main(String[] args) {
		BankAccount num = new BankAccount() ;
		num.accountNumber = 133234345;
		num.balance = 21_000;
		num.type = "Business";
		num.holderName ="Cholpon ZOMBI";
		num.deposit(232_000);
		num.transfer(1000);
		num.info();
        BankAccount num2 = new BankAccount();
        
	}

}

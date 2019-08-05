package selfStudy;

public class BankAccountInformation {

	public static void main(String[] args) {
		BankAcc b1 = new BankAcc();
		b1.holderName = "Cholpon Mashieva";
		b1.type = "Silver";
		b1.accountNum = 1234455634;
		b1.balance = 120.000;
		b1.info();
		b1.deposit(22.899);
		b1.info();
		b1.transfer(44.999);
		b1.info();

	}

}

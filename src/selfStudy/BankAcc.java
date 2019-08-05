package selfStudy;

public class BankAcc {
   String type, holderName;
   int  accountNum;
   double balance;
   
   public void deposit(double num) {
	  
	   System.out.println(num + " is deposited to your account.\n");
	   
	   balance += num;
   }
   public void transfer(double num1) {
	   System.out.println(num1 + " is transferred from your account.\n");
	   balance -= num1;
	   
   }
   public void info() {
	   System.out.println("Banking information:");
	   System.out.println("Type of card : "+ type);
	   System.out.println("Holder name : "+ holderName);
	   System.out.println("Account number : "+ accountNum);
	   System.out.println("Balance : "+ balance);
	   
   }
   
}

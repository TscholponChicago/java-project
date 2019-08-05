package povtoreniePropushennihTem;

public class BankAccount {
    String type;
    int  accountNumber;
    int balance;
    String holderName;
    public void deposit(double amount){
        System.out.println(amount + " is deposited to your account ");
        balance += amount;
    }
    public void transfer(double amount){
        System.out.println(amount +" is transferred to your account ");
        balance-=amount;
    }
    public void info(){
        System.out.println("Bank information: ");
        System.out.println("Name : "+holderName);
        System.out.println("Balance: "+balance);
        System.out.println("Type : "+type);
        System.out.println("Account Number: "+accountNumber);
    }
}

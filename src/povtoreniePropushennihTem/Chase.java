package povtoreniePropushennihTem;

public class Chase {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        bank1.accountNumber=124234341;
        bank1.balance =50000000;
        bank1.holderName="Hannamaria Ulanbek";
        bank1.type="checking";
        bank1.info();
        bank1.deposit(12000);
        bank1.transfer(4000);
        bank1.info();
    }

}

package DoWhileLoop;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
    
//	 int a = 2;	
//     do {
//    	 System.out.println("It is raining " + a);
//    	 a++;
//     }while(a < 20);
		
		//      TASK 1
	    /* write pro that keeps asking for transaction amount
	     * from user while user has sufficient amount of money.
	     * After each spending you need to adjust your balance
	     * var : balance, transaction amount, 
	     * flow: pls enter transaction amount:
	     * 200
	     * pls ent tran
	     * 100
	     * 5 you are broke
	     */
        Scanner scan = new Scanner(System.in);
        int balance = 1500;
        int transAmount;
        //Part II
        // when transaction is higher than balance
        // print transac amount is too high, try lower price and skip the
        //transaction proc to the next transaction, use continue
        // ask item name from the user per each transaction, if transaction is processed success print 
        // "% itemName purchesd succesf
        // if item name is AK-47 block the acoount, print Illegal item
        // and break the loop
        while(balance > 0) {
        	System.out.println("Please enter transaction amount:");
        	transAmount = scan.nextInt();
        	scan.nextLine();
        	System.out.println("Please what is your item 1?");
        	String item1 = scan.nextLine();
        	if(item1.equalsIgnoreCase("ak-47")) {
        	  System.out.println("illegal item");
        		break;
        		
        	} if(transAmount > balance) {
        	
        		 System.out.println("Transaction is too high.Try lower price");
        		 continue;
        	 }
        	 balance = balance - transAmount; // each time when we use money the balance goes down
        	 System.out.println("item1"+ "purchesed successuffllyy");
        	
        	}if(balance == 0) {
        		 System.out.println("You are broke!");
        	}
        System.out.println("Your balance : "+ balance);
        }
        
     
       
    
	}



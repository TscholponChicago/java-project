package ConstructorIntroWithTasks;

public class DebitCard {
   String  cardNum;
   String holderName,type;
   int pin;
   double balance;
   
 //TASK 1
 	//create class debitCard , declare inst var for cardNumber,holderName,
 	//type, pin, balance
 	//create constructor that accepts all 5 param
 	//to set all 4 instance vars.check for given type value
 	//type can only be "mastercard" or Visa
 	//Print "invalid type" and dont set values
 	//if it is not one o the valid options ,check for pin

   
   
   public  DebitCard(String holderName,String type,String cardNum, int pin,double balance) {
	   this.balance = balance;
	   this.cardNum = cardNum;
	   this.holderName = holderName;
	   this.pin = pin;
	   this.type = type;
	   
	   if(cardNum.length() == 16) {
		   this.cardNum =cardNum ;
	   }else {
		   System.out.println("Invalid card number");
	   }if(type.equalsIgnoreCase("mastercard") || type.equalsIgnoreCase("visa")) {
		   this.type = type;
	   }else {
		   System.out.println("invalid card type");
	   }
	   String pinStr = pin + "";
	   if(pinStr.length() == 4) {
		   this.pin = pin;
	   }else {
		   System.out.println("Invalid pin");
	   }
   }
  
}

package selfStudy;

import java.util.Random;
import java.util.Scanner;
public class FirstOldTasks {

	public static void main(String[] args) {
		//task 3
//Random ran = new Random();
//int randomNum= ran.nextInt(10);
//int remainder = randomNum % 2;
//System.out.println(randomNum);
//if(remainder == 0) {
//	System.out.println("Number is even");
//}else {
//	System.out.println("Number is odd");
//}
				
//	TAsk 4
	
	Scanner scan = new Scanner(System.in);


//	String userName = "test";
//	String userName2 = "james";
//	
//	System.out.println("Pls enter user name: ");
//	String enteredUser = scan.nextLine();
//	if(enteredUser.equals(userName) || enteredUser.equals(userName2)) {
//		System.out.println("User name existets!");
//	}else {
//		System.out.println("User name created!");
//	}
//	System.out.println("Please guess a number:");
//	
//	
//	int guessedNum = scan.nextInt();
//	Random ran = new Random();
//	int secretNum = ran.nextInt(10);
//	boolean found;
//	if(guessedNum == secretNum) {
//		System.out.println("Congrats!");
//		found = true;
//	}else if(guessedNum < secretNum) {
//		System.out.println("your guess is too low");
//	}else {
//		System.out.println("Your guess is too high");
//	}
//	
//	System.out.println("Pls enter message:");
//	String message = scan.nextLine();
//	boolean sent;
//	int leng = message.length();
//	if(leng >=15) {
//		
//		sent = true;
//	}else {
//		sent = false;
//		
//	}
//	System.out.println("Message:"+message);
//	System.out.println("Sent:"+sent);
//	
	
	System.out.println("Pls enter message:");
	String message = scan.nextLine();
	
	boolean sent, delivered;
	
	Random ran = new Random();
	int rand = ran.nextInt(10);
	if(rand % 2 == 0) {
		sent = true;
		delivered = true;
		//System.out.println("Delivered:"+true);
	}else {
		sent = false;
		delivered = false;
		System.out.println("Delivered:"+false);
		
	}
	System.out.println("Message: "+message);
	System.out.println("Sent: "+sent);
	System.out.println("Delivered: "+delivered);
	
	
	
	}
}

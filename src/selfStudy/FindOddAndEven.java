package selfStudy;

import java.util.Random;
import java.util.Scanner;
public class FindOddAndEven {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		//TASK 1
//	int num1, num2, num3;
//	System.out.println("Pls enter three numbers:");	
//    num1 = scan.nextInt();
//	num2 = scan.nextInt();
//	num3 = scan.nextInt();
//	if(num1 >= num2 && num1 >= num3) {
//		System.out.println("Maximum value of "+num1 +" ,"+num2+", "+num3+" is: "+num1);
//	}else if(num2 >= num1 && num2 >=num3) {
//		System.out.println("Max number:"+num2);
//	}else if(num3 >= num1 && num3 >= num2) {
//		System.out.println("Max num:"+ num3);
//	}else {
//		System.out.println("these numbers are equal");
//	}      TASK 2
		
//   System.out.println("Pls enter two doubles:");		
//	double a, b, calculate;
//	String operator = "";
//	a = scan.nextDouble();
//	b = scan.nextDouble();
//	System.out.println("Pls choose operator from below : +, -, *, /");
//	operator = scan.next();
//	switch (operator) {
//	case "+":
//		System.out.println("Result is :"+ (a+ b));
//		break;
//	case "-":
//		System.out.println("Result is :"+(a-b));
//		break;
//	case "*":
//		System.out.println("Result is :"+(a * b));
//		break;
//	case "/":
//		System.out.println("Result is :"+(a/ b));
//		break;
//		
//	}
//	                 TASK 3
//		Random a = new Random();
//		int num = a.nextInt(100);
//		if(num % 2 == 0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
//		System.out.println(num);
//		
//        TASK 4
//	System.out.println("Pls enter guess randomly number:");	
//	Random number =  new Random();
//	int choosed = number.nextInt(10);
//	int guessedNumber = scan.nextInt();
//	if(choosed == guessedNumber) {
//	   System.out.println("Congrats!");
//	}else if(guessedNumber < choosed) {
//		System.out.println("your guess is too low"+choosed);
//	}else {
//		System.out.println("Your guess is too high"+choosed);
//	}
//         TASK 5
		
		
		
//   String message;
//   boolean sent;
//	System.out.println("Pls enter the message:");
//	message = scan.nextLine();
//	if(message.length() >= 15) {
//		sent = true;
//		System.out.println("Message: "+message);
//		System.out.println("Sent: "+sent);
//	}else {
//		sent =false;
//		System.out.println(sent);
//	}
	// TASK 6
//	boolean campusOpen;
//	System.out.println("Plz enter time:");
//	int time = scan.nextInt();
//	
//	if(time >= 0 && time < 24) {
//		if(time >= 8 && time <= 23) {
//			campusOpen = true;
//			System.out.println("Campus open:"+campusOpen);
//		}else {
//			campusOpen = false;
//			System.out.println("Campus open: "+campusOpen);
//		}
//		
//	}
//	else {
//		System.out.println("Invalid time.Try again");
//	}
	
	// task 7
		
     String sent = scan.next();
     boolean multipleWord;
	 System.out.println("Pls enter a sentence");
	 sent = scan.nextLine();
	 sent = sent.trim();
	 /*
	  * modify a program to check if user entered some data or empty string
	  * if user entered empty string then print "pls enter data"
	  * if user entered valid data then check if multiple words or not
	  */ 
	  
	 boolean check =sent.contains(" ");
	 
	 if(sent.isEmpty()) {
		 System.out.println("PLS enter infor:");
	 }else {
	     if(sent.contains(" ")) {
	    	
		  multipleWord = true;
		 }else {
	   multipleWord = false; 
	 }
	System.out.println("Multiple words: "+multipleWord);
		
	 }	
	}
}	
	



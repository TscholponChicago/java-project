package selfStudy;

import java.util.Scanner;
public class mentWithErnist {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
//    System.out.println("Please enter 3 integers:");
//	  int num1 = scan.nextInt();
//	  int num2 = scan.nextInt();
//	  int num3 = scan.nextInt();
//	  if(num1 >= num2 && num1>= num3) {
//		  System.out.println("Maximum value of 3, 32, and 21 is:"+ num1);
//	  }else if(num2>= num1 && num2>= num3) {
//		  System.out.println("Maximum value of 3, 32, and 21 is: "+num2);
//	  }else if(num3>= num1 && num3>=num2) {
//		  System.out.println("Maximum value of 3, 32, and 21 is: "+num3);
//	  }else if(num1 == num2 && num1 == num3){
//		  System.out.println("All integers are equal.");
//	  }
	 
		System.out.println("Please enter two double values:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double total;
		
		System.out.println("Please choose an operator from below options:");
        
//		String plus ="+";     MY TRIES
//		char minus = '-';
//		char multi = '*';     
//		char divis = '/';
//		double total1 =a-b;
//		double total2 =a+b;
//		double total3 =a*b;
//		double total4 =a*b;    AND THEY ARE NOT WORKING
		
		scan.nextLine();
		String operator = scan.nextLine();
		switch (operator) {
		    case "-":
		    	total=a-b;
			 System.out.println("Result of "+"a-b"+" is "+total );
		    break;
		    case "+":
		    	total=a+b;
		     System.out.println("Resul of "+"a+b"+" is "+total);
		    break;
		    case "*":
		    	total=a*b;
		    System.out.println("Result of "+"a*b"+ " is "+total);
		    break;
		    case "/":
		    	total=a/b;
		    System.out.println("Result of "+"a/b "+" is "+total);
		    break;
		    default:
		    	if(!(operator=="+" || operator =="-" || operator == "*" || operator =="/")) {
		    		System.out.println("Error!");
		    	}
		}
		
		
		
		
		
		
		
		
	}

}

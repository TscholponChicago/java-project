package selfStudy;

import java.util.Scanner;
public class WarmUpSwitch {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	double num1, num2, result = 0;
	String operator;
	boolean invalidOperator = false;
	System.out.println("Please enter two numbers:");
	num1 = scan.nextDouble();
	num2 = scan.nextDouble();
	System.out.println("Please choose operator from below options: +, -, *, /");
	operator = scan.next();
	switch(operator) {
	case "+":
		result = num1+ num2;
		System.out.println("Result is "+result);
		break;
	case "*":
		result = num1 * num2;
		System.out.println("Result is "+ result);
		break;
	default:
		System.out.println("Invalid operator. Try again");
		invalidOperator = true;
	}
	if(invalidOperator) {
		
	}else {
		
	}
	   System.out.println("Result of "+ num1 + " "+operator + " " + num2 + " is "+result);
	
		
		
		
	}

}

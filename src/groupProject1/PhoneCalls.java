package groupProject1;

import java.util.Scanner;
public class PhoneCalls {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of calls");
	double calls = scan.nextDouble();
	double total =0;
	double num1 =200+(calls-100)*0.60;
	double num2 =200+(50*0.60)+(calls -150)*0.50;
	double num3 =200+(50*0.60)+(calls -200)*0.40;	
    double num4 =200;
    
    if(calls > 0 && calls <= 100) {
    	System.out.println("Your total is "+"$"+(total+num4));
    }else if(calls > 100 && calls <= 150) {
    	System.out.println("Your total is "+"$"+ (total+ num1));
    }else if(calls <=200) {
    	System.out.println("Your total is "+"$"+ (total +num2));
    }else if(calls > 200) {
    	System.out.println("Your total is "+"$"+ (total + num3));
    }else {
    	
    }
    
    
	
	}

}

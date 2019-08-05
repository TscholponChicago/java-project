package selfStudy;

import java.util.Scanner;
public class SwitchBoolean {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
//      System.out.println("Please enter 2 numbers:");
//      int num1 = scan.nextInt();
//      int num2 = scan.nextInt();
//      int result;
//      System.out.println("Please choose operator: + or -");
//      scan.nextLine();
//      String operators = scan.next();
//      
//      switch (operators) {
//    	  case "+":
//    		  result=num1 + num2;
//    		  System.out.println("Result is : "+result);
//      
//          break;
//    	  case "-":
//    		  result=num1 -num2;
//    		  System.out.println("Result is : "+result);
//    		  break;
//	}
        System.out.println("Enter one number:");
        int num1 = scan.nextInt();
       
        
        scan.nextLine();
       // int words = scan.nextInt();
        switch (num1) {
        case 1:
        	System.out.println("one");
        	break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        	default:
        	System.out.println("Error");
        }
        	
}
}
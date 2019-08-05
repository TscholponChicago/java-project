package mentor;

import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
   /*Write a program that asks two int from user
    * and find the max number
    * PSEUDO CODE
    * a) create scanner
    * b) read 2 int and store them into variables num1, num2
    * c) use if statement, we compare num1 to num2
    * d) print max number is condition meets
    */
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter any two numbers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
  
//    if(num1 > num2) {
//    	System.out.println(num1+" is max number");
//    }else {
//    	System.out.println(num2+"num is max");
//    }
    if(num1 > num2) {
    	System.out.println(num1+" is max number");
    }else if(num2 > num1) {
    	System.out.println(num2+" is max number");
    }else if(num1 == num2) {
    	System.out.println("These numbers are  equal");
    }else {
    	System.out.println("It's an invalid pattern");
    }
    
    
  }
}
package selfStudy;

import java.util.Scanner;

public class CompareWithIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
      int age = scan.nextInt();
      if(age > 0 && age <= 120) {
    	  System.out.println("Valid age");//for 15 it prints valid age because 15 is less then 120
    	  
    	   if(age >= 21) {
    	
    	 System.out.println("Welcome to club");
    	 
     }else {
    	  System.out.println("Not enough age");
    	  int diff = 21 - age;
    	  System.out.println("Come after "+diff+ " years");
     }
      }else {
    	  System.out.println("Invalid age");
      }
      
     
		
		
		
		
    
    
    

	}
}


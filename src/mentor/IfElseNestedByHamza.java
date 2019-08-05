package mentor;

import java.util.Scanner;

public class IfElseNestedByHamza {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//     int a;
//     System.out.println("Enter number");
//     
//     a = scan.nextInt();
//     if( a > 50) {
//    	 System.out.println("It's greater than 50");
//     }else {
//    	 System.out.println("it's less than 50");
//     }
    
    System.out.println("Pls  enter any number");
    int a = scan.nextInt();
    int remainder = a % 2;
    if(remainder == 0) {
    	
    	System.out.println("even");
    }else{
    	
    	System.out.println((a * 3)- 1);
    }
    
    
    
     
	}

}

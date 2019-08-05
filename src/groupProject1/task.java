package groupProject1;

import java.util.Scanner;
public class task {
	
	public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);

   int age = 19;
   if(age >= 21 ) {
	   System.out.println("Welcome to club");
   }else {
	   System.out.println("Not enough age");
	   int diff = 21 - age;
	   System.out.println("Pls come after "+ diff+" years");
   }
	
	
	
		
	}
	
	

}

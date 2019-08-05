package selfStudy;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {

        int book = 12;
        if(book < 3) {
        	System.out.println("Can I borrow some?");
        }else {
       	System.out.println("I see. You don't have extra.");
        }
        String name = "Cholpon";
        String name1 = "Cholpon";
        if(name.equals(name1)) {
        	System.out.println("I got you!");
        }else {
        	System.out.println("Invalid name!");
        }
        int books = 22;
        int toys = 22;
        if(books > toys) {
        	System.out.println("books are more");
        }else if(books < toys) {
        	System.out.println("toys are more");
        }else {
        	System.out.println("they are equal");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter user name and a password");
        
        String userName = scan.nextLine();
        String password = scan.nextLine();
        
        String validName = "Alatoo";
        String validPass = "abc199";
        if(userName.equals(validName) && password.equals(validPass)) {
        	System.out.println("Good job! You loged in.");
        }else {
        	System.out.println("Sorry.Try again.");
        }
        
        System.out.println("Please enter your current speed:");
        int speed = scan.nextInt();
        if(speed > 70) {
        	System.out.println("Slow down!");
        }else {
        	System.out.println("Keep it !");
        }
        
        
        
        
	}

}

package selfStudy;

import java.util.Scanner;
public class IfStatement1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userName = "Cholpon";
		String password = "abc123";
		
		System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        
        System.out.println("Please enter a password:");
        String pass = scan.nextLine();
        
        if(name.equals(userName) && pass.equals(password)) {
        	System.out.println("Welcome, "+userName);
        }else if(!name.equals(userName) && pass.equals(password)) {
        	System.out.println("Invalid name.");
        }else if(name.equals(userName) && !pass.equals(password)) {
        	System.out.println("Invalid password.");
        }else {
        	System.out.println("Invalid credentials.");
        }
        
		
	}

}

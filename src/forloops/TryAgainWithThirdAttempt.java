package forloops;

import java.util.Scanner;

public class TryAgainWithThirdAttempt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int attempts = 0;
		for(;;) {
			System.out.println("Pls enter your password:");
			String password = scan.nextLine();
			attempts++;
			if(password.equals("secret478")) {
				System.out.println("Welcome to your profile!");
				break;
			} if(attempts == 3) {
				System.out.println("Sorry. You account is locked!!Try again in 5 hours.");
				break;
			}	
		
		
		}
		int tr = 0;
		for(;;) {
			System.out.println("give me candy");
			String ans = scan.next();
			tr++;
			if(ans.equalsIgnoreCase("ok")) {
				System.out.println("thnks");
				break;
			}if(tr == 2) {
				System.out.println("sorry, i dont have any");
				break;
			}
		}
		
		
		
		
		
	}

}

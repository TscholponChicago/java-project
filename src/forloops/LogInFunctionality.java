package forloops;

import java.util.Scanner;

public class LogInFunctionality {

	public static void main(String[] args) {

      /*
       * 
       * 
       * 
       * 
       */
		Scanner scan = new Scanner(System.in);
		for(;;) {
			String password = scan.nextLine();
			if(password.equals("secret478")) {
				System.out.println("Welcome to your profile!");
				break;
			}else {
				System.out.println("Try again!");
			}
		}
		for(;;) {
			String anim = scan.next();
			if(anim.equals("tiger")) {
				System.out.println("it's a wild animal");
				break;
			}else {
				System.out.println("any pet?");
			}
		}
		
		
		
	}

}

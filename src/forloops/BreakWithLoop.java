package forloops;

import java.util.Scanner;

public class BreakWithLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
  // break the loop after "Hello" printed 13 times
		for(int a = 0; a <= 20; a++) {
			if(a <=13) {
				System.out.println("Good morning! "+a);
			}else {
				break;
			}
			
		}
		for(;;) {
			String answ = scan.next();
			if(answ.equalsIgnoreCase("hi")) {
				System.out.println("hello");
			}else if(answ.equals("bye")) {
				break;
			}
		}
		for(;;) {
			String pass = scan.next();
			if(pass.equalsIgnoreCase("123chopA")) {
				System.out.println("Welcome to profile");
				break;
			}else {
				System.out.println("Try again!");
			}
		}
		String weather = scan.next();
		for(;;) {
			if(weather.equals("warm")) {
				System.out.println("let's go outside");
				break;
			}else {
			System.out.println("let's sit at home");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
    
  }
	
}	
	
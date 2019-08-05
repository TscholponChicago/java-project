package forloops;

import java.util.Scanner;

public class AskInfinitly {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
	 for(;;) {
		String answer = scan.nextLine();
		if(answer.equalsIgnoreCase("hi")) {
			System.out.println("Hello!");
		}else if(answer.equals("bye!")) {
			System.out.println("Good- Bye!");
		}else {
			System.out.println("ignore");
		}
	}
	//System.out.println("This is the end of program.");
		
	
	
	
	
	
		
		
		
	
	}
}

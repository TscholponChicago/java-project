package forloops;

import java.util.Scanner;

public class MommyGiveMeCandyWithLoop {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
			for(int i = 1; i > 0; i++) {
				String answer = scan.nextLine();
				if(answer.equalsIgnoreCase("hi")) {
					System.out.println("Hello!");
				}else if(answer.equals("exit")) {
					break;
					
				}else {
					System.out.println("Good- Bye!");
				}
			}
		

	}

}

package String;

import java.util.Scanner;
public class NoU {

	public static void main(String[] args) {
		/* write program that asks message from user
		 * replace all 'u" and 'U' with empty string
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter a mess");
		String  mess = scan.nextLine().toLowerCase();
		String repl = mess.replace("u", " ");
		System.out.println(repl);
		
		
		
	}

}

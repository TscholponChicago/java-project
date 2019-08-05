package String;

import java.util.Scanner;
public class NoNegativity {

	public static void main(String[] args) {
		
		/*write progr that akss message from user
		 * replace word "hate" with "love"
		 * print new version of the message
		 * I hate youuu!--> I love youuu!
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter sent");
		String sent = scan.nextLine().toLowerCase();
		//sent = sent.replace("hate", "love");
		if(sent.contains("hate")){
			String repl = sent.replace("hate","love");
			System.out.println(repl);
		}else {
			System.out.println("invalid");
		}
		
		
		
	}

}

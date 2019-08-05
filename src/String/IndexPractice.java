package String;

import java.util.Scanner;
public class IndexPractice {

	public static void main(String[] args) {
		String breed = "Huskeys";
		int i = breed.indexOf('s');
		System.out.println(i);
		
		int b =breed.indexOf('s', 3);
		System.out.println(b);
		
		int t = breed.indexOf("ke");
		System.out.println(t);
		String word = "international";
		int c = word.indexOf('t', 3);
		System.out.println(c);
		
		/* write a program that detects bad words
		 * heck, silly, idiot
		 * ask user to enter a messag to send, checkc if messag contains above bad words
		 * if message contains any of those words print " message failed"
		 * otherwise print message sent
		 * NOTE: you must use indexOf method
		 */
		Scanner input = new Scanner(System.in);
		//String message = "heck, silly, idiot";
		
		System.out.println("Please enter a message:");
		String mess = input.nextLine().toLowerCase().trim(); // this trim helps me to unactivate spase that I input
		
		int first = mess.indexOf("heck");
		int second = mess.indexOf("silly");
		int third = mess.indexOf("idiot");
		
		System.out.println(first +", "+ second+", "+third);
		if(first == -1 && second == -1 && third == -1) { //first >=0 && second>=0 && third >=0) this gives me MESSAGE FAILED
			System.out.println("Message sent!");
		}else {
			System.out.println("Message failed!");
		}
		
		// to use 0. Look at line 38.Here we can : If(first >=0 || second> = 0 || third >=0  so Sysout will be "message failed!" else message sent		
		
		String word1 = "My friend";
		String v= word.substring(3);
		System.out.println(v);
		
		
	}

}

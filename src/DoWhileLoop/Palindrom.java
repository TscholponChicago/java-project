package DoWhileLoop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = scan.nextLine();
		int lastIndex = word.length()-1;
		boolean check = true;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != word.charAt(lastIndex)) {
				System.out.println("Not palindrom");
				check = false;
				break;
			}
			lastIndex--;
		}if(check) {
			System.out.println("Palindrom");
		}
		
	}

}

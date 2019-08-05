package selfStudy;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
		String word = scan.nextLine();
//		boolean same = true;
//		int lastIndex = word.length()-1;
//		for(int a = 0; a < word.length(); a++) {
//			if(word.charAt(0) != word.charAt(lastIndex)) {
//				same = false;
//				System.out.println("Not Palindrom");
//				break;
//			}
//			lastIndex--;
//		}if(same) {
//			System.out.println("Palindrom");
//		}
		
		//--------------------------------
		String reversed = "";
		
		for(int a = word.length()-1; a >= 0; a --) {
			reversed = reversed + word.charAt(a);
			
		}if(word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not palindrom");
		}
		
		
		
		}
		
	}



package selfStudy;

import java.util.Scanner;

public class UniqueLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter a word");
		String word = scan.next();
		String uni = "";
		for(int a = 0; a < word.length(); a++) {
			char letter = word.charAt(a);
			if(uni.contains(letter + "")) {
				continue;
			}
			uni += letter;
		}
		System.out.println(uni);
		
		
		
		
		

	}

}

package DoWhileLoop;

import java.util.Scanner;

public class SameLetters {

	public static void main(String[] args) {
		
		String str = "a";
		char s = str.charAt(0);
		System.out.println(s);
		/*use charAt method and loop
		 * read the word and store into String
		 * read second word and convert it to char
		 * iterate trough the char of word
		 * each chars you iterate keep checking with given char
		 * if same count it, if not 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = scan.nextLine().toLowerCase();
		System.out.println("Pls enter a char");
		char c = scan.next().charAt(0);
		
		System.out.println(word);
		System.out.println(c);
		int counter =0;
		for(int i = 0; i < word.length(); i++) {
			if(c == word.charAt(i)) {
				counter++;
			}
			
		}
		System.out.println(counter);
		
	}

}

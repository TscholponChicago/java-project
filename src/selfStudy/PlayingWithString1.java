package selfStudy;


import java.util.Scanner;
public class PlayingWithString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Plz enter a word:");
		String word = scan.nextLine();
		
		int length = word.length();
		System.out.println(length);

        int divide = word.length() / 2;
		System.out.println(divide);
		
		String justLetters = word.substring(divide-1, divide+2);
		System.out.println(justLetters);
		
	}

}

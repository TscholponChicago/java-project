package selfStudy;

import java.util.Scanner;

public class makeCapitMiddleLetters {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a word:");
    int middle; String middleTwo;
	String word = scan.nextLine().toLowerCase();
	int length = word.length();
	middle = length /2;
	if(length % 2 == 1) {
	 
		System.out.println(word.substring(middle).toUpperCase());
	}if(length % 2 == 0) {

	middleTwo = word.substring(middle, middle+ 2);
	}
	}

}

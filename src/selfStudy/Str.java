package selfStudy;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a word:");	
	String word1 = scan.nextLine();
	
	System.out.println("Please enter second word:");
	String word2 = scan.nextLine();	
	
	int length1 = word1.length();
	int length2 = word2.length();
	
	if(length1 > length2) {
		System.out.println(word2+word1+word2); 
	}else if(length1 < length2) {
		System.out.println(word1 + word2 + word1);
	}
	
	
	
	
	
	
	}

}

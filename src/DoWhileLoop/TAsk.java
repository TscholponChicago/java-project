package DoWhileLoop;

import java.util.Scanner;

public class TAsk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter a word:");
		String word = scan.nextLine();
		int length = word.length();
	
		for(int index = 0; index <= length-1; index++) {
			char m = word.charAt(index);
			System.out.println(m);
		}
		
		
	}

}

package DoWhileLoop;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = scan.nextLine();
		String reversed = "";
		
		for(int index = word.length()-1; index >=0; index -- ) {
			
			reversed += word.charAt(index);
		}if(word.equalsIgnoreCase(reversed)) {
		System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		
	}

}

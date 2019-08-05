package inputs;

import java.util.Scanner;
public class Color {
	public static void main(String[] args) {
//		int books = 70;
//		books %= 60; // minutes=minutes%60;
//		System.out.println(books);
//		books*=3;    // minutes = minutes*3;  10 * 3 =30
//		System.out.println(books);
		
		Scanner scan = new Scanner(System.in);
		String sent = scan.next();
	     boolean multipleWord;
		 System.out.println("Pls enter a sentence");
		 sent = scan.nextLine();
		 boolean check =sent.contains(" ");
		 if(sent.contains(" ")) {
			 multipleWord = true;
			 
		 }else {
		   multipleWord = false; 
		 }
		System.out.println("Multiple words: "+multipleWord);
			
		
		
		
		
		
		
		
		
		
	}

}

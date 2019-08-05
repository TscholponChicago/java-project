package selfStudy;

import java.util.Scanner;
public class sentWithSpaces {

	public static void main(String[] args) {

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

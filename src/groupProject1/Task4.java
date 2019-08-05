package groupProject1;

import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     String sent;
    boolean multipleWords;
   
	System.out.println("plz enter a sentence:");	
    sent  = scan.nextLine();
    sent = sent.trim();// removes spaces from front and back
   // boolean check = sent.contains(" ");  
	if(sent.contains(" ")) {
		multipleWords = true;
	}else {
		multipleWords = false;
	}
       System.out.println("Multiple words: "+multipleWords);
	}

}

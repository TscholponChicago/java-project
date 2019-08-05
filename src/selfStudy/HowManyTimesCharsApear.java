package selfStudy;

import java.util.Scanner;

public class HowManyTimesCharsApear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = scan.next().toLowerCase();
        String store = "";
        int [] count = new int[word.length()];
        for(int a = 0; a < word.length(); a++) {
        	char letter = word.charAt(a);
        	if(store.contains(a + "")) {
        		continue;
        	}
        for(int b = a; b < word.length(); b++) {
        	char letter2 = word.charAt(b);
        	if(a == b) {
        		count[a]++;
        	}
        }	
        	store += letter;
        	System.out.println(letter + ":" + count[a]  + "");
        }
	 	
		
	}

}

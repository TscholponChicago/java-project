package selfStudy;

import java.util.Scanner;

public class cuttingX {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		if(word.charAt(0) =='x' && word.charAt(1) == 'x') {
			System.out.println(word.substring(2));
		}else if(word.charAt(0) == 'x' ) {
			System.out.println(word.substring(1));
		}else if(word.charAt(1) == 'x') {
			System.out.println(word.substring(0,1).concat(word.substring(2)));
			
		}else {
			System.out.println(word);
		}
		
		

	}

}

package mentor;

import java.util.Scanner;

public class FindMaxLengthInStringArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = new String[5];
		for(int a = 0; a < words.length; a++) {
			words[a] = scan.nextLine();
		}
		String s = "";
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j < words.length; j++) {
				if(words[i].length() > words[j].length() && i != j) {
					s = words[i];
				}
			}
		}
		System.out.println(s);
	}

}

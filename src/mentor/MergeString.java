package mentor;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String one = scan.nextLine();
		String two = scan.nextLine();
		String merged = "";
		if(one.length() > two.length()) {
			for(int a = 0; a < two.length();a++) {
				merged += one.charAt(a) + "" + two.charAt(a)+"";
			}
			merged += one.substring(two.length());
		}else if(one.length() < two.length()) {
			for(int a = 0; a < one.length(); a++ ) {
				merged += one.charAt(a) + "" + two.charAt(a) + "";
			}
			merged += two.substring(one.length());
		}else {
			for(int a = 0; a < one.length(); a++) {
				merged +=one.charAt(a) + "" + two.charAt(a) + "";
				
			}
		}
		System.out.println(merged); 
	}

}

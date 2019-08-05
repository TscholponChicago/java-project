package selfStudy;

import java.util.Scanner;

public class bad {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		boolean a = hasBad(str);
		
	}
	public static boolean hasBad(String str) {
		
		if(str.length() >= 3) {
			if(str.indexOf("bad") == 0 || str.indexOf("bad")==1) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

}

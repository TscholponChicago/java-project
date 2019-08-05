package selfStudy;

import java.util.Scanner;

public class CheckElementUsingBoolean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] arr = {scan.nextLine(), scan.nextLine(),scan.nextLine()};
		String word = scan.nextLine();
		//contains(word);
		System.out.println((word));
	}
	
	
	public static boolean contains(String word) {
		Scanner scan = new Scanner(System.in);
	
		String[] arr = {scan.nextLine(), scan.nextLine(),scan.nextLine()};
		boolean check = false;
		for(int a = 0; a < arr.length; a++) {
			if(arr[a].equals(word)) {
				check = true;
				return true;
			}
		}
		return false;
	
	}
}

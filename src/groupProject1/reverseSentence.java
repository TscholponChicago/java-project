package groupProject1;

import java.util.Scanner;

public class reverseSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String result = "";
		String [] arr = str.split(" ");
		for(int a = arr.length -1; a >= 0; a--) {
			result +=" " +arr[a];
		}
		System.out.print(result.trim());
	}

}

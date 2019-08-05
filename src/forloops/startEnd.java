package forloops;

import java.util.Scanner;

public class startEnd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
		int start = scan.nextInt();
		int end = scan.nextInt();
		for(int a = 0; a < end; a++) {
			if(start <= end) {
				System.out.println("Step "+ a);
			}if(start >= end) {
				System.out.println("Step "+ a);
			}
		}
		
	}

}

package selfStudy;

import java.util.Scanner;

public class CountEachChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = scan.next().toLowerCase();
		int count = 0;
		for (int a = 0; a < word.length(); a++) {
			if (a > word.indexOf(word.charAt(a))) {
				continue;
				//	count = 1;
//				for (int b = 0; b < word.length(); b++) {
//					if (a == b) {
//						continue;
////			if(word.charAt(a) == word.charAt(b) + ":" + count + " ");
////			}
//						System.out.println();
//					}
//				}
//			}
//
//
//		}

			}}}}
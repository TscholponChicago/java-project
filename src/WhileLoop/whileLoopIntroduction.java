package WhileLoop;

import java.util.Scanner;

public class whileLoopIntroduction {

	public static void main(String[] args) {

//       int secretNum = 45;
//       Scanner scan = new Scanner(System.in);
//       System.out.println("guess the number:");
//       int guess = scan.nextInt();
//       
//       while(guess != secretNum) {
//    	   System.out.println("Wrong! Enter your guess:");
//    	   guess = scan.nextInt();
//       }
//		System.out.println("Congrats!");
		int a = 0;
		while (7 > 4) {
			a++;
			System.out.println("Hi!" + a);
			if (a == 4) {
				break;
			} else if (a == 2) {
				continue;
			}

		}

		System.out.println("End of while loop");

	}

}

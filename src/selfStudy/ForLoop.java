package selfStudy;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		for(int a = 0; a <= 100; a++) {
			if(a % 2 == 0) {
				System.out.print(a +" ");
			}
		}	
		System.out.println(); 
				
		for(int b = 0; b <= 100; b++) {
			if(b % 2 == 0) {
				//
				System.out.print(b +" ");
		}	
			}
			
		int sumOdd = 0;
		int sumEven = 0;
		for(int c = 0; c <= 100; c++) {
			if(c % 2 == 1) {
				sumEven += c;
				
			}else {
				sumOdd += c;
			}
			
		}
		
		System.out.println("Sum of even "+ sumEven);
		System.out.println("Sum of odd "+ sumOdd);
		
			
		
		
		
	}

}

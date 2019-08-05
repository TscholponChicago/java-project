package selfStudy;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
//		printName("Cholpon");
//        printObj("book");
//        printOb("kids",2);
//        nums(23,22);
//        printN("Chopa");
        printOdd();
        welcomePpl("Rose");
        printOddN(10);
	}
//	public static void printName(String name) {
//		System.out.println(name);
//		System.out.println("Chikita");
//		
//	}
//	public static void printObj(String obj) {
//		System.out.println(obj);
//	}
//	public static void printOb(String str, int num) {
//		System.out.println(str);
//		System.out.println(num);
//	}
//	public static void nums(int a , int b) {
//		System.out.println(a + b);
//		System.out.println(a - b);
//	}
//	public static void printN(String name) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your name:");
//		String ss = scan.nextLine();
//	}
	public static void printOdd() {
		for(int i = 0; i < 20; i ++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
	
	public static void welcomePpl(String name) {
		System.out.println("Welcome "+ name);
	}
	public static void printOddN(int limit) {
		for(int i = 0; i < limit; i ++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	}



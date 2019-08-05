package ConstructorIntroWithTasks;

import java.util.Scanner;

public class PhoneInfo {

	public static void main(String[] args) {
//	Phone p1 = new Phone("Iphone X","Silver");
//	p1.text(1234567891,"hi dear");
//	p1.call(1234567891);
	Scanner scan = new Scanner(System.in);
	System.out.println("Can you give an information about your phone?");
	System.out.println("What is your phone model?");
	String m= scan.nextLine();
	System.out.println("What is a color of your phone?");
	String c = scan.nextLine();
	Phone p1 = new Phone(m,c);
	System.out.println("Pls enter phone number to call");
	long pn = scan.nextLong();
	p1.call(pn);
	}

}

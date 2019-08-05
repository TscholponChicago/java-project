package selfStudy;

import java.util.Scanner;
public class scanExample1 {
	
	public static void main(String[] args) {
		
		// to find how old you are
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter current year:");
//		int currentYear = scan.nextInt();
//		
//		System.out.println("When were you born?");
//		int born = scan.nextInt();
//		
//		System.out.println("Now I can learn your age.");
//		int age = currentYear - born;
//		
//		System.out.println("You are "+ age +" years old.");
//		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("*****WELCOME TO ROSS******");
		System.out.println("---------------------------");
		System.out.println("How many dollars do you have?");
		
		double money = input.nextDouble();
		
		System.out.println("What do you need to buy?");
		String shoes = input.next();
		String bag = input.next();
		String toy = input.next();
		
		System.out.println("How much do shoes cost?");
		double priceShoes = input.nextDouble();
		
		System.out.println("How much does that bag cost?");
		double priceBag = input.nextDouble();
		
		System.out.println("How much does a toy cost?");
		double priceToy = input.nextDouble();
		
		double totalSum = priceShoes + priceBag + priceToy;
		System.out.println("Here is your receipt "+totalSum +" dollars!");
		
		System.out.println("*******Thank you for shopping with ROSS**********");
		
		
	}
	
	

}

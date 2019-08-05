package DoWhileLoop;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------Welcome to our store------");
		System.out.println("****REGISTRATION*****");
		System.out.println("How many items do you want to buy?");
		int itemsTotal = scan.nextInt();
		double totalPrice = 0;
		String allItems = "";
		
		for(int i = 1; i < itemsTotal; i++) {
			System.out.println("What is "+ i +" item?");
			String item = scan.next();
			
			System.out.println("How much "+ item +" cost?");
			double itemPrice = scan.nextDouble();
			
			if(i == itemsTotal) {
				allItems = allItems + item;
				
			} else {
				allItems = allItems + item+", ";
			}
			totalPrice = totalPrice + itemPrice;
			
		}
		
		System.out.println("Your items: "+allItems);
			System.out.println("Your total price: "+ totalPrice);
			
	}
}

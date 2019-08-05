package ConstructorIntroWithTasks;

import java.util.Scanner;

public class Items {
	
	public static void main(String[] args) {
		//TASK Create program, 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items do you want to add to your inventory?");
		
		int size = scan.nextInt();
		scan.nextLine();
		Item [] myItems = new Item[size];
		
		for(int a = 0; a < size; a++) {
			
			System.out.println("What is item : "+(a+1));
			String itemName = scan.nextLine();
			System.out.println("How much is item: "+(a+1));
		    double price = scan.nextDouble();
			scan.nextLine();
			Item item = new Item(itemName, price);
			myItems[a] = item;
			scan.nextLine();
		}
		for(Item i : myItems) {
			i.info();
		}
		// or we can do:  for(int a  =0; a < myItems.length; a++){
		//myItems[a].info();
		//}
	}

}

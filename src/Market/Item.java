package Market;

import java.util.ArrayList;

public class Item {
String name;
double price;
String made;
int quantity;
double balance;

static double generalBalance;
ArrayList<Item> listOfItems= new ArrayList<>();

public void addItem(Item item) {
	listOfItems.add(item);
}
public Item() {
	
}

public void comeIn(String name, double price, String made, int quantity) {
	this.name=name;
	this.price=price;
	this.made=made;
	this.quantity=quantity;
	this.balance=this.price*this.quantity;
	
	System.out.println(this.name+" Balance in warehaouse is: "+balance);
	generalBalance+=balance;
}

public static void geneBalance() {
	System.out.println("Total spend money "+generalBalance);
}


public void goOut(String name, double price, int quantity) {
	this.name=name;
	this.price=price;
	this.balance-=(this.price*this.quantity);
}
}

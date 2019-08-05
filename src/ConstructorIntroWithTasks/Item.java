package ConstructorIntroWithTasks;

public class Item {
	public String name;
	public double price;
	//TASK: Create class item
	//ins vars: name, price
	//create construcgtor that sets both name and price values,
	//create method info to show name and price as string in following format:
    // item information: Name: name     price : price

    
    public Item(String name, double price) {
    	this.name = name;
    	this.price = price;
    }
    public void info() {
    	System.out.println("Item info");
    	System.out.println("Name: "+this.name);
    	System.out.println("Price : "+this.price + "\n");
    }
    
}

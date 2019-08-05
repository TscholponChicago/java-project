package ArrayList;

import java.util.ArrayList;

import selfStudy.Grosery;

public class MyStore {
	String name, address;
	double price;
	int numOfItems;
	double totalSales;
	ArrayList<Grosery> storeItems = new ArrayList<>();

	public MyStore(String name, String address) {//this is constructor
		this.name = name;
		this.address = address;
        
	}

	
	public void sell(String itemName) {
		for(int i =0; i <storeItems.size();i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(storeItems.get(i).name+" is sold for "+storeItems.get(i).price);
				numOfItems--;
				totalSales +=storeItems.get(i).price;
				break;
			}
		}
	}
	public void seeInventory() {
		System.out.println("\nOur inventory list:");
		for(int j=0; j < storeItems.size();j++) {
			storeItems.get(j).info();
		}
		
		
	}
	public void addItems(Grosery tovarName) {
		storeItems.add(tovarName);
		numOfItems++;
		
	}
	public void refund(Grosery item) {
		System.out.println("Refund transaction completed for " + item.name);
        addItems(item);
        totalSales-=item.price;
	}
	}
	


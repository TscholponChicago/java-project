package ArrayList;

import java.util.ArrayList;

import ConstructorIntroWithTasks.Item;

public class Store {
	String name, address;
	int numofItems;
	float totalSales;//total money in store
	ArrayList<Item> items = new ArrayList<>();
   
	Store(String name, String address) {
		this.name = name;
		this.address = address;

	}
	
	public void addItem(Item a) {
		items.add(a);
		numofItems++;
	}
	public void seeInventory() {
		for(int i= 0;i< items.size();i++) {
			items.get(i).info();
		}
	}
	public void sell(String itemName) {
		for(int i =0; i < items.size();i++) {
			if(items.get(i).name.equals(itemName)) {
				totalSales += items.get(i).price;
				System.out.println("\n" + items.get(i).name+" is sold for "+ items.get(i).price +"\n");
				items.remove(i);
				numofItems--;
				break;//we put break because 
			}
		}
	}
		public boolean checkItem(String item) {
			for(int i = 0; i < items.size();i++) {
				if(items.get(i).name.equals(item)) {
					return true;
				}
			}
			System.out.println(item +" is not found 1in stock");
			return false;
		}
	
	public void refund(Item tovar) {
		System.out.println("Refund transaction completed for "+ tovar.name);
		items.add(tovar);// now we see all items on shelf
		totalSales -= tovar.price;//we returned an item back to store , store gaves
		//us money back
		numofItems ++;// total items after return
			
		
	}
	public void exchange(Item takeItem, Item retItem2) {
		items.remove(takeItem);
		items.add(retItem2);
		totalSales+= (takeItem.price - retItem2.price);
	}
}

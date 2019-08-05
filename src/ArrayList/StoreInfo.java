package ArrayList;

import ConstructorIntroWithTasks.Item;

public class StoreInfo {

	public static void main(String[] args) {
		Store ss = new Store("Dream","123Berwyn");
		Item book1 = new Item("132 startup",2.33);
	    ss.addItem(book1);
	    Item pen = new Item("stars",4.33);
	    Item bag = new Item("notebook",5.83);
		ss.addItem(book1);
		ss.addItem(pen);
		ss.addItem(bag);
		ss.seeInventory();
		System.out.println("Number of items:"+ss.numofItems);
        ss.sell("notebook");
        ss.seeInventory();
        System.out.println("\nNumber of items:"+ss.numofItems + ss.totalSales);
        
	}

}

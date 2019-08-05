package ArrayList;

import ConstructorIntroWithTasks.Item;

public class ShoppingCenter {
	public static void main(String[] args) {
		Store channel = new Store("Good Vibes", "Chicago, Il");
		channel.seeInventory();
		Item screen = new Item("Screen", 35);
		Item tire = new Item("Good Rich", 299);
		channel.addItem(tire);
		channel.seeInventory();
		channel.checkItem("Bag");
		channel.checkItem("pen");
		channel.checkItem("notebook");
	}
}

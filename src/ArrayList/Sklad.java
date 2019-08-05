package ArrayList;

import java.util.ArrayList;

public class Sklad {
	String name, address;
	int numOfItems;
	double totalSales;

	public Sklad(String name, String address) {
		this.name = name;
		this.address = address;
	}

	ArrayList<Tovari> items = new ArrayList<>();

	public void sell(String itemName) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " + items.get(i).price);
				numOfItems--;
				totalSales += items.get(i).price;
				break;
			}
		}
	}

	public void addItems(Tovari tovar) {
		items.add(tovar);
		numOfItems++;

	}

	public void seeInventory() {
		System.out.println("\nOur inventory list");
		for (Tovari i : items) {
			i.info();
		}
	}

	public void refund(Tovari tovar) {
		System.out.println("refund transaction completed for " + tovar.name);
		addItems(tovar);
		totalSales -= tovar.price;
	}

}

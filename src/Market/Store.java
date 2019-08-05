package Market;
import Market.Item;
public class Store {

	public static void main(String[] args) {
		Item s= new Item();
		s.name="Bisqiut";
		s.price=30;
		s.quantity=90;
		
		Item d=new Item();
		d.name="Tort";
		d.price=100;
		d.quantity=20;
		d.listOfItems.add(d);
		
//		s.listOfItems.add(s);
//		System.out.println(s.listOfItems.get(0).name);
//		System.out.println(s.listOfItems.get(0).price);
//		
		d.addItem(d);
		d.addItem(s);
		
		for (int i = 0; i < d.listOfItems.size(); i++) {
			System.out.println("List of item in wareHause: \n");
			System.out.println("Name of item: "+d.listOfItems.get(i).name);
			System.out.println("Name of item: "+d.listOfItems.get(i).price);
		}
		

		
//		b.comeIn("bread", 20.00, "borodonsky", 100);
//		b.comeIn("sugar", 3, "Argentina", 1000);
//		b.comeIn("Fluor", 10.00, "Krans", 100);
//		b.geneBalance();
	}
	
}

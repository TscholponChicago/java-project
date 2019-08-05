package ArrayList;

public class Tovari {
	public String name;
	public double price;

	public Tovari(String name, double price) {
		this.name = name;
		this.price = price;

	}
	public void info() {
		System.out.println("\nItem information:");
		System.out.println("Name: "+ this.name);
		System.out.println("Price : "+this.price);
	}
}

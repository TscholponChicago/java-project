package selfStudy;

public class Grosery {
public String name, brand;
public double price;

public Grosery(String name,double price,String brand) {
	this.name=name;
	this.price=price;
	this.brand=brand;
	
}
public void info() {
	System.out.println("\n******Welcome to our store:*******");
	System.out.println("Item: "+name);
	System.out.println("Brand of this item : "+brand);
	System.out.println("Price for this item: "+price);
}

}

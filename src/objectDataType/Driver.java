package objectDataType;

public class Driver {

	public static void main(String[] args) {
		Mashina c1 = new Mashina();
		c1.make = "Toyota";
		c1.mileage = 24334;
		c1.sportEdition = true;
		c1.age = 6;
		
		System.out.println(c1.mileage);
		c1.drive();
		System.out.println(c1.mileage);
		c1.drive(1200);
		System.out.println(c1.mileage);
	}

}

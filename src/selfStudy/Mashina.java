package selfStudy;

public class Mashina {
	String brand;
	boolean sportEdit;
	int year;
	int mileage;

	public void drive() {
		System.out.println(year + " " + brand + " is driving. ");
		mileage += 10;
	}

	public void drive(String destin) {
		System.out.println(year + " " + brand + " is driving to " + destin);
		mileage += 10;
	}

	public void drive(int mile) {
		System.out.println(year + " " + brand + " is driving " + mile + " miles.");
		mileage += mile;
	}
}

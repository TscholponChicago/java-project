package objectDataType;

public class Mashina {
//Esen's version
	String make;
	int age;
	int mileage;
	boolean sportEdition;
	public void drive() {
		System.out.println(age + " "+ make+ " is driving");
		mileage+= 10;
		
	}
	public void drive(String destin) {
		System.out.println(age + " year"+ make + "is driving to "+ destin);
		mileage += 10;
	}
	public void drive(int mile) {
		System.out.println(age + " "+ make+ "is driving "+ mile + "miles");
		mileage += mileage;
	}
}

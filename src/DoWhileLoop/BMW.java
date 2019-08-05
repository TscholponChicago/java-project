package DoWhileLoop;

public class BMW {
	private String model, color;
	private int year;
	private double price;
	static int totalCars;
	
	public BMW(String model, int year) {//this is constructor
	     this.model =model;
	     setYear(year);
	     totalCars++;
	}
	public void drive() {
		System.out.println(this.model + " is driving");

	}

	public void stop() {
		System.out.println(this.model + " is stopping");
	}
    public static void wash(BMW bmw) {//it is static method
    	System.out.println(bmw.model +" is washed.");
    }
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {//here we modify setters
		if(year >= 1900 && year <= 2019) {
			this.year = year;
		}
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {//here we modify setters
		if(price >= 0 && price <= 10000000) {
			this.price = price;
		}
		
	}

	
}

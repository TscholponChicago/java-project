package ObjectCreation;

public class Animal {
	String type;
	String color;
	int size, age;
	
	public void info() {
		System.out.println("There are wild and domestic animals.");
		System.out.println("All of them have kids.");
		System.out.println("Type :"+ this.type);
		System.out.println("Color: "+this.color);
	}
	public void setValues(String typeValue, String colorValue, int sizeValue, int ageValue) {
//		type = typeValue;
//		color =colorValue;
//		size = sizeValue;
//		age = ageValue;
		this.age = ageValue;
		this.color = colorValue;
		this.size= sizeValue;
		this.type = typeValue;
		
		System.out.println();
		
		
	}
	
}

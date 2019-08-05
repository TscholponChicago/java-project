package selfStudy;

public class Apfel {
	String color, type, taste;
	int size;

	

	public void info() {
//	  System.out.println("I mochte eine Apfel essen. Hast du eine fuer mich?");
//	  System.out.println("Alle Apfel sind shoen und schmeckt gut");
//	 System.out.println("Size : "+size);
//	 System.out.println("Type : "+type); 
//	 System.out.println("Color: "+color);
//	 System.out.println("Taste : "+taste);
		if (size != 0) {
			System.out.println("Size; "+size);
		}
		if (type != null) {
			System.out.println("Type: "+ type);
		}
		if (color != null) {
			System.out.println("Color :" +color);
		}
		if (taste != null) {
			System.out.println("Taste : "+taste);
		}

	}
	public void setValues(int sizeValue, String typeValue, String tasteValue, String colorValue) {
	   size = sizeValue;
	   color = colorValue;
	   type = typeValue;
	   taste = tasteValue;
			   
	}

}


package String;

public class Conversion {

	public static void main(String[] args) {

      String color = "Blue";
      double price = 33.55;
      boolean isSunny = true;
      String space = " ";
      String noSpace = "";
      String result = color+space + price + space + isSunny;
      String result1 = price + space+ color + space;
      System.out.println(result);
   	  System.out.println(result1);
	  String priceInString = price + noSpace; // gives me just value from double without any extra data/ infor
	  System.out.println(priceInString);
	  boolean check = priceInString.isEmpty();
	  System.out.println(check);
	  
	  
	  
		
		

	}

}

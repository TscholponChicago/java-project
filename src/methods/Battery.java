package methods;

public class Battery {

	public static void main(String[] args) {
     navigate("Park Ridge","Cybertek");
    // String name = "Berwyn";
     checkLength("Berwyn", 6);

	}
	public static void navigate(String origin, String destination) {
		//System.out.println("GPS is navigating from "+ origin + " to"+ destination);
		System.out.println("Hello world");
	}
	
   public static void checkLength(String word, int number) {// we can use diff data types
	   if(word.length() == number) {
		  System.out.println("String and number are equal"); 
	   }else {
		   System.out.println("Not equal");
	   }
   }
}

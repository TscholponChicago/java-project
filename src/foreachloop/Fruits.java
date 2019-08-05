package foreachloop;

public class Fruits {

	public static void main(String[] args) {
   String[] favorFruits = {"Apple","Kiwi","Banana","Mango","Pineapple"};
   for(String fruit : favorFruits) {
	   if(fruit.equals("Mango")) {
		    System.out.println(fruit); 
	   }
   }
   String colors[] = {"red","purple","orange","green","black"};
   for(String color : colors) {
	   if(color.equalsIgnoreCase("PurPLE")) {
		   System.out.println(color);
		   
	   }
		   if(color.length() % 2 == 0) {
		  System.out.println("this color is :" +color);
	   }
	    
   }
   
		
		
	}

}

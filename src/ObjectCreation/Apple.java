package ObjectCreation;

public class Apple {
	// these are called instance variable, because they belong to / object
	// 
	
       int size ;
       String type;
       String color;
       int year;
       String taste;
                              //these 4 paramethers are inside, we just want to set values
       public void setValues(int sizeValue, String typeValue, String colorValue, String tasteValue) {
    	   size = sizeValue;// and in our method we do a1.setValues(3,green......)
    	   type = typeValue;
    	   color = colorValue;
    	   taste = tasteValue;
    	   // when we do this.size = size; we refer to instance var
       }
       public void info() {// info(or any name) is a method(that we must have) we keep it in our class
    	   if(size != 0) {
    		    System.out.println(size);
    	   }
    	  if(color != null) {
    		  System.out.println("Color is :"+null);
    	  }
    	   if(type != null) {
    		    System.out.println("Type is :"+type);// it takes var name and add character
    	   }
    	    if(taste != null) {
    	    	System.out.println("Taste :"+taste);
    	    }
    	   
       }
//	public static void main(String[] args) {
//		int age = 34;//int is for storing numbers
//		int year = 2019;//java has this data type,
//		//whenever we need to store numbers, we just call int
//		String word = "book"; // if we want to store a name so we call String.
//		// Java is holding string for us.
//		//idea of online banking  ===> people ==> Bankacount(it is in object)
    		
	}



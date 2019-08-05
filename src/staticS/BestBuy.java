package staticS;

public class BestBuy {
	
   
	/*
	 * Static var is what can if there is no word static it means there is no static
	 * word mentioned we keep static in class, static fields and methods belong to
	 * class and shared by all objects of a class static String name; static int
	 * count; static int getCount(); static void printName()
	 */ 
	static int numOfComputers;// it is static variable numofComputers
	String location;// it is inst var
   static  String day="Saturday";

     static {
    	 numOfComputers=90;
     }
     static {
    	 System.out.println("First static block");
    	 if(day.equals("Saturday")) {
    		 numOfComputers =55;
    	 }else {
    		 numOfComputers=99;
    	 }
     }
     static {
    	 System.out.println("Second static block");
    	 
     }
      

}








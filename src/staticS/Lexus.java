package staticS;

public class Lexus {
     String model,color;
     int year;
     double mileage;
     double price;
     boolean isNew;
     static int totalLexus;//every car does not have this infor
     
     
     
     public Lexus(String model,int year) {//this is constructor
    	 this.model =model;this.year=year;
    	 totalLexus++;
    	 
    	 
     }
     public static double mileToKm(double mile) {//why we make it static ,because
    	 //we don't need to create an object to know how many kilometers
    	 return mile*1.6;
    	 
     }
     public static void evaluateCar(Lexus lexus) {// we need to see static method as a tool not
    	 // related to object
    	 int age=2019 - lexus.year;
    	 if(lexus.mileage <50000 && age<=3 ) {
    		 System.out.println("Best choice");
    	 }else if((lexus.mileage >= 50000 && lexus.mileage <= 10000) && age >3 && age < 7){
    		 System.out.println("Fair choice");
    	 }else if(lexus.mileage > 100000 && lexus.mileage < 200000) {
    		 System.out.println("You decide!");
    	 }else if(lexus.mileage >= 200000) {
    		 System.out.println("Stay away");
    	 }else {
    		 System.out.println("Not able to evaluate");
    	 }
     }
     
}

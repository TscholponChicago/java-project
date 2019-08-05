package selfStudy;

public class NestedIfElse {

	public static void main(String[] args) {
//       int hours = 8;
//       if(hours < 12) {
//    	   System.out.println("morning");
//       }else {
//    	   if(hours < 17) {
//    		    System.out.println("afternoon");
//    	   }else {
//    		   System.out.println("evening");
//    	   }
//    	  
//       }
		int typeSelection = 2;
		int drinkSelection = 1;
		double price=0;
		String drink;
		if(typeSelection == 1) {
			System.out.println("Hot drinks: 1- Tea, 2 - Coffee");
			if(drinkSelection ==1) {
				price = 2;
				drink ="Tea";
			}else if(drinkSelection==2){
				price = 3;
				drink = "coffee";
			}else{
				System.out.println("Invalid hot drink");
			}
		}else if(typeSelection == 2) {
			System.out.println("Cold drinks: 1-iced tea, 2- lemonade");
			if(drinkSelection ==1) {
				drink = "iced-tea";
				price = 3.20;
			}else if(drinkSelection == 2) {
				drink = "lemonade";
				price = 3.5;
			}else {
				System.out.println("invalid cold drink");
			}
		} else {
			System.out.println("invalid drink selection");
		}
			
		
       
       
       
       
       
       
       
       
       
      
 
	}
    }	
		
	

         
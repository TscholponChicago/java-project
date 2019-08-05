package array;

public class compareArrays {

	public static void main(String[] args) {
		//TASK compare two arrays, if they have same size print they are equal,
		// if not equal print not equal
     String phones[] = {"Iphone","Samsung","LG","Google Pixel","Pixel","Motorola"};
     String phone2[] = {"Iphonehjh","Samsung","LG","Google Pixel","Pixel","Motorola"};
     
     boolean same = true;
     for(int a = 0; a < phones.length; a++) {
    	 if(phones[a].equals(phone2[a])) { // compares two arrays
    		 continue;
    	 }else {
    		same = false;
    		break;
    	 }
    	
    	}if(same) {
    	 System.out.println("Two arrays are same");
     }else {
    	  System.out.println("Two arrays are different");
    	 
     }

		//Esen's version
     String cars1 [] = {"Toyota","Honda","Kia","Porsch","BMW"};
     String cars2 [] = {"Toyota","Honda","Kia","Porsch","BMW"};
     int count = 0;
     if(cars1.length == cars2.length) {
    	  for(int i = 0; i < cars1.length; i++) {
    		 String c1 = cars1[i];
    		 String c2 = cars2[i];
    		 if(c1.equals(c2)) {
    			 count++;
    		 }
    	  }
     }if(count == cars1.length) {
    	 System.out.println("Cars are same");
     }else {
    	 System.out.println("Cars are not same");
     }
     
    	 
     }
		
		
		
	}



package array;

public class ContainsOfTwoOrMore {

	public static void main(String[] args) {
		// iterate through each element and print
		// the items that consists of two or more words
     String kitchen [] = {"knife","dishwasher","trash can","spoon","pan","plates","wooden spoon","silver plates"};
     
     int length = kitchen.length;
     for(int a = 0; a < length; a ++) {
    	 if(kitchen[a].trim().contains(" ")) {
    		 System.out.println(kitchen[a]);
    	 }
     }
   
    	  
      }
		
		
		
		
		
		
	}



package forloops;

public class IQPrintNumbersAndSkipThree {

	public static void main(String[] args) {
		/* program: print every number from 0-50
		 * Skip numbers that ends with 3.
		 */ 
		 
      for(int i = 0; i <=50; i++) {
    	  if(i % 10 == 3) {
    		  continue;
    	  }
    	  System.out.println(i);
      }
      System.out.println();
      
     for(int a = 0; a <= 65; a++) {
    	 if(a % 10 == 5) {
    		 continue;
    	 }
    	 System.out.println(a);
     }
		
		

	}

}

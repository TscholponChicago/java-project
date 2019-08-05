package forloops;

public class CountHowMany {

	public static void main(String[] args) {
      // TASK I need to find how many times letter M appears in the word
      String word = "computer programming";
      char findM = 'm'; //What I need to find
      int counter = 0;//  counts how many times
      for(int i = 0; i < word.length(); i++ ) {
    	 if(word.charAt(i) == findM) { // are they  matching
    		counter++;      // means how many times it appears
    	 }
      }
      System.out.println("Count: "+ counter);
    	  
      //---------------------------------------
      
      String word1 = "international";
      char let = 'a';
      int count = 0;
      for(int a = 0; a < word1.length(); a++) {
    	  char l = word1.charAt(a);
    	  if(word1.contains(l + "")) {
    		  continue;
    	  }
    	  count += l;
      }
      
      System.out.println(count);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
		
		
		
		
	}

}

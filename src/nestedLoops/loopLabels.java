package nestedLoops;

public class loopLabels {

	public static void main(String[] args) {
		
     myOuterLoop:
    	 for(int a =0; a < 5; a++) {
     myInnerLoop: 		 
    	  for(int b=0; b < 10 ;b++) {
    		  if(b == 5) {
    			  continue;
    		  }if(b == 7) {
    		  break myOuterLoop;
    		  
    	  }
    		System.out.print(b);  
    	  }
    	  
      }

	}

}

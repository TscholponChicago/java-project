package selfStudy;

public class ArrayNumbersAppearOnce {

	public static void main(String[] args) {
		/*array with numbers, use nested loop
		 * and sprint only values that appears once
		 * 
		 * 
		 */
      int num[] = {5,6,77,11,23,23,56,56,7,11,2};
      for(int i = 0; i < num.length; i ++) {
    	  int uniqueNum = num[i];
    	  boolean repeat = false;
    	  for(int j = 0; j < num.length; j++) {
    		  if(num[j] == uniqueNum && i != j) {
    			  repeat = true;
    			  break;
    		  }
    	  }
    	  if(repeat == false) {
    		  System.out.println(num[i] + " ");
    	  }
      }
     
	}

}

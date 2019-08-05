package selfStudy;

public class LoopDay_01 {

	public static void main(String[] args) {
      int num = 0;
      while(num < 10) {
    	  System.out.println("Hello Dear! "+num);
    	  num++;
      }

		/*create a var counter and assign 1 to it
		 * keep printing the value of counter as 
		 * long as counter is less than 15
		 */ 
		 
		int counter = 1;
		while(counter < 15) {
			System.out.print(counter+" ");
			counter++;
		}
		/*
		 *  #
		 *  ##
		 *  ###
		 *  ####
		 *  #####
		 *  ######
		 */
		System.out.println( );
		int n = 1;
		String stairs = "";
		while(n <= 6) {
			stairs = stairs + "#";
			System.out.println(stairs);
			n++;
		}
		
		
		
		
		
		

	}

}

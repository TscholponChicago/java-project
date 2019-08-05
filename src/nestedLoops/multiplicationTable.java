package nestedLoops;

public class multiplicationTable {

	public static void main(String[] args) {

      /* multiplication table
       * 
       */
		int num = 0;
		for(int a = 1; a <= 10; a++) {
	    	for(int b = 1; b <= 10; b++) {
				System.out.println( a+ " x " + b + " = "+a * b+"\t|" );
				
			}
	    	System.out.println("_________________");
	    	
		}
		
		
		

	}

}

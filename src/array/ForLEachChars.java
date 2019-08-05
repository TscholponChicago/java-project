package array;

public class ForLEachChars {

	public static void main(String[] args) {
		/* create string array, give elements
		 * loop through each element and print the first letter
		 * 
		 */
		//PART 1

    String names[] = {"Hanna","chopa","ulanbek","toma"};
    int len = names.length;
    for(int a = 0; a < len; a++) {
    	String name = names[a];
    	System.out.println(name.charAt(0));
    	System.out.println(names[a].charAt(0));
    }
    
    
    	//PART 2
    //print names that ends with letter a
    String boys[] = {"Toma","Roma","Kosta","Bolot"};
    int l = boys.length;
    for(int b = 0; b < l; b++) {
    	String boy = boys[b];
    	if(boy.endsWith("a")) {
    		System.out.println(boys[b]);
    	}
    	
    }
    
    
		
		
		
	}

}

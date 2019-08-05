package array;

public class ArrayReverse {

	public static void main(String[] args) {
   /*create int array and assign 10 diff numbers between 0 and 100
    */ 
    int points[] = {3,45,66,44,12,22,33,44,45,90};
    if(points.length == 10 ) {
    	System.out.println("44 is found");
    }else {
    	System.out.println("we need 44 points");
    }
		for(int a = points.length-1; a >= 0; a--) {
			System.out.print(points[a] +" ");
		}
		
		
	int[] n = {12,432,45,54656,576,354,546,65,67};
	for(int a = n.length-1; a >=0; a--) {
		System.out.print(n[a]+" ");
	}
		
		String [] w= {"cholpon","bed","bread","cat"};
		for(int b = w.length-1; b >= 0; b--) {
			System.out.print(w[b] +" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

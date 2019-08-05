package groupProject1;

import java.util.Scanner;

public class ASci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
	    String str1 = input.next();
	    
	    //your code here 
	    //---------------------------------------------------------- 
	    
	    String numbers;
	    if(str1.length()>3 && str1.length()<100) {
	    	numbers = str1.replaceAll("[^0-9]", "");
	    	System.out.println(numbers);
	    }else {
	    	System.out.println("Invalid error");
	    }
	    
	    
	    

	}

}

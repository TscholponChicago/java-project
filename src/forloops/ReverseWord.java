package forloops;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      System.out.println("Pls enter the word:");
      String word = scan.nextLine();
      int lastIndex = word.length()-1;
      for(int a =lastIndex; a > 0; a--) {
	  System.out.print(word.charAt(a));
	 
		
		
      }	

	}

}

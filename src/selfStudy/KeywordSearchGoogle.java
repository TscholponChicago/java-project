package selfStudy;

import java.util.Scanner;

public class KeywordSearchGoogle {

	public static void main(String[] args) {
		//TASK ask user to enter keyword
		//if any elements contains thet keyword print that word
      Scanner scan = new Scanner(System.in);
      String country[] = {"Kazakhstan","Uzbekistan","Kyrgyzstan","Russia","India"};
      
      System.out.println("Please enter you keyword:");
      String keyword = scan.next();
      for(int a = 0; a < country.length;a++) {
    	  if(country[a].contains(keyword)) {
    		  System.out.println(country[a]);
    	  }
      }
}
}
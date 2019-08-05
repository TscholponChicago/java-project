package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	  static Scanner scan =new Scanner(System.in);
	  public static ArrayList<String> filterList (ArrayList<String> words,int length){
		  ArrayList<String> result = new ArrayList<>();
		  for(String word: words) {
			  if(word.length() == length) {
				  result.add(word);
			  }
		  }
		  return result;
	  }
       public static ArrayList <String> getStringList(){
    	  ArrayList<String> words = new ArrayList<>();
    	  String response;
    	  do {
    		  System.out.println("Please enter String:");
    		  String s = scan.nextLine();
    		  words.add(s);
    		  System.out.println("Do you want to continue Y/N");
    		  response = scan.nextLine();
    		  
    	  }while(response.equalsIgnoreCase("y"));
    		  System.out.println("Your list of string is returned");
    		  return words;
    	 
    	   
    	   
    	   
       }
}

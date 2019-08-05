package JustReplitTasks;

import java.util.Scanner;

public class Print3MiddleCharacter {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
//    System.out.println("pls enter 2 words:");
//	String word1 = scan.nextLine();
//	String word2 = scan.nextLine();
//	int length = word1.length();
//	
//  if(word1.charAt(word1.length()-1) == word2.charAt(0)){
//	 String firstOfWord2 = word2.substring(1,word2.length());
//	 System.out.println(word1+firstOfWord2); 
//  }else {
//	  System.out.println(word1+word2);
//  } 
	System.out.println("Enter 2 words separated by space:");
    String str = scan.nextLine();
    int space = str.indexOf(" ");
    
    String word1 = str.substring(0, space);
    String word2 = str.substring(space+1);
    
    int sum = word1.length() + word2.length();
    System.out.println(sum);
    
    String firstLetOfWord1 = str.substring(0,1).toUpperCase();
    String firstLetOfWord2 = str.substring(0,1).toUpperCase();
    
    System.out.println(firstLetOfWord1 + word1.substring(1) + " " + 
    firstLetOfWord2 + word2.substring(1));
    
  
  
 }
       		 
		
		
		}
		
		
	



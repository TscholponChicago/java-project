package selfStudy;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {

    String word = "My name is: Cholpon";
    int i = word.indexOf(":");
    String str = word.substring(i+2).toUpperCase();
    String a = word.substring(0,i+1)+str;
    System.out.println(a);
    
    
    Scanner scan = new Scanner(System.in);
    String word1 ="xxcode";
    char let = word1.charAt(0);
    char let1 = word1.charAt(1);
    if(let == let1) {
    	 String all = word1.substring(2);
    	 System.out.println(all);
    
    }
   
   String fruits = "Appleapple";
   int lengthOfWord = fruits.length();
   String first = fruits.substring(0,lengthOfWord/2);
   String second = fruits.substring(lengthOfWord/2);
   System.out.println(second);
   String upper = second.substring(0,1).toUpperCase();
   String result = first.concat(" ").concat(upper).concat(second.substring(1));
   System.out.println(result);
   
   
  System.out.println("Please enter a word:");
  String soz = scan.nextLine();
  if((soz.charAt(0)== 'x') && (soz.charAt(1) == 'x')){
	  System.out.println(soz.substring(2));
  }else if(soz.charAt(0) == 'x') {
	  System.out.println(soz.substring(1));
  }else if(soz.charAt(2) == 'x') {
	  System.out.println(soz.substring(3));
  }else {
	  System.out.println(soz);
  }
  
  
  
  
  
   
   
	}
	
	

}

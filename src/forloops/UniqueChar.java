package forloops;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
	  System.out.println("Please enter the string:");	
	  String str = scan.nextLine();
	  str = str.toLowerCase();
	  str = str.replace(" ", "");
	  System.out.println(str);
	  /*1. read the string and store into string var
	   * 2. convert all string to lowerCase it ignores the cases
	   * 3.replace white spaces with empty string
	   * 4.run for loop for each char of the string 
	   * 5.keep adding the char to result also keep checking if
	   *  result already contains the char
	   * 6.print the result
	   */
		String unique = "";
	      for(int a = 0; a < str.length(); a++ ) {
	    	char s = str.charAt(a);//comes from 26 line
	    	if(unique.contains(s+"")) {
	    		continue;
	    	}
	    	unique += s;
	    }
          System.out.println(unique);	  
		
		
	}

	}



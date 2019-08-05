package selfStudy;

public class Stringlololo {

	public static void main(String[] args) {

         //Given a string, return a new string
		//made of 3 copies of the last 2 chars of the original string. 
		//The string length will be at least 2.
         String str = "Hello";   // result should be lololo
         if(str.length() >= 2) {
        	  String lastLet = str.substring(str.length() -2);
        	  System.out.println(lastLet + lastLet + lastLet);
         }
        
        // System.out.println(lastLet);
         
	}

}

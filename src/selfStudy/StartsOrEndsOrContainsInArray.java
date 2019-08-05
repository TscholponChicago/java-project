package selfStudy;

import java.util.Scanner;

public class StartsOrEndsOrContainsInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TASK 1 PART I : print word that starts with H
//    String people[] = {"Cholpon","Ulanbek","Hannamaria","Vildan","Yaseen"};
//    for(int a = 0; a < people.length; a++) {
//       if(people[a].startsWith("H")) {
//    	   System.out.println(people[a]);
//       }	
//    }
//    System.out.println();
//    Scanner scan = new Scanner(System.in);
//    System.out.println("________________________");
//   
//    
//     // PART II : if word contains "e", print that word 
//     String family[] = {"Hannamaria","Ulanbek","Cholpon","Vildan","Yaseen"};
//     for(int b = 0; b < family.length; b++) {
//    	 if(family[b].contains("m")) {
//    		 System.out.println(family[b]);
//    	 }
//     }
		
		
		
     // PART III : TASK==> read string from user use scanner, print
	// person that contains the entered string keyword by user.	
	 String names[] = {"Cholponai","Raina","Chopa","Chinara","Ropita"};
     System.out.println("Please enter a keyword:");
     String keyword = scan.next();
     for(int i = 0; i < names.length; i++) {
    	 String name = names[i];
    	 if(name.contains(keyword)) {
    		 System.out.println(name);
    	 }
     }
     
     
     
     
     
     
     
     
     
     
     
	}

}

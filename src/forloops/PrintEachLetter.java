package forloops;

import java.util.Scanner;

public class PrintEachLetter {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String word = "Wooden spoon";
    //TASK 1 using for loop print each char one by one
	for(int a = 0; a < word.length(); a ++) {
		char letter = word.charAt(a);
		System.out.println(letter);
	}
    System.out.println();
    String word1 = "International";
    for(int b = 0; b < word1.length(); b ++) {
    	char let = word1.charAt(b);
    	System.out.println(let);
    }
    System.out.println();
    System.out.println("Please enter a word:");
    String wor = scan.next();
    for(int c = 0; c < wor.length(); c++) {
    	char l = wor.charAt(c);
    	System.out.print(l+" ");
    }
    System.out.println();
     //---TASK 2 find and print just vowels
     for(int z = 0; z < wor.length(); z++) {
    	 char l = wor.toLowerCase().charAt(z);//hold all vowels from given word
    	 if(l == 'a' || l == 'o' || l == 'e' || l == 'u' || l == 'i') {
    		 System.out.println("These are vowels: "+l+" ");
    	 }
    	 
     }
       //  TASK 3 find just consonants
       System.out.println();
       for(int n = 0; n < wor.length(); n ++) {
    	   char lett = wor.toLowerCase().charAt(n);
    	   if(!(lett == 'a' || lett == 'o' || lett == 'e' || lett == 'u' || lett == 'i'))
    	   System.out.println("Consonants are these: "+ lett+ " ");
       }
       System.out.println();
    System.out.println("What is your pet?");
    String pet = scan.next();
    //TASK 1)count and print each letter from word, 
    //     2)capitalize first and last
    //     3)count if it is odd or even
    for(int p = 0; p < pet.length(); p++) {
//    	System.out.println(p + " letters in this word");//1 task
//    	System.out.println();
//    	char letter = pet.charAt(p);
//    	System.out.println(letter);
//    }
    	
       // task 2    
       String w = pet.substring(0,1).toUpperCase();
       System.out.println(w);
       String wo = pet.substring(pet.length()-1).toUpperCase();
       String midd = pet.substring(1,pet.length()-1);
       System.out.println(wo);
       System.out.println(w + midd + wo);
    	
      // task 3
       if(pet.length() % 2 == 0) {
    	   System.out.println("it is even");
    	   
    	   }else {
    		   System.out.println("it's odd");
    	   }
       }
    
       
       
       
       
       
       
       
       
       
       
    
    
		
		
		
		
		
	}

}

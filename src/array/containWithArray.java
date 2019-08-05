package array;

import java.util.Scanner;

public class containWithArray {

	public static void main(String[] args) {
		// to find if the word contains 
     Scanner scan = new Scanner(System.in);
     String students[] = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
	 int length = students.length;
	  System.out.println("Please enter a keyword:");
	 String keyword = scan.next();
	  for(int a = 0; a < length; a++) {
	  String student = students[a];
	  if(student.contains(keyword)) {
       System.out.println(student);
     
    
    	
     } 
	
	 
	 
		
	  }	
		

	}

}

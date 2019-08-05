package array;

public class tasksArrays {

	public static void main(String[] args) {
     /* create string array for students
      * initialize with stud below: James, John, Adam, Elize, Jamie, Benzema
      * Loop through each element of stud, print first character of each name on each line
      */
      String students[] = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
      int length = students.length;
      for(int b = 0; b < length; b++) {
    	  String name = students[b];
    	  System.out.println(name.charAt(0));
      
      }
      
      
      
    	 //-PART 2 
    	 // modify the loop and print the player names whose name ends with s
//    	 if(student.endsWith("s")) {
//    		 System.out.println(student);
//    		 if(student.contains("s")) {
//    			 System.out.println(student);
//    		 }
    	 }
    	  
      
		
	
		
	}



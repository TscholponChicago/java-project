package IfElseStatement;

public class Phone {

	public static void main(String[] args) {

      String color = "green";
      int memory = 128;
      String model ="IPhone X";
      System.out.println("Color is changing to gold");
      color = "gold"; // we changed grey into gold
	  int size= color.length();// gives the length
	  memory = 512; // changed the memory
	  if(memory >= 512) {
		  System.out.println("Good phone");
	  }else {
		  System.out.println("Ok phone");
	  }
		
		
	}

}

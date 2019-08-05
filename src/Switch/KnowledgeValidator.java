package Switch;

import java.util.Scanner;
public class KnowledgeValidator {

	public static void main(String[] args) {

      // write a program that asks grade from user
	  // user must enter one character they are A,B,C,D,D,F
      // Switch based on the characters and print proper messages
	  // check for the length of the grade.If not one character give them proper message
	
    Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a grade:");	
	String grade = scan.nextLine();
	grade = grade.toUpperCase();
	
	if(grade.length() > 1) {
		System.out.println("Invalid data.Please enter one character.");
	}else {
	switch (grade) {
	case "A":
		System.out.println("excellent");
		break;
	case "B":
		System.out.println("Very good");
		break;
	case "C":
		System.out.println("Not bad");
		break;
	case "D":
		System.out.println("Keep practicing");
		break;
	case "F":
		System.out.println("Invalid grade, but exceptable");
		break;
	default:
		System.out.println("Invalid grade");
	
	}
	}	
		
		
	}

}

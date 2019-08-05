package selfStudy;

import java.util.Scanner;

public class IfElses {

	public static void main(String[] args) {
		String name, respond;
        boolean student;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name:");
		name = scan.nextLine();
		
		System.out.println("Are you a student?");
		respond = scan.nextLine();
		
		if(respond.equals("yes")) {
			student = true;
		}else {
			student = false;
		}
		System.out.println("Student :"+ name);
		System.out.println("Current student: "+student);
		
		if(student) {
			System.out.println(name+" you rock");
		}
			
		}
	
		
	}



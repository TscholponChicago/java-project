package Switch;

import java.util.Scanner;

public class UnderstandingBoolean {

	public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String name, answer;
   boolean current;
   System.out.println("Please enter your name: ");
   name = scan.next();
   System.out.println("Are you a student?\nyes/no");
   answer = scan.next();
   if(answer.equals("yes")) {
	   current= true;
   }else {
	   current = false;
   }
	System.out.println("Name: "+name);	
    System.out.println("Current student: "+current);
    if(current) {
    	System.out.println(name +" you Rock!");
    }
}
}
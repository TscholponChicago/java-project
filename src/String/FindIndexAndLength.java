package String;

import java.util.Scanner;
public class FindIndexAndLength {

	public static void main(String[] args) {
		/* write a program that asks user to enter the name.
		 * Print "cool" if entered name first letter is 'a'
		 * and ends with 'z', and print "not very cool"
		 * if otherwise
		 * /*modify the code to check if name is empty
		 * if empty then print "enter valid name"
		 * if not empty apply the logic
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name:");
		String name = scan.nextLine().toLowerCase().trim();
		if(name.isEmpty()) {
			System.out.println("Invalid name. Try again.");
		}else {
			int first = name.charAt(0);
			int dlina = name.length();
			int last = name.charAt(dlina - 1);
			if( first == 'c' && last == 'a') {
				System.out.println("Name: "+ name);
				System.out.println("It's a cool name.I like it.");
			}else {
				System.out.println("Name: "+name);
				System.out.println("Ooops.It's not a cool name.");
			}
		}
	
		
		
		
		
		
		
	}

}

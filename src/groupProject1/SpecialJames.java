package groupProject1;

import java.util.Scanner;
public class SpecialJames {

	public static void main(String[] args) {

    /* write a pro that asks the name form user, if they enter James then ask 
     * last name, if name is not james then dont ask the last name
     * use nested else, give value "nobody" if the name is not james
     */
//	
		
	 Scanner scan = new Scanner(System.in);
	 String name;
	 String lastName;
	 System.out.println("please enter your name:");
	 name = scan.nextLine();
	 if(name.equalsIgnoreCase("james")) {
		 System.out.println("Please enter your last name: ");
		lastName = scan.nextLine();
	 }else {
		 lastName = "nobody";
		 System.out.println(lastName);
	 }
        System.out.println("Name: "+ name);
		System.out.println("Last Name:"+ lastName);

	}

}

package selfStudy;

import java.util.Scanner;

public class invitingGuests {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String guest =""; String answer = "";
	System.out.println("Please enter guest name:");	
	String name = input.next();
	System.out.println("Do you want to enter one more guest?");
    answer = input.next();
	if(answer.equals("yes")) {
		System.out.println("Please enter guest name:");
		guest = input.next();
		
	}else if(answer.equals("no")) {
		System.out.println("Guest's list: "+name + ", "+ guest);
	}

}
}
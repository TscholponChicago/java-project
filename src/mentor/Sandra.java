package mentor;

import java.util.Scanner;
public class Sandra {

	public static void main(String[] args) {

      // 1 floor lobby 2 google 3 apple 4 cybertek
	 Scanner scan = new Scanner(System.in);
	  System.out.println("Which floor?");
	  int floor = scan.nextInt();
	  switch(floor) {
	  case 1:
		  System.out.println("Lobby");
		  break;
	  case 2:
		  System.out.println("Google");
		  break;
	  case 3:
		  System.out.println("Apple");
		  break;
	  case 4:
		  System.out.println("Cybertek");
		  break;
	  default:
		  System.out.println("No such floor.");
	  }
	 
		
		
		
		
		
		
	}

}

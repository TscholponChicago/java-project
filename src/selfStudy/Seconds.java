package selfStudy;
import java.util.Scanner;

public class Seconds {
	
  public static void main(String[] args) {
	  
	  Scanner scan = new Scanner(System.in);
	  int seconds;
	  int minutes;
	  int remainingSeconds;
	  System.out.println("\nWelcome to time calculator!!!\n");
	  System.out.println("Please enter total seconds:");
	  System.out.println("Please enter total minutes:");
	  
	  seconds = scan.nextInt();          //Second way: int seconds = scan.nextInt();        If I use this way I don't need to declare --> lines 9-11
	  minutes = seconds/60;              //            int minutes = scan.nextInt();
	  remainingSeconds = seconds%60;     //            int remainingSeconds = scan.nextInt();
      

	  System.out.println(seconds+" seconds/minutes converted into:");
	  System.out.println(minutes+" minutes");
	  System.out.println(remainingSeconds+" seconds");
	  System.out.println(minutes+"Hours");
	  System.out.println(remainingSeconds+"seconds");
	  
	  
	  
  }
	
}

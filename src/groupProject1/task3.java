package groupProject1;

import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
     
	 Scanner scan = new Scanner(System.in);	
	 int time;
	 boolean campusOpen;
     System.out.println("Please enter the time to check campus hours.");
	 time = scan.nextInt();
	 
	 if(time >= 0 && time < 24) {
		
		 if(time >= 8 && time < 24) {
			 campusOpen = true;
			
		 }
		
	      else {
		 campusOpen= false;
	      }
		 System.out.println("Campus open: "+campusOpen);
	      }
	 else{
		 System.out.println("Invalid time. Try again.");
	 }
		
		
	}

}

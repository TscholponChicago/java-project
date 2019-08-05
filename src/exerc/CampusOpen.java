package exerc;

import java.util.Scanner;

public class CampusOpen {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	boolean campusOpen;
	System.out.println("Pls enter time:");
	int time = scan.nextInt();
	if(time >= 0 && time< 24) {
		if(time >=8 && time < 24) {
		campusOpen =true;
		}else {
		campusOpen = false;
		}	
		System.out.println("Campus open: "+campusOpen);
	}else {
		System.out.println("Invalid time try again");
		}
	
	}
	

}

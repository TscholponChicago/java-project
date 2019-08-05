package objectDataType;

import java.util.Scanner;

public class introMyHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is a type of your house?");
		String type = scan.nextLine();
		System.out.println("What is an address of your house?");
		String address = scan.nextLine();
		System.out.println("How many rooms are in  your house?");
		int numRooms = scan.nextInt();
		
		House home = new House();
		home.infor(type, address, numRooms);
		home.info();
		
		

	}
	

}

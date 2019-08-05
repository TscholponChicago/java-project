package ObjectCreationTasks;

import java.util.Scanner;

public class MyHouse {

	public static void main(String[] args) {
		House myHouse = new House();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter type of house:");
		myHouse.type = scan.nextLine();
		System.out.println("Please enter the address:");
		myHouse.address =scan.nextLine();
		System.out.println("Please enter number of rooms:");
		myHouse.numOfRooms = scan.nextInt();
		myHouse.info();
		
	}

}

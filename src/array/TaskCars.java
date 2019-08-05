package array;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCars {

	public static void main(String[] args) {
		/*TASK I: 1) part: ask the num of cars, 
		 * and assign that num in 
		 * 2)part pls assign "Aston Martin" to each elemet of the garage element
		 * 3)part : change the first car to BMW and last car to mercedes
		 * 4)part : 
		 * 5)part : Loop through and check if there are german cars, if garage has BMW or mercedes
		 * print you have german car, if there is no german print you dont have german cars
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("How many cars do you have?");
	    int carsNum = scan.nextInt();
	    scan.nextLine();
        String [] garage = new String[carsNum];
        // this is second part
		for(int a = 0; a < garage.length; a++) {
			System.out.println("Pls enter "+ (a + 1) + ":");
			String carName = scan.nextLine();
			garage[a] = carName;
			
		}
		//boolean check = false;
		for(int c = 0; c < garage.length; c++) {
			if(garage[c].equalsIgnoreCase("BMW") || garage[c].equals("Mercedes")) {
				System.out.println("You have german car");
				//check = true;
				break;
			}
			if(c == garage.length-1)System.out.println("You dont have german car");
//		}if(check) {
//			System.out.println("You have german car");
//		}else {
//			System.out.println("You dont have german car");
//		}
        System.out.println(Arrays.toString(garage));// this print all elements of array
		 // this is third part
//		garage[0] ="BMW";
//		garage[garage.length-1] = "Mercedes";
//		System.out.println(Arrays.toString(garage));
      
	    // this is fourth part
        // promp the car name in the loop from the user to enter.Flow :
        //enter number cars:3 enter car1: bmw enter car 2: Mercedes
        // [BMW, Mercedes, Toyota]


        }
        
		

	}
}



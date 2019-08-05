package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningStringToArray {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int numOfFriends = scan.nextInt();
        String friendsName[] = new String[numOfFriends];
        for (int i = 0; i < numOfFriends; i++) {
            System.out.println("What is your " + (i + 1) + " friend's name?");
            String name = scan.next();
            friendsName[i] = name;
        }
        System.out.println(Arrays.toString(friendsName));
        System.out.println();
        //TASK 1 :a) ask user the number of cars he has
        // b) and create an array with given size
        System.out.println("How many cars do you have?");// a
        int numOfCars = scan.nextInt();
        String garage[] = new String[numOfCars];// b

        for (int b = 0; b < numOfCars; b++) {
            garage[b] = "Porsch"; //assing porsch to each element
            // TASK 2 : a) assign moskvich to first car and
            //      b) kia to last one
            garage[0] = "Moskvich";  // a
            garage[numOfCars - 1] = "Kia"; // b
            //TASK 3 check if there is german car, if it has BMW or mercedes say
            // you have german car, if not no
            boolean check = false;
            if (garage[b].equalsIgnoreCase("BMW") || garage[b].equals("Mercedes")) {
                System.out.println("You have german car");
                check = true;
                break;
            }
//       }if(check) {
//    	   System.out.println("You have german car");
//       }else {
//    	   System.out.println("You do not have german car");
//       }
//
//        System.out.println(Arrays.toString(garage));
//


        }
    }}
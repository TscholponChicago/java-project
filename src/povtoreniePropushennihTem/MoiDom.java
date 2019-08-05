package povtoreniePropushennihTem;

import java.util.Scanner;

public class MoiDom {
    public static void main(String[] args) {
        Dom dom1 = new Dom();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter type of house: ");
        dom1.type = scan.nextLine();
        System.out.println("Please enter the address: ");
        dom1.address =scan.nextLine();
        System.out.println("Please enter number of rooms: ");
        dom1.numOfRooms = scan.nextInt();
        dom1.info();
    }
}

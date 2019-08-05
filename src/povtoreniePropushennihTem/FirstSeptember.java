package povtoreniePropushennihTem;

import java.util.Scanner;

public class FirstSeptember {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students do you have in your class?");
        int numOfStud=scan.nextInt();
        scan.nextLine();
        Pupils [] data = new Pupils[numOfStud];
        for(int i=0; i < numOfStud; i++){
            Pupils p = new Pupils();
            System.out.println("Enter student name : "+(i+1));
            p.name = scan.nextLine();
            System.out.println("Enter last name for student : "+(i+1));
            p.lastName = scan.nextLine();
            System.out.println("Enter gender for student : "+(i+1));
            p.gender = scan.nextLine();
            System.out.println("Enter age for student: "+(i+1));
            p.age = scan.nextInt();
            scan.nextLine();
            data[i] = p;
        }
        System.out.println(data.length);
        System.out.println(data[0].name);
    }
}

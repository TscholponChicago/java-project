package povtoreniePropushennihTem;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many books you want:");
        int bookNum = scan.nextInt();
        scan.nextLine();
        Bucher [] knigi = new Bucher[bookNum];//here we store our books
        for(int i=0; i < bookNum;i++ ){
            Bucher b =new Bucher();
            System.out.println("Enter title for book : "+(i+1));
            b.title = scan.nextLine();
            System.out.println("Enter author for book: "+(i+1));
            b.author = scan.nextLine();
            System.out.println("Enter pages for book : "+(i+1));
            b.pages = scan.nextInt();
            scan.nextLine();
            knigi[i] = b;
        }
        System.out.println(knigi[0].title);
        System.out.println(knigi.length);

    }
}

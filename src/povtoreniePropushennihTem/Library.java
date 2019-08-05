package povtoreniePropushennihTem;

public class Library {
    public static void main(String[] args) {
        Bucher b1 =new Bucher();
        b1.author = "krilov";
        b1.title = "Vorona";
        b1.pages = 333;
        Bucher b2 = new Bucher();
        b2.author = "Chingiz";
        b2.title ="Gulsara";
        b2.pages = 544;
        Bucher b3 = new Bucher();
        b3.author = "James";
        b3.title ="Brain";
        b3.pages = 654;
        //create 3 object from book and set values, add all 3 books to array,loop the array,
        //and print out authors for each book
        Bucher [] books   = new Bucher[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        for(Bucher b : books){
            System.out.println(b.author);
        }
        //keep asking from user to enter total books, author title ...


    }
}

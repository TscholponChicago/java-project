package ConstructorIntroWithTasks;

public class Schkola {
    public static void main(String[] args) {
        Studenten s1= new Studenten();
        s1.name = "James";
        s1.age=33;
        s1.email = "dhgfgh@ksjhjdfhv";
        s1.read();

        Book b =new Book();
        b.title="horse";
        b.pages=66;
        b.author="chopa";
        s1.read(b);
    }

}

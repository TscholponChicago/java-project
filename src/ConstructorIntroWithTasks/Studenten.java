package ConstructorIntroWithTasks;

public class Studenten {
    String name,email;
    int age;
    public void read(){
        System.out.println(this.name+" is reading.");

    }
    public void read(Book book)
    {
        System.out.println(this.name +" is reading "+book.title+" by "+book.author);
    }
}

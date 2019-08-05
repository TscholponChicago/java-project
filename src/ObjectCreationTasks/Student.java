package ObjectCreationTasks;

public class Student {
    String name;
    String email;
    int age;
    public void read() {//1
    	System.out.println(this.name+"is reading");
    	System.out.println("This email: "+this.email+ " belongs to " +this.name);
    }
    public void read(Book book) {//2nd method,it comes from different class
    	System.out.println(this.name+"is reading"+book.title+"by"+book.author);
    }
    public void read(int hours) {
    	System.out.println(this.name +"is reading for"+hours+"hours");
    }
}

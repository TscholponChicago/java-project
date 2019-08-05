package encapsulation;

public class Library {
    private String bookName;
    private String author;
    private int pages;
    private int age;
    public void shelves(String name, String author){
        this.bookName = name;
        this.setAuthor(author);
    }
    public void storageOldBooks(int year){
        if(year<1990){
            System.out.println("They can go to storage");
        }else {
            System.out.println("we can keep them");
        }
    }
    public void setBookName(String bookName){
        this.bookName=bookName;


    }
    public String getBookName() {
     return this.bookName;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package ObjectCreationTasks;

import java.util.Scanner;

public class BooksInfor {

	public static void main(String[] args) {
		//TASK: create a prog that asks from user to enter total books
		//and asks title, author and pages
		//then store each book to the array
        Scanner scan = new Scanner(System.in);
        Book b1= new Book();
        b1.setValues("Cholpon Mashieva","Park Ridge",334);
        
        Book b2= new Book();
        b2.setValues("Nazar Shved", "Java is fun", 222);
        Book b3 = new Book();
        b3.setValues("Rabia Hanum", "Gassing", 5000);
        
        Book[] arr = {b1,b2,b3};
        for(int i=0; i < arr.length; i++) {
        	System.out.println(arr[i].author);
        }
        
       
	}
}

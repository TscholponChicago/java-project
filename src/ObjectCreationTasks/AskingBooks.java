package ObjectCreationTasks;

public class AskingBooks {

	public static void main(String[] args) {
		//Nazar
		//Task1 : inst var are in class
		// create 3 objects from book and set values.
		//add all 3 books to array
		//loop the array and print out authors for each book
		Book b1= new Book();//here we create an object
		b1.author = "Taras Shevchenko";
		b1.title = "Kobzar";
		b1.pages = 458;
		
		Book b2 = new Book();
		b2.author = " Ivan Franko";
		b2.title = "Koroche";
		b2.pages = 250;
		
		Book b3 = new Book();
		b3.author = "Grigoriy Skovoroda";
		b3.title = "Neizvestniy";
		b3.pages = 240;
		
		Book [] num = new Book[3];// here we put the size of all books
		num[0] = b1;
		num[1] = b2;
		num[2] = b3;
		for(int a = 0; a < num.length; a++) {
			System.out.println(num[a].author);
			
		}
		
		
		

	}

}

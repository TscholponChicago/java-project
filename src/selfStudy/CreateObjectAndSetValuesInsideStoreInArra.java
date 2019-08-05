package selfStudy;

import java.awt.print.Book;

public class CreateObjectAndSetValuesInsideStoreInArra {

	public static void main(String[] args) {
		BookFuar book1 = new BookFuar();
		book1.author = "Rose Johnson";
		book1.title ="Titanik man";
		book1.pages =233;
		
		BookFuar book2 = new BookFuar();
		book2.author = "lalla";
		book2.title ="wbannan";
		book2.pages = 3443;
		
		BookFuar book3 = new BookFuar();
		book3.author ="cholpon";
		book3.title ="apples";
		book3.pages = 34;
		
		BookFuar [] store = new BookFuar[3];
		store[0] = book1;
		store[1] = book2;
		store[2] = book3;
		for(int a = 0; a < store.length;a++) {
			System.out.println(store[a].author);
		}
		
	}

}

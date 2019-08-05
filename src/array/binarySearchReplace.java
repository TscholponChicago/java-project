package array;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchReplace {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookShelf[] = {"Friends","Dogs","Harry Potter","Ibrahim"};
        System.out.println("Please enter the book to replace:");
		String bookToReplace = scan.nextLine();
		
		
		System.out.println("Please enter the new book:");
		String newBook = scan.nextLine();
		
		Arrays.sort(bookShelf);// sorting 
		System.out.println(Arrays.toString(bookShelf));
		int result = Arrays.binarySearch(bookShelf, bookToReplace);//it finds target element that we are looking for
		if(result >= 0) {// means if it is existing
		bookShelf[result] = newBook;
		}
		System.out.println(Arrays.toString(bookShelf));
	

	}

}

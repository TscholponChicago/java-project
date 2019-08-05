package array;

import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {

	public static void main(String[] args)throws FileNotFoundException {
	     // pritn the names that has the length of 5
		// print all names but empty lines
		File file = new File("test.txt");// here we will load
		Scanner sc=new Scanner(file);     // we read it through scanner
		while(sc.hasNextLine()){          // if it has next file keep reading it
		String name = sc.nextLine().trim();// trim and store it
		if(name.length() == 5) { // if it is equal to 5
		
			System.out.println(name);// it will print all names line byline
		}if(name.isEmpty()) {     // if it is empty skip
			continue;
		}
		
		System.out.println(name);
		  
		
		
		
		
		
		}

}
}
package array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

public class StoreNamesIntoArray {

	public static void main(String[] args) throws FileNotFoundException {
		// Nazar's and my work
		File file = new File("test.txt");// here we will load
		Scanner sc=new Scanner(file); 
		
		String st = "";// to store all names
		while(sc.hasNextLine()){          // if it has next file keep reading it
		String name = sc.nextLine().trim();
          if(name.length() > 0) {// it starts reading from 1st name(it is zero position)
             
             st += name + ", "; // names 
		}
		
		

	}
		System.out.println(st);
		String students[] = st.split(" ");//we've immigrated all names without spaces to new Array
		System.out.println(Arrays.toString(students));
		
	}
}

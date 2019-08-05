package array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SplitMethodEsen {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");// here we will load
		Scanner sc = new Scanner(file); 
		
		String st = "";// to store all names
		String result = "";
		while(sc.hasNextLine()){          // if it has next file keep reading it
		String name = sc.nextLine().trim();
        if(name.isEmpty()) {
        continue;
        }
        result += name + ",";
		}
		System.out.println(result);
		String [] students = result.split(",");
		System.out.println(Arrays.toString(students));
		
	}

}

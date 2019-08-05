package selfStudy;

import java.util.Scanner;

public class StringMunipulation {

	public static void main(String[] args) {
     String animal = "ostricho";
     int a = animal.indexOf('o');
     System.out.println(a);
	 int b = animal.indexOf('t');
	 System.out.println(b);
     int c = animal.indexOf('o',3);
     System.out.println(c);
     String word = "kyrgyzgstanggggg";
     int d = word.indexOf('y',1);
     System.out.println(d);
     int e = word.indexOf('g',11);
     System.out.println(e);
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter a word:");
     String str = scan.nextLine().toLowerCase().trim();
     int in = str.indexOf("red");
     int in1 = str.indexOf("yellow");
     int in2 = str.indexOf("green");
     System.out.println(in + "," + in1 + "," +in2);
     if(in == -1 && in1 == -1 && in2 == -1) {
    	 System.out.println("Not colors");
     }else {
    	 System.out.println("Colors");
     }
		
	}

}

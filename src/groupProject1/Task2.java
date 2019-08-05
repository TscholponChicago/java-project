package groupProject1;

import java.util.*;

public class Task2 {

	public static void main(String[] args){
		Scanner abc = new Scanner(System.in);
		
		
		int a;
	    double b;
		String name;
		
	    name = abc.nextLine();
	    b = abc.nextDouble();
		a = abc.nextInt();
		
		System.out.println("String: "+name);
		System.out.println("Double: "+b);
		System.out.println("Int: "+a);

		
		
		
		
		System.out.println("----------TASK 2 --------------");
		
		int width;
		int length;
		
		System.out.println("Please enter width:");
		width = abc.nextInt();
		
		System.out.println("Please enter length:");
		length = abc.nextInt();
		
		
		System.out.println("Area of rectangle: "+width*length);
		System.out.println("Perimeter of rectangle: "+(width+ length)*2);
		
		
		
	}

}

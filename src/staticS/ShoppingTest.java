package staticS;

import java.util.Scanner;

public class ShoppingTest {

	public static void main(String[] args) {
		
		/*
		 * NOTES: Static members(vars and methods) we dont include constructor(because
		 * it is a part of class) constructor can not be static, static belong to class,
		 * we dont have to hace an object to use them, and values of static members are
		 * shared by all the objects.Because it doesnt belong to objects. public static
		 * 
		 * static is used for utility,it's kind of a tool that we can use Ex for static
		 * mehtods from java: Arrays.sort(); Arrays.toString(); We don't need to create
		 * an objects from Arrays class.We can use sort method and toString method
		 * simply using the class name itself,because both methods are static and they
		 * belong to array class Ex for non static methods from java: nextLine() ---
		 * from scanner trim() --from string class nextInt() from random class These
		 * methods cannot be called if we dont have an object from the class.
		 * 
		 */
		BestBuy b1 =new BestBuy();
		b1.location = "Chicago Downtown";
		BestBuy b2=new BestBuy();
		b2.location="Des Plaines";
		BestBuy b3=new BestBuy();
		b3.location="Rosemont";
//		System.out.println(b3.location);
//		BestBuy.numOfComputers=33;
//		System.out.println(b2.numOfComputers);
//		BestBuy.numOfComputers=88;
//		System.out.println(b1.numOfComputers);
//		BestBuy.numOfComputers=11;
//		System.out.println(BestBuy.numOfComputers);
		System.out.println(BestBuy.numOfComputers);  //if we unactivate code below so result
		// is gonna be 90, because i gave value to static var inside if statick block,
		//that static block is executed just once

	}

	

}

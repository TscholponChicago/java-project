package ArrayList;

import java.util.ArrayList;

public class ArrayExs {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(25);
		arr.add(30);
		arr.add(35);
		arr.set(1, 45);
		arr.remove((Integer) 25);
		System.out.println(arr);
		System.out.println(arr.get(1));
		ArrayList<String> str = new ArrayList<String>();
		str.add("Apple");
		str.add("Banana");
		str.add("Book");
		str.add("table");

		System.out.println(str.get(2));
		System.out.println(str);
		str.remove("Book");
		// str.remove(2);
		System.out.println(str);
		str.set(0, "Door");
		System.out.println(str);
		str.contains("cool");
		System.out.println(str);
		str.add(2, "doll");
		System.out.println(str);
		str.add(3,"wolf");
		System.out.println(str);
	}

}

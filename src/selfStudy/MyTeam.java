package selfStudy;

import java.util.Arrays;

public class MyTeam {

	public static void main(String[] args) {
		int num [] = new int[3];
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		System.out.println(num[0]);
		System.out.println(Arrays.toString(num));
		String names[] = {"Cholpon","Saeen","Viko","Ulanbek","Hannamaria","Yaseen"};
		System.out.println(names[0] + ", "+names[5]); // reads values from specific index
		System.out.println(Arrays.toString(names));  // reads all elements from array
		
		
		
	}

}

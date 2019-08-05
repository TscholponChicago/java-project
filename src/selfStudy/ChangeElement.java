package selfStudy;

import java.util.Arrays;

public class ChangeElement {

	public static void main(String[] args) {
		double num[] = {12.33, 22.55, 88.77, 12.90};
		num[3] = 56.77;
		System.out.println(Arrays.toString(num));
		num[0] = 11.55;
		System.out.println(Arrays.toString(num));
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num.length);
       int book[] = new int[4];
	}

}

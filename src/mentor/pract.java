package mentor;

import java.util.Arrays;

public class pract {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 23;
		arr[1] = 30;
		arr[2] = 35;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4]);
		String[] myName = { "A", "B", "C", "D" };
		for (int i = 0; i < myName.length; i++) {
			System.out.print(myName[i] + " ");
		}

		System.out.println();
		for (String str : myName) {
			System.out.print(str + " ");
		}

		for (int j = myName.length - 1; j >= 0; j--) {
			System.out.print(myName[j] + " ");
		}
		int[][] array = new int[2][3];
		array[0][0] = 22;
		array[0][1] = 23;
		array[0][2] = 44;

		array[1][0] = 55;
		array[1][1] = 64;
		array[1][2] = 23;
		for (int k = 0; k < array.length; k++) {
			for (int b = 0; b < array[k].length; b++) {
                System.out.print(array+" ");
			}
		}

	}

}

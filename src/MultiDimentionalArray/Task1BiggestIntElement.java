package MultiDimentionalArray;

public class Task1BiggestIntElement {

	public static void main(String[] args) {
		int[][] nums = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } };
		biggestElement(nums);
		
	}
  // task 1: create void method that accepts 2d Ar and 
	//prints the biggest int element
	public static void biggestElement(int[][] arr) {
		int biggest = arr[0][0];
		for (int a = 0; a < arr.length; a++) {

			for (int b = 0; b < arr[a].length; b++) {
				if (arr[a][b] > biggest) {
					biggest = arr[a][b];
				}
			}
		}
		System.out.println("Biggest :" + biggest);
	}

}

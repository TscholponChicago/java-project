package mentor;

public class Kuba {

	public static void main(String[] args) {
      odd();
      System.out.println(rev("book"));
	}

	public void unique(int [] array) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 6, 6, 9 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
             if(i != j && array[i] == array[j] ) {
            	 
             }
			}
			System.out.println(array[i]);
		}
	}
	public static void odd() {
		for(int a = 0; a <= 50;a++) {
			if(a % 2 == 1) {
				System.out.print(a+" ");
			}
		}
	}
	public static String rev(String word) {
		String rev = "";
		for(int i = word.length() -1; i >= 0; i--) {
			rev += word.charAt(i);
			
		}
		return rev;
	}
	

}

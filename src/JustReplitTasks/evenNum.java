package JustReplitTasks;

public class evenNum {

	public static void main(String[] args) {
		/*Write for and while loops so that they print 
		 * only the even numbers between 1 and 20.
           Expected Output:  2 4 6 8 10 12 14 16 18 20
		 */
		for(int a = 1; a <= 20; a ++) {
			if(a % 2 == 0) {
				System.out.print(a);
			}
		}
		
	}

}

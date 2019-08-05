package gurhanRevision;

public class fibonachi {

	public static void main(String[] args) {
		beFibonacci(15);
	}
	public static void beFibonacci(int numbers) {
		System.out.println("First "+numbers+" value of the fibonacci series are:");
		int one = 0;
		int two =1;
		
		
		for(int j=1; j <= numbers; j++) {
		System.out.print(one + " + ");	
		int result = one + two;// 0 1 = 1
		one = two;//1
		two = result;//1
		}
	}
	
}

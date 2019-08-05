package methods;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(23, 4));
		System.out.println(multipl(12, 24));
		System.out.println(subtr(12, 3));
		System.out.println(div(12,4));
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int multipl(int a, int b) {
		int multip = a * b;
		return multip;
	}

	public static int subtr(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public static int div(int a, int b) {
		int div = a / b;
        return div;
	}
}

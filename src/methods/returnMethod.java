package methods;

public class returnMethod {

	public static void main(String[] args) {
		System.out.println(nums(23, 45));
		System.out.println(numbers());
		int n = number1();
		System.out.println(n);
		String a = getDate();
		System.out.println(a);
		String b = str();
		System.out.println(b);
	}

	public static int nums(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int numbers() {
		return 99;
	}

	public static int number1() {
		return 344;
	}

	public static String getDate() {
		return "April 19,2019";
	}

	public static String str() {
		System.out.println("Hola my friends");
		return "Happy Birthday!";

	}

}
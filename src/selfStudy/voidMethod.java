package selfStudy;

public class voidMethod {

	public static void main(String[] args) {
		name();
		friend(45, "Cholpon");
		System.out.println(animal("dog"));
		name1("Cholpon");
		len("Cholpon", 2);
		len(2, 4);
		System.out.println(len());
		System.out.println(person(23, 56));
		bool(!true);
		System.out.println(crazy("maSha"));
	}

	public static void name() {
		System.out.println("My name is Cholpon.");
	}

	public static void friend(int num, String str) {
		System.out.println("Name " + str + " age: " + num);

	}

	public static String animal(String str1) {
		return str1;
	}

	public static void name1(String name) {
		System.out.println(name.charAt(0));
	}

	public static void len(String a, int b) {
		if (a.length() == b) {
			System.out.println("they are equal");
		} else {
			System.out.println("They are not equal");
		}

	}

	public static void len(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static int len() {
		int num = 23 + 56;
		return num;
	}

	public static int person(int a, int b) {
		if (a > b) {

			System.out.println(a + " is bigger than " + b);
			return a;
		} else {
			// System.out.println(b + " is bigger");
			return b;
		}
	}

	public static void bool(boolean aa) {
		if (aa == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean crazy(String person) {
		if (person.equalsIgnoreCase("Masha")) {
			return true;
		} else {
			return false;
		}
	}

}

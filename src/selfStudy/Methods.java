package selfStudy;

public class Methods {

	public static void main(String[] args) {
		printPos();
		pizza();//we dont feed a method
		hi("Hmmm!");
		youMom("book","cat");//here we feed method
		name();
		name("bag");  
	}
	public static void printPos() {
		System.out.println("Hello");
		System.out.println("How are you?");
	}
	public static void pizza() {
		System.out.println("I love pizza. Do you?");
	}
	public static void hi(String str) {
		//System.out.println("Hola amigos!");
		System.out.println(str);
	}
	public static void youMom(String str,String str2) {
		System.out.println("All moms love their kids.");
	}
	public static void name() {
		for(int i = 0; i < 3; i ++) {
			System.out.println("Chopa");
		}
	}
	public static void name(String str11) {
		System.out.println("Tree");
		System.out.println(str11.charAt(1));
	}

}

package overloadMethod;

public class IntoOverload {

	public static void main(String[] args) {
		draw();
		draw(45);
		draw("red");
		draw("Cholpon","M");
		name();
		name("banana");
		name("book","cat");
		name(2);
		}
	public static void draw(String color) {
		System.out.println("Drawing in :"+color);
	}
	public static void draw() {
		System.out.println("drawing smth");
	}
	public static void draw(int num) {
		System.out.println("Drawing with size of :"+num);
	}
	public static void draw(String name,String s) {
		System.out.println("Drawing person name: "+name+"last name:"+s);
	}
	public static void name() {
		System.out.println("bookkkj");
	}
	public static void name(String str1) {
		System.out.println("I have "+ str1);
	}
	public static void name(String str1,String str2) {
		System.out.println("I have "+ str1 + "and "+str2);
	}
	public static void name(int num) {
		System.out.println("I have "+num+" bananas");
	}
	

}

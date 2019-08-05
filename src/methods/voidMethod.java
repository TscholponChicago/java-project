package methods;
import java.util.*;
public class voidMethod {

	public static void main(String[] args) {

    // oddNum();//task 1
		greetings("Cholpon");
		oddNumbers(50);
		userName("cholpon","mashieva");
		
	}
	
	public static void heloW() {
		System.out.println("Hello world");
	}
	//task 1: create a void meth that prints odd numbrs from 0-50
	//flow: printOdd50() output is : 1 3 5 7 9
	public static void oddNum() {
		for(int i = 0; i <= 50; i ++) {
			if(i % 2 == 1) {
				System.out.print(i);
			}
		}
	}
	//task 2: create meth that greets ppl, method should accept a string(name)
	// and it should print out "welcome, ---name"
	//flow : input : welcome ("james" output: welcome ,james
	public static void greetings(String name) {
		System.out.println("Welcome "+ name);
	}
  /// task 3 : create void meth that accepts an int and method should print out
	//all odd num on same line separ with space from 0 to given int.Flow
	public static void oddNumbers(int num) {
		for(int a = 0; a <= num; a++) {
			if(a % 2 == 1) {
				System.out.print(a + " ");
			}
		}
	}
	//Together with Nazar
	public static void userName(String first, String last) {
	Random ran = new Random();
	int r = ran.nextInt(101);
	String login = first.toLowerCase().concat(last.toLowerCase()) + r;
	System.out.println();
	System.out.println(login);
	}
	
}











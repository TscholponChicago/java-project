package methods;

import java.util.Random;

public class VoidReverseWords {

	public static void main(String[] args) {
     reverseWord("Cholpon","Mashieva");
     reverseWord("Hannamaria","Ulanbek");
	}
	public static void reverseWord(String name, String last) {
		Random ran = new Random();
		int num = ran.nextInt(101);
		String login = name.toLowerCase().concat(last.toLowerCase() + num);
		System.out.println(login);
	}

}

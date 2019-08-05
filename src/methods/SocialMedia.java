package methods;

import java.util.Random;

public class SocialMedia {

	public static void main(String[] args) {
    createUsername("Karim","Benzema");
    createUsername("Hannamaria","Ulanbek");
	reverseString("Cybertek");
	reverseString("Hannamaria");
		
	}
	public static void createUsername(String firstName, String lastName) {
		Random ran = new Random();
		int r = ran.nextInt(100);
		lastName = lastName.toLowerCase();
		String userName = firstName + lastName + r;
		System.out.println(userName);
	}
	public static void reverseString(String word) {
		String result = "";
		for(int z = word.length()-1; z >= 0; z-- ) {
			result += word.charAt(z);
		}
		System.out.println(result);
	}

}

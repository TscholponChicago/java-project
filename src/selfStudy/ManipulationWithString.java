package selfStudy;

import java.util.Scanner;
public class ManipulationWithString {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a word:");
//	String word = scan.nextLine();
//	
//	if(word.charAt(0) == word.charAt(word.length()-1)) {
//		System.out.println("First and last letters are same");
//	}if(word.charAt(1) == word.charAt(word.length()-2)) {
//		System.out.println("Second from the beginning and second from the end are same");
//	}else {
//		System.out.println("Not same");
//	}
		
//		String word = "Rhinosarous";
//		String str = word.substring(4,8);
//		System.out.println(str);
//		String str1 =  word.substring(5);
//		System.out.println(str1);
//		String str3 = word.substring(5,6);
//		System.out.println(str3);
        
//		String email = "kgteacher2016@gmial.com";
//		String pattern1 = email.substring(13,14);
//		System.out.println(pattern1);
//		
//		String pattern2 = email.substring(13);
//		System.out.println(pattern2);
//		
//		int start = email.indexOf("@");
//		System.out.println(start);
//		int start1 = email.indexOf("@")+1;
//		System.out.println(start1);
		
	String word = scan.nextLine();
	
//	System.out.println(word.substring(0,1).toUpperCase()+
//    word.substring(1).toLowerCase());
	System.out.println(word.substring(0,1).toUpperCase()+word.substring(1)+
			word.substring(word.length()-1).toUpperCase());
	
	
	
		
	}

}

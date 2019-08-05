package gurhanRevision;

import java.util.Arrays;
import java.util.Scanner;

public class methods {
     
   
	
	public static void main(String[] args) {
		countWords();
		login("johnJava","2346");
		isPalindrom("civic");
		System.out.println(isPalindrom("civic"));
		System.out.println(resultCount("About 691,777,000 results(0,78 seconds"));
		String loremIpsum = "gdfshgfhgdfd.dhhjgfjhsgf.eufe massa ksdjh.dkhhfsdjhf";
		System.out.println(doesContain(loremIpsum));
		String word1 = "charm";
		String word2 = "march";
		System.out.println(isAnagram(word1,word2));
	}
	public static void countWords() {
		
		System.out.println("Please enter a sentence to be analyzed:");
		Scanner scan = new Scanner(System.in);
		String ss  = scan.nextLine();//today is a great day
		
		String [] sentArr = ss.split(" ");//it becomes an array by using split method
		
		System.out.println("Words in this sentence are as followed: "+Arrays.toString(sentArr));;
		
		System.out.println("The  number of words in this sentence is : "+ sentArr.length);
	}
	public static void login(String expectedUserName,String expectedPassword) {
		
		System.out.println("You have clicked to login button!");
		System.out.println("Please enter account name:");
		Scanner scan=new Scanner(System.in);
		
		String actualName = scan.nextLine();
		System.out.println("Please enter password:");
		String actualPassword = scan.nextLine();
		if(expectedUserName.contentEquals(actualName)&& expectedPassword.equals(actualPassword)) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Either ");
		}
		
	} 
	public static boolean isPalindrom(String str) {
		String rev= "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev+= str.charAt(i);
		}if(str.equalsIgnoreCase(rev)) {
			return true;
		}else {
			return false;
		}
	}
	public static String resultCount(String result) {
		 // 0     1           2     3     4
		//About 691,777,000 results(0,78 seconds
		String[] resultArr = result.split(" ");
		String resultNum = resultArr[1];
		String commaReplace = resultNum.replaceAll(",","");
		return commaReplace;
	}
	public static String resultTime(String result) {
		String [] resultArr1 = result.split("\\(");
		
		String secondPart = resultArr1[1];
		String removeParant = secondPart.replaceAll("\\)","");
		return removeParant;
	}
	public static boolean doesContain(String word) {
		String[] textArr = word.split("\\.");
		String third = textArr[2]; 
		if(third.contains("massa")) {
			return true;
		}else {
			return false;
		}
			
	}
	public static boolean isAnagram(String word1,String word2) {
		if(word1.length()!= word2.length()) {
			return false;
		}
		char [] word1Char = word1.toCharArray();//'m','a','r','c','h'
		char [] word2Char = word2.toCharArray();//'c','
		Arrays.sort(word1Char);// a c h m r
		Arrays.sort(word2Char);//a c h m r
		for(int i=0; i < word1Char.length;i++) {
			if(word1Char[i] != word2Char[i]) {
				return false;
			}
		}
		return true;
	}
		
		
		
		
	
}

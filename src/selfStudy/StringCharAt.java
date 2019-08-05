package selfStudy;

public class StringCharAt {

	public static void main(String[] args) {

    String word = "happy";
    char first = word.charAt(0);
    char second = word.charAt(1);
    System.out.println(first);
	System.out.println(second);
	String emoji = ":)";
	if(emoji.length() != 2) {
		System.out.println("Invalid emoji");
		return;
	}


}}

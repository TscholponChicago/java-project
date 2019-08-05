package String;

public class NameValidation {

	public static void main(String[] args) {
		
		String name = "Frunze";
		boolean letter = name.contains("r");// returns boolean
		
		System.out.println(letter);
		boolean letter1 = name.contains("a");
		System.out.println(letter1);
		
		boolean letter2 = name.contains("un");
		System.out.println(letter2);
		
		boolean letter3 = name.contains("re");
		System.out.println(letter3);
    
//		String sent = "I have an apple";
//		boolean a = sent.contains(sent);
//		System.out.println(a);


	}

}

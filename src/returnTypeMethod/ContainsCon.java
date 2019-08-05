package returnTypeMethod;

public class ContainsCon {

	public static void main(String[] args) {
	  String w = "consequences";
	  System.out.println(find(w));
	  String str = "concert";
	System.out.println(removing3Letters(str,"cer"));
	}
	public static String find(String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}if(word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		} else {
			return word;
		}
	}
	//task : write method should accept 2 strings
	// 1 data, 2 strings we want to remove (3 letters)
	//every single rules for previous version is same for this method too
	public static String removing3Letters(String word, String letters) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}if(word.contains(letters)) {
			return word.replace(letters, "");
		}else {
			return word;
		}
	}

}

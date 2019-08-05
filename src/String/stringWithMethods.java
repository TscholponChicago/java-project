package String;

public class stringWithMethods {

	public static void main(String[] args) {
		
		capMiddle("James");
		System.out.println(capMiddle("James"));
		
	}
	public static  String capMiddle(String str) {
		str = str.toLowerCase();
		int middle = str.length() /2;
		char c = str.charAt(middle);
		String midd = c+"";
		midd = midd.toUpperCase();
		String result = str.substring(0,middle) + midd+str.substring(middle+1);
		return result;
		
	}

	
	
}

package methods;

public class voidMethod1 {

	public static void main(String[] args) {
	   String name =  cut("Cholpon","pon");
	    System.out.println(name);
	}
	public static String cut(String name, String word) {
		String newString = "";
		if(name.contains(word)) {
			newString += name.replace(word, "");
			return newString;
			
		}
		return name;
	}

}

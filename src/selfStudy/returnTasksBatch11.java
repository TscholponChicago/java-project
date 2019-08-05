package selfStudy;

public class returnTasksBatch11 {

	public static void main(String[] args) {
		/*
		 * TASK: if str contains "con" if yes remove word Con from string CASES: 1)check
		 * if string is only 1 word, if str is 2 or more print invalid data, return empty
		 * string 2) check if string length at least 3,if less than 3 print invalid data
		 * 3) if str does not contain con return word itself
		 * 
		 */
		
	//	System.out.println(str("constructor and mommy"));
		String ss = "ceremony";
		System.out.println(remove3letters(ss,"mon"));
	}

//	public static String str(String word) {
//      word = word.toLowerCase().trim();
//      if(word.contains(" ") || word.length() < 2) {
//    	  System.out.println("Invalid data");
//    	  return "";
//      }if(word.contains("con")) {
//    	  return word.replace("con", "");
//      }else {
//    	  return word;
//      }
//	}
	/*TASK: method accepts 2 strings( 1- data, 2- string we want to remove(3letters))
	 * every single rules for prev version is same for this method
	 * 
	 */
	public static String remove3letters(String str1,String letters) {
		str1 = str1.toLowerCase().trim();
		if(str1.contains(" ") || str1.length() < 3) {
			return "";
		}if(str1.contains(letters)) {
			return str1.replace(letters, "");
		}else {
			return str1;
		}
	}
	 

}

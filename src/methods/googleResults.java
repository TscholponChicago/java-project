package methods;

public class googleResults {

	public static void main(String[] args) {
		/*
		 * TASK: meth name: resultGoogle. return type String. Accepts a string as
		 * paramehter String will be passed as google result count format print only the
		 * count of search result
		 * output is: 691000000
		 */
		String google = "About 691,000,000 results(0.78 seconds)";
        System.out.println(resultSearch(google));
        String str1 = "About 10,000,000 results (435.456 seconds)";
        System.out.println(resultGoogle(str1));
        String str2 = "About 80,070,100 results (4665.456 seconds)";
        System.out.println(findJustNum(str2));
        String goog = "About 623,76,46 results (0.45 seconds)";
        System.out.println(googleResultTime(goog));
        String jobs = "About 34,46,576 people find jobs(2.546 seconds)";
        System.out.println(findNums(jobs));
	}
	public static String resultSearch(String str) {
		String [] words = str.split(" ");
		String s = words[1];
		s = s.replace(",","");
		return s;
	}
	public static String resultGoogle(String sent) {
		String [] arr = sent.split(" ");//here we split all spaces
		String slovo = arr[1];// here we find specific number and assign to slovo
		slovo = slovo.replace(",","");
		return slovo;
		
	}
	public static String findJustNum(String sen) {
		String[] ss = sen.split(" ");
	    String soz = ss[1];
	    soz = soz.replace(",","");
	    return soz;
	}
	public static String googleResultTime(String str) {
		String r  = str.substring(str.indexOf("(")+1, str.length()-1);
		return r;
	}
	public static String findNums(String str) {
		String result = str.substring(str.indexOf("(")+1, str.length()-1);
		return result;
	}

}

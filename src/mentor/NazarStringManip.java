package mentor;

public class NazarStringManip {

	public static void main(String[] args) {
		/*task: us
		 * 
		 * 
		 * 
		 */
		String str1 = "Cybertek";
		String str2 = "Avangers";
		String result = str1.substring(2,5)+str2.substring(1,4);
		System.out.println(result);
		int sumOfLength = str1.length()+str2.length();
		//System.out.println(sumOfLength);
		int str2A = 7;
		System.out.println(str2.charAt(str2A));
		int str1B = 5;
		System.out.println(str1.charAt(str1B));
		int str1C = 4;
		System.out.println(str1.charAt(str1C));
		int str2D =5;
		System.out.println(str2.charAt(str2D));
		int str2E = 7;
		System.out.println(str2.charAt(str2E));
		int str2F = 7;
		System.out.println(str2.charAt(str2F));
		System.out.println(str1+str2);
	//	String result = str1+str2 + str2 +str1;
		System.out.println(result);
		String firstF = str1.substring(0,2);
		String firstS = str2.substring(0,2);
		System.out.println(firstF+firstS);
		String lastLF = str1.substring(str1.length()-2)+str2.substring(str2.length()-2);
		System.out.println(lastLF);
		
		
	}

}

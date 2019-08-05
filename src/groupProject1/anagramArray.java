package groupProject1;
import java.util.Arrays;
import java.util.Map;
public class anagramArray {

	public static void main(String[] args) {
	isAnagram("listen","silent");
	System.out.println(isAnagram("listen","dog"));
	
	}
	public static boolean isAnagram(String str1, String str2) {
		
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ","");
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int a = 0; a < str1.length(); a++) {
			if(char1[a] != char2[a]) {
				return false;
			}
		}
		return true;
	}

}

package selfStudy;

import java.util.Random;

public class Battery {

	public static void main(String[] args) {
		navigate("Chicago","Park Ridge");
		//sent("Book",4);
		String w = "Bishkek";
		sent(w,3);
		createUserName("Chikita","lopez");
		reverseStr("interntaional");
	}
	public static void navigate(String start,String end) {
		System.out.println("I will pick you up from "+start+" and drive to "+ end);
		
	}
	public static void sent(String str, int num) {
		if(str.length() == num) {
			System.out.println("Equal");
		}else {
			System.out.println("not equal");
		}
	}
	public static void createUserName(String name,String lastname) {
		
		Random r = new Random();
		
		int n = r.nextInt(101);
		String l = name.toLowerCase()+lastname.toLowerCase() + n;
		System.out.println(l);
	}
	public static void reverseStr(String str) {
		for(int i = str.length() -1; i >= 0; i --) {
			System.out.print(str.charAt(i));
		}
	}

}

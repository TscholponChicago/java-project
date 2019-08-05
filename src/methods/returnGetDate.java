package methods;

public class returnGetDate {

	public static void main(String[] args) {
	  String a = str();
	  System.out.println(a);
//	  int b = nums();
//	  System.out.println(b); gives 34
	  System.out.println(nums());// lines 8,9 gives same result 34
	  String c = str2();
	  System.out.println(c);
	  String s= str3("Chika","pika");//does it mean that these 2 param, make return
	  // method working?
	  System.out.println(s);
	}
	public static String str() {
		return "April 19, 2019";
	}
	public static int nums() {
		return 34;
	}
	public static String str2() {
		return "I have an apple";
	}
	public static String str3(String beg,String end) {
		return "son and you";
	}
	

}

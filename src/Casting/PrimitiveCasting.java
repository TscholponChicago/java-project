package Casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		short s = 45;
		int age = s;
		System.out.println(age);
		int size = age;System.out.println(size);
		
	//	byte b = size;// byte can not hold big numbers,  we can do like this:
		byte b = (byte)size;
		System.out.println(b);
		byte b2 = (byte)s;
		double d = 45.6;
		int ss = (int)d;
		System.out.println(ss);
		String str = "0.81 seconds";
		double seconds = Double.valueOf(str);
		System.out.println(seconds+1);
		//////////////--------------
		String wall = "6575";
		int w = Integer.valueOf(wall);
		System.out.println(w);
		
		//------------------------------
		String book = "674646";
		double dl = Double.valueOf(book);
		
		
	}

}

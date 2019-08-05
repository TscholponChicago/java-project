package overloadMethod;

public class Keys {

	public static void main(String[] args) {
    calculate(45);   // it comes from (int a), it calls specific one
    calculate((short) 45);//to convert it to short, we use this way
    
    

	}
	public static void calculate(short s) {
		System.out.println("Short is calculating:"+s);
		
	}
	public static void calculate(int a) {
		System.out.println("Int is calculating:"+a);
	}
	

}

package methods;

public class Phone {

	public static void main(String[] args) {
	//	boolean a = isWeather("Monday");
	//	System.out.println(a);
		boolean b = isWeather("Tuesday");
		System.out.println(b);
		boolean c = trafficLights("red");
		System.out.println(c);
	}
	public static boolean isWeather(String day) {
		if(day.equals("Monday")) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean trafficLights(String color) {
		if(color.equals("Green")) {
			System.out.println("You may drive!");
			return true;
		}else {
			System.out.println("Stop.You cannot drive!");
			return false;
		}
	}
	
	

}

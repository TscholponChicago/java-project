package methods;

public class usingBoolean {

	public static void main(String[] args) {
		boolean a = isWeatherSunny("Monday");
		System.out.println(a);
		boolean b = pogoda("Friday");
		if(b) {
			System.out.println("Let's go to market");
		}else {
			System.out.println("Let's do chores");
		}
		
	}
	public static boolean isWeatherSunny(String day) {
		if(day.equals("Monday")){
			return true;
		}else {
			System.out.println(day + " is not sunny");
			return false;
		}
	}
	public static boolean pogoda(String day) {
		if(day.equals("Friday")) {
			return true;  // terminates code
		}
		System.out.println(day + "is not funny");
		return false;
	}
}

package selfStudy;

public class IfElse {

	public static void main(String[] args) {
		
//		boolean isLightGreen = true;
//		if(isLightGreen) {
//			System.out.println("Drive!");
//		}else {
//			System.out.println("Stop!");
//		}
//		boolean isLightGreen = true;
//		boolean isLightYellow =true;
//		
//		if(isLightGreen) {
//			System.out.println("You may drive!");
//		}else if(isLightYellow) {
//			System.out.println("Slow down!");
//		
//		}else {
//			System.out.println("Stop!");
//		}
		
//		int ticket = 10;
//		int age =14;
//		boolean isStudent = true;
//		
//		if(age<=15) {
//			ticket =5;
//		}else if(age > 60) {
//			ticket =5;
//		}else if(isStudent) {
//			ticket = 5;
//		}
		
//		int apple = 2;
//		int banana = 100;
//		int books = 2;
//		int toys = 4;
//		
//		if(!(apple < banana && books >toys) ){
//			System.out.println("Good job");
//		}else if(apple > banana && books < toys) {
//			System.out.println("So sad");
//		}else if(apple < banana || books > toys) {
//			System.out.println("I need to think");
//		}else if(apple > banana || books < toys) {
//			System.out.println("Let's buy it");
//		}
		
		int apples = 30;
		int bananas = 30;
		if(apples > bananas) {
			System.out.println("I have more apples than bananas");
		}else if (apples < bananas){
			System.out.println("I have more bananas than apples");
		}else {
			System.out.println("Apples and bananas are equal");
		}
		
		String userName = "Cholpon";
		String lastName = "Cholpon";
		if(userName.equals(lastName)) {
			System.out.println("Access granted");
			System.out.println("Welcome agent!");
		}else {
			System.out.println("Sorry, try again later!");
		}
		
		
			
		}
		
	}




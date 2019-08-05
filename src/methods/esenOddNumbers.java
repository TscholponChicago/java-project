package methods;

public class esenOddNumbers {

	public static void main(String[] args) {

     //Esen's version 
		printOdd50();
		welcome("Cholpon");
		welcome("Nazar");
		printOdd(40);
	}
	public static void printOdd50() {
		for(int a = 0; a < 50; a++) {
            if(a % 2 == 1) {
            	System.out.println(a + " ");}
            }
		System.out.println();
	}
	public static void welcome(String name) {
    System.out.println("Welcome "+ name);

}
	public static void printOdd(int limit) {
		for(int k = 0; k < limit; k++) {
			if(k % 2 == 1) {
				System.out.println(k + " ");
			}
		}
	}
	
}
package String;

public class StartsWithUpper {

	public static void main(String[] args) {
		
	String s = "Account Number: 257389ACCD";
	/*Check if "number " starts with upper case or lower case
	 * print starts with upper case
	 * print if it starts with lower
	 */
		int a = s.indexOf(" ")+1;
		if(s.charAt(a) == 'n') {
			System.out.println("Starts with lower case");
		}else {
			System.out.println("Starts with upper case");
		}
		
		
		
		
	}

}

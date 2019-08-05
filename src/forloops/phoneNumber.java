package forloops;

import java.util.Scanner;

public class phoneNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a phone number:");
		String phone = scan.next();
		int length = phone.length();
		for(int a = 0; a < phone.length() ; a++) {
			if(!(phone.length() == 10 || phone.length() == 12)) {
				System.out.println("Invalid length - must be either 12 or 10 characters");
			}else if(phone.length() ==12)  {
				if(!(phone.charAt(0) == '(' && phone.charAt(4) == ')')){
					System.out.println("Invalid format");
				}
					
				}
			phone = phone.replace("(", "");
			phone = phone.replace(")", "");
			   if(phone.length() == 10) {
				   for(int i = 0; i < phone.length(); i++) {
					   char c = phone.charAt(i);
					   int ii = c;
					   if(ii < 48 || ii > 57) {
						   System.out.println("Must be number between 0 - 9");
						   break;
					   }
				   }
				   System.out.println("valid phone number");
			   }
			   
			}
			 
				
				
			
		
		
		
	}

}

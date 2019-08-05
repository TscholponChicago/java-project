package String;

public class AcoountLength {

	public static void main(String[] args) {
		String account = "Account Number: 453453628";
		int pos = account.indexOf(":")+2;// points on :
		String accountNum = account.substring(pos);
		//int numLeng = account.length();
	
		if(accountNum.length() == 8){
			System.out.println("Valid account");
		}else {
			System.out.println("Invalid account");
		}
		
		
		
		
		
		
	}

}

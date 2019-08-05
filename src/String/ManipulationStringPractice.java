package String;

public class ManipulationStringPractice {

	public static void main(String[] args) {
	String password = "Cholpon123";
	String entered = "Cholpon123";
	if(password.equalsIgnoreCase(entered)) {
		System.out.println("They are matched");
	}else {
		System.out.println("They are not matched");
	}
	System.out.println();
	String country = "Uzbekistankyrgyzstan";
	int index = country.indexOf("ky");
	String firstWord = country.substring(0,index);
	String secondWord = country.substring(index);
	String upper = secondWord.substring(0,1).toUpperCase();
	
	String connect = upper.concat(secondWord.substring(1));
	
	System.out.println(firstWord.concat(" ").concat(connect));
	
	String names = "Hannamariavildan";
	int i = names.indexOf("v");
	String hanna = names.substring(0,i);
	String vildan = names.substring(i);
	String up = vildan.substring(0,1).toUpperCase();
	System.out.println(up.concat(vildan.substring(1)));
	System.out.println(hanna.concat(" ").concat(up.concat(vildan.substring(1))));
	
	
	
	String animals = "Dogelephant";
	int in = animals.indexOf("e");
	String dog = animals.substring(0,in);
	String ele = animals.substring(in);
	String u = ele.substring(0,1).toUpperCase();
	System.out.println(dog.concat(" ").concat(u.concat(ele.substring(1))));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
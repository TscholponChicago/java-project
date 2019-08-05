package selfStudy;

public class validEmails {

	public static void main(String[] args) {
	String emails[] = {"gdfd@kjv.com","dc45@kjk.com","hd@kjkjhcom"};
	for(String email : emails) {
		if(email.contains("@") && email.contains(".")) {
			System.out.println(email);
		}
	}
	
	String names[] = {"Chopa%","kiki@.","Lo$la","Berta"};
	for(String name : names) {
		if(name.contains("$") || name.contains("%")) {
			System.out.println(name);
		}
	}

	}

}

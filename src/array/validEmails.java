package array;

public class validEmails {

	public static void main(String[] args) {
      // task 

		char et = '@';
		char dot = '.';
		String emails[] = {"abc123@gmail.com","bbc123@gmail.com","ttw123@gmail.com",
				"ggh45gmail.com","mme456@gmail.com"};
		for(String email : emails) {
			if(email.contains("@") && email.contains(".")) {
				System.out.println(email);
			}
				
			}
		}
		
		

	}



package String;

public class StartsWith {

	public static void main(String[] args) {
		String weather = "really good";
		 boolean check = weather.startsWith("really");
		 System.out.println(check);
         boolean end = weather.endsWith("d");
         boolean end1 = weather.endsWith(" ");
         System.out.println(end);
         System.out.println(end1);
         
         String account = "Your account number: 257389ACCD";
         
         boolean a = account.startsWith("2",21);
         System.out.println(a);
         
         if(a) {
        	 System.out.println("Cool");
         }else {
        	 System.out.println("Not cool");
         }
         
         
         
         
         
	}

}

package selfStudy;

public class FacebookUser {
     String username,name,password,friends;
     public FacebookUser(String username,String password) {
    	 this.username = username;
    	 this.password = password;
     }
     public FacebookUser(String name,String username,String password) {
    	 if(password.contains(username)) {
    		 System.out.println("password can not contain username.pls change password");
    		 this.password = "";
    	 }
    	 
     }
}

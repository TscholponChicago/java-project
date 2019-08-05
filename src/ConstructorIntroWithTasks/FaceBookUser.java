package ConstructorIntroWithTasks;

public class FaceBookUser {
   String username;
   String name;
   String password;
   int friends;
   int age;

   public FaceBookUser(String username, String password){
   	this.username = username;
   	this.password= password;
   }
   public FaceBookUser(String name, String username,String password) {
	   this.name = name;
	   this.username = username;
	   if (password.contains(username)) {
		   System.out.println("Password caannot contain username. Please change the password.");
		   //  this.password = "";
	   } else {
		   this.password = password;
	   }
   }
   public void sendFriendRequest(FaceBookUser user) {
	   if (user.friends < 5000) {
		   System.out.println("Friend request sent to " + user.name);
		   user.friends++;
		   this.friends++;

	   } else {
		   System.out.println(user.name + "cannot accept friend request!");
	   }

   }



}

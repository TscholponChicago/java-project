package selfStudy;

import java.util.Scanner;
public class SecondsToMinutes {
	
     public static void main(String[] args) {
	 
     Scanner scan = new Scanner(System.in);
     System.out.println("Different ways for first and second tasks");
	    
     String profile = scan.nextLine();
     String posts = scan.nextLine();
     String products = scan.nextLine();
     String pictures = scan.nextLine();
     String likes = scan.nextLine();
     String orders = scan.nextLine();
     String video = scan.nextLine();
     String comments = scan.nextLine();
     String feedbacks = scan.nextLine();
   
     System.out.println("\nPlease enter username:");  
	 String user = scan.nextLine();
	 
	 System.out.println("Please enter password:");
	 String password1 = scan.nextLine();
	 
	// System.out.println("\tWelcome, Jbond");
	 
	 
	/* System.out.println("Profile  \tPictures   \tVideos");
	 System.out.println("Post      \tLikes      \tComments");
	 System.out.println("Products   \tOrders     \tFeedbacks");
	*/
     System.out.println("\tWelcome, "+user);
     System.out.println(profile+"\t\t"+posts+"\t\t"+products);
     System.out.println(pictures+"\t\t"+likes+"\t\t"+orders);
     System.out.println(video+"\t\t"+comments+"\t\t"+feedbacks);
    
     
	 
}	
}

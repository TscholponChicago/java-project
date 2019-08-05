package ConstructorIntroWithTasks;

public class SocialMedia {

	public static void main(String[] args) {
      FaceBookUser fb1=new FaceBookUser("jb07","jb2019");
      FaceBookUser fb2= new FaceBookUser("bilal","howareyou");
        System.out.println(fb1.password);
        System.out.println(fb1.age);
        System.out.println(fb1.username);
       fb2.name="Viko";
       fb2.username="goose";
       fb2.password="2344bvb";
        System.out.println(fb2.password);
        fb1.password ="123dfg";
        fb1.friends =55;
        System.out.println(fb1.password);
       // FaceBookUser fb3 = new FaceBookUser("John Wick","jwick","jwick2019");
        FaceBookUser fb3 = new FaceBookUser("John Wick","jwick","Jw2019");
        System.out.println(fb3.name);
        System.out.println(fb3.password);
        System.out.println(fb1.friends);
        System.out.println(fb3.friends);



	}
}
package selfStudy;

public class Studenten {
   String name, lastName;
   int age;
   int id;
   int kids;
   String status;
   String hobby;
   public void genInfo() {
	   System.out.println("Name : "+name);
	   System.out.println("Last name : "+ lastName);
	   System.out.println("Age : "+ age);
	   System.out.println("Id : "+ id);
	  System.out.println();
   }
   
   public void famStatus() {
	   System.out.println(name + " "+ " is "+ status);
	   System.out.println(name +" "+ " has "+ kids + " kids.");
	   
   }
   public void interest(String hobby) {
	   System.out.println(name + " "+ " has hobby. It is "+ hobby+ ".");
   }
   public void friends(int friends) {
	   System.out.println(name + " has " + friends + " friends.");
   }
   public void cars(int cars) {
	   System.out.println(name + " has just "+ cars+ " car.");
   }
   public void books(int books) {
	   System.out.println(name +" has so many books. The quantity is : "+ books);
   }
}

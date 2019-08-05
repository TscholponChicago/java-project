package ConstructorIntroWithTasks;

public class Testing {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.age);
		Person p2 = new Person(34);
		System.out.println(p2.age);
        Person p3 =new Person("Cholpon","Mashieva");
        System.out.println(p3.name+" "+p3.lastName + " "
        		+ p3.age);
        Person p4 = new Person("Cholpon","Mashieva",37, 169,"reading");
        System.out.println("I am "+p4.name+" "+p4.lastName+" "+". I am "+ p4.age+" and I am "+p4.height+". I like "+p4.hobby+" and also playing an instrument. ");
        
	}

}

package ConstructorIntroWithTasks;

public class Person {

	String name,lastName;
	int age, height;
	String hobby;
	
	
	public Person() {
		
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	public Person(String name,String lastName, int age,int height, String hobby) {
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.height= height;
		this.hobby = hobby;
	}
}

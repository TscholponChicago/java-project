package encapsulation;

public class Person {

	private String name;
	private String gender;
	private int age;
	private int height;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male")|| gender.equalsIgnoreCase("female")){
			this.gender = gender;
		}

	}

	public void setAge(int age) {
		if(age >=0 && age <=120){
			this.age = age;
		}else{
			System.out.println("Invalid age");
		}

	}

	public void setHeight(int height) {
		if(weight>0){
			this.height = height;
		}else{
			System.out.println("Invalid height");
		}

	}

	public void setWeight(int weight) {
		if(height>0){
			this.weight = weight;
		}else{
			System.out.println("Invalid weight");
		}

	}

	public int getAge() {
		return age;
	}
	public void info(){
		System.out.println("Name : "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
		System.out.println("Height: "+this .height);
		System.out.println("Weight: "+this.weight);
	}
	public static void getHaircut(Person person){
		if(person.gender.equalsIgnoreCase("male")){
			System.out.println(person.name+" is getting haircut at men barbershop");
		}else if(person.gender.equalsIgnoreCase("female")){
			System.out.println(person.name +" is getting haircut at women barbershop");
		}else{
			System.out.println("cannot get haircut");
		}
	}
	public static void getMarried(Person person1,Person person2){
		if(person1.age>18 && person2.age >=18){

			if(person1.gender.equalsIgnoreCase("male") && person2.gender.equalsIgnoreCase("female")){
				System.out.println("Valid marriage");
			}
		}else if(person1.gender.equalsIgnoreCase("male") && person2.gender.equalsIgnoreCase("female")){
			if(person1.age < 18&& person2.age <18){
				System.out.println("Invalid marriage");
			}

		}else{
			System.out.println("To young to get marriage");
		}
	}

}

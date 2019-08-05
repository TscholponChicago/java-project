package objectDataType;

public class PetShop {
	
	public static void main(String[] args) {
       //here we create an object from a class:
		
		Dog dog1 = new Dog();//when we type new we create new object, Dog is class name, dog1 is a name
		// on the left side we already have  a data
		//dog --> is a class that holds all the rules for one dog to have 
		//dog1 --> is a representation of an actual object/dog
		//instance -- is same as object
		//instantiate--> creating an object
		//whenever we are using keyword 'new' we are instantiating an object
		//dog1 will have all infor about a class
		System.out.println(dog1.age);// it holds 0 because we did not give info, because we just created
		//but if we say:
		dog1.age = 3;//here we set an age for dog
		System.out.println(dog1.age);//it gives 3
		System.out.println(dog1.color);//it gives null
		dog1.bark();//here we call the behavior method of dog
		Dog dog2 = new Dog();
		System.out.println(dog2.age);//prints 0,because they have different info
		//we use keyword new when we create an object.Unlimited objects can be 
		//created using one class.Once object is created that object will have 
		//copy of all the variables and and methods from the class
		
		// fe            Class : phone
		/*
		 *     Sumsung      Ip       Nokia      Motorolla
		 *     
		 *      These are objects
		 */
		
	}
}

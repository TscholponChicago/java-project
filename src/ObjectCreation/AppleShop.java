package ObjectCreation;

import objectDataType.ClassCar;

public class AppleShop {

	public static void main(String[] args) {
	Apple a1 = new Apple();// we create an object, a1 does not have any info yet,
	//Apple is class name, a1 is object name
	a1.color ="Red"; // but here we give all datails
	a1.size = 2;
	a1.taste = "sweet";
	a1.type = "aport";
	a1.year = 1982;
//	 
	System.out.println(a1.color);//if we want to see color
//	
	a1.info();// if we want to see all information about
//	// this apple
	Apple a2 = new Apple();
	a2.color = "Green";
	a2.size = 4;
	a2.taste = "sour";
	a2.type = "machentosh";
    a2.year = 1999;
    a2.info();// this info comes from class, we call it 
//	//any time when we want to see info we just write// call  keyword info 
//	//we call same method(info) but different object which is a2
//	
	a1.setValues(4, "gala", "green", "sweet");
	a1.info();
	} 

}
